/**
 */
package upctforma.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import upctforma.Column;
import upctforma.Composite;
import upctforma.CompositeType;
import upctforma.ContentDefinition;
import upctforma.ContentElement;
import upctforma.ContentUnit;
import upctforma.ContentUnitType;
import upctforma.Field;
import upctforma.FieldValue;
import upctforma.Game;
import upctforma.Image;
import upctforma.ImageType;
import upctforma.Import;
import upctforma.LanguageType;
import upctforma.ListType;
import upctforma.ListValue;
import upctforma.Literal;
import upctforma.NameElement;
import upctforma.PlaceHolder;
import upctforma.RecordType;
import upctforma.RecordValue;
import upctforma.Row;
import upctforma.Section;
import upctforma.SimpleElement;
import upctforma.SimpleType;
import upctforma.TemplateDef;
import upctforma.Text;
import upctforma.Type;
import upctforma.UnitLicenses;
import upctforma.UpctformaFactory;
import upctforma.UpctformaPackage;
import upctforma.UseTemplate;
import upctforma.Video;
import upctforma.VideoType;
import upctforma.Widget;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaPackageImpl extends EPackageImpl implements UpctformaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

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
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum videoTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitLicensesEEnum = null;

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
	 * @see upctforma.UpctformaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UpctformaPackageImpl() {
		super(eNS_URI, UpctformaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UpctformaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UpctformaPackage init() {
		if (isInited) return (UpctformaPackage)EPackage.Registry.INSTANCE.getEPackage(UpctformaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUpctformaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UpctformaPackageImpl theUpctformaPackage = registeredUpctformaPackage instanceof UpctformaPackageImpl ? (UpctformaPackageImpl)registeredUpctformaPackage : new UpctformaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUpctformaPackage.createPackageContents();

		// Initialize created meta-data
		theUpctformaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUpctformaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UpctformaPackage.eNS_URI, theUpctformaPackage);
		return theUpctformaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Elements() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Width() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateDef() {
		return templateDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateDef_Rows() {
		return (EReference)templateDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Url() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Type() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Alt() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
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
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Widgettype() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Widgetelements() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Help() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Html() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVideo_Id() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVideo_Title() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVideo_Type() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVideo_Captions() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVideo_Descriptions() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentDefinition() {
		return contentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentDefinition_Templates() {
		return (EReference)contentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentDefinition_Imports() {
		return (EReference)contentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentDefinition_Unit() {
		return (EReference)contentDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentDefinition_Types() {
		return (EReference)contentDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentElement() {
		return contentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleElement() {
		return simpleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaceHolder() {
		return placeHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaceHolder_Type() {
		return (EReference)placeHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Columns() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Usetemplate() {
		return (EReference)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentUnit() {
		return contentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentUnit_Sections() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Author() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Type() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Language() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_License() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Email() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Institution() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Theme() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Idunidad() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentUnit_Learninganalytics() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Rows() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Title() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseTemplate() {
		return useTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseTemplate_Typetemplate() {
		return (EReference)useTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseTemplate_Templateelements() {
		return (EReference)useTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordType() {
		return recordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordType_Recordtype() {
		return (EReference)recordTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetType() {
		return widgetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidgetType_Widgettypeelements() {
		return (EReference)widgetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_Listtype() {
		return (EReference)listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGame_Id() {
		return (EAttribute)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeType() {
		return compositeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Fieldtype() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordValue() {
		return recordValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordValue_Recordvalues() {
		return (EReference)recordValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListValue() {
		return listValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListValue_Listvalues() {
		return (EReference)listValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldValue() {
		return fieldValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldValue_Fieldvalue() {
		return (EReference)fieldValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumber_Num() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Literal() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContentUnitType() {
		return contentUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVideoType() {
		return videoTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImageType() {
		return imageTypeEEnum;
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
	public UpctformaFactory getUpctformaFactory() {
		return (UpctformaFactory)getEFactoryInstance();
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
		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__ELEMENTS);
		createEAttribute(columnEClass, COLUMN__WIDTH);

		templateDefEClass = createEClass(TEMPLATE_DEF);
		createEReference(templateDefEClass, TEMPLATE_DEF__ROWS);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__URL);
		createEAttribute(imageEClass, IMAGE__TYPE);
		createEAttribute(imageEClass, IMAGE__ALT);

		nameElementEClass = createEClass(NAME_ELEMENT);
		createEAttribute(nameElementEClass, NAME_ELEMENT__NAME);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__WIDGETTYPE);
		createEReference(widgetEClass, WIDGET__WIDGETELEMENTS);
		createEAttribute(widgetEClass, WIDGET__HELP);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__HTML);

		compositeEClass = createEClass(COMPOSITE);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__ID);
		createEAttribute(videoEClass, VIDEO__TITLE);
		createEAttribute(videoEClass, VIDEO__TYPE);
		createEAttribute(videoEClass, VIDEO__CAPTIONS);
		createEAttribute(videoEClass, VIDEO__DESCRIPTIONS);

		contentDefinitionEClass = createEClass(CONTENT_DEFINITION);
		createEReference(contentDefinitionEClass, CONTENT_DEFINITION__TEMPLATES);
		createEReference(contentDefinitionEClass, CONTENT_DEFINITION__IMPORTS);
		createEReference(contentDefinitionEClass, CONTENT_DEFINITION__UNIT);
		createEReference(contentDefinitionEClass, CONTENT_DEFINITION__TYPES);

		contentElementEClass = createEClass(CONTENT_ELEMENT);

		simpleElementEClass = createEClass(SIMPLE_ELEMENT);

		placeHolderEClass = createEClass(PLACE_HOLDER);
		createEReference(placeHolderEClass, PLACE_HOLDER__TYPE);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__COLUMNS);
		createEReference(rowEClass, ROW__USETEMPLATE);

		contentUnitEClass = createEClass(CONTENT_UNIT);
		createEReference(contentUnitEClass, CONTENT_UNIT__SECTIONS);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__AUTHOR);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__TYPE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__LANGUAGE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__LICENSE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__EMAIL);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__INSTITUTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__THEME);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__IDUNIDAD);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__LEARNINGANALYTICS);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__ROWS);
		createEAttribute(sectionEClass, SECTION__TITLE);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		useTemplateEClass = createEClass(USE_TEMPLATE);
		createEReference(useTemplateEClass, USE_TEMPLATE__TYPETEMPLATE);
		createEReference(useTemplateEClass, USE_TEMPLATE__TEMPLATEELEMENTS);

		typeEClass = createEClass(TYPE);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);

		recordTypeEClass = createEClass(RECORD_TYPE);
		createEReference(recordTypeEClass, RECORD_TYPE__RECORDTYPE);

		widgetTypeEClass = createEClass(WIDGET_TYPE);
		createEReference(widgetTypeEClass, WIDGET_TYPE__WIDGETTYPEELEMENTS);

		listTypeEClass = createEClass(LIST_TYPE);
		createEReference(listTypeEClass, LIST_TYPE__LISTTYPE);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__ID);

		compositeTypeEClass = createEClass(COMPOSITE_TYPE);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__FIELDTYPE);

		recordValueEClass = createEClass(RECORD_VALUE);
		createEReference(recordValueEClass, RECORD_VALUE__RECORDVALUES);

		listValueEClass = createEClass(LIST_VALUE);
		createEReference(listValueEClass, LIST_VALUE__LISTVALUES);

		fieldValueEClass = createEClass(FIELD_VALUE);
		createEReference(fieldValueEClass, FIELD_VALUE__FIELDVALUE);

		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__NUM);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__LITERAL);

		// Create enums
		contentUnitTypeEEnum = createEEnum(CONTENT_UNIT_TYPE);
		videoTypeEEnum = createEEnum(VIDEO_TYPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
		imageTypeEEnum = createEEnum(IMAGE_TYPE);
		unitLicensesEEnum = createEEnum(UNIT_LICENSES);
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
		columnEClass.getESuperTypes().add(this.getComposite());
		templateDefEClass.getESuperTypes().add(this.getNameElement());
		imageEClass.getESuperTypes().add(this.getSimpleElement());
		widgetEClass.getESuperTypes().add(this.getContentElement());
		widgetEClass.getESuperTypes().add(this.getNameElement());
		textEClass.getESuperTypes().add(this.getSimpleElement());
		compositeEClass.getESuperTypes().add(this.getContentElement());
		videoEClass.getESuperTypes().add(this.getSimpleElement());
		contentDefinitionEClass.getESuperTypes().add(this.getNameElement());
		simpleElementEClass.getESuperTypes().add(this.getContentElement());
		placeHolderEClass.getESuperTypes().add(this.getContentElement());
		rowEClass.getESuperTypes().add(this.getComposite());
		contentUnitEClass.getESuperTypes().add(this.getNameElement());
		sectionEClass.getESuperTypes().add(this.getNameElement());
		typeEClass.getESuperTypes().add(this.getNameElement());
		simpleTypeEClass.getESuperTypes().add(this.getType());
		recordTypeEClass.getESuperTypes().add(this.getCompositeType());
		widgetTypeEClass.getESuperTypes().add(this.getType());
		listTypeEClass.getESuperTypes().add(this.getCompositeType());
		gameEClass.getESuperTypes().add(this.getSimpleElement());
		compositeTypeEClass.getESuperTypes().add(this.getType());
		fieldEClass.getESuperTypes().add(this.getNameElement());
		recordValueEClass.getESuperTypes().add(this.getContentElement());
		listValueEClass.getESuperTypes().add(this.getContentElement());
		fieldValueEClass.getESuperTypes().add(this.getNameElement());
		numberEClass.getESuperTypes().add(this.getSimpleElement());
		literalEClass.getESuperTypes().add(this.getSimpleElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Elements(), this.getContentElement(), null, "elements", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Width(), ecorePackage.getEString(), "width", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateDefEClass, TemplateDef.class, "TemplateDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateDef_Rows(), this.getRow(), null, "rows", null, 0, -1, TemplateDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Type(), this.getImageType(), "type", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Alt(), ecorePackage.getEString(), "alt", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameElementEClass, NameElement.class, "NameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_Widgettype(), this.getWidgetType(), null, "widgettype", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Widgetelements(), this.getContentElement(), null, "widgetelements", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Help(), ecorePackage.getEString(), "help", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Html(), ecorePackage.getEString(), "html", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Id(), ecorePackage.getEString(), "id", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Title(), ecorePackage.getEString(), "title", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Type(), this.getVideoType(), "type", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Captions(), ecorePackage.getEString(), "captions", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Descriptions(), ecorePackage.getEString(), "descriptions", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentDefinitionEClass, ContentDefinition.class, "ContentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentDefinition_Templates(), this.getTemplateDef(), null, "templates", null, 0, -1, ContentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentDefinition_Imports(), this.getImport(), null, "imports", null, 0, -1, ContentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentDefinition_Unit(), this.getContentUnit(), null, "unit", null, 0, 1, ContentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentDefinition_Types(), this.getType(), null, "types", null, 0, -1, ContentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentElementEClass, ContentElement.class, "ContentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleElementEClass, SimpleElement.class, "SimpleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeHolderEClass, PlaceHolder.class, "PlaceHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceHolder_Type(), this.getType(), null, "type", null, 1, 1, PlaceHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Columns(), this.getColumn(), null, "columns", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRow_Usetemplate(), this.getUseTemplate(), null, "usetemplate", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_Sections(), this.getSection(), null, "sections", null, 1, -1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Author(), ecorePackage.getEString(), "author", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Type(), this.getContentUnitType(), "type", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Language(), this.getLanguageType(), "language", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_License(), this.getUnitLicenses(), "license", "PRIVATE", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Email(), ecorePackage.getEString(), "email", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Theme(), ecorePackage.getEString(), "theme", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Idunidad(), ecorePackage.getEString(), "idunidad", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Learninganalytics(), ecorePackage.getEInt(), "learninganalytics", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Rows(), this.getRow(), null, "rows", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Title(), ecorePackage.getEString(), "title", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useTemplateEClass, UseTemplate.class, "UseTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseTemplate_Typetemplate(), this.getTemplateDef(), null, "typetemplate", null, 0, 1, UseTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseTemplate_Templateelements(), this.getContentElement(), null, "templateelements", null, 0, -1, UseTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordTypeEClass, RecordType.class, "RecordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordType_Recordtype(), this.getField(), null, "recordtype", null, 1, -1, RecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetTypeEClass, WidgetType.class, "WidgetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetType_Widgettypeelements(), this.getType(), null, "widgettypeelements", null, 1, -1, WidgetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListType_Listtype(), this.getType(), null, "listtype", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_Id(), ecorePackage.getEString(), "id", null, 0, 1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeTypeEClass, CompositeType.class, "CompositeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Fieldtype(), this.getType(), null, "fieldtype", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordValueEClass, RecordValue.class, "RecordValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordValue_Recordvalues(), this.getFieldValue(), null, "recordvalues", null, 1, -1, RecordValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listValueEClass, ListValue.class, "ListValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListValue_Listvalues(), this.getContentElement(), null, "listvalues", null, 1, -1, ListValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldValueEClass, FieldValue.class, "FieldValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldValue_Fieldvalue(), this.getContentElement(), null, "fieldvalue", null, 1, 1, FieldValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEClass, upctforma.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_Num(), ecorePackage.getEInt(), "num", null, 0, 1, upctforma.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contentUnitTypeEEnum, ContentUnitType.class, "ContentUnitType");
		addEEnumLiteral(contentUnitTypeEEnum, ContentUnitType.INTEROPERABILITY);
		addEEnumLiteral(contentUnitTypeEEnum, ContentUnitType.OPEN);
		addEEnumLiteral(contentUnitTypeEEnum, ContentUnitType.PREVIEW);
		addEEnumLiteral(contentUnitTypeEEnum, ContentUnitType.GAMIFICATION);

		initEEnum(videoTypeEEnum, VideoType.class, "VideoType");
		addEEnumLiteral(videoTypeEEnum, VideoType.NORMAL);
		addEEnumLiteral(videoTypeEEnum, VideoType.INTERACTIVE);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.EN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ES);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FR);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.LT);

		initEEnum(imageTypeEEnum, ImageType.class, "ImageType");
		addEEnumLiteral(imageTypeEEnum, ImageType.ORIGINAL);
		addEEnumLiteral(imageTypeEEnum, ImageType.FIT);

		initEEnum(unitLicensesEEnum, UnitLicenses.class, "UnitLicenses");
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.PRIVATE);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BY);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYSA);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYND);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNC);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNCSA);
		addEEnumLiteral(unitLicensesEEnum, UnitLicenses.BYNCND);

		// Create resource
		createResource(eNS_URI);
	}

} //UpctformaPackageImpl
