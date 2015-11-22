/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Interface#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Interface#getOperaciones_iterfaces <em>Operaciones iterfaces</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Interface#getContantes_Interfaces <em>Contantes Interfaces</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Interface#getHerenciasInterfaz_contenidas <em>Herencias Interfaz contenidas</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getInterface_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Interface#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones iterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones iterfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones iterfaces</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getInterface_Operaciones_iterfaces()
	 * @model type="proyectofinalmdf.similuml.Operacion" containment="true"
	 * @generated
	 */
	EList getOperaciones_iterfaces();

	/**
	 * Returns the value of the '<em><b>Contantes Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.ConstantesInterfaces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contantes Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contantes Interfaces</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getInterface_Contantes_Interfaces()
	 * @model type="proyectofinalmdf.similuml.ConstantesInterfaces" containment="true"
	 * @generated
	 */
	EList getContantes_Interfaces();

	/**
	 * Returns the value of the '<em><b>Herencias Interfaz contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias Interfaz contenidas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias Interfaz contenidas</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getInterface_HerenciasInterfaz_contenidas()
	 * @model type="proyectofinalmdf.similuml.Herencia" containment="true"
	 * @generated
	 */
	EList getHerenciasInterfaz_contenidas();

} // Interface
