/**
 */
package upctforma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Section Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctforma.UpctformaPackage#getSectionType()
 * @model
 * @generated
 */
public enum SectionType implements Enumerator {
	/**
	 * The '<em><b>Background Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_IMAGE(0, "BackgroundImage", "BackgroundImage"),

	/**
	 * The '<em><b>Background Colour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_COLOUR(1, "BackgroundColour", "BackgroundColour");

	/**
	 * The '<em><b>Background Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_IMAGE
	 * @model name="BackgroundImage"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_IMAGE_VALUE = 0;

	/**
	 * The '<em><b>Background Colour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOUR
	 * @model name="BackgroundColour"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_COLOUR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Section Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SectionType[] VALUES_ARRAY =
		new SectionType[] {
			BACKGROUND_IMAGE,
			BACKGROUND_COLOUR,
		};

	/**
	 * A public read-only list of all the '<em><b>Section Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Section Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionType get(int value) {
		switch (value) {
			case BACKGROUND_IMAGE_VALUE: return BACKGROUND_IMAGE;
			case BACKGROUND_COLOUR_VALUE: return BACKGROUND_COLOUR;
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
	private SectionType(int value, String name, String literal) {
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
	
} //SectionType
