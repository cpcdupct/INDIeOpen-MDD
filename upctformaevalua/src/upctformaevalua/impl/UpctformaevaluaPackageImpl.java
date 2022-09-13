/**
 */
package upctformaevalua.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import upctformaevalua.Answer;
import upctformaevalua.Assertion;
import upctformaevalua.Evaluation;
import upctformaevalua.EvaluationLanguageType;
import upctformaevalua.EvaluationUnit;
import upctformaevalua.EvaluationUnitType;
import upctformaevalua.FillingAnswer;
import upctformaevalua.Final;
import upctformaevalua.Hole;
import upctformaevalua.Multiple;
import upctformaevalua.MultipleAnswer;
import upctformaevalua.NameElement;
import upctformaevalua.Paragraph;
import upctformaevalua.Question;
import upctformaevalua.Single;
import upctformaevalua.SingleAnswer;
import upctformaevalua.Statement;
import upctformaevalua.Training;
import upctformaevalua.TrueOrFalse;
import upctformaevalua.TypeGrade;
import upctformaevalua.TypeHole;
import upctformaevalua.UnitLicenses;
import upctformaevalua.UpctformaevaluaFactory;
import upctformaevalua.UpctformaevaluaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaevaluaPackageImpl extends EPackageImpl implements UpctformaevaluaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillingAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueOrFalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGradeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeHoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationLanguageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitLicensesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationUnitTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see upctformaevalua.UpctformaevaluaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformaevaluaPackageImpl() {
		super(eNS_URI, UpctformaevaluaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UpctformaevaluaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformaevaluaPackage init() {
		if (isInited) return (UpctformaevaluaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaevaluaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUpctformaevaluaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UpctformaevaluaPackageImpl theUpctformaevaluaPackage = registeredUpctformaevaluaPackage instanceof UpctformaevaluaPackageImpl ? (UpctformaevaluaPackageImpl)registeredUpctformaevaluaPackage : new UpctformaevaluaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUpctformaevaluaPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformaevaluaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpctformaevaluaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformaevaluaPackage.eNS_URI, theUpctformaevaluaPackage);
		return theUpctformaevaluaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluation_Units() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluationUnit() {
		return evaluationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvaluationUnit_Questions() {
		return (EReference)evaluationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Numberquestions() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Language() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_License() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Email() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Institution() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Type() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Author() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Theme() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Idunidad() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvaluationUnit_Learninganalytics() {
		return (EAttribute)evaluationUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraining() {
		return trainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraining_Attempts() {
		return (EAttribute)trainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraining_Grade() {
		return (EAttribute)trainingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Correctfeedback() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestion_Incorrectfeedback() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatement_Text() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHole() {
		return holeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHole_Type() {
		return (EAttribute)holeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssertion_Value() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleAnswer() {
		return singleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleAnswer_Statements() {
		return (EReference)singleAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleAnswer_Answers() {
		return (EReference)singleAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleAnswer_Correctanswer() {
		return (EAttribute)singleAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleAnswer() {
		return multipleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleAnswer_Statements() {
		return (EReference)multipleAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleAnswer_Answers() {
		return (EReference)multipleAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFillingAnswer() {
		return fillingAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFillingAnswer_Holes() {
		return (EReference)fillingAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrueOrFalse() {
		return trueOrFalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrueOrFalse_Assertions() {
		return (EReference)trueOrFalseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameElement() {
		return nameElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameElement_Name() {
		return (EAttribute)nameElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnswer_Text() {
		return (EAttribute)answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingle() {
		return singleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiple_Value() {
		return (EAttribute)multipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeGrade() {
		return typeGradeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeHole() {
		return typeHoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvaluationLanguageType() {
		return evaluationLanguageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitLicenses() {
		return unitLicensesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvaluationUnitType() {
		return evaluationUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpctformaevaluaFactory getUpctformaevaluaFactory() {
		return (UpctformaevaluaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evaluationEClass = createEClass(EVALUATION);
		createEReference(evaluationEClass, EVALUATION__UNITS);

		evaluationUnitEClass = createEClass(EVALUATION_UNIT);
		createEReference(evaluationUnitEClass, EVALUATION_UNIT__QUESTIONS);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__NUMBERQUESTIONS);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__LANGUAGE);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__LICENSE);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__EMAIL);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__INSTITUTION);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__TYPE);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__AUTHOR);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__THEME);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__IDUNIDAD);
		createEAttribute(evaluationUnitEClass, EVALUATION_UNIT__LEARNINGANALYTICS);

		trainingEClass = createEClass(TRAINING);
		createEAttribute(trainingEClass, TRAINING__ATTEMPTS);
		createEAttribute(trainingEClass, TRAINING__GRADE);

		finalEClass = createEClass(FINAL);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__CORRECTFEEDBACK);
		createEAttribute(questionEClass, QUESTION__INCORRECTFEEDBACK);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__TEXT);

		paragraphEClass = createEClass(PARAGRAPH);

		holeEClass = createEClass(HOLE);
		createEAttribute(holeEClass, HOLE__TYPE);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__VALUE);

		singleAnswerEClass = createEClass(SINGLE_ANSWER);
		createEReference(singleAnswerEClass, SINGLE_ANSWER__STATEMENTS);
		createEReference(singleAnswerEClass, SINGLE_ANSWER__ANSWERS);
		createEAttribute(singleAnswerEClass, SINGLE_ANSWER__CORRECTANSWER);

		multipleAnswerEClass = createEClass(MULTIPLE_ANSWER);
		createEReference(multipleAnswerEClass, MULTIPLE_ANSWER__STATEMENTS);
		createEReference(multipleAnswerEClass, MULTIPLE_ANSWER__ANSWERS);

		fillingAnswerEClass = createEClass(FILLING_ANSWER);
		createEReference(fillingAnswerEClass, FILLING_ANSWER__HOLES);

		trueOrFalseEClass = createEClass(TRUE_OR_FALSE);
		createEReference(trueOrFalseEClass, TRUE_OR_FALSE__ASSERTIONS);

		nameElementEClass = createEClass(NAME_ELEMENT);
		createEAttribute(nameElementEClass, NAME_ELEMENT__NAME);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__TEXT);

		singleEClass = createEClass(SINGLE);

		multipleEClass = createEClass(MULTIPLE);
		createEAttribute(multipleEClass, MULTIPLE__VALUE);

		// Create enums
		typeGradeEEnum = createEEnum(TYPE_GRADE);
		typeHoleEEnum = createEEnum(TYPE_HOLE);
		evaluationLanguageTypeEEnum = createEEnum(EVALUATION_LANGUAGE_TYPE);
		unitLicensesEEnum = createEEnum(UNIT_LICENSES);
		evaluationUnitTypeEEnum = createEEnum(EVALUATION_UNIT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evaluationEClass.getESuperTypes().add(this.getNameElement());
		evaluationUnitEClass.getESuperTypes().add(this.getNameElement());
		evaluationUnitEClass.getESuperTypes().add(ecorePackage.getEObject());
		trainingEClass.getESuperTypes().add(this.getEvaluationUnit());
		finalEClass.getESuperTypes().add(this.getEvaluationUnit());
		paragraphEClass.getESuperTypes().add(this.getStatement());
		holeEClass.getESuperTypes().add(this.getStatement());
		assertionEClass.getESuperTypes().add(this.getStatement());
		singleAnswerEClass.getESuperTypes().add(this.getQuestion());
		multipleAnswerEClass.getESuperTypes().add(this.getQuestion());
		fillingAnswerEClass.getESuperTypes().add(this.getQuestion());
		trueOrFalseEClass.getESuperTypes().add(this.getQuestion());
		singleEClass.getESuperTypes().add(this.getAnswer());
		multipleEClass.getESuperTypes().add(this.getAnswer());

		// Initialize classes, features, and operations; add parameters
		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluation_Units(), this.getEvaluationUnit(), null, "units", null, 0, -1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationUnitEClass, EvaluationUnit.class, "EvaluationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationUnit_Questions(), this.getQuestion(), null, "questions", null, 0, -1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Numberquestions(), ecorePackage.getEInt(), "numberquestions", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Language(), this.getEvaluationLanguageType(), "language", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_License(), this.getUnitLicenses(), "license", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Email(), ecorePackage.getEString(), "email", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Type(), this.getEvaluationUnitType(), "type", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Author(), ecorePackage.getEString(), "author", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Theme(), ecorePackage.getEString(), "theme", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Idunidad(), ecorePackage.getEString(), "idunidad", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationUnit_Learninganalytics(), ecorePackage.getEInt(), "learninganalytics", null, 0, 1, EvaluationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainingEClass, Training.class, "Training", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraining_Attempts(), ecorePackage.getEInt(), "Attempts", null, 0, 1, Training.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraining_Grade(), this.getTypeGrade(), "grade", null, 0, 1, Training.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Correctfeedback(), ecorePackage.getEString(), "correctfeedback", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Incorrectfeedback(), ecorePackage.getEString(), "incorrectfeedback", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(holeEClass, Hole.class, "Hole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHole_Type(), this.getTypeHole(), "type", null, 0, 1, Hole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertion_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleAnswerEClass, SingleAnswer.class, "SingleAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleAnswer_Statements(), this.getParagraph(), null, "statements", null, 1, 1, SingleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleAnswer_Answers(), this.getSingle(), null, "answers", null, 0, -1, SingleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleAnswer_Correctanswer(), ecorePackage.getEInt(), "correctanswer", null, 0, 1, SingleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleAnswerEClass, MultipleAnswer.class, "MultipleAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleAnswer_Statements(), this.getParagraph(), null, "statements", null, 1, 1, MultipleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleAnswer_Answers(), this.getMultiple(), null, "answers", null, 0, -1, MultipleAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillingAnswerEClass, FillingAnswer.class, "FillingAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFillingAnswer_Holes(), this.getHole(), null, "holes", null, 0, -1, FillingAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueOrFalseEClass, TrueOrFalse.class, "TrueOrFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrueOrFalse_Assertions(), this.getAssertion(), null, "assertions", null, 0, -1, TrueOrFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameElementEClass, NameElement.class, "NameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Text(), ecorePackage.getEString(), "text", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleEClass, Single.class, "Single", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiple_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeGradeEEnum, TypeGrade.class, "TypeGrade");
		addEEnumLiteral(typeGradeEEnum, TypeGrade.HIGHEST);
		addEEnumLiteral(typeGradeEEnum, TypeGrade.MIDDLE);
		addEEnumLiteral(typeGradeEEnum, TypeGrade.LOWEST);

		initEEnum(typeHoleEEnum, TypeHole.class, "TypeHole");
		addEEnumLiteral(typeHoleEEnum, TypeHole.VISIBLE);
		addEEnumLiteral(typeHoleEEnum, TypeHole.HOLE);

		initEEnum(evaluationLanguageTypeEEnum, EvaluationLanguageType.class, "EvaluationLanguageType");
		addEEnumLiteral(evaluationLanguageTypeEEnum, EvaluationLanguageType.EN);
		addEEnumLiteral(evaluationLanguageTypeEEnum, EvaluationLanguageType.ES);
		addEEnumLiteral(evaluationLanguageTypeEEnum, EvaluationLanguageType.FR);
		addEEnumLiteral(evaluationLanguageTypeEEnum, EvaluationLanguageType.EL);
		addEEnumLiteral(evaluationLanguageTypeEEnum, EvaluationLanguageType.LT);

		initEEnum(unitLicensesEEnum, UnitLicenses.class, "UnitLicenses");
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.PRIVATE);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BY);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYSA);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYND);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNC);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNCSA);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNCND);

		initEEnum(evaluationUnitTypeEEnum, EvaluationUnitType.class, "EvaluationUnitType");
		addEEnumLiteral(evaluationUnitTypeEEnum, EvaluationUnitType.INTEROPERABILITY);
		addEEnumLiteral(evaluationUnitTypeEEnum, EvaluationUnitType.OPEN);
		addEEnumLiteral(evaluationUnitTypeEEnum, EvaluationUnitType.PREVIEW);

		// Create resource
		createResource(eNS_URI);
	}

} //UpctformaevaluaPackageImpl
