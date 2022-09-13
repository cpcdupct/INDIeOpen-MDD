/**
 */
package upctforma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see upctforma.UpctformaPackage
 * @generated
 */
public class UpctformaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UpctformaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpctformaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UpctformaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpctformaSwitch<Adapter> modelSwitch =
		new UpctformaSwitch<Adapter>() {
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseTemplateDef(TemplateDef object) {
				return createTemplateDefAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseNameElement(NameElement object) {
				return createNameElementAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseContentDefinition(ContentDefinition object) {
				return createContentDefinitionAdapter();
			}
			@Override
			public Adapter caseContentElement(ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseSimpleElement(SimpleElement object) {
				return createSimpleElementAdapter();
			}
			@Override
			public Adapter casePlaceHolder(PlaceHolder object) {
				return createPlaceHolderAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseContentUnit(ContentUnit object) {
				return createContentUnitAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseUseTemplate(UseTemplate object) {
				return createUseTemplateAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseSimpleType(SimpleType object) {
				return createSimpleTypeAdapter();
			}
			@Override
			public Adapter caseRecordType(RecordType object) {
				return createRecordTypeAdapter();
			}
			@Override
			public Adapter caseWidgetType(WidgetType object) {
				return createWidgetTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseCompositeType(CompositeType object) {
				return createCompositeTypeAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseRecordValue(RecordValue object) {
				return createRecordValueAdapter();
			}
			@Override
			public Adapter caseListValue(ListValue object) {
				return createListValueAdapter();
			}
			@Override
			public Adapter caseFieldValue(FieldValue object) {
				return createFieldValueAdapter();
			}
			@Override
			public Adapter caseNumber(upctforma.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.TemplateDef <em>Template Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.TemplateDef
	 * @generated
	 */
	public Adapter createTemplateDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.NameElement
	 * @generated
	 */
	public Adapter createNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.ContentDefinition <em>Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.ContentDefinition
	 * @generated
	 */
	public Adapter createContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.SimpleElement <em>Simple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.SimpleElement
	 * @generated
	 */
	public Adapter createSimpleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.PlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.PlaceHolder
	 * @generated
	 */
	public Adapter createPlaceHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.ContentUnit
	 * @generated
	 */
	public Adapter createContentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.UseTemplate <em>Use Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.UseTemplate
	 * @generated
	 */
	public Adapter createUseTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.RecordType
	 * @generated
	 */
	public Adapter createRecordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.WidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.WidgetType
	 * @generated
	 */
	public Adapter createWidgetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.CompositeType
	 * @generated
	 */
	public Adapter createCompositeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.RecordValue <em>Record Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.RecordValue
	 * @generated
	 */
	public Adapter createRecordValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.ListValue <em>List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.ListValue
	 * @generated
	 */
	public Adapter createListValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.FieldValue
	 * @generated
	 */
	public Adapter createFieldValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link upctforma.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see upctforma.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UpctformaAdapterFactory
