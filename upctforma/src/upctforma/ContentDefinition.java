/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.ContentDefinition#getTemplates <em>Templates</em>}</li>
 *   <li>{@link upctforma.ContentDefinition#getImports <em>Imports</em>}</li>
 *   <li>{@link upctforma.ContentDefinition#getUnit <em>Unit</em>}</li>
 *   <li>{@link upctforma.ContentDefinition#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getContentDefinition()
 * @model
 * @generated
 */
public interface ContentDefinition extends NameElement {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.TemplateDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getContentDefinition_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateDef> getTemplates();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getContentDefinition_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(ContentUnit)
	 * @see upctforma.UpctformaPackage#getContentDefinition_Unit()
	 * @model containment="true"
	 * @generated
	 */
	ContentUnit getUnit();

	/**
	 * Sets the value of the '{@link upctforma.ContentDefinition#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ContentUnit value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getContentDefinition_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // ContentDefinition
