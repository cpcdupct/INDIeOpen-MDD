/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.TemplateDef#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getTemplateDef()
 * @model
 * @generated
 */
public interface TemplateDef extends NameElement {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getTemplateDef_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

} // TemplateDef
