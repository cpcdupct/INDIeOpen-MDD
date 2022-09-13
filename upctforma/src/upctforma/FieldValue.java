/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.FieldValue#getFieldvalue <em>Fieldvalue</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getFieldValue()
 * @model
 * @generated
 */
public interface FieldValue extends NameElement {
	/**
	 * Returns the value of the '<em><b>Fieldvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fieldvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldvalue</em>' containment reference.
	 * @see #setFieldvalue(ContentElement)
	 * @see upctforma.UpctformaPackage#getFieldValue_Fieldvalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentElement getFieldvalue();

	/**
	 * Sets the value of the '{@link upctforma.FieldValue#getFieldvalue <em>Fieldvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldvalue</em>' containment reference.
	 * @see #getFieldvalue()
	 * @generated
	 */
	void setFieldvalue(ContentElement value);

} // FieldValue
