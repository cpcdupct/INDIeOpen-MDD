/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.MultipleAnswer#getStatements <em>Statements</em>}</li>
 *   <li>{@link upctformaevalua.MultipleAnswer#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getMultipleAnswer()
 * @model
 * @generated
 */
public interface MultipleAnswer extends Question {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference.
	 * @see #setStatements(Paragraph)
	 * @see upctformaevalua.UpctformaevaluaPackage#getMultipleAnswer_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Paragraph getStatements();

	/**
	 * Sets the value of the '{@link upctformaevalua.MultipleAnswer#getStatements <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' containment reference.
	 * @see #getStatements()
	 * @generated
	 */
	void setStatements(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Multiple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getMultipleAnswer_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Multiple> getAnswers();

} // MultipleAnswer
