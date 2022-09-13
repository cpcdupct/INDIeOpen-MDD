package org.xtext.generator

import upctforma.Row
import java.util.List
import upctforma.ContentElement
import org.eclipse.emf.ecore.EObject

class ElementRow implements ContentGeneration<Row>{
	def <T extends EObject> T getContainerOfType(EObject ele, Class<T> type) {
		for (var EObject e = ele.eContainer(); e != null; e = e.eContainer())
			if (type.isInstance(e))
				return type.cast(e);
		return null;
	}

	override generate(Row row, Output output,String secId, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){
		var boolean hasRowParent= getContainerOfType(row, Row) != null;
		
		output.addStrElement('''
				<div class="row bgwhitecab2">
			''');
		
		for (var z = 0; z < row.columns.length; z++){		
			var secId2 = secId + "c" + z.toString();	
			WidgetFactory.getElement(output, args, z, row.columns.get(z), secId2, title, tipoUnidad, origin, headingLevel);
		}

		output.addStrElement('''			
				</div>
		''');		
	}	
}