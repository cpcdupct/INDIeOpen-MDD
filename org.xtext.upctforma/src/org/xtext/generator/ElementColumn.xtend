package org.xtext.generator

import upctforma.Column
import upctforma.ContentElement
import java.util.List

class ElementColumn  implements ContentGeneration<Column> {
	override generate(Column column, Output output,String secId, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){
		output.addStrElement('''
			 <div class="col-md-«column.width»">			
		''');
		
		for (var i = 0; i < column.elements.length; i++){
			var secId3 = secId + "e" + i.toString();
			WidgetFactory.getElement(output, args, j + i, column.elements.get(i), secId3, title, tipoUnidad, origin, headingLevel);	
		}
		
		output.addStrElement('''
		   </div>		
		'''	);
	}
	
}