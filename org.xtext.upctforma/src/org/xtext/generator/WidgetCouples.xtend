package org.xtext.generator

import java.util.Base64
import java.util.List
import java.util.stream.Collectors
import java.util.stream.IntStream
import org.xtext.generator.helpers.GamificationHelper
import upctforma.ContentElement
import upctforma.Image
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import upctforma.Widget
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SpeechToActionHelper
import org.xtext.generator.helpers.SiteMapHelper

class WidgetCouples implements ContentGeneration<Widget> {
    override generate(Widget widget, Output output, String idgen, String title, List<ContentElement> args, int j,
        Integer tipo, Integer tipoUnidad, String origin, int headingLevel) {
        if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {
            var ListValue tempwg1;
            if(tipo == 1) {
                tempwg1 = widget.widgetelements.get(0) as ListValue;
            } else {
                val arge = args.get(j) as Widget;
                tempwg1 = arge.widgetelements.get(0) as ListValue;
            }

            var List<Integer> positions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                Collectors.toList());

            var options = '''
                «FOR position : positions BEFORE '[' SEPARATOR ',' AFTER ']'»
                    « val tempwg2 = tempwg1.listvalues.get(position) as RecordValue »
                    «FOR subposition : #[0,1] SEPARATOR ',' »
                        « val elem = tempwg2.recordvalues.get(subposition).fieldvalue»
                        « IF elem instanceof Image »
                        { "type": "img", "src": "«elem.url»", "alt": «elem.alt.json» }
                        « ELSEIF elem instanceof Text »
                        { "type": "text", "content": «elem.html.parse(widget).json» }
                        «ENDIF»
                    «ENDFOR»
                «ENDFOR»
            '''

            var content = '''
                «IF tipoUnidad == GAMIFICATION_VALUE »
                <section class="bgwhitecab2">
                  <div class="container">
                «ENDIF»
                <div class="content-element">
                  <div class="row">
                    <div class="col-md-12 interview">
                        <h«headingLevel» id="heading-«idgen»"><i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpImageText")}»
                        « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                        « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                        </h«headingLevel»>
                        <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                    </div>
                  </div>
                  <div class="row widget-couples">
                    <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                    <div class="col-md-12 centered">                    
                        <div id="«idgen»" data-desc="«widget.name»" class="row couples parejas«idgen»"
                             role="application" aria-labelledby="heading-«idgen» activity-description-«idgen»"
                             data-content="«Base64.encoder.encodeToString(options.getBytes("UTF-8"))»">
                             <div id="activity-description-«idgen»" class="activity-description sr-only">«i18n.getMessageWithParameters("couples-description", tempwg1.listvalues.length) »</div>
                        </div>
                       «IF tipoUnidad == GAMIFICATION_VALUE »
                       <div class="row">
                           <div class="col-md-6 col-sm-12 mb-2"> <button class="btn btn-block btn-reset btn-secondary">«i18n.getMessage("ResetAnswer")»</button></div>
                           <div class="col-md-6 col-sm-12 mb-2"> <button class="btn btn-block btn-check btn-success btn-gamification">«i18n.getMessage("HelpCheckAnswer")»</button></div>
                       </div>
                       «ELSE»
                       <div class="row">
                          <div class="col-12 mb-2"> <button class="btn btn-block btn-reset btn-secondary">«i18n.getMessage("ResetAnswer")»</button></div>
                      </div>
                       «ENDIF»
                       <div class="row">
                           <div class="col-12 resultado-couples" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
                        </div>
                   </div>
                
                  </div>
                </div>
                «IF tipoUnidad == GAMIFICATION_VALUE »
                  </div>
                </section>
                «ENDIF»
            ''';
            
            output.addStrIndex(content);
            if(tipoUnidad == GAMIFICATION_VALUE) {
                output.addStrTeacher(content);
            }            

            output.addStrProgesoObj('''
                ,"objetivo«idgen»"
            ''');
            SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpImageText", output, widget);
        }

    }
}
