/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filling Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.FillingAnswer#getHoles <em>Holes</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getFillingAnswer()
 * @model
 * @generated
 */
public interface FillingAnswer extends Question {
	/**
	 * Returns the value of the '<em><b>Holes</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Hole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holes</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getFillingAnswer_Holes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hole> getHoles();

} // FillingAnswer
