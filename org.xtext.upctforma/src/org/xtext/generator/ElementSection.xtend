package org.xtext.generator

import upctforma.Section
import java.util.List
import upctforma.ContentElement
import java.util.ArrayList
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE

class ElementSection{
	def generate(Section section, Output output,Integer secId, Integer tipoUnidad, String origin, int headingLevel){

		var nextLevel = if (tipoUnidad == GAMIFICATION_VALUE) headingLevel else headingLevel + 1;
		output.addStrElement('''
			<section id="apdo«secId»" class="container" aria-labelledby="s«secId»">
	                <div class="row">
	                    <div class="col-md-12">
	                        <h«headingLevel» id="s«secId»" class="centered titulocabecera"><strong>«section.title»</strong></h«headingLevel»>
	                    </div>
	                </div>
		''');
		
		var href = '''«if (tipoUnidad == INTEROPERABILITY_VALUE) "<?php echo $config->get('LINK_PATH'); ?>" else if (tipoUnidad == GAMIFICATION_VALUE) "game.html" else "index.html"»''';		
		output.addStrMap('''
			<li><a class="item-link" href="«href»#apdo«secId»">«section.title»</a><ul>
		''');

	    for (var i = 0; i < section.rows.length; i++){
	    	var rowt = section.rows.get(i).usetemplate;
	    	var List<ContentElement> args = new ArrayList();
	    	if (rowt !== null){
	    		args = rowt.templateelements;
	    		for (var j = 0; j < rowt.typetemplate.rows.length; j++){
					var String idgen = "s" + secId.toString() + "r" + i.toString() + "rt" + j.toString();
					WidgetFactory.getElement(output, args, j, rowt.typetemplate.rows.get(j),idgen,section.title, tipoUnidad, origin, nextLevel);
		  		}
            } else {
	    		var String idgen = "s" + secId.toString() + "r" + i.toString();
                WidgetFactory.getElement(output, args, i, section.rows.get(i),idgen,section.title, tipoUnidad, origin, nextLevel);
            }
	    }    
	
		output.addStrMap('''
			</ul></li>
		''');
		
		output.addStrElement('''
	        </section>
		''');
		output.addStrProgesoObj(''',"section"'''.toString());
		
	}
	
}