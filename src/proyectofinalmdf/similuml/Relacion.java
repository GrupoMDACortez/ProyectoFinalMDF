/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Relacion#getCardinalidadInferior <em>Cardinalidad Inferior</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Relacion#getCardinalidadSuperior <em>Cardinalidad Superior</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Relacion#getOrigen <em>Origen</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Relacion#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Relacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Cardinalidad Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalidad Inferior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalidad Inferior</em>' attribute.
	 * @see #setCardinalidadInferior(int)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion_CardinalidadInferior()
	 * @model
	 * @generated
	 */
	int getCardinalidadInferior();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Relacion#getCardinalidadInferior <em>Cardinalidad Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalidad Inferior</em>' attribute.
	 * @see #getCardinalidadInferior()
	 * @generated
	 */
	void setCardinalidadInferior(int value);

	/**
	 * Returns the value of the '<em><b>Cardinalidad Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalidad Superior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalidad Superior</em>' attribute.
	 * @see #setCardinalidadSuperior(int)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion_CardinalidadSuperior()
	 * @model
	 * @generated
	 */
	int getCardinalidadSuperior();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Relacion#getCardinalidadSuperior <em>Cardinalidad Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalidad Superior</em>' attribute.
	 * @see #getCardinalidadSuperior()
	 * @generated
	 */
	void setCardinalidadSuperior(int value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Clase)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion_Origen()
	 * @model
	 * @generated
	 */
	Clase getOrigen();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Relacion#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Clase value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Clase)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getRelacion_Destino()
	 * @model
	 * @generated
	 */
	Clase getDestino();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Relacion#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Clase value);

} // Relacion
