/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getInterfaces_del_Diagrama <em>Interfaces del Diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getClases_del_Diagrama <em>Clases del Diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getRealizaciones_del_Diagrama <em>Realizaciones del Diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getHerencias_del_Diagrama <em>Herencias del Diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getAsociaciones_del_diagrama <em>Asociaciones del diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getAgregaciones_del_diagrama <em>Agregaciones del diagrama</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.DiagramaClases#getComposiciones_del_diagrama <em>Composiciones del diagrama</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases()
 * @model
 * @generated
 */
public interface DiagramaClases extends EObject {
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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.DiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces del Diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Interfaces_del_Diagrama()
	 * @model type="proyectofinalmdf.similuml.Interface" containment="true"
	 * @generated
	 */
	EList getInterfaces_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Clases del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Clase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases del Diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Clases_del_Diagrama()
	 * @model type="proyectofinalmdf.similuml.Clase" containment="true"
	 * @generated
	 */
	EList getClases_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Realizaciones del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizaciones del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizaciones del Diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Realizaciones_del_Diagrama()
	 * @model type="proyectofinalmdf.similuml.Realizacion" containment="true"
	 * @generated
	 */
	EList getRealizaciones_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Herencias del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias del Diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Herencias_del_Diagrama()
	 * @model type="proyectofinalmdf.similuml.Herencia" containment="true"
	 * @generated
	 */
	EList getHerencias_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Asociaciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Asociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociaciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociaciones del diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Asociaciones_del_diagrama()
	 * @model type="proyectofinalmdf.similuml.Asociacion" containment="true"
	 * @generated
	 */
	EList getAsociaciones_del_diagrama();

	/**
	 * Returns the value of the '<em><b>Agregaciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Agregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agregaciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregaciones del diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Agregaciones_del_diagrama()
	 * @model type="proyectofinalmdf.similuml.Agregacion" containment="true"
	 * @generated
	 */
	EList getAgregaciones_del_diagrama();

	/**
	 * Returns the value of the '<em><b>Composiciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link proyectofinalmdf.similuml.Composicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composiciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composiciones del diagrama</em>' containment reference list.
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getDiagramaClases_Composiciones_del_diagrama()
	 * @model type="proyectofinalmdf.similuml.Composicion" containment="true"
	 * @generated
	 */
	EList getComposiciones_del_diagrama();

} // DiagramaClases
