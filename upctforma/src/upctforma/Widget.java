/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Widget#getWidgettype <em>Widgettype</em>}</li>
 *   <li>{@link upctforma.Widget#getWidgetelements <em>Widgetelements</em>}</li>
 *   <li>{@link upctforma.Widget#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends ContentElement, NameElement {
	/**
	 * Returns the value of the '<em><b>Widgettype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgettype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgettype</em>' reference.
	 * @see #setWidgettype(WidgetType)
	 * @see upctforma.UpctformaPackage#getWidget_Widgettype()
	 * @model required="true"
	 * @generated
	 */
	WidgetType getWidgettype();

	/**
	 * Sets the value of the '{@link upctforma.Widget#getWidgettype <em>Widgettype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widgettype</em>' reference.
	 * @see #getWidgettype()
	 * @generated
	 */
	void setWidgettype(WidgetType value);

	/**
	 * Returns the value of the '<em><b>Widgetelements</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.ContentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgetelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgetelements</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getWidget_Widgetelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentElement> getWidgetelements();

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see #setHelp(String)
	 * @see upctforma.UpctformaPackage#getWidget_Help()
	 * @model
	 * @generated
	 */
	String getHelp();

	/**
	 * Sets the value of the '{@link upctforma.Widget#getHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(String value);

} // Widget
