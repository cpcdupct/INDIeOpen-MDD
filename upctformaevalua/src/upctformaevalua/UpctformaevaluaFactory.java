/**
 */
package upctformaevalua;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage
 * @generated
 */
public interface UpctformaevaluaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformaevaluaFactory eINSTANCE = upctformaevalua.impl.UpctformaevaluaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns a new object of class '<em>Evaluation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Unit</em>'.
	 * @generated
	 */
	EvaluationUnit createEvaluationUnit();

	/**
	 * Returns a new object of class '<em>Training</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training</em>'.
	 * @generated
	 */
	Training createTraining();

	/**
	 * Returns a new object of class '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final</em>'.
	 * @generated
	 */
	Final createFinal();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Hole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hole</em>'.
	 * @generated
	 */
	Hole createHole();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	Assertion createAssertion();

	/**
	 * Returns a new object of class '<em>Single Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Answer</em>'.
	 * @generated
	 */
	SingleAnswer createSingleAnswer();

	/**
	 * Returns a new object of class '<em>Multiple Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Answer</em>'.
	 * @generated
	 */
	MultipleAnswer createMultipleAnswer();

	/**
	 * Returns a new object of class '<em>Filling Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filling Answer</em>'.
	 * @generated
	 */
	FillingAnswer createFillingAnswer();

	/**
	 * Returns a new object of class '<em>True Or False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Or False</em>'.
	 * @generated
	 */
	TrueOrFalse createTrueOrFalse();

	/**
	 * Returns a new object of class '<em>Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Element</em>'.
	 * @generated
	 */
	NameElement createNameElement();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Single</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single</em>'.
	 * @generated
	 */
	Single createSingle();

	/**
	 * Returns a new object of class '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple</em>'.
	 * @generated
	 */
	Multiple createMultiple();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UpctformaevaluaPackage getUpctformaevaluaPackage();

} //UpctformaevaluaFactory
