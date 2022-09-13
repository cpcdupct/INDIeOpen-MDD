/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.UseTemplate#getTypetemplate <em>Typetemplate</em>}</li>
 *   <li>{@link upctforma.UseTemplate#getTemplateelements <em>Templateelements</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getUseTemplate()
 * @model
 * @generated
 */
public interface UseTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Typetemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typetemplate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typetemplate</em>' reference.
	 * @see #setTypetemplate(TemplateDef)
	 * @see upctforma.UpctformaPackage#getUseTemplate_Typetemplate()
	 * @model
	 * @generated
	 */
	TemplateDef getTypetemplate();

	/**
	 * Sets the value of the '{@link upctforma.UseTemplate#getTypetemplate <em>Typetemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typetemplate</em>' reference.
	 * @see #getTypetemplate()
	 * @generated
	 */
	void setTypetemplate(TemplateDef value);

	/**
	 * Returns the value of the '<em><b>Templateelements</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.ContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templateelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templateelements</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getUseTemplate_Templateelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentElement> getTemplateelements();

} // UseTemplate
