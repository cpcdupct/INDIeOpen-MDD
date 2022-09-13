package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import java.util.stream.IntStream
import java.util.stream.Collectors
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.GamificationHelper
import java.util.Base64
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification

class WidgetSentenceOrder  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {
    		var ListValue sentences;
    		if (tipo==1){
    			sentences = widget.widgetelements.get(0) as ListValue;	
    		}else{
    			val arge = args.get(j) as Widget;				
    			sentences = arge.widgetelements.get(0) as ListValue;
    		}
    		var List<Integer> positions = IntStream.range(0, sentences.listvalues.length).boxed().collect(
                    Collectors.toList());
    
             var content = '''
             «IF tipoUnidad == GAMIFICATION_VALUE »
             <section class="bgwhitecab2">
               <div class="container">
             «ENDIF»
             <div id="«idgen»" class="content-element sentences-container">
                <div class="row">
                 <div class="col-md-12 interview">
                     <h«headingLevel» id="heading-«idgen»">
                         <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpSentenceOrder")}»
                         « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                         « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                     </h«headingLevel»>
                     <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                 </div>
                </div>
                <div class="row">
                  <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                </div>
             «FOR position : positions »
                « val sentence = sentences.listvalues.get(position) as RecordValue »
    			« val solutions = sentence.recordvalues.get(0).fieldvalue as ListValue »
    			« val words = sentence.recordvalues.get(1).fieldvalue as ListValue »
    			« val wordPositions =IntStream.range(0, words.listvalues.length).boxed().collect(
                    Collectors.toList())» 
    			« val payload = '''{
    			     "words": «FOR word : words.listvalues BEFORE '[' SEPARATOR ',' AFTER ']'» « (word as Text).html.json » «ENDFOR»,
                     "solutions": «FOR solution : solutions.listvalues BEFORE '[' SEPARATOR ',' AFTER ']'» « (solution as Text).html.json » «ENDFOR»
                }''' »
                
                <div role="application">
        			<table role="grid"
        			       id="«idgen»«position»"
        			       aria-labelledby="heading-«idgen»" 
        			       class="row widget-sentence-order mb-4" data-content="«Base64.encoder.encodeToString(payload.getBytes("UTF-8"))»">
        			  <tbody class="col">
        			    <tr class="row source-words word-list align-items-center">
        			      <th scope="row" class="col">«i18n.getMessage("sentence-order-word-list")»</th>
                         «FOR wp : wordPositions »
                          <td class="col drag-word-item"></td>
                          «ENDFOR»
        			    </tr>
        			    <tr class="row target-words word-list align-items-center">
        			     <th scope="row" class="col"><span class="answer-status"></span>«i18n.getMessage("sentence-order-answer")»</th>
        			     «FOR wp : wordPositions »
                         <td class="col drag-word-item" tabindex="-1"></td>
                         «ENDFOR»
        			    </tr>
        			  </tbody>
        			</table>
    			</div>
    		«ENDFOR»
    		    <div class="row">
    		        <div class="col-12 resultado centered mb-4" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
                    <div class="col-12 col-sm-6 mb-2">
                        <button type="button" class="btn btn-block btn-check btn-gamification btn-success events">«i18n.getMessage("HelpCheckAnswer")»</button>
                    </div>
                    <div class="col-12 col-sm-6 mb-2">
                        <button type="button" class="btn btn-block btn-reset btn-secondary">«i18n.getMessage("ResetAnswer")»</button>
                    </div>
                    
                </div>
    		</div>
            «IF tipoUnidad == GAMIFICATION_VALUE »
              </div>
            </section>
            «ENDIF»
    		''';
    		
            positions.forEach[pos |
                output.addStrProgesoObj(''',"objetivo«idgen»"''')
            ];
            output.addStrIndex(content);
            if(tipoUnidad == GAMIFICATION_VALUE) {
                output.addStrTeacher(content);
            }    
    	}
	}
	
}