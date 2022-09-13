/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctforma.Field;
import upctforma.Type;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.FieldImpl#getFieldtype <em>Fieldtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends NameElementImpl implements Field {
	/**
	 * The cached value of the '{@link #getFieldtype() <em>Fieldtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldtype()
	 * @generated
	 * @ordered
	 */
	protected Type fieldtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getFieldtype() {
		if (fieldtype != null && fieldtype.eIsProxy()) {
			InternalEObject oldFieldtype = (InternalEObject)fieldtype;
			fieldtype = (Type)eResolveProxy(oldFieldtype);
			if (fieldtype != oldFieldtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.FIELD__FIELDTYPE, oldFieldtype, fieldtype));
			}
		}
		return fieldtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetFieldtype() {
		return fieldtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldtype(Type newFieldtype) {
		Type oldFieldtype = fieldtype;
		fieldtype = newFieldtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.FIELD__FIELDTYPE, oldFieldtype, fieldtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.FIELD__FIELDTYPE:
				if (resolve) return getFieldtype();
				return basicGetFieldtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformaPackage.FIELD__FIELDTYPE:
				setFieldtype((Type)newValue);
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
			case UpctformaPackage.FIELD__FIELDTYPE:
				setFieldtype((Type)null);
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
			case UpctformaPackage.FIELD__FIELDTYPE:
				return fieldtype != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldImpl
