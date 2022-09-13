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

import upctforma.ContentUnit;
import upctforma.ContentUnitType;
import upctforma.LanguageType;
import upctforma.Section;
import upctforma.UnitLicenses;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getLicense <em>License</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getIdunidad <em>Idunidad</em>}</li>
 *   <li>{@link upctforma.impl.ContentUnitImpl#getLearninganalytics <em>Learninganalytics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentUnitImpl extends NameElementImpl implements ContentUnit {
	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContentUnitType TYPE_EDEFAULT = ContentUnitType.INTEROPERABILITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContentUnitType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageType LANGUAGE_EDEFAULT = LanguageType.EN;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType language = LANGUAGE_EDEFAULT;

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
	protected ContentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.CONTENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, UpctformaPackage.CONTENT_UNIT__SECTIONS);
		}
		return sections;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnitType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ContentUnitType newType) {
		ContentUnitType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(LanguageType newLanguage) {
		LanguageType oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__LICENSE, oldLicense, license));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__INSTITUTION, oldInstitution, institution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__THEME, oldTheme, theme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__IDUNIDAD, oldIdunidad, idunidad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_UNIT__LEARNINGANALYTICS, oldLearninganalytics, learninganalytics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.CONTENT_UNIT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.CONTENT_UNIT__SECTIONS:
				return getSections();
			case UpctformaPackage.CONTENT_UNIT__AUTHOR:
				return getAuthor();
			case UpctformaPackage.CONTENT_UNIT__TYPE:
				return getType();
			case UpctformaPackage.CONTENT_UNIT__LANGUAGE:
				return getLanguage();
			case UpctformaPackage.CONTENT_UNIT__LICENSE:
				return getLicense();
			case UpctformaPackage.CONTENT_UNIT__EMAIL:
				return getEmail();
			case UpctformaPackage.CONTENT_UNIT__INSTITUTION:
				return getInstitution();
			case UpctformaPackage.CONTENT_UNIT__THEME:
				return getTheme();
			case UpctformaPackage.CONTENT_UNIT__IDUNIDAD:
				return getIdunidad();
			case UpctformaPackage.CONTENT_UNIT__LEARNINGANALYTICS:
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
			case UpctformaPackage.CONTENT_UNIT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__TYPE:
				setType((ContentUnitType)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__LANGUAGE:
				setLanguage((LanguageType)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__LICENSE:
				setLicense((UnitLicenses)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__EMAIL:
				setEmail((String)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__THEME:
				setTheme((String)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__IDUNIDAD:
				setIdunidad((String)newValue);
				return;
			case UpctformaPackage.CONTENT_UNIT__LEARNINGANALYTICS:
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
			case UpctformaPackage.CONTENT_UNIT__SECTIONS:
				getSections().clear();
				return;
			case UpctformaPackage.CONTENT_UNIT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__IDUNIDAD:
				setIdunidad(IDUNIDAD_EDEFAULT);
				return;
			case UpctformaPackage.CONTENT_UNIT__LEARNINGANALYTICS:
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
			case UpctformaPackage.CONTENT_UNIT__SECTIONS:
				return sections != null && !sections.isEmpty();
			case UpctformaPackage.CONTENT_UNIT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case UpctformaPackage.CONTENT_UNIT__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformaPackage.CONTENT_UNIT__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case UpctformaPackage.CONTENT_UNIT__LICENSE:
				return license != LICENSE_EDEFAULT;
			case UpctformaPackage.CONTENT_UNIT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case UpctformaPackage.CONTENT_UNIT__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case UpctformaPackage.CONTENT_UNIT__THEME:
				return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
			case UpctformaPackage.CONTENT_UNIT__IDUNIDAD:
				return IDUNIDAD_EDEFAULT == null ? idunidad != null : !IDUNIDAD_EDEFAULT.equals(idunidad);
			case UpctformaPackage.CONTENT_UNIT__LEARNINGANALYTICS:
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
		result.append(" (author: ");
		result.append(author);
		result.append(", type: ");
		result.append(type);
		result.append(", language: ");
		result.append(language);
		result.append(", license: ");
		result.append(license);
		result.append(", email: ");
		result.append(email);
		result.append(", institution: ");
		result.append(institution);
		result.append(", theme: ");
		result.append(theme);
		result.append(", idunidad: ");
		result.append(idunidad);
		result.append(", learninganalytics: ");
		result.append(learninganalytics);
		result.append(')');
		return result.toString();
	}

} //ContentUnitImpl
