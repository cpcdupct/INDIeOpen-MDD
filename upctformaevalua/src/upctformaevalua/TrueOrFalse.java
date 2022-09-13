/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>True Or False</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.TrueOrFalse#getAssertions <em>Assertions</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getTrueOrFalse()
 * @model
 * @generated
 */
public interface TrueOrFalse extends Question {
	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Assertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getTrueOrFalse_Assertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assertion> getAssertions();

} // TrueOrFalse
