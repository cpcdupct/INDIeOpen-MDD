/**
 */
package upctformaevalua;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaFactory
 * @model kind="package"
 * @generated
 */
public interface UpctformaevaluaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctformaevalua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctformaevalua";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctformaevalua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformaevaluaPackage eINSTANCE = upctformaevalua.impl.UpctformaevaluaPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.NameElementImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.EvaluationImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__UNITS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.EvaluationUnitImpl <em>Evaluation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.EvaluationUnitImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnit()
	 * @generated
	 */
	int EVALUATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__QUESTIONS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__NUMBERQUESTIONS = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__LANGUAGE = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__LICENSE = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__EMAIL = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__INSTITUTION = NAME_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__TYPE = NAME_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__AUTHOR = NAME_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__THEME = NAME_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Idunidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__IDUNIDAD = NAME_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Learninganalytics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT__LEARNINGANALYTICS = NAME_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Evaluation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECLASS = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EIS_PROXY = NAME_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ERESOURCE = NAME_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECONTAINER = NAME_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECONTAINING_FEATURE = NAME_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECONTAINMENT_FEATURE = NAME_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECONTENTS = NAME_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EALL_CONTENTS = NAME_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ECROSS_REFERENCES = NAME_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE = NAME_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE_BOOLEAN = NAME_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___ESET__ESTRUCTURALFEATURE_OBJECT = NAME_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EIS_SET__ESTRUCTURALFEATURE = NAME_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EUNSET__ESTRUCTURALFEATURE = NAME_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT___EINVOKE__EOPERATION_ELIST = NAME_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Evaluation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_UNIT_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.TrainingImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__NAME = EVALUATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__QUESTIONS = EVALUATION_UNIT__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__NUMBERQUESTIONS = EVALUATION_UNIT__NUMBERQUESTIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__LANGUAGE = EVALUATION_UNIT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__LICENSE = EVALUATION_UNIT__LICENSE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__EMAIL = EVALUATION_UNIT__EMAIL;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__INSTITUTION = EVALUATION_UNIT__INSTITUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__TYPE = EVALUATION_UNIT__TYPE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__AUTHOR = EVALUATION_UNIT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__THEME = EVALUATION_UNIT__THEME;

	/**
	 * The feature id for the '<em><b>Idunidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__IDUNIDAD = EVALUATION_UNIT__IDUNIDAD;

	/**
	 * The feature id for the '<em><b>Learninganalytics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__LEARNINGANALYTICS = EVALUATION_UNIT__LEARNINGANALYTICS;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__ATTEMPTS = EVALUATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__GRADE = EVALUATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = EVALUATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECLASS = EVALUATION_UNIT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EIS_PROXY = EVALUATION_UNIT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ERESOURCE = EVALUATION_UNIT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECONTAINER = EVALUATION_UNIT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECONTAINING_FEATURE = EVALUATION_UNIT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECONTAINMENT_FEATURE = EVALUATION_UNIT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECONTENTS = EVALUATION_UNIT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EALL_CONTENTS = EVALUATION_UNIT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ECROSS_REFERENCES = EVALUATION_UNIT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EGET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___ESET__ESTRUCTURALFEATURE_OBJECT = EVALUATION_UNIT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EIS_SET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EUNSET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING___EINVOKE__EOPERATION_ELIST = EVALUATION_UNIT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = EVALUATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.FinalImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NAME = EVALUATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__QUESTIONS = EVALUATION_UNIT__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NUMBERQUESTIONS = EVALUATION_UNIT__NUMBERQUESTIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__LANGUAGE = EVALUATION_UNIT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__LICENSE = EVALUATION_UNIT__LICENSE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__EMAIL = EVALUATION_UNIT__EMAIL;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__INSTITUTION = EVALUATION_UNIT__INSTITUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__TYPE = EVALUATION_UNIT__TYPE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__AUTHOR = EVALUATION_UNIT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__THEME = EVALUATION_UNIT__THEME;

	/**
	 * The feature id for the '<em><b>Idunidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__IDUNIDAD = EVALUATION_UNIT__IDUNIDAD;

	/**
	 * The feature id for the '<em><b>Learninganalytics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__LEARNINGANALYTICS = EVALUATION_UNIT__LEARNINGANALYTICS;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = EVALUATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECLASS = EVALUATION_UNIT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EIS_PROXY = EVALUATION_UNIT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ERESOURCE = EVALUATION_UNIT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECONTAINER = EVALUATION_UNIT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECONTAINING_FEATURE = EVALUATION_UNIT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECONTAINMENT_FEATURE = EVALUATION_UNIT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECONTENTS = EVALUATION_UNIT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EALL_CONTENTS = EVALUATION_UNIT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ECROSS_REFERENCES = EVALUATION_UNIT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EGET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EGET__ESTRUCTURALFEATURE_BOOLEAN = EVALUATION_UNIT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___ESET__ESTRUCTURALFEATURE_OBJECT = EVALUATION_UNIT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EIS_SET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EUNSET__ESTRUCTURALFEATURE = EVALUATION_UNIT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL___EINVOKE__EOPERATION_ELIST = EVALUATION_UNIT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = EVALUATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.QuestionImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CORRECTFEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INCORRECTFEEDBACK = 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.StatementImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.ParagraphImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = STATEMENT__TEXT;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.HoleImpl <em>Hole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.HoleImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getHole()
	 * @generated
	 */
	int HOLE = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__TEXT = STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.AssertionImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TEXT = STATEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.SingleAnswerImpl <em>Single Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.SingleAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getSingleAnswer()
	 * @generated
	 */
	int SINGLE_ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER__STATEMENTS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER__ANSWERS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correctanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER__CORRECTANSWER = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Single Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.MultipleAnswerImpl <em>Multiple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.MultipleAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultipleAnswer()
	 * @generated
	 */
	int MULTIPLE_ANSWER = 10;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__STATEMENTS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER__ANSWERS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.FillingAnswerImpl <em>Filling Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.FillingAnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFillingAnswer()
	 * @generated
	 */
	int FILLING_ANSWER = 11;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Holes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER__HOLES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filling Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filling Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_ANSWER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.TrueOrFalseImpl <em>True Or False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.TrueOrFalseImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTrueOrFalse()
	 * @generated
	 */
	int TRUE_OR_FALSE = 12;

	/**
	 * The feature id for the '<em><b>Correctfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__CORRECTFEEDBACK = QUESTION__CORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Incorrectfeedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__INCORRECTFEEDBACK = QUESTION__INCORRECTFEEDBACK;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE__ASSERTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>True Or False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>True Or False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OR_FALSE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.AnswerImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.SingleImpl <em>Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.SingleImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getSingle()
	 * @generated
	 */
	int SINGLE = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__TEXT = ANSWER__TEXT;

	/**
	 * The number of structural features of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.impl.MultipleImpl
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 16;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__TEXT = ANSWER__TEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__VALUE = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.TypeGrade
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeGrade()
	 * @generated
	 */
	int TYPE_GRADE = 17;

	/**
	 * The meta object id for the '{@link upctformaevalua.TypeHole <em>Type Hole</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.TypeHole
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeHole()
	 * @generated
	 */
	int TYPE_HOLE = 18;

	/**
	 * The meta object id for the '{@link upctformaevalua.EvaluationLanguageType <em>Evaluation Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.EvaluationLanguageType
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationLanguageType()
	 * @generated
	 */
	int EVALUATION_LANGUAGE_TYPE = 19;


	/**
	 * The meta object id for the '{@link upctformaevalua.UnitLicenses <em>Unit Licenses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.UnitLicenses
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUnitLicenses()
	 * @generated
	 */
	int UNIT_LICENSES = 20;


	/**
	 * The meta object id for the '{@link upctformaevalua.EvaluationUnitType <em>Evaluation Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctformaevalua.EvaluationUnitType
	 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnitType()
	 * @generated
	 */
	int EVALUATION_UNIT_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link upctformaevalua.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see upctformaevalua.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.Evaluation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see upctformaevalua.Evaluation#getUnits()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_Units();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.EvaluationUnit <em>Evaluation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Unit</em>'.
	 * @see upctformaevalua.EvaluationUnit
	 * @generated
	 */
	EClass getEvaluationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.EvaluationUnit#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see upctformaevalua.EvaluationUnit#getQuestions()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EReference getEvaluationUnit_Questions();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numberquestions</em>'.
	 * @see upctformaevalua.EvaluationUnit#getNumberquestions()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Numberquestions();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see upctformaevalua.EvaluationUnit#getLanguage()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Language();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see upctformaevalua.EvaluationUnit#getLicense()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_License();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see upctformaevalua.EvaluationUnit#getEmail()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Email();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see upctformaevalua.EvaluationUnit#getInstitution()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Institution();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformaevalua.EvaluationUnit#getType()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see upctformaevalua.EvaluationUnit#getAuthor()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Author();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see upctformaevalua.EvaluationUnit#getTheme()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Theme();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getIdunidad <em>Idunidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idunidad</em>'.
	 * @see upctformaevalua.EvaluationUnit#getIdunidad()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Idunidad();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.EvaluationUnit#getLearninganalytics <em>Learninganalytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learninganalytics</em>'.
	 * @see upctformaevalua.EvaluationUnit#getLearninganalytics()
	 * @see #getEvaluationUnit()
	 * @generated
	 */
	EAttribute getEvaluationUnit_Learninganalytics();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see upctformaevalua.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Training#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts</em>'.
	 * @see upctformaevalua.Training#getAttempts()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Training#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see upctformaevalua.Training#getGrade()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Grade();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see upctformaevalua.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see upctformaevalua.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Question#getCorrectfeedback <em>Correctfeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctfeedback</em>'.
	 * @see upctformaevalua.Question#getCorrectfeedback()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Correctfeedback();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Question#getIncorrectfeedback <em>Incorrectfeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incorrectfeedback</em>'.
	 * @see upctformaevalua.Question#getIncorrectfeedback()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Incorrectfeedback();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see upctformaevalua.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Statement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see upctformaevalua.Statement#getText()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Text();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see upctformaevalua.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hole</em>'.
	 * @see upctformaevalua.Hole
	 * @generated
	 */
	EClass getHole();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Hole#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctformaevalua.Hole#getType()
	 * @see #getHole()
	 * @generated
	 */
	EAttribute getHole_Type();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see upctformaevalua.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Assertion#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see upctformaevalua.Assertion#isValue()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Value();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.SingleAnswer <em>Single Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Answer</em>'.
	 * @see upctformaevalua.SingleAnswer
	 * @generated
	 */
	EClass getSingleAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link upctformaevalua.SingleAnswer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see upctformaevalua.SingleAnswer#getStatements()
	 * @see #getSingleAnswer()
	 * @generated
	 */
	EReference getSingleAnswer_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.SingleAnswer#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see upctformaevalua.SingleAnswer#getAnswers()
	 * @see #getSingleAnswer()
	 * @generated
	 */
	EReference getSingleAnswer_Answers();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.SingleAnswer#getCorrectanswer <em>Correctanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correctanswer</em>'.
	 * @see upctformaevalua.SingleAnswer#getCorrectanswer()
	 * @see #getSingleAnswer()
	 * @generated
	 */
	EAttribute getSingleAnswer_Correctanswer();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.MultipleAnswer <em>Multiple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Answer</em>'.
	 * @see upctformaevalua.MultipleAnswer
	 * @generated
	 */
	EClass getMultipleAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link upctformaevalua.MultipleAnswer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statements</em>'.
	 * @see upctformaevalua.MultipleAnswer#getStatements()
	 * @see #getMultipleAnswer()
	 * @generated
	 */
	EReference getMultipleAnswer_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.MultipleAnswer#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see upctformaevalua.MultipleAnswer#getAnswers()
	 * @see #getMultipleAnswer()
	 * @generated
	 */
	EReference getMultipleAnswer_Answers();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.FillingAnswer <em>Filling Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filling Answer</em>'.
	 * @see upctformaevalua.FillingAnswer
	 * @generated
	 */
	EClass getFillingAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.FillingAnswer#getHoles <em>Holes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holes</em>'.
	 * @see upctformaevalua.FillingAnswer#getHoles()
	 * @see #getFillingAnswer()
	 * @generated
	 */
	EReference getFillingAnswer_Holes();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.TrueOrFalse <em>True Or False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Or False</em>'.
	 * @see upctformaevalua.TrueOrFalse
	 * @generated
	 */
	EClass getTrueOrFalse();

	/**
	 * Returns the meta object for the containment reference list '{@link upctformaevalua.TrueOrFalse#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see upctformaevalua.TrueOrFalse#getAssertions()
	 * @see #getTrueOrFalse()
	 * @generated
	 */
	EReference getTrueOrFalse_Assertions();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see upctformaevalua.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctformaevalua.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see upctformaevalua.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Answer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see upctformaevalua.Answer#getText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Text();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Single <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single</em>'.
	 * @see upctformaevalua.Single
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Returns the meta object for class '{@link upctformaevalua.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see upctformaevalua.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for the attribute '{@link upctformaevalua.Multiple#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see upctformaevalua.Multiple#isValue()
	 * @see #getMultiple()
	 * @generated
	 */
	EAttribute getMultiple_Value();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Grade</em>'.
	 * @see upctformaevalua.TypeGrade
	 * @generated
	 */
	EEnum getTypeGrade();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.TypeHole <em>Type Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Hole</em>'.
	 * @see upctformaevalua.TypeHole
	 * @generated
	 */
	EEnum getTypeHole();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.EvaluationLanguageType <em>Evaluation Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Language Type</em>'.
	 * @see upctformaevalua.EvaluationLanguageType
	 * @generated
	 */
	EEnum getEvaluationLanguageType();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.UnitLicenses <em>Unit Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Licenses</em>'.
	 * @see upctformaevalua.UnitLicenses
	 * @generated
	 */
	EEnum getUnitLicenses();

	/**
	 * Returns the meta object for enum '{@link upctformaevalua.EvaluationUnitType <em>Evaluation Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Unit Type</em>'.
	 * @see upctformaevalua.EvaluationUnitType
	 * @generated
	 */
	EEnum getEvaluationUnitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformaevaluaFactory getUpctformaevaluaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.EvaluationImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__UNITS = eINSTANCE.getEvaluation_Units();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.EvaluationUnitImpl <em>Evaluation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.EvaluationUnitImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnit()
		 * @generated
		 */
		EClass EVALUATION_UNIT = eINSTANCE.getEvaluationUnit();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_UNIT__QUESTIONS = eINSTANCE.getEvaluationUnit_Questions();

		/**
		 * The meta object literal for the '<em><b>Numberquestions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__NUMBERQUESTIONS = eINSTANCE.getEvaluationUnit_Numberquestions();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__LANGUAGE = eINSTANCE.getEvaluationUnit_Language();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__LICENSE = eINSTANCE.getEvaluationUnit_License();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__EMAIL = eINSTANCE.getEvaluationUnit_Email();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__INSTITUTION = eINSTANCE.getEvaluationUnit_Institution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__TYPE = eINSTANCE.getEvaluationUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__AUTHOR = eINSTANCE.getEvaluationUnit_Author();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__THEME = eINSTANCE.getEvaluationUnit_Theme();

		/**
		 * The meta object literal for the '<em><b>Idunidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__IDUNIDAD = eINSTANCE.getEvaluationUnit_Idunidad();

		/**
		 * The meta object literal for the '<em><b>Learninganalytics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_UNIT__LEARNINGANALYTICS = eINSTANCE.getEvaluationUnit_Learninganalytics();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.TrainingImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__ATTEMPTS = eINSTANCE.getTraining_Attempts();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__GRADE = eINSTANCE.getTraining_Grade();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.FinalImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.QuestionImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Correctfeedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CORRECTFEEDBACK = eINSTANCE.getQuestion_Correctfeedback();

		/**
		 * The meta object literal for the '<em><b>Incorrectfeedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INCORRECTFEEDBACK = eINSTANCE.getQuestion_Incorrectfeedback();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.StatementImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__TEXT = eINSTANCE.getStatement_Text();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.ParagraphImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.HoleImpl <em>Hole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.HoleImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getHole()
		 * @generated
		 */
		EClass HOLE = eINSTANCE.getHole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLE__TYPE = eINSTANCE.getHole_Type();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.AssertionImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__VALUE = eINSTANCE.getAssertion_Value();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.SingleAnswerImpl <em>Single Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.SingleAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getSingleAnswer()
		 * @generated
		 */
		EClass SINGLE_ANSWER = eINSTANCE.getSingleAnswer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ANSWER__STATEMENTS = eINSTANCE.getSingleAnswer_Statements();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ANSWER__ANSWERS = eINSTANCE.getSingleAnswer_Answers();

		/**
		 * The meta object literal for the '<em><b>Correctanswer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ANSWER__CORRECTANSWER = eINSTANCE.getSingleAnswer_Correctanswer();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.MultipleAnswerImpl <em>Multiple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.MultipleAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultipleAnswer()
		 * @generated
		 */
		EClass MULTIPLE_ANSWER = eINSTANCE.getMultipleAnswer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ANSWER__STATEMENTS = eINSTANCE.getMultipleAnswer_Statements();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ANSWER__ANSWERS = eINSTANCE.getMultipleAnswer_Answers();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.FillingAnswerImpl <em>Filling Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.FillingAnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getFillingAnswer()
		 * @generated
		 */
		EClass FILLING_ANSWER = eINSTANCE.getFillingAnswer();

		/**
		 * The meta object literal for the '<em><b>Holes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILLING_ANSWER__HOLES = eINSTANCE.getFillingAnswer_Holes();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.TrueOrFalseImpl <em>True Or False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.TrueOrFalseImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTrueOrFalse()
		 * @generated
		 */
		EClass TRUE_OR_FALSE = eINSTANCE.getTrueOrFalse();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUE_OR_FALSE__ASSERTIONS = eINSTANCE.getTrueOrFalse_Assertions();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.NameElementImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getNameElement()
		 * @generated
		 */
		EClass NAME_ELEMENT = eINSTANCE.getNameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__NAME = eINSTANCE.getNameElement_Name();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.AnswerImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TEXT = eINSTANCE.getAnswer_Text();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.SingleImpl <em>Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.SingleImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getSingle()
		 * @generated
		 */
		EClass SINGLE = eINSTANCE.getSingle();

		/**
		 * The meta object literal for the '{@link upctformaevalua.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.impl.MultipleImpl
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE__VALUE = eINSTANCE.getMultiple_Value();

		/**
		 * The meta object literal for the '{@link upctformaevalua.TypeGrade <em>Type Grade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.TypeGrade
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeGrade()
		 * @generated
		 */
		EEnum TYPE_GRADE = eINSTANCE.getTypeGrade();

		/**
		 * The meta object literal for the '{@link upctformaevalua.TypeHole <em>Type Hole</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.TypeHole
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getTypeHole()
		 * @generated
		 */
		EEnum TYPE_HOLE = eINSTANCE.getTypeHole();

		/**
		 * The meta object literal for the '{@link upctformaevalua.EvaluationLanguageType <em>Evaluation Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.EvaluationLanguageType
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationLanguageType()
		 * @generated
		 */
		EEnum EVALUATION_LANGUAGE_TYPE = eINSTANCE.getEvaluationLanguageType();

		/**
		 * The meta object literal for the '{@link upctformaevalua.UnitLicenses <em>Unit Licenses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.UnitLicenses
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getUnitLicenses()
		 * @generated
		 */
		EEnum UNIT_LICENSES = eINSTANCE.getUnitLicenses();

		/**
		 * The meta object literal for the '{@link upctformaevalua.EvaluationUnitType <em>Evaluation Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctformaevalua.EvaluationUnitType
		 * @see upctformaevalua.impl.UpctformaevaluaPackageImpl#getEvaluationUnitType()
		 * @generated
		 */
		EEnum EVALUATION_UNIT_TYPE = eINSTANCE.getEvaluationUnitType();

	}

} //UpctformaevaluaPackage
