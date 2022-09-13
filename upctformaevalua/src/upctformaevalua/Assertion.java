/**
 */
package upctformaevalua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.Assertion#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Statement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see upctformaevalua.UpctformaevaluaPackage#getAssertion_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link upctformaevalua.Assertion#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // Assertion
