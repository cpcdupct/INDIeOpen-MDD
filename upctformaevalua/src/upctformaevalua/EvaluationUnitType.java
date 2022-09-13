/**
 */
package upctformaevalua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnitType()
 * @model
 * @generated
 */
public enum EvaluationUnitType implements Enumerator {
	/**
	 * The '<em><b>Interoperability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEROPERABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEROPERABILITY(0, "Interoperability", "Interoperability"),

	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(1, "Open", "Open"),

	/**
	 * The '<em><b>Preview</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIEW(2, "Preview", "Preview");

	/**
	 * The '<em><b>Interoperability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEROPERABILITY
	 * @model name="Interoperability"
	 * @generated
	 * @ordered
	 */
	public static final int INTEROPERABILITY_VALUE = 0;

	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="Open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 1;

	/**
	 * The '<em><b>Preview</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIEW
	 * @model name="Preview"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIEW_VALUE = 2;

	/**
	 * An array of all the '<em><b>Evaluation Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationUnitType[] VALUES_ARRAY =
		new EvaluationUnitType[] {
			INTEROPERABILITY,
			OPEN,
			PREVIEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Evaluation Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationUnitType get(int value) {
		switch (value) {
			case INTEROPERABILITY_VALUE: return INTEROPERABILITY;
			case OPEN_VALUE: return OPEN;
			case PREVIEW_VALUE: return PREVIEW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaluationUnitType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EvaluationUnitType
