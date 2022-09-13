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

import upctforma.Column;
import upctforma.Row;
import upctforma.UpctformaPackage;
import upctforma.UseTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.RowImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link upctforma.impl.RowImpl#getUsetemplate <em>Usetemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends CompositeImpl implements Row {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getUsetemplate() <em>Usetemplate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsetemplate()
	 * @generated
	 * @ordered
	 */
	protected UseTemplate usetemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, UpctformaPackage.ROW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseTemplate getUsetemplate() {
		return usetemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsetemplate(UseTemplate newUsetemplate, NotificationChain msgs) {
		UseTemplate oldUsetemplate = usetemplate;
		usetemplate = newUsetemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpctformaPackage.ROW__USETEMPLATE, oldUsetemplate, newUsetemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsetemplate(UseTemplate newUsetemplate) {
		if (newUsetemplate != usetemplate) {
			NotificationChain msgs = null;
			if (usetemplate != null)
				msgs = ((InternalEObject)usetemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.ROW__USETEMPLATE, null, msgs);
			if (newUsetemplate != null)
				msgs = ((InternalEObject)newUsetemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.ROW__USETEMPLATE, null, msgs);
			msgs = basicSetUsetemplate(newUsetemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.ROW__USETEMPLATE, newUsetemplate, newUsetemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.ROW__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.ROW__USETEMPLATE:
				return basicSetUsetemplate(null, msgs);
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
			case UpctformaPackage.ROW__COLUMNS:
				return getColumns();
			case UpctformaPackage.ROW__USETEMPLATE:
				return getUsetemplate();
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
			case UpctformaPackage.ROW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case UpctformaPackage.ROW__USETEMPLATE:
				setUsetemplate((UseTemplate)newValue);
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
			case UpctformaPackage.ROW__COLUMNS:
				getColumns().clear();
				return;
			case UpctformaPackage.ROW__USETEMPLATE:
				setUsetemplate((UseTemplate)null);
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
			case UpctformaPackage.ROW__COLUMNS:
				return columns != null && !columns.isEmpty();
			case UpctformaPackage.ROW__USETEMPLATE:
				return usetemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //RowImpl
