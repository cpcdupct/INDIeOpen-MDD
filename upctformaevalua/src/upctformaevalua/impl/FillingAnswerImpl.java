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

import upctformaevalua.FillingAnswer;
import upctformaevalua.Hole;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filling Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.FillingAnswerImpl#getHoles <em>Holes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FillingAnswerImpl extends QuestionImpl implements FillingAnswer {
	/**
	 * The cached value of the '{@link #getHoles() <em>Holes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Hole> holes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillingAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.FILLING_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hole> getHoles() {
		if (holes == null) {
			holes = new EObjectContainmentEList<Hole>(Hole.class, this, UpctformaevaluaPackage.FILLING_ANSWER__HOLES);
		}
		return holes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaevaluaPackage.FILLING_ANSWER__HOLES:
				return ((InternalEList<?>)getHoles()).basicRemove(otherEnd, msgs);
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
			case UpctformaevaluaPackage.FILLING_ANSWER__HOLES:
				return getHoles();
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
			case UpctformaevaluaPackage.FILLING_ANSWER__HOLES:
				getHoles().clear();
				getHoles().addAll((Collection<? extends Hole>)newValue);
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
			case UpctformaevaluaPackage.FILLING_ANSWER__HOLES:
				getHoles().clear();
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
			case UpctformaevaluaPackage.FILLING_ANSWER__HOLES:
				return holes != null && !holes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FillingAnswerImpl
