/**
 */
package upctforma;

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
 * @see upctforma.UpctformaFactory
 * @model kind="package"
 * @generated
 */
public interface UpctformaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "upctforma";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cpcd.upct.es/upctforma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "upctforma";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpctformaPackage eINSTANCE = upctforma.impl.UpctformaPackageImpl.init();

	/**
	 * The meta object id for the '{@link upctforma.impl.ContentElementImpl <em>Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ContentElementImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getContentElement()
	 * @generated
	 */
	int CONTENT_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.CompositeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 6;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ColumnImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ELEMENTS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.NameElementImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 3;

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
	 * The meta object id for the '{@link upctforma.impl.TemplateDefImpl <em>Template Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TemplateDefImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getTemplateDef()
	 * @generated
	 */
	int TEMPLATE_DEF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF__ROWS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEF_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SimpleElementImpl <em>Simple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SimpleElementImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSimpleElement()
	 * @generated
	 */
	int SIMPLE_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Simple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ELEMENT_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ELEMENT_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ImageImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TYPE = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = SIMPLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.WidgetImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widgettype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGETTYPE = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Widgetelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGETELEMENTS = CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HELP = CONTENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TextImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__HTML = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.VideoImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TITLE = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TYPE = SIMPLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Captions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CAPTIONS = SIMPLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTIONS = SIMPLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ContentDefinitionImpl <em>Content Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ContentDefinitionImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getContentDefinition()
	 * @generated
	 */
	int CONTENT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION__TEMPLATES = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION__IMPORTS = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION__UNIT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION__TYPES = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Content Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_DEFINITION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.PlaceHolderImpl <em>Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.PlaceHolderImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getPlaceHolder()
	 * @generated
	 */
	int PLACE_HOLDER = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER__TYPE = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.RowImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 12;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usetemplate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__USETEMPLATE = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = COMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ContentUnitImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__SECTIONS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__AUTHOR = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__TYPE = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LANGUAGE = NAME_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LICENSE = NAME_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__EMAIL = NAME_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__INSTITUTION = NAME_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__THEME = NAME_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Idunidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__IDUNIDAD = NAME_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Learninganalytics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LEARNINGANALYTICS = NAME_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SectionImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ROWS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ImportImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.UseTemplateImpl <em>Use Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.UseTemplateImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getUseTemplate()
	 * @generated
	 */
	int USE_TEMPLATE = 16;

	/**
	 * The feature id for the '<em><b>Typetemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE__TYPETEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Templateelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE__TEMPLATEELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Use Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Use Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.TypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.SimpleTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.CompositeTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.RecordTypeImpl <em>Record Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.RecordTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getRecordType()
	 * @generated
	 */
	int RECORD_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__NAME = COMPOSITE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Recordtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__RECORDTYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_OPERATION_COUNT = COMPOSITE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.WidgetTypeImpl <em>Widget Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.WidgetTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getWidgetType()
	 * @generated
	 */
	int WIDGET_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Widgettypeelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TYPE__WIDGETTYPEELEMENTS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Widget Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ListTypeImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = COMPOSITE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Listtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__LISTTYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = COMPOSITE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.GameImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ID = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.FieldImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fieldtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELDTYPE = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.RecordValueImpl <em>Record Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.RecordValueImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getRecordValue()
	 * @generated
	 */
	int RECORD_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Recordvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE__RECORDVALUES = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.ListValueImpl <em>List Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.ListValueImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getListValue()
	 * @generated
	 */
	int LIST_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Listvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE__LISTVALUES = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VALUE_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.FieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.FieldValueImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getFieldValue()
	 * @generated
	 */
	int FIELD_VALUE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fieldvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__FIELDVALUE = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link upctforma.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.NumberImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 28;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NUM = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.impl.LiteralImpl
	 * @see upctforma.impl.UpctformaPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 29;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL = SIMPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = SIMPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = SIMPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link upctforma.ContentUnitType <em>Content Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.ContentUnitType
	 * @see upctforma.impl.UpctformaPackageImpl#getContentUnitType()
	 * @generated
	 */
	int CONTENT_UNIT_TYPE = 30;

	/**
	 * The meta object id for the '{@link upctforma.VideoType <em>Video Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.VideoType
	 * @see upctforma.impl.UpctformaPackageImpl#getVideoType()
	 * @generated
	 */
	int VIDEO_TYPE = 31;

	/**
	 * The meta object id for the '{@link upctforma.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.LanguageType
	 * @see upctforma.impl.UpctformaPackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 32;

	/**
	 * The meta object id for the '{@link upctforma.ImageType <em>Image Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.ImageType
	 * @see upctforma.impl.UpctformaPackageImpl#getImageType()
	 * @generated
	 */
	int IMAGE_TYPE = 33;

	/**
	 * The meta object id for the '{@link upctforma.UnitLicenses <em>Unit Licenses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see upctforma.UnitLicenses
	 * @see upctforma.impl.UpctformaPackageImpl#getUnitLicenses()
	 * @generated
	 */
	int UNIT_LICENSES = 34;

	/**
	 * Returns the meta object for class '{@link upctforma.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see upctforma.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Column#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see upctforma.Column#getElements()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Elements();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see upctforma.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Width();

	/**
	 * Returns the meta object for class '{@link upctforma.TemplateDef <em>Template Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Def</em>'.
	 * @see upctforma.TemplateDef
	 * @generated
	 */
	EClass getTemplateDef();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.TemplateDef#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see upctforma.TemplateDef#getRows()
	 * @see #getTemplateDef()
	 * @generated
	 */
	EReference getTemplateDef_Rows();

	/**
	 * Returns the meta object for class '{@link upctforma.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see upctforma.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Image#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see upctforma.Image#getUrl()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Url();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Image#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctforma.Image#getType()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see upctforma.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for class '{@link upctforma.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see upctforma.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see upctforma.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for class '{@link upctforma.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see upctforma.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the reference '{@link upctforma.Widget#getWidgettype <em>Widgettype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Widgettype</em>'.
	 * @see upctforma.Widget#getWidgettype()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Widgettype();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Widget#getWidgetelements <em>Widgetelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgetelements</em>'.
	 * @see upctforma.Widget#getWidgetelements()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Widgetelements();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Widget#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see upctforma.Widget#getHelp()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Help();

	/**
	 * Returns the meta object for class '{@link upctforma.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see upctforma.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Text#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see upctforma.Text#getHtml()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Html();

	/**
	 * Returns the meta object for class '{@link upctforma.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see upctforma.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link upctforma.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see upctforma.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see upctforma.Video#getId()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Id();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see upctforma.Video#getTitle()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Title();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctforma.Video#getType()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getCaptions <em>Captions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captions</em>'.
	 * @see upctforma.Video#getCaptions()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Captions();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Video#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptions</em>'.
	 * @see upctforma.Video#getDescriptions()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Descriptions();

	/**
	 * Returns the meta object for class '{@link upctforma.ContentDefinition <em>Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Definition</em>'.
	 * @see upctforma.ContentDefinition
	 * @generated
	 */
	EClass getContentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.ContentDefinition#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see upctforma.ContentDefinition#getTemplates()
	 * @see #getContentDefinition()
	 * @generated
	 */
	EReference getContentDefinition_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.ContentDefinition#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see upctforma.ContentDefinition#getImports()
	 * @see #getContentDefinition()
	 * @generated
	 */
	EReference getContentDefinition_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link upctforma.ContentDefinition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see upctforma.ContentDefinition#getUnit()
	 * @see #getContentDefinition()
	 * @generated
	 */
	EReference getContentDefinition_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.ContentDefinition#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see upctforma.ContentDefinition#getTypes()
	 * @see #getContentDefinition()
	 * @generated
	 */
	EReference getContentDefinition_Types();

	/**
	 * Returns the meta object for class '{@link upctforma.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Element</em>'.
	 * @see upctforma.ContentElement
	 * @generated
	 */
	EClass getContentElement();

	/**
	 * Returns the meta object for class '{@link upctforma.SimpleElement <em>Simple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Element</em>'.
	 * @see upctforma.SimpleElement
	 * @generated
	 */
	EClass getSimpleElement();

	/**
	 * Returns the meta object for class '{@link upctforma.PlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Holder</em>'.
	 * @see upctforma.PlaceHolder
	 * @generated
	 */
	EClass getPlaceHolder();

	/**
	 * Returns the meta object for the reference '{@link upctforma.PlaceHolder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see upctforma.PlaceHolder#getType()
	 * @see #getPlaceHolder()
	 * @generated
	 */
	EReference getPlaceHolder_Type();

	/**
	 * Returns the meta object for class '{@link upctforma.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see upctforma.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see upctforma.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link upctforma.Row#getUsetemplate <em>Usetemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usetemplate</em>'.
	 * @see upctforma.Row#getUsetemplate()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Usetemplate();

	/**
	 * Returns the meta object for class '{@link upctforma.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit</em>'.
	 * @see upctforma.ContentUnit
	 * @generated
	 */
	EClass getContentUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.ContentUnit#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see upctforma.ContentUnit#getSections()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_Sections();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see upctforma.ContentUnit#getAuthor()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Author();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see upctforma.ContentUnit#getType()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see upctforma.ContentUnit#getLanguage()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Language();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see upctforma.ContentUnit#getLicense()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_License();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see upctforma.ContentUnit#getEmail()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Email();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see upctforma.ContentUnit#getInstitution()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Institution();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see upctforma.ContentUnit#getTheme()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Theme();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getIdunidad <em>Idunidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idunidad</em>'.
	 * @see upctforma.ContentUnit#getIdunidad()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Idunidad();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.ContentUnit#getLearninganalytics <em>Learninganalytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learninganalytics</em>'.
	 * @see upctforma.ContentUnit#getLearninganalytics()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_Learninganalytics();

	/**
	 * Returns the meta object for class '{@link upctforma.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see upctforma.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.Section#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see upctforma.Section#getRows()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Rows();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see upctforma.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for class '{@link upctforma.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see upctforma.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see upctforma.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link upctforma.UseTemplate <em>Use Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Template</em>'.
	 * @see upctforma.UseTemplate
	 * @generated
	 */
	EClass getUseTemplate();

	/**
	 * Returns the meta object for the reference '{@link upctforma.UseTemplate#getTypetemplate <em>Typetemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typetemplate</em>'.
	 * @see upctforma.UseTemplate#getTypetemplate()
	 * @see #getUseTemplate()
	 * @generated
	 */
	EReference getUseTemplate_Typetemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.UseTemplate#getTemplateelements <em>Templateelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templateelements</em>'.
	 * @see upctforma.UseTemplate#getTemplateelements()
	 * @see #getUseTemplate()
	 * @generated
	 */
	EReference getUseTemplate_Templateelements();

	/**
	 * Returns the meta object for class '{@link upctforma.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see upctforma.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link upctforma.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see upctforma.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for class '{@link upctforma.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type</em>'.
	 * @see upctforma.RecordType
	 * @generated
	 */
	EClass getRecordType();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.RecordType#getRecordtype <em>Recordtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recordtype</em>'.
	 * @see upctforma.RecordType#getRecordtype()
	 * @see #getRecordType()
	 * @generated
	 */
	EReference getRecordType_Recordtype();

	/**
	 * Returns the meta object for class '{@link upctforma.WidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Type</em>'.
	 * @see upctforma.WidgetType
	 * @generated
	 */
	EClass getWidgetType();

	/**
	 * Returns the meta object for the reference list '{@link upctforma.WidgetType#getWidgettypeelements <em>Widgettypeelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgettypeelements</em>'.
	 * @see upctforma.WidgetType#getWidgettypeelements()
	 * @see #getWidgetType()
	 * @generated
	 */
	EReference getWidgetType_Widgettypeelements();

	/**
	 * Returns the meta object for class '{@link upctforma.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see upctforma.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the reference '{@link upctforma.ListType#getListtype <em>Listtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listtype</em>'.
	 * @see upctforma.ListType#getListtype()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_Listtype();

	/**
	 * Returns the meta object for class '{@link upctforma.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see upctforma.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Game#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see upctforma.Game#getId()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Id();

	/**
	 * Returns the meta object for class '{@link upctforma.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see upctforma.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for class '{@link upctforma.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see upctforma.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link upctforma.Field#getFieldtype <em>Fieldtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fieldtype</em>'.
	 * @see upctforma.Field#getFieldtype()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Fieldtype();

	/**
	 * Returns the meta object for class '{@link upctforma.RecordValue <em>Record Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Value</em>'.
	 * @see upctforma.RecordValue
	 * @generated
	 */
	EClass getRecordValue();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.RecordValue#getRecordvalues <em>Recordvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recordvalues</em>'.
	 * @see upctforma.RecordValue#getRecordvalues()
	 * @see #getRecordValue()
	 * @generated
	 */
	EReference getRecordValue_Recordvalues();

	/**
	 * Returns the meta object for class '{@link upctforma.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Value</em>'.
	 * @see upctforma.ListValue
	 * @generated
	 */
	EClass getListValue();

	/**
	 * Returns the meta object for the containment reference list '{@link upctforma.ListValue#getListvalues <em>Listvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listvalues</em>'.
	 * @see upctforma.ListValue#getListvalues()
	 * @see #getListValue()
	 * @generated
	 */
	EReference getListValue_Listvalues();

	/**
	 * Returns the meta object for class '{@link upctforma.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see upctforma.FieldValue
	 * @generated
	 */
	EClass getFieldValue();

	/**
	 * Returns the meta object for the containment reference '{@link upctforma.FieldValue#getFieldvalue <em>Fieldvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fieldvalue</em>'.
	 * @see upctforma.FieldValue#getFieldvalue()
	 * @see #getFieldValue()
	 * @generated
	 */
	EReference getFieldValue_Fieldvalue();

	/**
	 * Returns the meta object for class '{@link upctforma.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see upctforma.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Number#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see upctforma.Number#getNum()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Num();

	/**
	 * Returns the meta object for class '{@link upctforma.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see upctforma.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link upctforma.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see upctforma.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Literal();

	/**
	 * Returns the meta object for enum '{@link upctforma.ContentUnitType <em>Content Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Unit Type</em>'.
	 * @see upctforma.ContentUnitType
	 * @generated
	 */
	EEnum getContentUnitType();

	/**
	 * Returns the meta object for enum '{@link upctforma.VideoType <em>Video Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Video Type</em>'.
	 * @see upctforma.VideoType
	 * @generated
	 */
	EEnum getVideoType();

	/**
	 * Returns the meta object for enum '{@link upctforma.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see upctforma.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for enum '{@link upctforma.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Type</em>'.
	 * @see upctforma.ImageType
	 * @generated
	 */
	EEnum getImageType();

	/**
	 * Returns the meta object for enum '{@link upctforma.UnitLicenses <em>Unit Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Licenses</em>'.
	 * @see upctforma.UnitLicenses
	 * @generated
	 */
	EEnum getUnitLicenses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpctformaFactory getUpctformaFactory();

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
		 * The meta object literal for the '{@link upctforma.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ColumnImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ELEMENTS = eINSTANCE.getColumn_Elements();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TemplateDefImpl <em>Template Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TemplateDefImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getTemplateDef()
		 * @generated
		 */
		EClass TEMPLATE_DEF = eINSTANCE.getTemplateDef();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEF__ROWS = eINSTANCE.getTemplateDef_Rows();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ImageImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TYPE = eINSTANCE.getImage_Type();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

		/**
		 * The meta object literal for the '{@link upctforma.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.NameElementImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getNameElement()
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
		 * The meta object literal for the '{@link upctforma.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.WidgetImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Widgettype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDGETTYPE = eINSTANCE.getWidget_Widgettype();

		/**
		 * The meta object literal for the '<em><b>Widgetelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDGETELEMENTS = eINSTANCE.getWidget_Widgetelements();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__HELP = eINSTANCE.getWidget_Help();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TextImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__HTML = eINSTANCE.getText_Html();

		/**
		 * The meta object literal for the '{@link upctforma.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.CompositeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link upctforma.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.VideoImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__ID = eINSTANCE.getVideo_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TITLE = eINSTANCE.getVideo_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TYPE = eINSTANCE.getVideo_Type();

		/**
		 * The meta object literal for the '<em><b>Captions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__CAPTIONS = eINSTANCE.getVideo_Captions();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DESCRIPTIONS = eINSTANCE.getVideo_Descriptions();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ContentDefinitionImpl <em>Content Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ContentDefinitionImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getContentDefinition()
		 * @generated
		 */
		EClass CONTENT_DEFINITION = eINSTANCE.getContentDefinition();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_DEFINITION__TEMPLATES = eINSTANCE.getContentDefinition_Templates();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_DEFINITION__IMPORTS = eINSTANCE.getContentDefinition_Imports();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_DEFINITION__UNIT = eINSTANCE.getContentDefinition_Unit();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_DEFINITION__TYPES = eINSTANCE.getContentDefinition_Types();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ContentElementImpl <em>Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ContentElementImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getContentElement()
		 * @generated
		 */
		EClass CONTENT_ELEMENT = eINSTANCE.getContentElement();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SimpleElementImpl <em>Simple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SimpleElementImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSimpleElement()
		 * @generated
		 */
		EClass SIMPLE_ELEMENT = eINSTANCE.getSimpleElement();

		/**
		 * The meta object literal for the '{@link upctforma.impl.PlaceHolderImpl <em>Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.PlaceHolderImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getPlaceHolder()
		 * @generated
		 */
		EClass PLACE_HOLDER = eINSTANCE.getPlaceHolder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_HOLDER__TYPE = eINSTANCE.getPlaceHolder_Type();

		/**
		 * The meta object literal for the '{@link upctforma.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.RowImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();

		/**
		 * The meta object literal for the '<em><b>Usetemplate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__USETEMPLATE = eINSTANCE.getRow_Usetemplate();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ContentUnitImpl <em>Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ContentUnitImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getContentUnit()
		 * @generated
		 */
		EClass CONTENT_UNIT = eINSTANCE.getContentUnit();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__SECTIONS = eINSTANCE.getContentUnit_Sections();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__AUTHOR = eINSTANCE.getContentUnit_Author();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__TYPE = eINSTANCE.getContentUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LANGUAGE = eINSTANCE.getContentUnit_Language();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LICENSE = eINSTANCE.getContentUnit_License();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__EMAIL = eINSTANCE.getContentUnit_Email();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__INSTITUTION = eINSTANCE.getContentUnit_Institution();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__THEME = eINSTANCE.getContentUnit_Theme();

		/**
		 * The meta object literal for the '<em><b>Idunidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__IDUNIDAD = eINSTANCE.getContentUnit_Idunidad();

		/**
		 * The meta object literal for the '<em><b>Learninganalytics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LEARNINGANALYTICS = eINSTANCE.getContentUnit_Learninganalytics();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SectionImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ROWS = eINSTANCE.getSection_Rows();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ImportImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link upctforma.impl.UseTemplateImpl <em>Use Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.UseTemplateImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getUseTemplate()
		 * @generated
		 */
		EClass USE_TEMPLATE = eINSTANCE.getUseTemplate();

		/**
		 * The meta object literal for the '<em><b>Typetemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_TEMPLATE__TYPETEMPLATE = eINSTANCE.getUseTemplate_Typetemplate();

		/**
		 * The meta object literal for the '<em><b>Templateelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_TEMPLATE__TEMPLATEELEMENTS = eINSTANCE.getUseTemplate_Templateelements();

		/**
		 * The meta object literal for the '{@link upctforma.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.TypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link upctforma.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.SimpleTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '{@link upctforma.impl.RecordTypeImpl <em>Record Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.RecordTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getRecordType()
		 * @generated
		 */
		EClass RECORD_TYPE = eINSTANCE.getRecordType();

		/**
		 * The meta object literal for the '<em><b>Recordtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TYPE__RECORDTYPE = eINSTANCE.getRecordType_Recordtype();

		/**
		 * The meta object literal for the '{@link upctforma.impl.WidgetTypeImpl <em>Widget Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.WidgetTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getWidgetType()
		 * @generated
		 */
		EClass WIDGET_TYPE = eINSTANCE.getWidgetType();

		/**
		 * The meta object literal for the '<em><b>Widgettypeelements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_TYPE__WIDGETTYPEELEMENTS = eINSTANCE.getWidgetType_Widgettypeelements();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ListTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Listtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__LISTTYPE = eINSTANCE.getListType_Listtype();

		/**
		 * The meta object literal for the '{@link upctforma.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.GameImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__ID = eINSTANCE.getGame_Id();

		/**
		 * The meta object literal for the '{@link upctforma.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.CompositeTypeImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '{@link upctforma.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.FieldImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Fieldtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FIELDTYPE = eINSTANCE.getField_Fieldtype();

		/**
		 * The meta object literal for the '{@link upctforma.impl.RecordValueImpl <em>Record Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.RecordValueImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getRecordValue()
		 * @generated
		 */
		EClass RECORD_VALUE = eINSTANCE.getRecordValue();

		/**
		 * The meta object literal for the '<em><b>Recordvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_VALUE__RECORDVALUES = eINSTANCE.getRecordValue_Recordvalues();

		/**
		 * The meta object literal for the '{@link upctforma.impl.ListValueImpl <em>List Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.ListValueImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getListValue()
		 * @generated
		 */
		EClass LIST_VALUE = eINSTANCE.getListValue();

		/**
		 * The meta object literal for the '<em><b>Listvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VALUE__LISTVALUES = eINSTANCE.getListValue_Listvalues();

		/**
		 * The meta object literal for the '{@link upctforma.impl.FieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.FieldValueImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getFieldValue()
		 * @generated
		 */
		EClass FIELD_VALUE = eINSTANCE.getFieldValue();

		/**
		 * The meta object literal for the '<em><b>Fieldvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_VALUE__FIELDVALUE = eINSTANCE.getFieldValue_Fieldvalue();

		/**
		 * The meta object literal for the '{@link upctforma.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.NumberImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__NUM = eINSTANCE.getNumber_Num();

		/**
		 * The meta object literal for the '{@link upctforma.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.impl.LiteralImpl
		 * @see upctforma.impl.UpctformaPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LITERAL = eINSTANCE.getLiteral_Literal();

		/**
		 * The meta object literal for the '{@link upctforma.ContentUnitType <em>Content Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.ContentUnitType
		 * @see upctforma.impl.UpctformaPackageImpl#getContentUnitType()
		 * @generated
		 */
		EEnum CONTENT_UNIT_TYPE = eINSTANCE.getContentUnitType();

		/**
		 * The meta object literal for the '{@link upctforma.VideoType <em>Video Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.VideoType
		 * @see upctforma.impl.UpctformaPackageImpl#getVideoType()
		 * @generated
		 */
		EEnum VIDEO_TYPE = eINSTANCE.getVideoType();

		/**
		 * The meta object literal for the '{@link upctforma.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.LanguageType
		 * @see upctforma.impl.UpctformaPackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

		/**
		 * The meta object literal for the '{@link upctforma.ImageType <em>Image Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.ImageType
		 * @see upctforma.impl.UpctformaPackageImpl#getImageType()
		 * @generated
		 */
		EEnum IMAGE_TYPE = eINSTANCE.getImageType();

		/**
		 * The meta object literal for the '{@link upctforma.UnitLicenses <em>Unit Licenses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see upctforma.UnitLicenses
		 * @see upctforma.impl.UpctformaPackageImpl#getUnitLicenses()
		 * @generated
		 */
		EEnum UNIT_LICENSES = eINSTANCE.getUnitLicenses();

	}

} //UpctformaPackage
