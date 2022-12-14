/*
 * generated by Xtext 2.12.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import upctforma.ContentUnit
import org.xtext.generator.config.ConfigGenerator

class UpctformaGenerator extends AbstractGenerator {
	val PLATFORM_VERSION = '''Platform version « ConfigGenerator.INSTANCE.version »''';
	var String origin = '';

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	
		for (e : resource.allContents.toIterable.filter(ContentUnit)){
			compile(e,fsa)
		}
	}
	
	def compile(ContentUnit cu, IFileSystemAccess2 fsa){	
		switch cu.language.value{
			case 0: {i18n.setLocale("en","IE");}    
		   	case 1: {i18n.setLocale("es","ES");}
		   	case 2: {i18n.setLocale("fr","FR");}
		   	case 3: {i18n.setLocale("el","EL");}
		   	case 4: {i18n.setLocale("lt","LT");}
		}
		var output = new Output(fsa, cu, PLATFORM_VERSION);	
		var LearningUnit learningunit = UnitFactory.getLearningUnit(cu,PLATFORM_VERSION); 
		learningunit.setHeader1(output);
		if (cu.email.contains('upct')){
			origin = "upctforma";
		}else{
			origin = "indieopen";
		}
											
		for (var i = 0; i < cu.sections.length; i++){
			WidgetFactory.processSection(output, cu.sections.get(i),i, cu.type.value, origin, 2);			
		}
		learningunit.setHeader2(output);
		output.writeOutput();	
	} 
}