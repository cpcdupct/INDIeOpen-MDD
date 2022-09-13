/**
 */
package upctformaevalua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.Training#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link upctformaevalua.Training#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getTraining()
 * @model
 * @generated
 */
public interface Training extends EvaluationUnit {
	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts</em>' attribute.
	 * @see #setAttempts(int)
	 * @see upctformaevalua.UpctformaevaluaPackage#getTraining_Attempts()
	 * @model
	 * @generated
	 */
	int getAttempts();

	/**
	 * Sets the value of the '{@link upctformaevalua.Training#getAttempts <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempts</em>' attribute.
	 * @see #getAttempts()
	 * @generated
	 */
	void setAttempts(int value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.TypeGrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see upctformaevalua.TypeGrade
	 * @see #setGrade(TypeGrade)
	 * @see upctformaevalua.UpctformaevaluaPackage#getTraining_Grade()
	 * @model
	 * @generated
	 */
	TypeGrade getGrade();

	/**
	 * Sets the value of the '{@link upctformaevalua.Training#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see upctformaevalua.TypeGrade
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(TypeGrade value);

} // Training
