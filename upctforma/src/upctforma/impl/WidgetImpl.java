/**
 */
package upctforma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctforma.ContentElement;
import upctforma.NameElement;
import upctforma.UpctformaPackage;
import upctforma.Widget;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link upctforma.impl.WidgetImpl#getWidgettype <em>Widgettype</em>}</li>
 *   <li>{@link upctforma.impl.WidgetImpl#getWidgetelements <em>Widgetelements</em>}</li>
 *   <li>{@link upctforma.impl.WidgetImpl#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends ContentElementImpl implements Widget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgettype() <em>Widgettype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgettype()
	 * @generated
	 * @ordered
	 */
	protected WidgetType widgettype;

	/**
	 * The cached value of the '{@link #getWidgetelements() <em>Widgetelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentElement> widgetelements;

	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetType getWidgettype() {
		if (widgettype != null && widgettype.eIsProxy()) {
			InternalEObject oldWidgettype = (InternalEObject)widgettype;
			widgettype = (WidgetType)eResolveProxy(oldWidgettype);
			if (widgettype != oldWidgettype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.WIDGET__WIDGETTYPE, oldWidgettype, widgettype));
			}
		}
		return widgettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetType basicGetWidgettype() {
		return widgettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidgettype(WidgetType newWidgettype) {
		WidgetType oldWidgettype = widgettype;
		widgettype = newWidgettype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__WIDGETTYPE, oldWidgettype, widgettype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentElement> getWidgetelements() {
		if (widgetelements == null) {
			widgetelements = new EObjectContainmentEList<ContentElement>(ContentElement.class, this, UpctformaPackage.WIDGET__WIDGETELEMENTS);
		}
		return widgetelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelp(String newHelp) {
		String oldHelp = help;
		help = newHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.WIDGET__HELP, oldHelp, help));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return ((InternalEList<?>)getWidgetelements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.WIDGET__NAME:
				return getName();
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				if (resolve) return getWidgettype();
				return basicGetWidgettype();
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return getWidgetelements();
			case UpctformaPackage.WIDGET__HELP:
				return getHelp();
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
			case UpctformaPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				setWidgettype((WidgetType)newValue);
				return;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				getWidgetelements().clear();
				getWidgetelements().addAll((Collection<? extends ContentElement>)newValue);
				return;
			case UpctformaPackage.WIDGET__HELP:
				setHelp((String)newValue);
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
			case UpctformaPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				setWidgettype((WidgetType)null);
				return;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				getWidgetelements().clear();
				return;
			case UpctformaPackage.WIDGET__HELP:
				setHelp(HELP_EDEFAULT);
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
			case UpctformaPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UpctformaPackage.WIDGET__WIDGETTYPE:
				return widgettype != null;
			case UpctformaPackage.WIDGET__WIDGETELEMENTS:
				return widgetelements != null && !widgetelements.isEmpty();
			case UpctformaPackage.WIDGET__HELP:
				return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NameElement.class) {
			switch (derivedFeatureID) {
				case UpctformaPackage.WIDGET__NAME: return UpctformaPackage.NAME_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NameElement.class) {
			switch (baseFeatureID) {
				case UpctformaPackage.NAME_ELEMENT__NAME: return UpctformaPackage.WIDGET__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", help: ");
		result.append(help);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
