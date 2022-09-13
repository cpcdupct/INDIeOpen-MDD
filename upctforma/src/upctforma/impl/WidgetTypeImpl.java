/**
 */
package upctforma.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import upctforma.Type;
import upctforma.UpctformaPackage;
import upctforma.WidgetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.WidgetTypeImpl#getWidgettypeelements <em>Widgettypeelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetTypeImpl extends TypeImpl implements WidgetType {
	/**
	 * The cached value of the '{@link #getWidgettypeelements() <em>Widgettypeelements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgettypeelements()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> widgettypeelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.WIDGET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getWidgettypeelements() {
		if (widgettypeelements == null) {
			widgettypeelements = new EObjectResolvingEList<Type>(Type.class, this, UpctformaPackage.WIDGET_TYPE__WIDGETTYPEELEMENTS);
		}
		return widgettypeelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.WIDGET_TYPE__WIDGETTYPEELEMENTS:
				return getWidgettypeelements();
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
			case UpctformaPackage.WIDGET_TYPE__WIDGETTYPEELEMENTS:
				getWidgettypeelements().clear();
				getWidgettypeelements().addAll((Collection<? extends Type>)newValue);
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
			case UpctformaPackage.WIDGET_TYPE__WIDGETTYPEELEMENTS:
				getWidgettypeelements().clear();
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
			case UpctformaPackage.WIDGET_TYPE__WIDGETTYPEELEMENTS:
				return widgettypeelements != null && !widgettypeelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetTypeImpl
