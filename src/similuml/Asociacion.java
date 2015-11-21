/**
 */
package similuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asociacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link similuml.Asociacion#getDesdeClaseaInterfaz <em>Desde Clasea Interfaz</em>}</li>
 *   <li>{@link similuml.Asociacion#getHaciaInterfazdesdeClase <em>Hacia Interfazdesde Clase</em>}</li>
 * </ul>
 *
 * @see similuml.SimilumlPackage#getAsociacion()
 * @model
 * @generated
 */
public interface Asociacion extends Relacion {
	/**
	 * Returns the value of the '<em><b>Desde Clasea Interfaz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desde Clasea Interfaz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desde Clasea Interfaz</em>' reference.
	 * @see #setDesdeClaseaInterfaz(Clase)
	 * @see similuml.SimilumlPackage#getAsociacion_DesdeClaseaInterfaz()
	 * @model
	 * @generated
	 */
	Clase getDesdeClaseaInterfaz();

	/**
	 * Sets the value of the '{@link similuml.Asociacion#getDesdeClaseaInterfaz <em>Desde Clasea Interfaz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desde Clasea Interfaz</em>' reference.
	 * @see #getDesdeClaseaInterfaz()
	 * @generated
	 */
	void setDesdeClaseaInterfaz(Clase value);

	/**
	 * Returns the value of the '<em><b>Hacia Interfazdesde Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hacia Interfazdesde Clase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hacia Interfazdesde Clase</em>' reference.
	 * @see #setHaciaInterfazdesdeClase(Interface)
	 * @see similuml.SimilumlPackage#getAsociacion_HaciaInterfazdesdeClase()
	 * @model
	 * @generated
	 */
	Interface getHaciaInterfazdesdeClase();

	/**
	 * Sets the value of the '{@link similuml.Asociacion#getHaciaInterfazdesdeClase <em>Hacia Interfazdesde Clase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hacia Interfazdesde Clase</em>' reference.
	 * @see #getHaciaInterfazdesdeClase()
	 * @generated
	 */
	void setHaciaInterfazdesdeClase(Interface value);

} // Asociacion
