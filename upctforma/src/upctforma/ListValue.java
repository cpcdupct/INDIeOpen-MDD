/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.ListValue#getListvalues <em>Listvalues</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getListValue()
 * @model
 * @generated
 */
public interface ListValue extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Listvalues</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.ContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listvalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listvalues</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getListValue_Listvalues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContentElement> getListvalues();

} // ListValue
