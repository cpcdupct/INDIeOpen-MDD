/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.WidgetType#getWidgettypeelements <em>Widgettypeelements</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getWidgetType()
 * @model
 * @generated
 */
public interface WidgetType extends Type {
	/**
	 * Returns the value of the '<em><b>Widgettypeelements</b></em>' reference list.
	 * The list contents are of type {@link upctforma.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgettypeelements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgettypeelements</em>' reference list.
	 * @see upctforma.UpctformaPackage#getWidgetType_Widgettypeelements()
	 * @model required="true"
	 * @generated
	 */
	EList<Type> getWidgettypeelements();

} // WidgetType
