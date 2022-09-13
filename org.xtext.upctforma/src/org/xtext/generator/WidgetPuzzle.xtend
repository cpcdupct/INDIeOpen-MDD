package org.xtext.generator

import java.util.List
import org.xtext.generator.helpers.GamificationHelper
import org.xtext.generator.helpers.SpeechToActionHelper
import upctforma.ContentElement
import upctforma.FieldValue
import upctforma.Image
import upctforma.ListValue
import upctforma.Number
import upctforma.RecordValue
import upctforma.Widget
import static extension org.xtext.generator.helpers.StringHelper.*
import static upctforma.ContentUnitType.GAMIFICATION_VALUE

import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification
import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.Base64
import upctforma.Text

class WidgetPuzzle implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {
    		var RecordValue puzzle;
    		if (tipo==1){
    			puzzle = widget.widgetelements.get(0) as RecordValue;	
    		}else{
    			val arge = args.get(j) as Widget;				
    			puzzle = arge.widgetelements.get(0) as RecordValue;
    		}
    		
    		var background = ((puzzle.recordvalues.get(0) as FieldValue).fieldvalue) as Image;
    		var pieces = ((puzzle.recordvalues.get(1) as FieldValue).fieldvalue) as ListValue;    
            var List<Integer> positions = IntStream.range(0, pieces.listvalues.length).boxed().collect(
                    Collectors.toList());
            
            val payload = '''
                     «FOR piece : pieces.listvalues BEFORE '[' SEPARATOR ',' AFTER ']'»
                        « var record = piece as RecordValue »
                        { "x": « (record.recordvalues.get(0).fieldvalue as Number).num », 
                          "y": « (record.recordvalues.get(1).fieldvalue as Number).num », 
                          "w": « (record.recordvalues.get(2).fieldvalue as Number).num », 
                          "h": « (record.recordvalues.get(3).fieldvalue as Number).num », 
                          "altImg": « (record.recordvalues.get(4).fieldvalue as Text).html.json», 
                          "altRect": « (record.recordvalues.get(5).fieldvalue as Text).html.json» }
                     «ENDFOR»'''             

             var content = '''
             «IF tipoUnidad == GAMIFICATION_VALUE »
             <section class="bgwhitecab2">
               <div class="container">
             «ENDIF»
             <div class="content-element">
               <div class="row">
                 <div class="col-md-12 interview">
                   <h«headingLevel» id="heading-«idgen»">
                     <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpPuzzle")}»
                       « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                       « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                   </h«headingLevel»>
                   <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                 </div>
               </div>
               <div class="row">
                 <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
               </div>
               <div id="«idgen»" role="application" class="row no-gutters widget-puzzle" data-content="«Base64.encoder.encodeToString(payload.getBytes("UTF-8"))»">
                   <ul id="pieces-list-«idgen»" class="pieces-list grid col-12 col-md-3 mb-4 ">
                   «FOR position : positions »
                   <li class="piece-placeholder">
                      <div class="dropdown">
                        <div id="dropdown-piece-«idgen»-«position»" role="menu" aria-labelledby="heading-dropdown-«idgen»-«position»" class="dropdown-menu" tabindex="-1">
                          <h«headingLevel+1» class="dropdown-title" id="heading-dropdown-«idgen»-«position»">«i18n.getMessage("puzzle-move-to")»</h«headingLevel+1»>
                          <ul class="column-options" role="none">
                          «FOR otherpos : positions »
                            <li class="dropdown-item" role="none">
                              <a role="menuitem" id="clip-link-«idgen»-«position»-«otherpos»" data-pos="«otherpos + 1»" class="clip-link" href="#" aria-labelledby="clip-link-«idgen»-«position»-«otherpos» alt-text-«idgen»-«otherpos»">
                              <span class="sr-only">«i18n.getMessage("puzzle-item")» </span>« otherpos + 1 » </a>
                            </li>
                          «ENDFOR»
                          </ul>
                        </div>
                      </div>
                   </li>
                   «ENDFOR»
                   </ul>
                   <div class="col-12 col-md-9 mb-4">
                     <div class="wrapper position-relative d-inline-block">
                       <img id="img-«idgen»" data-src="«background.url»" alt="" class="puzzle-background img-responsive" «if (background.type.value == 1) 'style="width:100%;"'» />
                       <svg class="interactive-layer" aria-labelledby="img-title-«idgen»">
                         <title id="img-title-«idgen»">«background.alt»</title>
                       «FOR position : positions »
                         « var piece = pieces.listvalues.get(position)»
                         « var record = piece as RecordValue »
                         « var x = record.recordvalues.get(0).fieldvalue as Number »
                         « var y = record.recordvalues.get(1).fieldvalue as Number »
                         « var w = record.recordvalues.get(2).fieldvalue as Number »
                         « var h = record.recordvalues.get(3).fieldvalue as Number »
                         <g aria-hidden="true" class="clip-group dropdown">
                           <circle class="clip-text-circle" cx="«x.num + w.num/2»" cy="«y.num + h.num/2»" r="«Math.min(40, Math.min(h.num, w.num)/2)»" />
                           <text id="text-«idgen»-«position»" class="clip-text" x="«x.num + w.num/2»" y="«y.num + h.num/2»"><tspan class="sr-only">«i18n.getMessage("puzzle-item")» </tspan> «position + 1»</text>
                         </g>
                       «ENDFOR»
                       «FOR position : positions »
                       « var piece = pieces.listvalues.get(position)»
                       « var record = piece as RecordValue »
                       « var x = record.recordvalues.get(0).fieldvalue as Number »
                       « var y = record.recordvalues.get(1).fieldvalue as Number »
                       « var w = record.recordvalues.get(2).fieldvalue as Number »
                       « var h = record.recordvalues.get(3).fieldvalue as Number »
                       « var alt = (record.recordvalues.get(5).fieldvalue as Text).html »
                       <foreignObject class="clip-placeholder" x="«x.num»" y="«y.num»" width="«w.num»" height="«h.num»">
                         <div class="hidden" id="alt-text-«idgen»-«position»">«alt»</div>
                         <div role="region" 
                            aria-labelledby="text-«idgen»-«position» alt-text-«idgen»-«position»"
                            id="piece-wrapper-«idgen»-«position»" class="piece-wrapper" data-pos="«position + 1»" xmlns="http://www.w3.org/1999/xhtml"></div>
                       </foreignObject>
                      «ENDFOR»
                       </svg>
                     </div>
                   </div>
    		   </div>
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
    	}
	}
	
}