/**
 */
package proyectofinalmdf.similuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyectofinalmdf.similuml.ConstantesInterfaces;
import proyectofinalmdf.similuml.Herencia;
import proyectofinalmdf.similuml.Interface;
import proyectofinalmdf.similuml.Operacion;
import proyectofinalmdf.similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.impl.InterfaceImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.InterfaceImpl#getOperaciones_iterfaces <em>Operaciones iterfaces</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.InterfaceImpl#getContantes_Interfaces <em>Contantes Interfaces</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.InterfaceImpl#getHerenciasInterfaz_contenidas <em>Herencias Interfaz contenidas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends EObjectImpl implements Interface {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperaciones_iterfaces() <em>Operaciones iterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones_iterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones_iterfaces;

	/**
	 * The cached value of the '{@link #getContantes_Interfaces() <em>Contantes Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContantes_Interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList contantes_Interfaces;

	/**
	 * The cached value of the '{@link #getHerenciasInterfaz_contenidas() <em>Herencias Interfaz contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciasInterfaz_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList herenciasInterfaz_contenidas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.INTERFACE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones_iterfaces() {
		if (operaciones_iterfaces == null) {
			operaciones_iterfaces = new EObjectContainmentEList(Operacion.class, this, SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES);
		}
		return operaciones_iterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContantes_Interfaces() {
		if (contantes_Interfaces == null) {
			contantes_Interfaces = new EObjectContainmentEList(ConstantesInterfaces.class, this, SimilumlPackage.INTERFACE__CONTANTES_INTERFACES);
		}
		return contantes_Interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHerenciasInterfaz_contenidas() {
		if (herenciasInterfaz_contenidas == null) {
			herenciasInterfaz_contenidas = new EObjectContainmentEList(Herencia.class, this, SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS);
		}
		return herenciasInterfaz_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES:
				return ((InternalEList)getOperaciones_iterfaces()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.INTERFACE__CONTANTES_INTERFACES:
				return ((InternalEList)getContantes_Interfaces()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS:
				return ((InternalEList)getHerenciasInterfaz_contenidas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.INTERFACE__NOMBRE:
				return getNombre();
			case SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES:
				return getOperaciones_iterfaces();
			case SimilumlPackage.INTERFACE__CONTANTES_INTERFACES:
				return getContantes_Interfaces();
			case SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS:
				return getHerenciasInterfaz_contenidas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimilumlPackage.INTERFACE__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES:
				getOperaciones_iterfaces().clear();
				getOperaciones_iterfaces().addAll((Collection)newValue);
				return;
			case SimilumlPackage.INTERFACE__CONTANTES_INTERFACES:
				getContantes_Interfaces().clear();
				getContantes_Interfaces().addAll((Collection)newValue);
				return;
			case SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS:
				getHerenciasInterfaz_contenidas().clear();
				getHerenciasInterfaz_contenidas().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimilumlPackage.INTERFACE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES:
				getOperaciones_iterfaces().clear();
				return;
			case SimilumlPackage.INTERFACE__CONTANTES_INTERFACES:
				getContantes_Interfaces().clear();
				return;
			case SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS:
				getHerenciasInterfaz_contenidas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimilumlPackage.INTERFACE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimilumlPackage.INTERFACE__OPERACIONES_ITERFACES:
				return operaciones_iterfaces != null && !operaciones_iterfaces.isEmpty();
			case SimilumlPackage.INTERFACE__CONTANTES_INTERFACES:
				return contantes_Interfaces != null && !contantes_Interfaces.isEmpty();
			case SimilumlPackage.INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS:
				return herenciasInterfaz_contenidas != null && !herenciasInterfaz_contenidas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
