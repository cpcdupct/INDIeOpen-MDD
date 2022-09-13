/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import upctforma.Text;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.TextImpl#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends SimpleElementImpl implements Text {
	/**
	 * The default value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected String html = HTML_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtml() {
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtml(String newHtml) {
		String oldHtml = html;
		html = newHtml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.TEXT__HTML, oldHtml, html));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.TEXT__HTML:
				return getHtml();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformaPackage.TEXT__HTML:
				setHtml((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UpctformaPackage.TEXT__HTML:
				setHtml(HTML_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UpctformaPackage.TEXT__HTML:
				return HTML_EDEFAULT == null ? html != null : !HTML_EDEFAULT.equals(html);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (html: ");
		result.append(html);
		result.append(')');
		return result.toString();
	}

} //TextImpl
