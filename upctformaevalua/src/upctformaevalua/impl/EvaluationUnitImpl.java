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
import upctformaevalua.EvaluationLanguageType;
import upctformaevalua.EvaluationUnit;
import upctformaevalua.EvaluationUnitType;
import upctformaevalua.Question;
import upctformaevalua.UnitLicenses;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getNumberquestions <em>Numberquestions</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getLicense <em>License</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getIdunidad <em>Idunidad</em>}</li>
 *   <li>{@link upctformaevalua.impl.EvaluationUnitImpl#getLearninganalytics <em>Learninganalytics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationUnitImpl extends NameElementImpl implements EvaluationUnit {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The default value of the '{@link #getNumberquestions() <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberquestions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBERQUESTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberquestions() <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberquestions()
	 * @generated
	 * @ordered
	 */
	protected int numberquestions = NUMBERQUESTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationLanguageType LANGUAGE_EDEFAULT = EvaluationLanguageType.EN;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EvaluationLanguageType language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final UnitLicenses LICENSE_EDEFAULT = UnitLicenses.PRIVATE;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected UnitLicenses license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationUnitType TYPE_EDEFAULT = EvaluationUnitType.INTEROPERABILITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EvaluationUnitType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String THEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected String theme = THEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdunidad() <em>Idunidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdunidad()
	 * @generated
	 * @ordered
	 */
	protected static final String IDUNIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdunidad() <em>Idunidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdunidad()
	 * @generated
	 * @ordered
	 */
	protected String idunidad = IDUNIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLearninganalytics() <em>Learninganalytics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearninganalytics()
	 * @generated
	 * @ordered
	 */
	protected static final int LEARNINGANALYTICS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLearninganalytics() <em>Learninganalytics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearninganalytics()
	 * @generated
	 * @ordered
	 */
	protected int learninganalytics = LEARNINGANALYTICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaevaluaPackage.Literals.EVALUATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberquestions() {
		return numberquestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberquestions(int newNumberquestions) {
		int oldNumberquestions = numberquestions;
		numberquestions = newNumberquestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS, oldNumberquestions, numberquestions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationLanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(EvaluationLanguageType newLanguage) {
		EvaluationLanguageType oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitLicenses getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(UnitLicenses newLicense) {
		UnitLicenses oldLicense = license;
		license = newLicense == null ? LICENSE_EDEFAULT : newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationUnitType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EvaluationUnitType newType) {
		EvaluationUnitType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheme(String newTheme) {
		String oldTheme = theme;
		theme = newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdunidad() {
		return idunidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdunidad(String newIdunidad) {
		String oldIdunidad = idunidad;
		idunidad = newIdunidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__IDUNIDAD, oldIdunidad, idunidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLearninganalytics() {
		return learninganalytics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearninganalytics(int newLearninganalytics) {
		int oldLearninganalytics = learninganalytics;
		learninganalytics = newLearninganalytics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaevaluaPackage.EVALUATION_UNIT__LEARNINGANALYTICS, oldLearninganalytics, learninganalytics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return getQuestions();
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				return getNumberquestions();
			case UpctformaevaluaPackage.EVALUATION_UNIT__LANGUAGE:
				return getLanguage();
			case UpctformaevaluaPackage.EVALUATION_UNIT__LICENSE:
				return getLicense();
			case UpctformaevaluaPackage.EVALUATION_UNIT__EMAIL:
				return getEmail();
			case UpctformaevaluaPackage.EVALUATION_UNIT__INSTITUTION:
				return getInstitution();
			case UpctformaevaluaPackage.EVALUATION_UNIT__TYPE:
				return getType();
			case UpctformaevaluaPackage.EVALUATION_UNIT__AUTHOR:
				return getAuthor();
			case UpctformaevaluaPackage.EVALUATION_UNIT__THEME:
				return getTheme();
			case UpctformaevaluaPackage.EVALUATION_UNIT__IDUNIDAD:
				return getIdunidad();
			case UpctformaevaluaPackage.EVALUATION_UNIT__LEARNINGANALYTICS:
				return getLearninganalytics();
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				setNumberquestions((Integer)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LANGUAGE:
				setLanguage((EvaluationLanguageType)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LICENSE:
				setLicense((UnitLicenses)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__EMAIL:
				setEmail((String)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__TYPE:
				setType((EvaluationUnitType)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__THEME:
				setTheme((String)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__IDUNIDAD:
				setIdunidad((String)newValue);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LEARNINGANALYTICS:
				setLearninganalytics((Integer)newValue);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				getQuestions().clear();
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				setNumberquestions(NUMBERQUESTIONS_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__IDUNIDAD:
				setIdunidad(IDUNIDAD_EDEFAULT);
				return;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LEARNINGANALYTICS:
				setLearninganalytics(LEARNINGANALYTICS_EDEFAULT);
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
			case UpctformaevaluaPackage.EVALUATION_UNIT__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case UpctformaevaluaPackage.EVALUATION_UNIT__NUMBERQUESTIONS:
				return numberquestions != NUMBERQUESTIONS_EDEFAULT;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case UpctformaevaluaPackage.EVALUATION_UNIT__LICENSE:
				return license != LICENSE_EDEFAULT;
			case UpctformaevaluaPackage.EVALUATION_UNIT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case UpctformaevaluaPackage.EVALUATION_UNIT__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case UpctformaevaluaPackage.EVALUATION_UNIT__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformaevaluaPackage.EVALUATION_UNIT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case UpctformaevaluaPackage.EVALUATION_UNIT__THEME:
				return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
			case UpctformaevaluaPackage.EVALUATION_UNIT__IDUNIDAD:
				return IDUNIDAD_EDEFAULT == null ? idunidad != null : !IDUNIDAD_EDEFAULT.equals(idunidad);
			case UpctformaevaluaPackage.EVALUATION_UNIT__LEARNINGANALYTICS:
				return learninganalytics != LEARNINGANALYTICS_EDEFAULT;
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
		result.append(" (numberquestions: ");
		result.append(numberquestions);
		result.append(", language: ");
		result.append(language);
		result.append(", license: ");
		result.append(license);
		result.append(", email: ");
		result.append(email);
		result.append(", institution: ");
		result.append(institution);
		result.append(", type: ");
		result.append(type);
		result.append(", author: ");
		result.append(author);
		result.append(", theme: ");
		result.append(theme);
		result.append(", idunidad: ");
		result.append(idunidad);
		result.append(", learninganalytics: ");
		result.append(learninganalytics);
		result.append(')');
		return result.toString();
	}

} //EvaluationUnitImpl
