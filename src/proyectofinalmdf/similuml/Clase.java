/**
 */
package proyectofinalmdf.similuml;

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
 *   <li>{@link proyectofinalmdf.similuml.Clase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getOperaciones_clases <em>Operaciones clases</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getAtributos_clases <em>Atributos clases</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getAsociaciones_contenidas <em>Asociaciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getComposiciones_contenidas <em>Composiciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getAgregaciones_contenidas <em>Agregaciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getRealizacion_contenida <em>Realizacion contenida</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Clase#getHerenciasClases_contenidas <em>Herencias Clases contenidas</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase()
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Clase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones clases</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones clases</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Operaciones_clases()
	 * @model type="proyectofinalmdf.similuml.Operacion" containment="true"
	 * @generated
	 */
	EList getOperaciones_clases();

	/**
	 * Returns the value of the '<em><b>Atributos clases</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos clases</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Atributos_clases()
	 * @model type="proyectofinalmdf.similuml.Atributo" containment="true"
	 * @generated
	 */
	EList getAtributos_clases();

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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_EsAbstracta()
	 * @model
	 * @generated
	 */
	boolean isEsAbstracta();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Clase#isEsAbstracta <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Abstracta</em>' attribute.
	 * @see #isEsAbstracta()
	 * @generated
	 */
	void setEsAbstracta(boolean value);

	/**
	 * Returns the value of the '<em><b>Asociaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Asociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociaciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociaciones contenidas</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Asociaciones_contenidas()
	 * @model type="proyectofinalmdf.similuml.Asociacion" containment="true"
	 * @generated
	 */
	EList getAsociaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Composiciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Composicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composiciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composiciones contenidas</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Composiciones_contenidas()
	 * @model type="proyectofinalmdf.similuml.Composicion" containment="true"
	 * @generated
	 */
	EList getComposiciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Agregaciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Agregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agregaciones contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregaciones contenidas</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Agregaciones_contenidas()
	 * @model type="proyectofinalmdf.similuml.Agregacion" containment="true"
	 * @generated
	 */
	EList getAgregaciones_contenidas();

	/**
	 * Returns the value of the '<em><b>Realizacion contenida</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizacion contenida</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizacion contenida</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_Realizacion_contenida()
	 * @model type="proyectofinalmdf.similuml.Realizacion" containment="true"
	 * @generated
	 */
	EList getRealizacion_contenida();

	/**
	 * Returns the value of the '<em><b>Herencias Clases contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias Clases contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias Clases contenidas</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getClase_HerenciasClases_contenidas()
	 * @model type="proyectofinalmdf.similuml.Herencia" containment="true"
	 * @generated
	 */
	EList getHerenciasClases_contenidas();

} // Clase
