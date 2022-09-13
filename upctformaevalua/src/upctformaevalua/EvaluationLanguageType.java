/**
 */
package upctformaevalua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Language Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationLanguageType()
 * @model
 * @generated
 */
public enum EvaluationLanguageType implements Enumerator {
	/**
	 * The '<em><b>EN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_VALUE
	 * @generated
	 * @ordered
	 */
	EN(0, "EN", "EN"),

	/**
	 * The '<em><b>ES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(1, "ES", "ES"),

	/**
	 * The '<em><b>FR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FR_VALUE
	 * @generated
	 * @ordered
	 */
	FR(2, "FR", "FR"),

	/**
	 * The '<em><b>EL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EL_VALUE
	 * @generated
	 * @ordered
	 */
	EL(3, "EL", "EL"), /**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(4, "LT", "LT");

	/**
	 * The '<em><b>EN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EN_VALUE = 0;

	/**
	 * The '<em><b>ES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 1;

	/**
	 * The '<em><b>FR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FR_VALUE = 2;

	/**
	 * The '<em><b>EL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EL_VALUE = 3;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Evaluation Language Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationLanguageType[] VALUES_ARRAY =
		new EvaluationLanguageType[] {
			EN,
			ES,
			FR,
			EL,
			LT,
		};

	/**
	 * A public read-only list of all the '<em><b>Evaluation Language Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationLanguageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Language Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationLanguageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationLanguageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Language Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationLanguageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationLanguageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Language Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationLanguageType get(int value) {
		switch (value) {
			case EN_VALUE: return EN;
			case ES_VALUE: return ES;
			case FR_VALUE: return FR;
			case EL_VALUE: return EL;
			case LT_VALUE: return LT;
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
	private EvaluationLanguageType(int value, String name, String literal) {
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
	
} //EvaluationLanguageType
