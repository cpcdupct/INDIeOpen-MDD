package org.xtext.generator

import upctforma.ContentElement
import java.util.List

interface ContentGeneration<T extends ContentElement> {	
	def generate(T element, Output output, String secId, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){} 
}
	