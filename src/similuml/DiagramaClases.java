/**
 */
package similuml;

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
 *   <li>{@link similuml.DiagramaClases#getNombre <em>Nombre</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getInterfaces_del_Diagrama <em>Interfaces del Diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getClases_del_Diagrama <em>Clases del Diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getRealizaciones_del_Diagrama <em>Realizaciones del Diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getHerencias_del_Diagrama <em>Herencias del Diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getAsociaciones_del_diagrama <em>Asociaciones del diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getAgregaciones_del_diagrama <em>Agregaciones del diagrama</em>}</li>
 *   <li>{@link similuml.DiagramaClases#getComposiciones_del_diagrama <em>Composiciones del diagrama</em>}</li>
 * </ul>
 *
 * @see similuml.SimilumlPackage#getDiagramaClases()
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
	 * @see similuml.SimilumlPackage#getDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link similuml.DiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Interfaces del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces del Diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Interfaces_del_Diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Clases del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Clase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases del Diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Clases_del_Diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clase> getClases_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Realizaciones del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Realizacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizaciones del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizaciones del Diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Realizaciones_del_Diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realizacion> getRealizaciones_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Herencias del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias del Diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Herencias_del_Diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerencias_del_Diagrama();

	/**
	 * Returns the value of the '<em><b>Asociaciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Asociacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociaciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociaciones del diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Asociaciones_del_diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asociacion> getAsociaciones_del_diagrama();

	/**
	 * Returns the value of the '<em><b>Agregaciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Agregacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agregaciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregaciones del diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Agregaciones_del_diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agregacion> getAgregaciones_del_diagrama();

	/**
	 * Returns the value of the '<em><b>Composiciones del diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link similuml.Composicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composiciones del diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composiciones del diagrama</em>' containment reference list.
	 * @see similuml.SimilumlPackage#getDiagramaClases_Composiciones_del_diagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composicion> getComposiciones_del_diagrama();

} // DiagramaClases
