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

import upctforma.ContentDefinition;
import upctforma.ContentUnit;
import upctforma.Import;
import upctforma.TemplateDef;
import upctforma.Type;
import upctforma.UpctformaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.ContentDefinitionImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link upctforma.impl.ContentDefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link upctforma.impl.ContentDefinitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link upctforma.impl.ContentDefinitionImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentDefinitionImpl extends NameElementImpl implements ContentDefinition {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateDef> templates;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ContentUnit unit;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateDef> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<TemplateDef>(TemplateDef.class, this, UpctformaPackage.CONTENT_DEFINITION__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, UpctformaPackage.CONTENT_DEFINITION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(ContentUnit newUnit, NotificationChain msgs) {
		ContentUnit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_DEFINITION__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(ContentUnit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.CONTENT_DEFINITION__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UpctformaPackage.CONTENT_DEFINITION__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.CONTENT_DEFINITION__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, UpctformaPackage.CONTENT_DEFINITION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.CONTENT_DEFINITION__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.CONTENT_DEFINITION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case UpctformaPackage.CONTENT_DEFINITION__UNIT:
				return basicSetUnit(null, msgs);
			case UpctformaPackage.CONTENT_DEFINITION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.CONTENT_DEFINITION__TEMPLATES:
				return getTemplates();
			case UpctformaPackage.CONTENT_DEFINITION__IMPORTS:
				return getImports();
			case UpctformaPackage.CONTENT_DEFINITION__UNIT:
				return getUnit();
			case UpctformaPackage.CONTENT_DEFINITION__TYPES:
				return getTypes();
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
			case UpctformaPackage.CONTENT_DEFINITION__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends TemplateDef>)newValue);
				return;
			case UpctformaPackage.CONTENT_DEFINITION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case UpctformaPackage.CONTENT_DEFINITION__UNIT:
				setUnit((ContentUnit)newValue);
				return;
			case UpctformaPackage.CONTENT_DEFINITION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
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
			case UpctformaPackage.CONTENT_DEFINITION__TEMPLATES:
				getTemplates().clear();
				return;
			case UpctformaPackage.CONTENT_DEFINITION__IMPORTS:
				getImports().clear();
				return;
			case UpctformaPackage.CONTENT_DEFINITION__UNIT:
				setUnit((ContentUnit)null);
				return;
			case UpctformaPackage.CONTENT_DEFINITION__TYPES:
				getTypes().clear();
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
			case UpctformaPackage.CONTENT_DEFINITION__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case UpctformaPackage.CONTENT_DEFINITION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case UpctformaPackage.CONTENT_DEFINITION__UNIT:
				return unit != null;
			case UpctformaPackage.CONTENT_DEFINITION__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentDefinitionImpl
