/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Realizacion#getOrigenRealizacion <em>Origen Realizacion</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Realizacion#getDestinoRealizacion <em>Destino Realizacion</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Realizacion#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getRealizacion()
 * @model
 * @generated
 */
public interface Realizacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen Realizacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen Realizacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen Realizacion</em>' reference.
	 * @see #setOrigenRealizacion(Clase)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRealizacion_OrigenRealizacion()
	 * @model
	 * @generated
	 */
	Clase getOrigenRealizacion();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Realizacion#getOrigenRealizacion <em>Origen Realizacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen Realizacion</em>' reference.
	 * @see #getOrigenRealizacion()
	 * @generated
	 */
	void setOrigenRealizacion(Clase value);

	/**
	 * Returns the value of the '<em><b>Destino Realizacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino Realizacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino Realizacion</em>' reference.
	 * @see #setDestinoRealizacion(Interface)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRealizacion_DestinoRealizacion()
	 * @model
	 * @generated
	 */
	Interface getDestinoRealizacion();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Realizacion#getDestinoRealizacion <em>Destino Realizacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino Realizacion</em>' reference.
	 * @see #getDestinoRealizacion()
	 * @generated
	 */
	void setDestinoRealizacion(Interface value);

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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRealizacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Realizacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Realizacion
