/**
 */
package upctforma.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import upctforma.Column;
import upctforma.Composite;
import upctforma.CompositeType;
import upctforma.ContentDefinition;
import upctforma.ContentElement;
import upctforma.ContentUnit;
import upctforma.Field;
import upctforma.FieldValue;
import upctforma.Game;
import upctforma.Image;
import upctforma.Import;
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
import upctforma.UpctformaPackage;
import upctforma.UseTemplate;
import upctforma.Video;
import upctforma.Widget;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see upctforma.UpctformaPackage
 * @generated
 */
public class UpctformaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaSwitch() {
		if (modelPackage == null) {
			modelPackage = UpctformaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UpctformaPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseComposite(column);
				if (result == null) result = caseContentElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.TEMPLATE_DEF: {
				TemplateDef templateDef = (TemplateDef)theEObject;
				T result = caseTemplateDef(templateDef);
				if (result == null) result = caseNameElement(templateDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseSimpleElement(image);
				if (result == null) result = caseContentElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.NAME_ELEMENT: {
				NameElement nameElement = (NameElement)theEObject;
				T result = caseNameElement(nameElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseContentElement(widget);
				if (result == null) result = caseNameElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseSimpleElement(text);
				if (result == null) result = caseContentElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseContentElement(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseSimpleElement(video);
				if (result == null) result = caseContentElement(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.CONTENT_DEFINITION: {
				ContentDefinition contentDefinition = (ContentDefinition)theEObject;
				T result = caseContentDefinition(contentDefinition);
				if (result == null) result = caseNameElement(contentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.CONTENT_ELEMENT: {
				ContentElement contentElement = (ContentElement)theEObject;
				T result = caseContentElement(contentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.SIMPLE_ELEMENT: {
				SimpleElement simpleElement = (SimpleElement)theEObject;
				T result = caseSimpleElement(simpleElement);
				if (result == null) result = caseContentElement(simpleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.PLACE_HOLDER: {
				PlaceHolder placeHolder = (PlaceHolder)theEObject;
				T result = casePlaceHolder(placeHolder);
				if (result == null) result = caseContentElement(placeHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseComposite(row);
				if (result == null) result = caseContentElement(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.CONTENT_UNIT: {
				ContentUnit contentUnit = (ContentUnit)theEObject;
				T result = caseContentUnit(contentUnit);
				if (result == null) result = caseNameElement(contentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseNameElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.USE_TEMPLATE: {
				UseTemplate useTemplate = (UseTemplate)theEObject;
				T result = caseUseTemplate(useTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNameElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseType(simpleType);
				if (result == null) result = caseNameElement(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.RECORD_TYPE: {
				RecordType recordType = (RecordType)theEObject;
				T result = caseRecordType(recordType);
				if (result == null) result = caseCompositeType(recordType);
				if (result == null) result = caseType(recordType);
				if (result == null) result = caseNameElement(recordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.WIDGET_TYPE: {
				WidgetType widgetType = (WidgetType)theEObject;
				T result = caseWidgetType(widgetType);
				if (result == null) result = caseType(widgetType);
				if (result == null) result = caseNameElement(widgetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = caseCompositeType(listType);
				if (result == null) result = caseType(listType);
				if (result == null) result = caseNameElement(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = caseSimpleElement(game);
				if (result == null) result = caseContentElement(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.COMPOSITE_TYPE: {
				CompositeType compositeType = (CompositeType)theEObject;
				T result = caseCompositeType(compositeType);
				if (result == null) result = caseType(compositeType);
				if (result == null) result = caseNameElement(compositeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseNameElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.RECORD_VALUE: {
				RecordValue recordValue = (RecordValue)theEObject;
				T result = caseRecordValue(recordValue);
				if (result == null) result = caseContentElement(recordValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.LIST_VALUE: {
				ListValue listValue = (ListValue)theEObject;
				T result = caseListValue(listValue);
				if (result == null) result = caseContentElement(listValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.FIELD_VALUE: {
				FieldValue fieldValue = (FieldValue)theEObject;
				T result = caseFieldValue(fieldValue);
				if (result == null) result = caseNameElement(fieldValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.NUMBER: {
				upctforma.Number number = (upctforma.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseSimpleElement(number);
				if (result == null) result = caseContentElement(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UpctformaPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseSimpleElement(literal);
				if (result == null) result = caseContentElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateDef(TemplateDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameElement(NameElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDefinition(ContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentElement(ContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleElement(SimpleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceHolder(PlaceHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentUnit(ContentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseTemplate(UseTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordType(RecordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetType(WidgetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordValue(RecordValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValue(ListValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldValue(FieldValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(upctforma.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UpctformaSwitch
