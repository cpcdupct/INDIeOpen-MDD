/**
 */
package upctformaevalua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Licenses</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage#getUnitLicenses()
 * @model
 * @generated
 */
public enum UnitLicenses implements Enumerator {
	/**
	 * The '<em><b>PRIVATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(0, "PRIVATE", "PRIVATE"),

	/**
	 * The '<em><b>BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_VALUE
	 * @generated
	 * @ordered
	 */
	BY(1, "BY", "BY"),

	/**
	 * The '<em><b>BYSA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYSA_VALUE
	 * @generated
	 * @ordered
	 */
	BYSA(2, "BYSA", "BYSA"),

	/**
	 * The '<em><b>BYND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYND_VALUE
	 * @generated
	 * @ordered
	 */
	BYND(3, "BYND", "BYND"),

	/**
	 * The '<em><b>BYNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNC_VALUE
	 * @generated
	 * @ordered
	 */
	BYNC(4, "BYNC", "BYNC"),

	/**
	 * The '<em><b>BYNCSA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNCSA_VALUE
	 * @generated
	 * @ordered
	 */
	BYNCSA(5, "BYNCSA", "BYNCSA"),

	/**
	 * The '<em><b>BYNCND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNCND_VALUE
	 * @generated
	 * @ordered
	 */
	BYNCND(6, "BYNCND", "BYNCND");

	/**
	 * The '<em><b>PRIVATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 0;

	/**
	 * The '<em><b>BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BY_VALUE = 1;

	/**
	 * The '<em><b>BYSA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYSA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYSA_VALUE = 2;

	/**
	 * The '<em><b>BYND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYND_VALUE = 3;

	/**
	 * The '<em><b>BYNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYNC_VALUE = 4;

	/**
	 * The '<em><b>BYNCSA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNCSA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYNCSA_VALUE = 5;

	/**
	 * The '<em><b>BYNCND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYNCND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYNCND_VALUE = 6;

	/**
	 * An array of all the '<em><b>Unit Licenses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitLicenses[] VALUES_ARRAY =
		new UnitLicenses[] {
			PRIVATE,
			BY,
			BYSA,
			BYND,
			BYNC,
			BYNCSA,
			BYNCND,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Licenses</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitLicenses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Licenses</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitLicenses get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitLicenses result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Licenses</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitLicenses getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitLicenses result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Licenses</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnitLicenses get(int value) {
		switch (value) {
			case PRIVATE_VALUE: return PRIVATE;
			case BY_VALUE: return BY;
			case BYSA_VALUE: return BYSA;
			case BYND_VALUE: return BYND;
			case BYNC_VALUE: return BYNC;
			case BYNCSA_VALUE: return BYNCSA;
			case BYNCND_VALUE: return BYNCND;
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
	private UnitLicenses(int value, String name, String literal) {
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
	
} //UnitLicenses
