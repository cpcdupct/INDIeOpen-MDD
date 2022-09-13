/**
 */
package upctformaevalua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Grade</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage#getTypeGrade()
 * @model
 * @generated
 */
public enum TypeGrade implements Enumerator {
	/**
	 * The '<em><b>Highest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHEST_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHEST(1, "highest", "highest"),

	/**
	 * The '<em><b>Middle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE(2, "middle", "middle"),

	/**
	 * The '<em><b>Lowest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWEST_VALUE
	 * @generated
	 * @ordered
	 */
	LOWEST(3, "lowest", "lowest");

	/**
	 * The '<em><b>Highest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHEST
	 * @model name="highest"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHEST_VALUE = 1;

	/**
	 * The '<em><b>Middle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @model name="middle"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_VALUE = 2;

	/**
	 * The '<em><b>Lowest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWEST
	 * @model name="lowest"
	 * @generated
	 * @ordered
	 */
	public static final int LOWEST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Grade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeGrade[] VALUES_ARRAY =
		new TypeGrade[] {
			HIGHEST,
			MIDDLE,
			LOWEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Grade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeGrade> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Grade</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGrade get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGrade result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Grade</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGrade getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeGrade result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Grade</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeGrade get(int value) {
		switch (value) {
			case HIGHEST_VALUE: return HIGHEST;
			case MIDDLE_VALUE: return MIDDLE;
			case LOWEST_VALUE: return LOWEST;
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
	private TypeGrade(int value, String name, String literal) {
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
	
} //TypeGrade
