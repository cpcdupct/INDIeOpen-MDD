/**
 */
package upctformaevalua.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import upctformaevalua.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage
 * @generated
 */
public class UpctformaevaluaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformaevaluaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaevaluaSwitch() {
		if (modelPackage == null) {
			modelPackage = UpctformaevaluaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UpctformaevaluaPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = caseNameElement(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.EVALUATION_UNIT: {
				EvaluationUnit evaluationUnit = (EvaluationUnit)theEObject;
				T result = caseEvaluationUnit(evaluationUnit);
				if (result == null) result = caseNameElement(evaluationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.TRAINING: {
				Training training = (Training)theEObject;
				T result = caseTraining(training);
				if (result == null) result = caseEvaluationUnit(training);
				if (result == null) result = caseNameElement(training);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.FINAL: {
				Final final_ = (Final)theEObject;
				T result = caseFinal(final_);
				if (result == null) result = caseEvaluationUnit(final_);
				if (result == null) result = caseNameElement(final_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseStatement(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.HOLE: {
				Hole hole = (Hole)theEObject;
				T result = caseHole(hole);
				if (result == null) result = caseStatement(hole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseStatement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.SINGLE_ANSWER: {
				SingleAnswer singleAnswer = (SingleAnswer)theEObject;
				T result = caseSingleAnswer(singleAnswer);
				if (result == null) result = caseQuestion(singleAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.MULTIPLE_ANSWER: {
				MultipleAnswer multipleAnswer = (MultipleAnswer)theEObject;
				T result = caseMultipleAnswer(multipleAnswer);
				if (result == null) result = caseQuestion(multipleAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.FILLING_ANSWER: {
				FillingAnswer fillingAnswer = (FillingAnswer)theEObject;
				T result = caseFillingAnswer(fillingAnswer);
				if (result == null) result = caseQuestion(fillingAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.TRUE_OR_FALSE: {
				TrueOrFalse trueOrFalse = (TrueOrFalse)theEObject;
				T result = caseTrueOrFalse(trueOrFalse);
				if (result == null) result = caseQuestion(trueOrFalse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.NAME_ELEMENT: {
				NameElement nameElement = (NameElement)theEObject;
				T result = caseNameElement(nameElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.ANSWER: {
				Answer answer = (Answer)theEObject;
				T result = caseAnswer(answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.SINGLE: {
				Single single = (Single)theEObject;
				T result = caseSingle(single);
				if (result == null) result = caseAnswer(single);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaevaluaPackage.MULTIPLE: {
				Multiple multiple = (Multiple)theEObject;
				T result = caseMultiple(multiple);
				if (result == null) result = caseAnswer(multiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationUnit(EvaluationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraining(Training object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinal(Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHole(Hole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleAnswer(SingleAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleAnswer(MultipleAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filling Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filling Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillingAnswer(FillingAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Or False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Or False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueOrFalse(TrueOrFalse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameElement(NameElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingle(Single object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiple(Multiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UpctformaevaluaSwitch
