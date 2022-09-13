/**
 */
package upctformaevalua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctformaevalua.Assertion;
import upctformaevalua.TrueOrFalse;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True Or False</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.TrueOrFalseImpl#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrueOrFalseImpl extends QuestionImpl implements TrueOrFalse {
	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assertion> assertions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueOrFalseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.TRUE_OR_FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
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
			case UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS:
				return getAssertions();
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
			case UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
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
			case UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS:
				getAssertions().clear();
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
			case UpctformaevaluaPackage.TRUE_OR_FALSE__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrueOrFalseImpl
