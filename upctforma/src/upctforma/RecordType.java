/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.RecordType#getRecordtype <em>Recordtype</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends CompositeType {
	/**
	 * Returns the value of the '<em><b>Recordtype</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recordtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recordtype</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getRecordType_Recordtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getRecordtype();

} // RecordType
