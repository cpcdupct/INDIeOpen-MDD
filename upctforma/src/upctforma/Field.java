/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Field#getFieldtype <em>Fieldtype</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NameElement {
	/**
	 * Returns the value of the '<em><b>Fieldtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fieldtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldtype</em>' reference.
	 * @see #setFieldtype(Type)
	 * @see upctforma.UpctformaPackage#getField_Fieldtype()
	 * @model required="true"
	 * @generated
	 */
	Type getFieldtype();

	/**
	 * Sets the value of the '{@link upctforma.Field#getFieldtype <em>Fieldtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldtype</em>' reference.
	 * @see #getFieldtype()
	 * @generated
	 */
	void setFieldtype(Type value);

} // Field
