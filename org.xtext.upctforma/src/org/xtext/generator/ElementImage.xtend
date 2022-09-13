package org.xtext.generator

import upctforma.Image
import java.util.List
import upctforma.ContentElement

class ElementImage  implements ContentGeneration<Image>{
	
	override generate(Image image, Output output, String secId, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){
		output.addStrElement('''<img loading="lazy" src="«image.url»" alt="«image.alt»" title="Imagen" class="img-responsive" «if (image.type.value == 1) 'style="width:100%;"'»>''');
	}
}