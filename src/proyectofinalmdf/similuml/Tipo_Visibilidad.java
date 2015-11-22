/**
 */
package proyectofinalmdf.similuml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Visibilidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectofinalmdf.similuml.SimilumlPackage#getTipo_Visibilidad()
 * @model
 * @generated
 */
public final class Tipo_Visibilidad extends AbstractEnumerator {
	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_LITERAL
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE = 0;

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_LITERAL
	 * @model name="public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC = 1;

	/**
	 * The '<em><b>Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_LITERAL
	 * @model name="package"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE = 2;

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTECTED_LITERAL
	 * @model name="protected"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED = 3;

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Visibilidad PRIVATE_LITERAL = new Tipo_Visibilidad(PRIVATE, "private", "private");

	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Visibilidad PUBLIC_LITERAL = new Tipo_Visibilidad(PUBLIC, "public", "public");

	/**
	 * The '<em><b>Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Visibilidad PACKAGE_LITERAL = new Tipo_Visibilidad(PACKAGE, "package", "package");

	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @generated
	 * @ordered
	 */
	public static final Tipo_Visibilidad PROTECTED_LITERAL = new Tipo_Visibilidad(PROTECTED, "protected", "protected");

	/**
	 * An array of all the '<em><b>Tipo Visibilidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tipo_Visibilidad[] VALUES_ARRAY =
		new Tipo_Visibilidad[] {
			PRIVATE_LITERAL,
			PUBLIC_LITERAL,
			PACKAGE_LITERAL,
			PROTECTED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Visibilidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Visibilidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Visibilidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Visibilidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Visibilidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Visibilidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Visibilidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Visibilidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Visibilidad get(int value) {
		switch (value) {
			case PRIVATE: return PRIVATE_LITERAL;
			case PUBLIC: return PUBLIC_LITERAL;
			case PACKAGE: return PACKAGE_LITERAL;
			case PROTECTED: return PROTECTED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Tipo_Visibilidad(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Tipo_Visibilidad
