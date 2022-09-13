/**
 */
package upctforma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import upctforma.UpctformaPackage;
import upctforma.Video;
import upctforma.VideoType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link upctforma.impl.VideoImpl#getId <em>Id</em>}</li>
 *   <li>{@link upctforma.impl.VideoImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link upctforma.impl.VideoImpl#getType <em>Type</em>}</li>
 *   <li>{@link upctforma.impl.VideoImpl#getCaptions <em>Captions</em>}</li>
 *   <li>{@link upctforma.impl.VideoImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends SimpleElementImpl implements Video {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VideoType TYPE_EDEFAULT = VideoType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VideoType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptions() <em>Captions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptions()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptions() <em>Captions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptions()
	 * @generated
	 * @ordered
	 */
	protected String captions = CAPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptions() <em>Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String descriptions = DESCRIPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpctformaPackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.VIDEO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.VIDEO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VideoType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VideoType newType) {
		VideoType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.VIDEO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaptions() {
		return captions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaptions(String newCaptions) {
		String oldCaptions = captions;
		captions = newCaptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.VIDEO__CAPTIONS, oldCaptions, captions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptions(String newDescriptions) {
		String oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpctformaPackage.VIDEO__DESCRIPTIONS, oldDescriptions, descriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpctformaPackage.VIDEO__ID:
				return getId();
			case UpctformaPackage.VIDEO__TITLE:
				return getTitle();
			case UpctformaPackage.VIDEO__TYPE:
				return getType();
			case UpctformaPackage.VIDEO__CAPTIONS:
				return getCaptions();
			case UpctformaPackage.VIDEO__DESCRIPTIONS:
				return getDescriptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UpctformaPackage.VIDEO__ID:
				setId((String)newValue);
				return;
			case UpctformaPackage.VIDEO__TITLE:
				setTitle((String)newValue);
				return;
			case UpctformaPackage.VIDEO__TYPE:
				setType((VideoType)newValue);
				return;
			case UpctformaPackage.VIDEO__CAPTIONS:
				setCaptions((String)newValue);
				return;
			case UpctformaPackage.VIDEO__DESCRIPTIONS:
				setDescriptions((String)newValue);
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
			case UpctformaPackage.VIDEO__ID:
				setId(ID_EDEFAULT);
				return;
			case UpctformaPackage.VIDEO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case UpctformaPackage.VIDEO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UpctformaPackage.VIDEO__CAPTIONS:
				setCaptions(CAPTIONS_EDEFAULT);
				return;
			case UpctformaPackage.VIDEO__DESCRIPTIONS:
				setDescriptions(DESCRIPTIONS_EDEFAULT);
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
			case UpctformaPackage.VIDEO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UpctformaPackage.VIDEO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case UpctformaPackage.VIDEO__TYPE:
				return type != TYPE_EDEFAULT;
			case UpctformaPackage.VIDEO__CAPTIONS:
				return CAPTIONS_EDEFAULT == null ? captions != null : !CAPTIONS_EDEFAULT.equals(captions);
			case UpctformaPackage.VIDEO__DESCRIPTIONS:
				return DESCRIPTIONS_EDEFAULT == null ? descriptions != null : !DESCRIPTIONS_EDEFAULT.equals(descriptions);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(", captions: ");
		result.append(captions);
		result.append(", descriptions: ");
		result.append(descriptions);
		result.append(')');
		return result.toString();
	}

} //VideoImpl
