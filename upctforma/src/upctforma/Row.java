/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Row#getColumns <em>Columns</em>}</li>
 *   <li>{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends Composite {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Usetemplate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usetemplate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usetemplate</em>' containment reference.
	 * @see #setUsetemplate(UseTemplate)
	 * @see upctforma.UpctformaPackage#getRow_Usetemplate()
	 * @model containment="true"
	 * @generated
	 */
	UseTemplate getUsetemplate();

	/**
	 * Sets the value of the '{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usetemplate</em>' containment reference.
	 * @see #getUsetemplate()
	 * @generated
	 */
	void setUsetemplate(UseTemplate value);

} // Row
