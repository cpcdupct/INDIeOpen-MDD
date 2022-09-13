/*
 * generated by Xtext 2.12.0
 */
package org.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.services.UpctformaevaluaGrammarAccess
import upctformaevalua.Evaluation
import upctformaevalua.EvaluationUnit
import upctformaevalua.Question

class UpctformaevaluaFormatter extends AbstractFormatter2 {
	
	@Inject extension UpctformaevaluaGrammarAccess

	def dispatch void format(Evaluation evaluation, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (EvaluationUnit evaluationUnit : evaluation.getUnits()) {
			evaluationUnit.format;
		}
	}

	def dispatch void format(EvaluationUnit evaluationUnit, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Question question : evaluationUnit.getQuestions()) {
			question.format;
		}
	}
	
	// TODO: implement for Training, Final, SingleAnswer, MultipleAnswer, FillingAnswer, TrueOrFalse
}
