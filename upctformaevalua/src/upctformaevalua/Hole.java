/**
 */
package upctformaevalua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.Hole#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getHole()
 * @model
 * @generated
 */
public interface Hole extends Statement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.TypeHole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctformaevalua.TypeHole
	 * @see #setType(TypeHole)
	 * @see upctformaevalua.UpctformaevaluaPackage#getHole_Type()
	 * @model
	 * @generated
	 */
	TypeHole getType();

	/**
	 * Sets the value of the '{@link upctformaevalua.Hole#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctformaevalua.TypeHole
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeHole value);

} // Hole
