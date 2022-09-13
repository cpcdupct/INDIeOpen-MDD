/**
 */
package upctformaevalua.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import upctformaevalua.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage
 * @generated
 */
public class UpctformaevaluaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformaevaluaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaevaluaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UpctformaevaluaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpctformaevaluaSwitch<Adapter> modelSwitch =
		new UpctformaevaluaSwitch<Adapter>() {
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter caseEvaluationUnit(EvaluationUnit object) {
				return createEvaluationUnitAdapter();
			}
			@Override
			public Adapter caseTraining(Training object) {
				return createTrainingAdapter();
			}
			@Override
			public Adapter caseFinal(Final object) {
				return createFinalAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseHole(Hole object) {
				return createHoleAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseSingleAnswer(SingleAnswer object) {
				return createSingleAnswerAdapter();
			}
			@Override
			public Adapter caseMultipleAnswer(MultipleAnswer object) {
				return createMultipleAnswerAdapter();
			}
			@Override
			public Adapter caseFillingAnswer(FillingAnswer object) {
				return createFillingAnswerAdapter();
			}
			@Override
			public Adapter caseTrueOrFalse(TrueOrFalse object) {
				return createTrueOrFalseAdapter();
			}
			@Override
			public Adapter caseNameElement(NameElement object) {
				return createNameElementAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseSingle(Single object) {
				return createSingleAdapter();
			}
			@Override
			public Adapter caseMultiple(Multiple object) {
				return createMultipleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.EvaluationUnit <em>Evaluation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.EvaluationUnit
	 * @generated
	 */
	public Adapter createEvaluationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Training
	 * @generated
	 */
	public Adapter createTrainingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Final
	 * @generated
	 */
	public Adapter createFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Hole
	 * @generated
	 */
	public Adapter createHoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.SingleAnswer <em>Single Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.SingleAnswer
	 * @generated
	 */
	public Adapter createSingleAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.MultipleAnswer <em>Multiple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.MultipleAnswer
	 * @generated
	 */
	public Adapter createMultipleAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.FillingAnswer <em>Filling Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.FillingAnswer
	 * @generated
	 */
	public Adapter createFillingAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.TrueOrFalse <em>True Or False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.TrueOrFalse
	 * @generated
	 */
	public Adapter createTrueOrFalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.NameElement
	 * @generated
	 */
	public Adapter createNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Single <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Single
	 * @generated
	 */
	public Adapter createSingleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctformaevalua.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctformaevalua.Multiple
	 * @generated
	 */
	public Adapter createMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UpctformaevaluaAdapterFactory
