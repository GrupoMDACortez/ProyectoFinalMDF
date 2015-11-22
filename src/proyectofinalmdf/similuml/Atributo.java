/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Atributo#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectofinalmdf.similuml.Tipo_Predefinido}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido
	 * @see #setTipo(Tipo_Predefinido)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getAtributo_Tipo()
	 * @model
	 * @generated
	 */
	Tipo_Predefinido getTipo();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo_Predefinido value);

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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getAtributo_Visibilidad()
	 * @model
	 * @generated
	 */
	Tipo_Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Atributo#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Visibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(Tipo_Visibilidad value);

} // Atributo
