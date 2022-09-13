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

class WidgetMissingWords  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		
		if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {
            val INPUT_MARKER = "[blank]";
    		
    		var ListValue sentences;
    		if (tipo==1){
    			sentences= widget.widgetelements.get(0) as ListValue;	
    		}else{
    			val arge = args.get(j) as Widget;				
    			sentences= arge.widgetelements.get(0) as ListValue;
    		}
    		val List<Integer> positions = IntStream.range(0, sentences.listvalues.length).boxed().collect(
                    Collectors.toList());
            // Obtain solutions for every sentence
            val solutions = "[" + sentences.listvalues.stream.map[sentence | {
                // Get all valid combinations for each sentence
                val combinations = (sentence as RecordValue).recordvalues.get(1).fieldvalue as ListValue;
                "[" + combinations.listvalues.stream.map[combination | (combination as Text).html.json]
                    .collect(Collectors.joining(",")) + "]";
            }].collect(Collectors.joining(",")) + "]";
       
             var content = '''
             «IF tipoUnidad == GAMIFICATION_VALUE »
             <section class="bgwhitecab2">
               <div class="container">
             «ENDIF»
             <div class="content-element">
                <div class="row">
                 <div class="col-md-12 interview">
                     <h«headingLevel» id="heading-«idgen»">
                         <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpMissingWords")}»
                         « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                         « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                     </h«headingLevel»>
                     <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                 </div>
                </div>
                <div id="«idgen»" class="row widget-missing-words" data-content="«Base64.encoder.encodeToString(solutions.getBytes("UTF-8"))»">
                    <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                    <ul class="col-md-12">
                    «FOR position : positions »
                       « val sentence = sentences.listvalues.get(position) as RecordValue »
        			   « val phrase = (sentence.recordvalues.get(0).fieldvalue as Text).html »
        			   « val inputPosition = phrase.indexOf(INPUT_MARKER)»
        			   « val left = phrase.substring(0, inputPosition) »
        			   « val right = phrase.substring(inputPosition + INPUT_MARKER.length) »
            		   <li class="sentence row form-group no-gutters">
            		     <div class="col-md-10">
            		       <label id="label-«idgen»-«position»" class="sentence-label" for="«idgen»-«position»">
            		         «left»
            		         <input id="«idgen»-«position»" 
            		          class="d-inline form-control missing-word-candidate" type="text"
            		          aria-labelledby="label-«idgen»-«position» result-«idgen»-«position»"
            		          aria-label="«i18n.getMessage("missing-words-input-label")»"
            		          name="«idgen»-«position»">
            			     «right»
            			   </label>
            		     </div>
            			 <div id="result-«idgen»-«position»" class="iconresult centered col-md-2"></div>
            		   </li>
            		«ENDFOR»
        		    </ul>
        		    <div class="col-12 resultado centered mb-4" id="result-«idgen»" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
        		    <div class="col-12 col-sm-6 mb-2">
                      <button type="button" class="btn btn-block btn-gamification btn-success btn-check">«i18n.getMessage("HelpCheckAnswer")»</button>
                    </div>
                    <div class="col-12 col-sm-6 mb-2">
                      <button type="button" class="btn btn-block btn-secondary btn-reset">«i18n.getMessage("ResetAnswer")»</button>
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