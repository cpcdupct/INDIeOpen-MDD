/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Video#getId <em>Id</em>}</li>
 *   <li>{@link upctforma.Video#getTitle <em>Title</em>}</li>
 *   <li>{@link upctforma.Video#getType <em>Type</em>}</li>
 *   <li>{@link upctforma.Video#getCaptions <em>Captions</em>}</li>
 *   <li>{@link upctforma.Video#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends SimpleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see upctforma.UpctformaPackage#getVideo_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link upctforma.Video#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see upctforma.UpctformaPackage#getVideo_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link upctforma.Video#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.VideoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctforma.VideoType
	 * @see #setType(VideoType)
	 * @see upctforma.UpctformaPackage#getVideo_Type()
	 * @model
	 * @generated
	 */
	VideoType getType();

	/**
	 * Sets the value of the '{@link upctforma.Video#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctforma.VideoType
	 * @see #getType()
	 * @generated
	 */
	void setType(VideoType value);

	/**
	 * Returns the value of the '<em><b>Captions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captions</em>' attribute.
	 * @see #setCaptions(String)
	 * @see upctforma.UpctformaPackage#getVideo_Captions()
	 * @model
	 * @generated
	 */
	String getCaptions();

	/**
	 * Sets the value of the '{@link upctforma.Video#getCaptions <em>Captions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captions</em>' attribute.
	 * @see #getCaptions()
	 * @generated
	 */
	void setCaptions(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute.
	 * @see #setDescriptions(String)
	 * @see upctforma.UpctformaPackage#getVideo_Descriptions()
	 * @model
	 * @generated
	 */
	String getDescriptions();

	/**
	 * Sets the value of the '{@link upctforma.Video#getDescriptions <em>Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' attribute.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(String value);

} // Video
