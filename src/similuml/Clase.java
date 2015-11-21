/**
 */
package similuml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link similuml.Clase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link similuml.Clase#getOperaciones_clases <em>Operaciones clases</em>}</li>
 *   <li>{@link similuml.Clase#getAtributos_clases <em>Atributos clases</em>}</li>
 *   <li>{@link similuml.Clase#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link similuml.Clase#getAsociaciones_contenidas <em>Asociaciones contenidas</em>}</li>
 *   <li>{@link similuml.Clase#getComposiciones_contenidas <em>Composiciones contenidas</em>}</li>
 *   <li>{@link similuml.Clase#getAgregaciones_contenidas <em>Agregaciones contenidas</em>}</li>
 *   <li>{@link similuml.Clase#getRealizacion_contenida <em>Realizacion contenida</em>}</li>
 *   <li>{@link similuml.Clase#getHerenciasClases_contenidas <em>Herencias Clases contenidas</em>}</li>
 * </ul>
 *
 * @see similuml.SimilumlPackage#getClase()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clase_distinta_de_alumno'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL constraints=''"
 * @generated
 */
public interface Clase extends EObject {
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
	 * @see similuml.SimilumlPackage#getClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link similuml.Clase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones clases</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones clases</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Operaciones_clases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operacion> getOperaciones_clases();

	/**
	 * Returns the value of the '<em><b>Atributos clases</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos clases</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Atributos_clases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos_clases();

	/**
	 * Returns the value of the '<em><b>Es Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Abstracta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Abstracta</em>' attribute.
	 * @see #setEsAbstracta(boolean)
	 * @see similuml.SimilumlPackage#getClase_EsAbstracta()
	 * @model
	 * @generated
	 */
	boolean isEsAbstracta();

	/**
	 * Sets the value of the '{@link similuml.Clase#isEsAbstracta <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Abstracta</em>' attribute.
	 * @see #isEsAbstracta()
	 * @generated
	 */
	void setEsAbstracta(boolean value);

	/**
	 * Returns the value of the '<em><b>Asociaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Asociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociaciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociaciones contenidas</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Asociaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asociacion> getAsociaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Composiciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Composicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composiciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composiciones contenidas</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Composiciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composicion> getComposiciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Agregaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Agregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agregaciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregaciones contenidas</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Agregaciones_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agregacion> getAgregaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Realizacion contenida</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion contenida</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion contenida</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_Realizacion_contenida()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realizacion> getRealizacion_contenida();

	/**
	 * Returns the value of the '<em><b>Herencias Clases contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias Clases contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias Clases contenidas</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getClase_HerenciasClases_contenidas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerenciasClases_contenidas();

} // Clase
