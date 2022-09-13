/**
 */
package upctformaevalua.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import upctformaevalua.Question;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.QuestionImpl#getCorrectfeedback <em>Correctfeedback</em>}</li>
 *   <li>{@link upctformaevalua.impl.QuestionImpl#getIncorrectfeedback <em>Incorrectfeedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getCorrectfeedback() <em>Correctfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectfeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRECTFEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrectfeedback() <em>Correctfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectfeedback()
	 * @generated
	 * @ordered
	 */
	protected String correctfeedback = CORRECTFEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncorrectfeedback() <em>Incorrectfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorrectfeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String INCORRECTFEEDBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncorrectfeedback() <em>Incorrectfeedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorrectfeedback()
	 * @generated
	 * @ordered
	 */
	protected String incorrectfeedback = INCORRECTFEEDBACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrectfeedback() {
		return correctfeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectfeedback(String newCorrectfeedback) {
		String oldCorrectfeedback = correctfeedback;
		correctfeedback = newCorrectfeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.QUESTION__CORRECTFEEDBACK, oldCorrectfeedback, correctfeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncorrectfeedback() {
		return incorrectfeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncorrectfeedback(String newIncorrectfeedback) {
		String oldIncorrectfeedback = incorrectfeedback;
		incorrectfeedback = newIncorrectfeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.QUESTION__INCORRECTFEEDBACK, oldIncorrectfeedback, incorrectfeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaevaluaPackage.QUESTION__CORRECTFEEDBACK:
				return getCorrectfeedback();
			case UpctformaevaluaPackage.QUESTION__INCORRECTFEEDBACK:
				return getIncorrectfeedback();
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
			case UpctformaevaluaPackage.QUESTION__CORRECTFEEDBACK:
				setCorrectfeedback((String)newValue);
				return;
			case UpctformaevaluaPackage.QUESTION__INCORRECTFEEDBACK:
				setIncorrectfeedback((String)newValue);
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
			case UpctformaevaluaPackage.QUESTION__CORRECTFEEDBACK:
				setCorrectfeedback(CORRECTFEEDBACK_EDEFAULT);
				return;
			case UpctformaevaluaPackage.QUESTION__INCORRECTFEEDBACK:
				setIncorrectfeedback(INCORRECTFEEDBACK_EDEFAULT);
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
			case UpctformaevaluaPackage.QUESTION__CORRECTFEEDBACK:
				return CORRECTFEEDBACK_EDEFAULT == null ? correctfeedback != null : !CORRECTFEEDBACK_EDEFAULT.equals(correctfeedback);
			case UpctformaevaluaPackage.QUESTION__INCORRECTFEEDBACK:
				return INCORRECTFEEDBACK_EDEFAULT == null ? incorrectfeedback != null : !INCORRECTFEEDBACK_EDEFAULT.equals(incorrectfeedback);
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
		result.append(" (correctfeedback: ");
		result.append(correctfeedback);
		result.append(", incorrectfeedback: ");
		result.append(incorrectfeedback);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
