/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.ContentUnit#getSections <em>Sections</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getAuthor <em>Author</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getType <em>Type</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getLanguage <em>Language</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getLicense <em>License</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getEmail <em>Email</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getInstitution <em>Institution</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getTheme <em>Theme</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getIdunidad <em>Idunidad</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getLearninganalytics <em>Learninganalytics</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getContentUnit()
 * @model
 * @generated
 */
public interface ContentUnit extends NameElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getContentUnit_Sections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.ContentUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctforma.ContentUnitType
	 * @see #setType(ContentUnitType)
	 * @see upctforma.UpctformaPackage#getContentUnit_Type()
	 * @model
	 * @generated
	 */
	ContentUnitType getType();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctforma.ContentUnitType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContentUnitType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see upctforma.LanguageType
	 * @see #setLanguage(LanguageType)
	 * @see upctforma.UpctformaPackage#getContentUnit_Language()
	 * @model
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see upctforma.LanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * The default value is <code>"PRIVATE"</code>.
	 * The literals are from the enumeration {@link upctforma.UnitLicenses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see upctforma.UnitLicenses
	 * @see #setLicense(UnitLicenses)
	 * @see upctforma.UpctformaPackage#getContentUnit_License()
	 * @model default="PRIVATE"
	 * @generated
	 */
	UnitLicenses getLicense();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see upctforma.UnitLicenses
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(UnitLicenses value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Theme()
	 * @model
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(String value);

	/**
	 * Returns the value of the '<em><b>Idunidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idunidad</em>' attribute.
	 * @see #setIdunidad(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Idunidad()
	 * @model
	 * @generated
	 */
	String getIdunidad();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getIdunidad <em>Idunidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idunidad</em>' attribute.
	 * @see #getIdunidad()
	 * @generated
	 */
	void setIdunidad(String value);

	/**
	 * Returns the value of the '<em><b>Learninganalytics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learninganalytics</em>' attribute.
	 * @see #setLearninganalytics(int)
	 * @see upctforma.UpctformaPackage#getContentUnit_Learninganalytics()
	 * @model
	 * @generated
	 */
	int getLearninganalytics();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getLearninganalytics <em>Learninganalytics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learninganalytics</em>' attribute.
	 * @see #getLearninganalytics()
	 * @generated
	 */
	void setLearninganalytics(int value);

} // ContentUnit
