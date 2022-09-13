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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import upctforma.ContentElement;
import upctforma.TemplateDef;
import upctforma.UpctformaPackage;
import upctforma.UseTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.UseTemplateImpl#getTypetemplate <em>Typetemplate</em>}</li>
 *   <li>{@link upctforma.impl.UseTemplateImpl#getTemplateelements <em>Templateelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseTemplateImpl extends MinimalEObjectImpl.Container implements UseTemplate {
	/**
	 * The cached value of the '{@link #getTypetemplate() <em>Typetemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypetemplate()
	 * @generated
	 * @ordered
	 */
	protected TemplateDef typetemplate;

	/**
	 * The cached value of the '{@link #getTemplateelements() <em>Templateelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentElement> templateelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.USE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateDef getTypetemplate() {
		if (typetemplate != null && typetemplate.eIsProxy()) {
			InternalEObject oldTypetemplate = (InternalEObject)typetemplate;
			typetemplate = (TemplateDef)eResolveProxy(oldTypetemplate);
			if (typetemplate != oldTypetemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE, oldTypetemplate, typetemplate));
			}
		}
		return typetemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDef basicGetTypetemplate() {
		return typetemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypetemplate(TemplateDef newTypetemplate) {
		TemplateDef oldTypetemplate = typetemplate;
		typetemplate = newTypetemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE, oldTypetemplate, typetemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentElement> getTemplateelements() {
		if (templateelements == null) {
			templateelements = new EObjectContainmentEList<ContentElement>(ContentElement.class, this, UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS);
		}
		return templateelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS:
				return ((InternalEList<?>)getTemplateelements()).basicRemove(otherEnd, msgs);
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
			case UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE:
				if (resolve) return getTypetemplate();
				return basicGetTypetemplate();
			case UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS:
				return getTemplateelements();
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
			case UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE:
				setTypetemplate((TemplateDef)newValue);
				return;
			case UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS:
				getTemplateelements().clear();
				getTemplateelements().addAll((Collection<? extends ContentElement>)newValue);
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
			case UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE:
				setTypetemplate((TemplateDef)null);
				return;
			case UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS:
				getTemplateelements().clear();
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
			case UpctformaPackage.USE_TEMPLATE__TYPETEMPLATE:
				return typetemplate != null;
			case UpctformaPackage.USE_TEMPLATE__TEMPLATEELEMENTS:
				return templateelements != null && !templateelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseTemplateImpl
