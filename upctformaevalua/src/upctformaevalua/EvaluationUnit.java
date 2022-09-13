/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.EvaluationUnit#getQuestions <em>Questions</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getLanguage <em>Language</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getLicense <em>License</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getEmail <em>Email</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getInstitution <em>Institution</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getType <em>Type</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getAuthor <em>Author</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getTheme <em>Theme</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getIdunidad <em>Idunidad</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getLearninganalytics <em>Learninganalytics</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit()
 * @model
 * @generated
 */
public interface EvaluationUnit extends NameElement, EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numberquestions</em>' attribute.
	 * @see #setNumberquestions(int)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Numberquestions()
	 * @model
	 * @generated
	 */
	int getNumberquestions();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberquestions</em>' attribute.
	 * @see #getNumberquestions()
	 * @generated
	 */
	void setNumberquestions(int value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.EvaluationLanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see upctformaevalua.EvaluationLanguageType
	 * @see #setLanguage(EvaluationLanguageType)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Language()
	 * @model
	 * @generated
	 */
	EvaluationLanguageType getLanguage();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see upctformaevalua.EvaluationLanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(EvaluationLanguageType value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.UnitLicenses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see upctformaevalua.UnitLicenses
	 * @see #setLicense(UnitLicenses)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_License()
	 * @model
	 * @generated
	 */
	UnitLicenses getLicense();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see upctformaevalua.UnitLicenses
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
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getEmail <em>Email</em>}' attribute.
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
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.EvaluationUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformaevalua.EvaluationUnitType
	 * @see #setType(EvaluationUnitType)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Type()
	 * @model
	 * @generated
	 */
	EvaluationUnitType getType();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformaevalua.EvaluationUnitType
	 * @see #getType()
	 * @generated
	 */
	void setType(EvaluationUnitType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Theme()
	 * @model
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getTheme <em>Theme</em>}' attribute.
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
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Idunidad()
	 * @model
	 * @generated
	 */
	String getIdunidad();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getIdunidad <em>Idunidad</em>}' attribute.
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
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Learninganalytics()
	 * @model
	 * @generated
	 */
	int getLearninganalytics();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getLearninganalytics <em>Learninganalytics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learninganalytics</em>' attribute.
	 * @see #getLearninganalytics()
	 * @generated
	 */
	void setLearninganalytics(int value);

} // EvaluationUnit
