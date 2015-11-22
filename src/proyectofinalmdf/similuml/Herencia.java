/**
 */
package proyectofinalmdf.similuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.Herencia#getHerenciaClase_Origen <em>Herencia Clase Origen</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Herencia#getHereda_Clase_Destino <em>Hereda Clase Destino</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Herencia#getHereda_Interfaz_Origen <em>Hereda Interfaz Origen</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Herencia#getHereda_Interfaz_destino <em>Hereda Interfaz destino</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.Herencia#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia()
 * @model
 * @generated
 */
public interface Herencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Herencia Clase Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencia Clase Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencia Clase Origen</em>' reference.
	 * @see #setHerenciaClase_Origen(Clase)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia_HerenciaClase_Origen()
	 * @model
	 * @generated
	 */
	Clase getHerenciaClase_Origen();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Herencia#getHerenciaClase_Origen <em>Herencia Clase Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herencia Clase Origen</em>' reference.
	 * @see #getHerenciaClase_Origen()
	 * @generated
	 */
	void setHerenciaClase_Origen(Clase value);

	/**
	 * Returns the value of the '<em><b>Hereda Clase Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hereda Clase Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hereda Clase Destino</em>' reference.
	 * @see #setHereda_Clase_Destino(Clase)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia_Hereda_Clase_Destino()
	 * @model
	 * @generated
	 */
	Clase getHereda_Clase_Destino();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Herencia#getHereda_Clase_Destino <em>Hereda Clase Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hereda Clase Destino</em>' reference.
	 * @see #getHereda_Clase_Destino()
	 * @generated
	 */
	void setHereda_Clase_Destino(Clase value);

	/**
	 * Returns the value of the '<em><b>Hereda Interfaz Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hereda Interfaz Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hereda Interfaz Origen</em>' reference.
	 * @see #setHereda_Interfaz_Origen(Interface)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia_Hereda_Interfaz_Origen()
	 * @model
	 * @generated
	 */
	Interface getHereda_Interfaz_Origen();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Herencia#getHereda_Interfaz_Origen <em>Hereda Interfaz Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hereda Interfaz Origen</em>' reference.
	 * @see #getHereda_Interfaz_Origen()
	 * @generated
	 */
	void setHereda_Interfaz_Origen(Interface value);

	/**
	 * Returns the value of the '<em><b>Hereda Interfaz destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hereda Interfaz destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hereda Interfaz destino</em>' reference.
	 * @see #setHereda_Interfaz_destino(Interface)
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia_Hereda_Interfaz_destino()
	 * @model
	 * @generated
	 */
	Interface getHereda_Interfaz_destino();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Herencia#getHereda_Interfaz_destino <em>Hereda Interfaz destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hereda Interfaz destino</em>' reference.
	 * @see #getHereda_Interfaz_destino()
	 * @generated
	 */
	void setHereda_Interfaz_destino(Interface value);

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
	 * @see proyectofinalmdf.similuml.SimilumlPackage#getHerencia_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectofinalmdf.similuml.Herencia#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Herencia
