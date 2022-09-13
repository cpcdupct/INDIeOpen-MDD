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
import upctforma.FieldValue

class WidgetMatchColumns  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		if( tipoUnidad != GAMIFICATION_VALUE || widget.belongsToGamification(idgen)) {
            var ListValue columns;
    		if (tipo==1){
                columns = widget.widgetelements.get(0) as ListValue;
    		}else{
                val arge = args.get(j) as Widget;
                columns = arge.widgetelements.get(0) as ListValue;
    		}
    		var columnLists = columns.listvalues.stream().map[col | 
    		    (((col as RecordValue).recordvalues.get(1) as FieldValue).fieldvalue as ListValue)
    		      .listvalues
    		      .stream
    		      .map[ elem | (elem as Text).html ] 
    		      .collect(Collectors.toList);
    		].collect(Collectors.toList); 
    		var terms = columnLists.stream().flatMap[col | col.stream ].collect(Collectors.toList);
    		
    		var List<Integer> positions = IntStream.range(0, columns.listvalues.length).boxed().collect(
                    Collectors.toList());
                    
            var List<Integer> termPositions = IntStream.range(0, terms.length).boxed().collect(
                Collectors.toList());
    
            val payload = '''
                     «FOR list : columnLists BEFORE '[' SEPARATOR ',' AFTER ']'»
                        «FOR term : list BEFORE '[' SEPARATOR ',' AFTER ']'» 
                          « term.json » 
                        «ENDFOR»
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
                     <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpMatchColumns")}»
                       « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                       « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                   </h«headingLevel»>
                   <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                 </div>
               </div>
               <div class="row">
                 <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
               </div>
               <div id="«idgen»" 
                    aria-labelledby="heading-«idgen»"
                    role="application" 
                    class="row widget-match-columns" 
                    data-content="«Base64.encoder.encodeToString(payload.getBytes("UTF-8"))»">
                 <div class="col-12 col-lg-3 col-md-4 col-sm-6 mb-4">
                   <div class="match-terms d-flex flex-column">
                     <h«headingLevel+1» class="match-column-heading" id="heading-«idgen»-terms">«i18n.getMessage("match-columns-terms")»</h«headingLevel+1»>
                     <ul class="column-list flex-grow-1" aria-labelledby="heading-«idgen»-terms">
                     « FOR termPosition: termPositions »
                       <li draggable="true" 
                           aria-grabbed="false"
                           class="column-term dropdown"
                           id="column-term-«idgen»-«termPosition»">
                           <button
                             tabindex="-1"
                             aria-expanded="false" 
                             aria-haspopup="true"
                             data-toggle="dropdown"
                             aria-controls="dropdown-«idgen»-«termPosition»"
                             class="btn btn-success term-button">
                           </button>
                           <div id="dropdown-«idgen»-«termPosition»" role="menu" aria-labelledby="heading-dropdown-«idgen»-«termPosition»" class="dropdown-menu" tabindex="-1">
                             <h«headingLevel+1» class="dropdown-title" id="heading-dropdown-«idgen»-«termPosition»">«i18n.getMessage("match-columns-move-to")»</h«headingLevel+1»>
                             <ul class="column-options" role="none">
                             «FOR position : positions »
                               « var column = (((columns.listvalues.get(position) as RecordValue).recordvalues.get(0) as FieldValue).fieldvalue as Text).html »
                               <li class="dropdown-item" role="none">
                                 <a role="menuitem" data-column="column-list-«idgen»-«position»" class="column-link" href="#">« column »</a>
                               </li>
                             «ENDFOR»
                             </ul>
                           </div>
                       </li>
                     « ENDFOR »
                     </ul>
                   </div>
                 </div>
                 <div class="match-columns grid col-12 col-lg-9 col-md-8 col-sm-6 mb-4">
                 «FOR position : positions »
                   <div class="match-column d-flex flex-column">
                     « var columnData = columns.listvalues.get(position) as RecordValue »
                     <h«headingLevel+1» class="match-column-heading" id="heading-«idgen»-column-«position»">
                       « ((columnData.recordvalues.get(0) as FieldValue).fieldvalue as Text).html »
                     </h«headingLevel+1»>
                     <ul id="column-list-«idgen»-«position»" aria-labelledby="heading-«idgen»-column-«position»" class="flex-grow-1 column-list"></ul>
                   </div>
    		     «ENDFOR»
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

            positions.forEach[pos |
                output.addStrProgesoObj(''',"objetivo«idgen»«pos»"''')
            ];
            output.addStrIndex(content);
            if(tipoUnidad == GAMIFICATION_VALUE) {
                output.addStrTeacher(content);
            }    
    	}
	}
	
}