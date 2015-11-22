/**
 */
package proyectofinalmdf.similuml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Predefinido</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectofinalmdf.similuml.SimilumlPackage#getTipo_Predefinido()
 * @model
 * @generated
 */
public final class Tipo_Predefinido extends AbstractEnumerator {
	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_LITERAL
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT = 0;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 1;

	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR_LITERAL
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR = 2;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 3;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 4;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 5;

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido INT_LITERAL = new Tipo_Predefinido(INT, "int", "int");

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido FLOAT_LITERAL = new Tipo_Predefinido(FLOAT, "float", "float");

	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido CHAR_LITERAL = new Tipo_Predefinido(CHAR, "char", "char");

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido BOOLEAN_LITERAL = new Tipo_Predefinido(BOOLEAN, "boolean", "boolean");

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido STRING_LITERAL = new Tipo_Predefinido(STRING, "String", "String");

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Predefinido DOUBLE_LITERAL = new Tipo_Predefinido(DOUBLE, "double", "double");

	/**
	 * An array of all the '<em><b>Tipo Predefinido</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tipo_Predefinido[] VALUES_ARRAY =
		new Tipo_Predefinido[] {
			INT_LITERAL,
			FLOAT_LITERAL,
			CHAR_LITERAL,
			BOOLEAN_LITERAL,
			STRING_LITERAL,
			DOUBLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Predefinido</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Predefinido</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Predefinido get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Predefinido result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Predefinido</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Predefinido getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Predefinido result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Predefinido</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Predefinido get(int value) {
		switch (value) {
			case INT: return INT_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case CHAR: return CHAR_LITERAL;
			case BOOLEAN: return BOOLEAN_LITERAL;
			case STRING: return STRING_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Tipo_Predefinido(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Tipo_Predefinido
