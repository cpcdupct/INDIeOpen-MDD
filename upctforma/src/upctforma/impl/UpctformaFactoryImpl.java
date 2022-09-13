/**
 */
package upctforma.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpctformaFactoryImpl extends EFactoryImpl implements UpctformaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpctformaFactory init() {
		try {
			UpctformaFactory theUpctformaFactory = (UpctformaFactory)EPackage.Registry.INSTANCE.getEFactory(UpctformaPackage.eNS_URI);
			if (theUpctformaFactory != null) {
				return theUpctformaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UpctformaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UpctformaPackage.COLUMN: return createColumn();
			case UpctformaPackage.TEMPLATE_DEF: return createTemplateDef();
			case UpctformaPackage.IMAGE: return createImage();
			case UpctformaPackage.NAME_ELEMENT: return createNameElement();
			case UpctformaPackage.WIDGET: return createWidget();
			case UpctformaPackage.TEXT: return createText();
			case UpctformaPackage.COMPOSITE: return createComposite();
			case UpctformaPackage.VIDEO: return createVideo();
			case UpctformaPackage.CONTENT_DEFINITION: return createContentDefinition();
			case UpctformaPackage.CONTENT_ELEMENT: return createContentElement();
			case UpctformaPackage.SIMPLE_ELEMENT: return createSimpleElement();
			case UpctformaPackage.PLACE_HOLDER: return createPlaceHolder();
			case UpctformaPackage.ROW: return createRow();
			case UpctformaPackage.CONTENT_UNIT: return createContentUnit();
			case UpctformaPackage.SECTION: return createSection();
			case UpctformaPackage.IMPORT: return createImport();
			case UpctformaPackage.USE_TEMPLATE: return createUseTemplate();
			case UpctformaPackage.TYPE: return createType();
			case UpctformaPackage.SIMPLE_TYPE: return createSimpleType();
			case UpctformaPackage.RECORD_TYPE: return createRecordType();
			case UpctformaPackage.WIDGET_TYPE: return createWidgetType();
			case UpctformaPackage.LIST_TYPE: return createListType();
			case UpctformaPackage.GAME: return createGame();
			case UpctformaPackage.COMPOSITE_TYPE: return createCompositeType();
			case UpctformaPackage.FIELD: return createField();
			case UpctformaPackage.RECORD_VALUE: return createRecordValue();
			case UpctformaPackage.LIST_VALUE: return createListValue();
			case UpctformaPackage.FIELD_VALUE: return createFieldValue();
			case UpctformaPackage.NUMBER: return createNumber();
			case UpctformaPackage.LITERAL: return createLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaPackage.CONTENT_UNIT_TYPE:
				return createContentUnitTypeFromString(eDataType, initialValue);
			case UpctformaPackage.VIDEO_TYPE:
				return createVideoTypeFromString(eDataType, initialValue);
			case UpctformaPackage.LANGUAGE_TYPE:
				return createLanguageTypeFromString(eDataType, initialValue);
			case UpctformaPackage.IMAGE_TYPE:
				return createImageTypeFromString(eDataType, initialValue);
			case UpctformaPackage.UNIT_LICENSES:
				return createUnitLicensesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UpctformaPackage.CONTENT_UNIT_TYPE:
				return convertContentUnitTypeToString(eDataType, instanceValue);
			case UpctformaPackage.VIDEO_TYPE:
				return convertVideoTypeToString(eDataType, instanceValue);
			case UpctformaPackage.LANGUAGE_TYPE:
				return convertLanguageTypeToString(eDataType, instanceValue);
			case UpctformaPackage.IMAGE_TYPE:
				return convertImageTypeToString(eDataType, instanceValue);
			case UpctformaPackage.UNIT_LICENSES:
				return convertUnitLicensesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateDef createTemplateDef() {
		TemplateDefImpl templateDef = new TemplateDefImpl();
		return templateDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameElement createNameElement() {
		NameElementImpl nameElement = new NameElementImpl();
		return nameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentDefinition createContentDefinition() {
		ContentDefinitionImpl contentDefinition = new ContentDefinitionImpl();
		return contentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentElement createContentElement() {
		ContentElementImpl contentElement = new ContentElementImpl();
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleElement createSimpleElement() {
		SimpleElementImpl simpleElement = new SimpleElementImpl();
		return simpleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaceHolder createPlaceHolder() {
		PlaceHolderImpl placeHolder = new PlaceHolderImpl();
		return placeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit createContentUnit() {
		ContentUnitImpl contentUnit = new ContentUnitImpl();
		return contentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseTemplate createUseTemplate() {
		UseTemplateImpl useTemplate = new UseTemplateImpl();
		return useTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordType createRecordType() {
		RecordTypeImpl recordType = new RecordTypeImpl();
		return recordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetType createWidgetType() {
		WidgetTypeImpl widgetType = new WidgetTypeImpl();
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordValue createRecordValue() {
		RecordValueImpl recordValue = new RecordValueImpl();
		return recordValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListValue createListValue() {
		ListValueImpl listValue = new ListValueImpl();
		return listValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldValue createFieldValue() {
		FieldValueImpl fieldValue = new FieldValueImpl();
		return fieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public upctforma.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnitType createContentUnitTypeFromString(EDataType eDataType, String initialValue) {
		ContentUnitType result = ContentUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoType createVideoTypeFromString(EDataType eDataType, String initialValue) {
		VideoType result = VideoType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVideoTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType createImageTypeFromString(EDataType eDataType, String initialValue) {
		ImageType result = ImageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLicenses createUnitLicensesFromString(EDataType eDataType, String initialValue) {
		UnitLicenses result = UnitLicenses.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitLicensesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpctformaPackage getUpctformaPackage() {
		return (UpctformaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UpctformaPackage getPackage() {
		return UpctformaPackage.eINSTANCE;
	}

} //UpctformaFactoryImpl
