package org.xtext.generator

import java.util.Base64
import java.util.List
import java.util.stream.Collectors
import java.util.stream.IntStream
import org.xtext.generator.helpers.GamificationHelper
import org.xtext.generator.helpers.SpeechToActionHelper
import upctforma.ContentElement
import upctforma.Number
import upctforma.RecordValue
import upctforma.Text
import upctforma.Widget

import static extension org.xtext.generator.helpers.StringHelper.*

class WidgetHangman  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		var RecordValue record;
		if (tipo==1){
			record= widget.widgetelements.get(0) as RecordValue;	
		}else{
			val arge = args.get(j) as Widget;				
			record= arge.widgetelements.get(0) as RecordValue;
		}
		
		val question = record.recordvalues.get(0).fieldvalue as Text;
		val solution = record.recordvalues.get(1).fieldvalue as Text;
		val letters = solution.html.split("");
		var List<Integer> positions = IntStream.range(0, letters.length).boxed().collect(
                Collectors.toList());
		val attempts = record.recordvalues.get(2).fieldvalue as Number;
		val payload = '''{"attempts": «attempts.num», "solution": « solution.html.json »}''' 
		var content = '''
         <div class="content-element">
            <div class="row">
             <div class="col-md-12 interview">
                 <h«headingLevel» id="heading-«idgen»">
                     <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpHangman")}»
                     « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                     « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                 </h«headingLevel»>
                 <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
             </div>
            </div>
            <form id="«idgen»" autocomplete="off" class="row widget-hangman no-gutters align-items-center" data-content="«Base64.encoder.encodeToString(payload.getBytes("UTF-8"))»">
                <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                <div class="guess-attempts col-12 col-md-2 mb-4 centered" aria-live="polite" aria-atomic="true">
                    <i class="fa-regular fa-circle-«attempts.num»" aria-hidden="true"></i>
                    <span class="description"><span class="number sr-only">«attempts.num»</span>«i18n.getMessage("guess-remaining-attempts")»</span>
                </div>
                <div class="col-12 col-md-10 centered">
                    <div class="row">
                        <div class="col-12 col-md-10 hangman-question"><h«headingLevel+1»>«question.html»</h«headingLevel+1»></div>
                        <div class="col-12 col-md-10 hangman-word centered">
                          <div class="hangman-result" aria-hidden="true" id="hangman-result-«idgen»">«i18n.getMessage("guess-current-result")»</div>
                          <ol class="hangman-word-list" aria-labelledby="hangman-result-«idgen»">
                          «FOR position : positions»
                            «IF letters.get(position) == " " »
                              <li class="hangman-result-letter">
                                <div class="letter letter-«position+1»">
                                <span class="sr-only">«i18n.getMessage("guess-space")»</span>
                                <span class="shown" aria-hidden="true">&nbsp;</span>
                                </div>
                              </li>
                            «ELSE»
                              <li class="hangman-result-letter">
                                <div class="letter letter-«position+1»">
                                  <span class="sr-only">«i18n.getMessage("guess-blank")»</span>
                                  <span class="shown" aria-hidden="true">_</span>
                                </div>
                              </li>
                            «ENDIF»
                          «ENDFOR»
                          </ol>
                        </div>
                    </div>
                </div>
                <div class="col-12 hangman-feedback centered resultado" aria-live="polite" aria-atomic="true">
                </div>
                <div class="col-12 hangman-input">
                   <div class="form-group row justify-content-center">
                     <label class="form-col-label col-12 col-md-3 mb-4 hangman-label" for="hangman-letter-«idgen»">Next attempt:</label>
                     <div class="col-12 col-md-6 mb-4">
                       <div class="typed-letters">
                        <input class="hangman-letter form-control" id="hangman-letter-«idgen»" type="text" maxlength="1" minlength="1" required />
                       </div>
                     </div>
                     <div class="col-12 col-md-3 mb-4">
                        <input type="submit" id="btn-«idgen»" class="btn btn-block btn-check btn-success events" value="«i18n.getMessage("text-check")»" />
                     </div>
                   </div>
                </div>
                <div class="col-12">
                    <button type="button" id="buttontest«idgen»" class="btn btn-block btn-secondary btn-reset events">«i18n.getMessage("start-again")»</button>
                </div>
                <div class="col-12 resultado resultado«idgen»" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
            </form>
		 </div>
		''';
		output.addStrProgesoObj(''',"objetivo«idgen»"''');
		output.addStrElement(content);

	}
	
}