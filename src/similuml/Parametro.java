/**
 */
package similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link similuml.Parametro#getNombre <em>Nombre</em>}</li>
 *   <li>{@link similuml.Parametro#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see similuml.SimilumlPackage#getParametro()
 * @model
 * @generated
 */
public interface Parametro extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see similuml.SimilumlPackage#getParametro_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link similuml.Parametro#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link similuml.Tipo_Predefinido}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see similuml.Tipo_Predefinido
	 * @see #setTipo(Tipo_Predefinido)
	 * @see similuml.SimilumlPackage#getParametro_Tipo()
	 * @model
	 * @generated
	 */
	Tipo_Predefinido getTipo();

	/**
	 * Sets the value of the '{@link similuml.Parametro#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see similuml.Tipo_Predefinido
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo_Predefinido value);

} // Parametro
