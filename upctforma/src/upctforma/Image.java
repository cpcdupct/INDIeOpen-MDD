/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Image#getUrl <em>Url</em>}</li>
 *   <li>{@link upctforma.Image#getType <em>Type</em>}</li>
 *   <li>{@link upctforma.Image#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends SimpleElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see upctforma.UpctformaPackage#getImage_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link upctforma.Image#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctforma.ImageType
	 * @see #setType(ImageType)
	 * @see upctforma.UpctformaPackage#getImage_Type()
	 * @model
	 * @generated
	 */
	ImageType getType();

	/**
	 * Sets the value of the '{@link upctforma.Image#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctforma.ImageType
	 * @see #getType()
	 * @generated
	 */
	void setType(ImageType value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see upctforma.UpctformaPackage#getImage_Alt()
	 * @model
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link upctforma.Image#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

} // Image
