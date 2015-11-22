/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Operacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Operacion#getTipo_retorno <em>Tipo retorno</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Operacion#getParametros_contenidos <em>Parametros contenidos</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Operacion#isEsAbstracto <em>Es Abstracto</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Operacion#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Operacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo retorno</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectofinalmdf.similuml.Tipo_Predefinido_Retorno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo retorno</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido_Retorno
	 * @see #setTipo_retorno(Tipo_Predefinido_Retorno)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion_Tipo_retorno()
	 * @model
	 * @generated
	 */
	Tipo_Predefinido_Retorno getTipo_retorno();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Operacion#getTipo_retorno <em>Tipo retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo retorno</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido_Retorno
	 * @see #getTipo_retorno()
	 * @generated
	 */
	void setTipo_retorno(Tipo_Predefinido_Retorno value);

	/**
	 * Returns the value of the '<em><b>Parametros contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros contenidos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros contenidos</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion_Parametros_contenidos()
	 * @model type="proyectofinalmdf.similuml.Parametro" containment="true"
	 * @generated
	 */
	EList getParametros_contenidos();

	/**
	 * Returns the value of the '<em><b>Es Abstracto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Abstracto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Abstracto</em>' attribute.
	 * @see #setEsAbstracto(boolean)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion_EsAbstracto()
	 * @model
	 * @generated
	 */
	boolean isEsAbstracto();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Operacion#isEsAbstracto <em>Es Abstracto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Abstracto</em>' attribute.
	 * @see #isEsAbstracto()
	 * @generated
	 */
	void setEsAbstracto(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectofinalmdf.similuml.Tipo_Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Visibilidad
	 * @see #setVisibilidad(Tipo_Visibilidad)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getOperacion_Visibilidad()
	 * @model
	 * @generated
	 */
	Tipo_Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Operacion#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Visibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(Tipo_Visibilidad value);

} // Operacion
