/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.RecordValue#getRecordvalues <em>Recordvalues</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getRecordValue()
 * @model
 * @generated
 */
public interface RecordValue extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Recordvalues</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.FieldValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recordvalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recordvalues</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getRecordValue_Recordvalues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FieldValue> getRecordvalues();

} // RecordValue
