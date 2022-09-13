package org.xtext.generator

import upctforma.Text
import java.util.List
import upctforma.ContentElement
import static extension org.xtext.generator.helpers.StringHelper.*
import static extension org.xtext.generator.helpers.HTMLHelper.*

class ElementText implements ContentGeneration<Text>{

	override generate(Text te, Output output,String secId, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){
		output.addStrElement(te.html.replaceHeadings(headingLevel).parse(te).fixInvalidHtml);
	}
	
}