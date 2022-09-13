/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctforma.ListType;
import upctforma.Type;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.ListTypeImpl#getListtype <em>Listtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends CompositeTypeImpl implements ListType {
	/**
	 * The cached value of the '{@link #getListtype() <em>Listtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListtype()
	 * @generated
	 * @ordered
	 */
	protected Type listtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getListtype() {
		if (listtype != null && listtype.eIsProxy()) {
			InternalEObject oldListtype = (InternalEObject)listtype;
			listtype = (Type)eResolveProxy(oldListtype);
			if (listtype != oldListtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.LIST_TYPE__LISTTYPE, oldListtype, listtype));
			}
		}
		return listtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetListtype() {
		return listtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListtype(Type newListtype) {
		Type oldListtype = listtype;
		listtype = newListtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.LIST_TYPE__LISTTYPE, oldListtype, listtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.LIST_TYPE__LISTTYPE:
				if (resolve) return getListtype();
				return basicGetListtype();
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
			case UpctformaPackage.LIST_TYPE__LISTTYPE:
				setListtype((Type)newValue);
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
			case UpctformaPackage.LIST_TYPE__LISTTYPE:
				setListtype((Type)null);
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
			case UpctformaPackage.LIST_TYPE__LISTTYPE:
				return listtype != null;
		}
		return super.eIsSet(featureID);
	}

} //ListTypeImpl
