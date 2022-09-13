/**
 */
package upctformaevalua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctformaevalua.Paragraph;
import upctformaevalua.Single;
import upctformaevalua.SingleAnswer;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.SingleAnswerImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link upctformaevalua.impl.SingleAnswerImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link upctformaevalua.impl.SingleAnswerImpl#getCorrectanswer <em>Correctanswer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleAnswerImpl extends QuestionImpl implements SingleAnswer {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected Paragraph statements;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Single> answers;

	/**
	 * The default value of the '{@link #getCorrectanswer() <em>Correctanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectanswer()
	 * @generated
	 * @ordered
	 */
	protected static final int CORRECTANSWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCorrectanswer() <em>Correctanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectanswer()
	 * @generated
	 * @ordered
	 */
	protected int correctanswer = CORRECTANSWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.SINGLE_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph getStatements() {
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatements(Paragraph newStatements, NotificationChain msgs) {
		Paragraph oldStatements = statements;
		statements = newStatements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS, oldStatements, newStatements);
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
	public void setStatements(Paragraph newStatements) {
		if (newStatements != statements) {
			NotificationChain msgs = null;
			if (statements != null)
				msgs = ((InternalEObject)statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS, null, msgs);
			if (newStatements != null)
				msgs = ((InternalEObject)newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS, null, msgs);
			msgs = basicSetStatements(newStatements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS, newStatements, newStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Single> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<Single>(Single.class, this, UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCorrectanswer() {
		return correctanswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectanswer(int newCorrectanswer) {
		int oldCorrectanswer = correctanswer;
		correctanswer = newCorrectanswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.SINGLE_ANSWER__CORRECTANSWER, oldCorrectanswer, correctanswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS:
				return basicSetStatements(null, msgs);
			case UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
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
			case UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS:
				return getStatements();
			case UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS:
				return getAnswers();
			case UpctformaevaluaPackage.SINGLE_ANSWER__CORRECTANSWER:
				return getCorrectanswer();
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
			case UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS:
				setStatements((Paragraph)newValue);
				return;
			case UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Single>)newValue);
				return;
			case UpctformaevaluaPackage.SINGLE_ANSWER__CORRECTANSWER:
				setCorrectanswer((Integer)newValue);
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
			case UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS:
				setStatements((Paragraph)null);
				return;
			case UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS:
				getAnswers().clear();
				return;
			case UpctformaevaluaPackage.SINGLE_ANSWER__CORRECTANSWER:
				setCorrectanswer(CORRECTANSWER_EDEFAULT);
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
			case UpctformaevaluaPackage.SINGLE_ANSWER__STATEMENTS:
				return statements != null;
			case UpctformaevaluaPackage.SINGLE_ANSWER__ANSWERS:
				return answers != null && !answers.isEmpty();
			case UpctformaevaluaPackage.SINGLE_ANSWER__CORRECTANSWER:
				return correctanswer != CORRECTANSWER_EDEFAULT;
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
		result.append(" (correctanswer: ");
		result.append(correctanswer);
		result.append(')');
		return result.toString();
	}

} //SingleAnswerImpl
