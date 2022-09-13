/**
 */
package upctforma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctforma.Field;
import upctforma.RecordType;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.RecordTypeImpl#getRecordtype <em>Recordtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeImpl extends CompositeTypeImpl implements RecordType {
	/**
	 * The cached value of the '{@link #getRecordtype() <em>Recordtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> recordtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.RECORD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getRecordtype() {
		if (recordtype == null) {
			recordtype = new EObjectContainmentEList<Field>(Field.class, this, UpctformaPackage.RECORD_TYPE__RECORDTYPE);
		}
		return recordtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.RECORD_TYPE__RECORDTYPE:
				return ((InternalEList<?>)getRecordtype()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.RECORD_TYPE__RECORDTYPE:
				return getRecordtype();
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
			case UpctformaPackage.RECORD_TYPE__RECORDTYPE:
				getRecordtype().clear();
				getRecordtype().addAll((Collection<? extends Field>)newValue);
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
			case UpctformaPackage.RECORD_TYPE__RECORDTYPE:
				getRecordtype().clear();
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
			case UpctformaPackage.RECORD_TYPE__RECORDTYPE:
				return recordtype != null && !recordtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordTypeImpl
