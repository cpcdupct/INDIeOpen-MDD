package org.xtext.generator

import java.util.List
import upctforma.ContentElement
import upctforma.Widget
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import org.xtext.generator.helpers.GamificationHelper
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification
import static upctforma.ContentUnitType.GAMIFICATION_VALUE;
import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.Base64
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetTrueFalse implements ContentGeneration<Widget> {
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

                var String solutions = "[" + tempwg1.listvalues.stream.map[ele |
                    ((ele as RecordValue).recordvalues.get(1).fieldvalue as Text).html.toLowerCase
                ].collect(Collectors.joining(",")) + "]";

                var List<Integer> positions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                    Collectors.toList());

                var content = '''
                «IF tipoUnidad == GAMIFICATION_VALUE »
                <section class="bgwhitecab2">
                  <div class="container">
                «ENDIF»
                   <div class="content-element">
                    <div class="row">
                    	<div class="col-md-12 interview">
                    		<h«headingLevel» id="heading-«idgen»">
                    		   <i class="fas fa-info-circle"></i>&nbsp;
                    		   « IF widget.help.empty » «i18n.getMessage("HelpTrueFalse")»
                    		   « ELSE » «widget.help»
                    		   « ENDIF »
                               « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                               « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                    		</h«headingLevel»>
                    		<i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                    	</div>
                    </div>
                    <div id="«idgen»" class="row widget-truefalse" role="group" aria-labelledby="heading-«idgen»" data-desc="«widget.name»" data-content="«Base64.encoder.encodeToString(solutions.bytes)»">
                      <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                    	<ul class="col-md-12">
                    	«FOR position : positions»
                    	   «val tempwg3 = (tempwg1.listvalues.get(position) as RecordValue).recordvalues.get(0).fieldvalue as Text»
                    	   «val positiveFeedback = (tempwg1.listvalues.get(position) as RecordValue).recordvalues.get(2).fieldvalue as Text»
                    	   «val negativeFeedback = (tempwg1.listvalues.get(position) as RecordValue).recordvalues.get(3).fieldvalue as Text»
                           <li class="question row no-gutters padtf backgroundTF">
                             <div class="col-md-7 col-sm-9 col-xs-9" >
                                <p id="statement-«idgen»«position»">«tempwg3.html.parse(widget)»</p>
                               <p id="positiveFeedback-«idgen»«position»" class="hidden positiveFeedback alert alert-success">«positiveFeedback.html»</p>
                               <p id="negativeFeedback-«idgen»«position»" class="hidden negativeFeedback alert alert-danger">«negativeFeedback.html»</p>
                             </div>
                             <div class="col-md-2 offset-md-1 col-sm-2 col-xs-2 centered">
                               <div class="custom-control custom-switch">
                                 <input aria-labelledby="statement-«idgen»«position» result-«idgen»«position»"
                                        name="«idgen»«position»"
                                        type="checkbox"
                                        class="custom-control-input"
                                        id="customSwitch«idgen»«position»"/>
                                 <label class="custom-control-label TFfalse-color" for="customSwitch«idgen»«position»">«i18n.getMessage("TextFalse")»</label>
                               </div>
                             </div>
                             <div id="result-«idgen»«position»" class="col-md-1 col-sm-1 col-xs-1 iconresult centered"></div>
                          </li>
                    	«ENDFOR»
                    	</ul>
                        <div class="col-md-12">
                          <div class="row">
                            <div class="col-12 centered mb-4 resultado_truefalse" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
                            <div class="col-12 col-sm-6 mb-2">
                              <button type="button" class="btn btn-gamification btn-block btn-success boton_truefalse">«i18n.getMessage("HelpCheckAnswer")»</button>
                    	    </div>
                            <div class="col-12 col-sm-6 mb-2">
                              <button type="button" class="btn btn-reset btn-block btn-secondary">«i18n.getMessage("ResetAnswer")»</button>
                            </div>
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
                output.addStrProgesoObj(''',"objetivo«idgen»"''');
                SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpTrueFalse", output, widget);
        }
    }

}
