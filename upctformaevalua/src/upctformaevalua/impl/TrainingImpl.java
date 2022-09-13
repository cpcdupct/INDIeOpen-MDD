/**
 */
package upctformaevalua.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctformaevalua.Training;
import upctformaevalua.TypeGrade;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.TrainingImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link upctformaevalua.impl.TrainingImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingImpl extends EvaluationUnitImpl implements Training {
	/**
	 * The default value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected int attempts = ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final TypeGrade GRADE_EDEFAULT = TypeGrade.HIGHEST;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected TypeGrade grade = GRADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.TRAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttempts() {
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttempts(int newAttempts) {
		int oldAttempts = attempts;
		attempts = newAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.TRAINING__ATTEMPTS, oldAttempts, attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeGrade getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(TypeGrade newGrade) {
		TypeGrade oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.TRAINING__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaevaluaPackage.TRAINING__ATTEMPTS:
				return getAttempts();
			case UpctformaevaluaPackage.TRAINING__GRADE:
				return getGrade();
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
			case UpctformaevaluaPackage.TRAINING__ATTEMPTS:
				setAttempts((Integer)newValue);
				return;
			case UpctformaevaluaPackage.TRAINING__GRADE:
				setGrade((TypeGrade)newValue);
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
			case UpctformaevaluaPackage.TRAINING__ATTEMPTS:
				setAttempts(ATTEMPTS_EDEFAULT);
				return;
			case UpctformaevaluaPackage.TRAINING__GRADE:
				setGrade(GRADE_EDEFAULT);
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
			case UpctformaevaluaPackage.TRAINING__ATTEMPTS:
				return attempts != ATTEMPTS_EDEFAULT;
			case UpctformaevaluaPackage.TRAINING__GRADE:
				return grade != GRADE_EDEFAULT;
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
		result.append(" (Attempts: ");
		result.append(attempts);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //TrainingImpl
