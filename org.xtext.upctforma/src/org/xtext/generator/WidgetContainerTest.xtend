package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Number
import upctforma.Text
import org.xtext.generator.helpers.GamificationHelper
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification
import static upctforma.ContentUnitType.GAMIFICATION_VALUE;
import java.util.stream.IntStream
import java.util.stream.Collectors
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetContainerTest implements ContentGeneration<Widget> {
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

            var List<Integer> questions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                Collectors.toList());

            var content = '''
            «IF tipoUnidad == GAMIFICATION_VALUE »
            <section class="bgwhitecab2">
              <div class="container">
            «ENDIF»
              <div class="content-element">
                <div class="row">
                    <div class="col-md-12 interview">
                        <h«headingLevel» id="heading-«idgen»"><i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpAnswer")}»
                        «GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin)»
                        « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                        </h«headingLevel»>
                        <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                    </div>
                </div>
                <div id="«idgen»" class="row container-test" role="group" aria-labelledby="heading-«idgen»" data-desc="«widget.name»">
                    <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                    <div class="col-md-12">
                        <div class="row padtf w-100">
                        «FOR question : questions»
                            «val tempwg2 = tempwg1.listvalues.get(question) as RecordValue»
                            «val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text»
                            «val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as ListValue»
                            «val tempwg5 = tempwg2.recordvalues.get(2).fieldvalue as Number»
                            «val positiveFeedback = tempwg2.recordvalues.get(3).fieldvalue as Text»
                            «val negativeFeedback = tempwg2.recordvalues.get(4).fieldvalue as Text»
                            «val questionText = tempwg3.html.replace('[blank]', '<span aria-label="blank space" role="math">____</span>')»
                            «var List<Integer> options = IntStream.range(0, tempwg4.listvalues.length).boxed().collect(
                                            Collectors.toList())»
                            <fieldset class="question col-md-4 col-sm-6 col-xs-12">
                                <legend class="mb-4">«questionText»</legend>
                                «FOR option : options»
                                «val response = tempwg4.listvalues.get(option) as Text»
                                <div class="mb-2 option">
                                    <input class="events" type="radio" id="«idgen»«question»«option»"
                                        data-desc="objetivo«idgen»"
                                        name="«idgen»«question»"
                                        value="«if (tempwg5.num == (option+1)) "true" else "false"»">
                                    <label for="«idgen»«question»«option»" class="labeltest">«response.html.parse(widget)»</label>
                                </div>
                                «ENDFOR»
                                <p id="positiveFeedback-«idgen»«question»" class="hidden positiveFeedback alert alert-success">«positiveFeedback.html»</p>
                                <p id="negativeFeedback-«idgen»«question»" class="hidden negativeFeedback alert alert-danger">«negativeFeedback.html»</p>
                            </fieldset>
                            
                        «ENDFOR»
                        </div>
                        <div class="row">
                            <div class="col-12 centered resultado resultado«idgen» mb-4" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
                            <div class="col-12 col-sm-6 mb-2">
                                <button type="button" id="buttontest«idgen»" class="btn btn-block btn-check btn-gamification btn-success events">«i18n.getMessage("HelpCheckAnswer")»</button>
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

            output.addStrProgesoObj(''',"objetivo«idgen»"''');
            output.addStrIndex(content);
            if(tipoUnidad == GAMIFICATION_VALUE) {
                output.addStrTeacher(content);
            }
            SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpAnswer", output, widget);
        }

    }

}
