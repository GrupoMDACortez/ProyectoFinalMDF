/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constantes Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.ConstantesInterfaces#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.ConstantesInterfaces#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getConstantesInterfaces()
 * @model
 * @generated
 */
public interface ConstantesInterfaces extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getConstantesInterfaces_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.ConstantesInterfaces#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectofinalmdf.similuml.Tipo_Predefinido_Retorno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido_Retorno
	 * @see #setTipo(Tipo_Predefinido_Retorno)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getConstantesInterfaces_Tipo()
	 * @model
	 * @generated
	 */
	Tipo_Predefinido_Retorno getTipo();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.ConstantesInterfaces#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see proyectofinalmdf.similuml.Tipo_Predefinido_Retorno
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo_Predefinido_Retorno value);

} // ConstantesInterfaces
