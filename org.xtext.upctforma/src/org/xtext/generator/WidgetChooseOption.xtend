package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.RecordValue
import upctforma.Text
import upctforma.Image
import upctforma.Number
import org.xtext.generator.helpers.GamificationHelper
import upctforma.ContentUnit
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetChooseOption implements ContentGeneration<Widget>{
    override generate(Widget widget, Output output, String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel) {
        if((tipoUnidad != GAMIFICATION_VALUE) ||
            ((tipoUnidad == GAMIFICATION_VALUE) && (idgen.equals(Utils.getContainerOfType(widget, ContentUnit).idunidad)))) {
            var RecordValue tempwg1;
            if(tipo == 1) {
                tempwg1 = widget.widgetelements.get(0) as RecordValue;
            } else {
                val arge = args.get(j) as Widget;
                tempwg1 = arge.widgetelements.get(0) as RecordValue;
            }

            val tempwg2 = tempwg1.recordvalues.get(0).fieldvalue as Text;
            val tempwg3 = tempwg1.recordvalues.get(1).fieldvalue as Image;
            val tempwg4 = tempwg1.recordvalues.get(2).fieldvalue as Text;
            val tempwg5 = tempwg1.recordvalues.get(3).fieldvalue as Text;
            val tempwg6 = tempwg1.recordvalues.get(4).fieldvalue as Text;
            val tempwg7 = tempwg1.recordvalues.get(5).fieldvalue as Text;
            val tempwg8 = tempwg1.recordvalues.get(6).fieldvalue as Number;

            var content = '''
                «IF tipoUnidad == GAMIFICATION_VALUE »
                <section class="bgwhitecab2">
                  <div class="container">
                «ENDIF»
                  <div class="content-element">
                    <div class="row">
                        <div class="col-md-12 interview">
                            <h«headingLevel» id="heading-«idgen»"><i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpCorrectOption")}»
                            «GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin)»
                            « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                            </h«headingLevel»>
                            <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 offset-md-3 col-sm-8 offset-sm-2">
                            <div id="«idgen»" class="pictograma" data-desc="«widget.name»" data-obj="objetivo«idgen»" data-value="«tempwg8.num»">
                                <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                                <div class="containerpregunta">
                                    <div class="no-padding">
                                        <h«headingLevel + 1» id="heading-«idgen»-1" class="text-center">«tempwg2.html»</h«headingLevel + 1»>
                                    </div>
                                    <div class="no-padding">
                                        <figure class="m-0" data-question="«idgen»"><img id="image-«idgen»" src="«tempwg3.url»" alt="«tempwg3.alt»" class="img-responsive"></figure>
                                    </div>
                                    <ul class="no-padding choose-option-grid" aria-labelledby="heading-«idgen»-1 image-«idgen»">
                                        <li class="respuesta" >
                                            <button type="button" class="btn btn-gamification btn-success response w98m1" data-response="1" data-question="«idgen»">«tempwg4.html.parse(widget)»</button>
                                        </li>
                                        <li class="respuesta">
                                            <button type="button" class="btn btn-gamification btn-success response w98m1" data-response="2" data-question="«idgen»">«tempwg5.html.parse(widget)»</button>
                                        </li>
                                        <li class="respuesta">
                                            <button type="button" class="btn  btn-success btn-gamification response w98m1" data-response="3" data-question="«idgen»">«tempwg6.html.parse(widget)»</button>
                                        </li>
                                        <li class="respuesta">
                                            <button type="button" class="btn btn-success btn-gamification response w98m1" data-response="4" data-question="«idgen»" >«tempwg7.html.parse(widget)»</button>
                                        </li>
                                    </ul>
                                </div>
                                <div class="col-12 mb-2">
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
            SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpCorrectOption", output, widget);
        }
    }
}
