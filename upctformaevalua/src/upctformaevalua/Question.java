/**
 */
package upctformaevalua;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.Question#getCorrectfeedback <em>Correctfeedback</em>}</li>
 *   <li>{@link upctformaevalua.Question#getIncorrectfeedback <em>Incorrectfeedback</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctfeedback</em>' attribute.
	 * @see #setCorrectfeedback(String)
	 * @see upctformaevalua.UpctformaevaluaPackage#getQuestion_Correctfeedback()
	 * @model
	 * @generated
	 */
	String getCorrectfeedback();

	/**
	 * Sets the value of the '{@link upctformaevalua.Question#getCorrectfeedback <em>Correctfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctfeedback</em>' attribute.
	 * @see #getCorrectfeedback()
	 * @generated
	 */
	void setCorrectfeedback(String value);

	/**
	 * Returns the value of the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorrectfeedback</em>' attribute.
	 * @see #setIncorrectfeedback(String)
	 * @see upctformaevalua.UpctformaevaluaPackage#getQuestion_Incorrectfeedback()
	 * @model
	 * @generated
	 */
	String getIncorrectfeedback();

	/**
	 * Sets the value of the '{@link upctformaevalua.Question#getIncorrectfeedback <em>Incorrectfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incorrectfeedback</em>' attribute.
	 * @see #getIncorrectfeedback()
	 * @generated
	 */
	void setIncorrectfeedback(String value);

} // Question
