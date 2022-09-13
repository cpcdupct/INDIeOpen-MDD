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
import upctforma.Image
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification

class WidgetCorrectWord  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		
        if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {		
    		var ListValue exercises;
    		if (tipo==1){
    		  exercises = widget.widgetelements.get(0) as ListValue;	
    		}else{
    			val arge = args.get(j) as Widget;				
    			exercises = arge.widgetelements.get(0) as ListValue;
    		}
    		var List<Integer> positions = IntStream.range(0, exercises.listvalues.length).boxed().collect(
                    Collectors.toList());
                    
             // Obtain solutions for every sentence
            val solutions = "[" + exercises.listvalues.stream.map[exercise | {
                // Get all valid combinations for each sentence
                ((exercise as RecordValue).recordvalues.get(2).fieldvalue as Text).html.json
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
                     <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpTerm")}»
                         « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                         « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                   </h«headingLevel»>
                   <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                 </div>
               </div>
               <div id="«idgen»" class="row widget-correct-word" data-content="«Base64.encoder.encodeToString(solutions.getBytes("UTF-8"))»">
                 <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
                 «FOR position : positions »
                   « val exercise = exercises.listvalues.get(position) as RecordValue »
        		   « val question = exercise.recordvalues.get(0).fieldvalue as Text »
        		   « val image = exercise.recordvalues.get(1).fieldvalue as Image »
        		   « val len = (exercise.recordvalues.get(2).fieldvalue as Text).html.length »
        		   « val List<Integer> letters = IntStream.range(0, len).boxed().collect(Collectors.toList())»
    			   <fieldset class="col-md-4 col-sm-6 centered mb-4 correct-word" aria-labelledby="heading-«idgen»-«position» image-«idgen»-«position» result-«idgen»-«position»">
    			     <legend><h«headingLevel+1» id="heading-«idgen»-«position»">«question.html»</h«headingLevel+1»></legend>
                     <div class="no-padding">
                       <figure class="m-0"><img id="image-«idgen»-«position»" src="«image.url»" alt="«image.alt»" class="img-responsive"></figure>
                     </div>
    				 <ol class="word-letters">
    				 « var i = 0 »
    			     «FOR letter : letters »
    			       <li class="word-letter"><input class="correct-word-letter form-control d-inline" aria-label="«i18n.getMessage("correct-word-letter")» «i+=1»" type="text" maxlength="1" /></li>
    			     «ENDFOR»
    				 </ol>
    				 <span id="result-«idgen»-«position»" class="iconresult centered"></span>
    			   </fieldset>
    		     «ENDFOR»
    		       <div class="col-12">
    		         <div class="row">
                       <div id="result-«idgen»" class="col-12 resultado mb-4 centered" aria-live="polite" aria-atomic="true" aria-relevant="all"></div>
                       <div class="col-12 col-sm-6 mb-2">
                         <button type="button" class="btn btn-check btn-block btn-gamification btn-success">«i18n.getMessage("HelpCheckAnswer")»</button>
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