/**
 */
package similuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import similuml.Clase;
import similuml.Herencia;
import similuml.Interface;
import similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link similuml.impl.HerenciaImpl#getHerenciaClase_Origen <em>Herencia Clase Origen</em>}</li>
 *   <li>{@link similuml.impl.HerenciaImpl#getHereda_Clase_Destino <em>Hereda Clase Destino</em>}</li>
 *   <li>{@link similuml.impl.HerenciaImpl#getHereda_Interfaz_Origen <em>Hereda Interfaz Origen</em>}</li>
 *   <li>{@link similuml.impl.HerenciaImpl#getHereda_Interfaz_destino <em>Hereda Interfaz destino</em>}</li>
 *   <li>{@link similuml.impl.HerenciaImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerenciaImpl extends MinimalEObjectImpl.Container implements Herencia {
	/**
	 * The cached value of the '{@link #getHerenciaClase_Origen() <em>Herencia Clase Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciaClase_Origen()
	 * @generated
	 * @ordered
	 */
	protected Clase herenciaClase_Origen;

	/**
	 * The cached value of the '{@link #getHereda_Clase_Destino() <em>Hereda Clase Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHereda_Clase_Destino()
	 * @generated
	 * @ordered
	 */
	protected Clase hereda_Clase_Destino;

	/**
	 * The cached value of the '{@link #getHereda_Interfaz_Origen() <em>Hereda Interfaz Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHereda_Interfaz_Origen()
	 * @generated
	 * @ordered
	 */
	protected Interface hereda_Interfaz_Origen;

	/**
	 * The cached value of the '{@link #getHereda_Interfaz_destino() <em>Hereda Interfaz destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHereda_Interfaz_destino()
	 * @generated
	 * @ordered
	 */
	protected Interface hereda_Interfaz_destino;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.HERENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getHerenciaClase_Origen() {
		if (herenciaClase_Origen != null && herenciaClase_Origen.eIsProxy()) {
			InternalEObject oldHerenciaClase_Origen = (InternalEObject)herenciaClase_Origen;
			herenciaClase_Origen = (Clase)eResolveProxy(oldHerenciaClase_Origen);
			if (herenciaClase_Origen != oldHerenciaClase_Origen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN, oldHerenciaClase_Origen, herenciaClase_Origen));
			}
		}
		return herenciaClase_Origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetHerenciaClase_Origen() {
		return herenciaClase_Origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerenciaClase_Origen(Clase newHerenciaClase_Origen) {
		Clase oldHerenciaClase_Origen = herenciaClase_Origen;
		herenciaClase_Origen = newHerenciaClase_Origen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN, oldHerenciaClase_Origen, herenciaClase_Origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getHereda_Clase_Destino() {
		if (hereda_Clase_Destino != null && hereda_Clase_Destino.eIsProxy()) {
			InternalEObject oldHereda_Clase_Destino = (InternalEObject)hereda_Clase_Destino;
			hereda_Clase_Destino = (Clase)eResolveProxy(oldHereda_Clase_Destino);
			if (hereda_Clase_Destino != oldHereda_Clase_Destino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO, oldHereda_Clase_Destino, hereda_Clase_Destino));
			}
		}
		return hereda_Clase_Destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetHereda_Clase_Destino() {
		return hereda_Clase_Destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHereda_Clase_Destino(Clase newHereda_Clase_Destino) {
		Clase oldHereda_Clase_Destino = hereda_Clase_Destino;
		hereda_Clase_Destino = newHereda_Clase_Destino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO, oldHereda_Clase_Destino, hereda_Clase_Destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getHereda_Interfaz_Origen() {
		if (hereda_Interfaz_Origen != null && hereda_Interfaz_Origen.eIsProxy()) {
			InternalEObject oldHereda_Interfaz_Origen = (InternalEObject)hereda_Interfaz_Origen;
			hereda_Interfaz_Origen = (Interface)eResolveProxy(oldHereda_Interfaz_Origen);
			if (hereda_Interfaz_Origen != oldHereda_Interfaz_Origen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN, oldHereda_Interfaz_Origen, hereda_Interfaz_Origen));
			}
		}
		return hereda_Interfaz_Origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetHereda_Interfaz_Origen() {
		return hereda_Interfaz_Origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHereda_Interfaz_Origen(Interface newHereda_Interfaz_Origen) {
		Interface oldHereda_Interfaz_Origen = hereda_Interfaz_Origen;
		hereda_Interfaz_Origen = newHereda_Interfaz_Origen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN, oldHereda_Interfaz_Origen, hereda_Interfaz_Origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getHereda_Interfaz_destino() {
		if (hereda_Interfaz_destino != null && hereda_Interfaz_destino.eIsProxy()) {
			InternalEObject oldHereda_Interfaz_destino = (InternalEObject)hereda_Interfaz_destino;
			hereda_Interfaz_destino = (Interface)eResolveProxy(oldHereda_Interfaz_destino);
			if (hereda_Interfaz_destino != oldHereda_Interfaz_destino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO, oldHereda_Interfaz_destino, hereda_Interfaz_destino));
			}
		}
		return hereda_Interfaz_destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetHereda_Interfaz_destino() {
		return hereda_Interfaz_destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHereda_Interfaz_destino(Interface newHereda_Interfaz_destino) {
		Interface oldHereda_Interfaz_destino = hereda_Interfaz_destino;
		hereda_Interfaz_destino = newHereda_Interfaz_destino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO, oldHereda_Interfaz_destino, hereda_Interfaz_destino));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.HERENCIA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN:
				if (resolve) return getHerenciaClase_Origen();
				return basicGetHerenciaClase_Origen();
			case SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO:
				if (resolve) return getHereda_Clase_Destino();
				return basicGetHereda_Clase_Destino();
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN:
				if (resolve) return getHereda_Interfaz_Origen();
				return basicGetHereda_Interfaz_Origen();
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO:
				if (resolve) return getHereda_Interfaz_destino();
				return basicGetHereda_Interfaz_destino();
			case SimilumlPackage.HERENCIA__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN:
				setHerenciaClase_Origen((Clase)newValue);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO:
				setHereda_Clase_Destino((Clase)newValue);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN:
				setHereda_Interfaz_Origen((Interface)newValue);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO:
				setHereda_Interfaz_destino((Interface)newValue);
				return;
			case SimilumlPackage.HERENCIA__NOMBRE:
				setNombre((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN:
				setHerenciaClase_Origen((Clase)null);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO:
				setHereda_Clase_Destino((Clase)null);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN:
				setHereda_Interfaz_Origen((Interface)null);
				return;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO:
				setHereda_Interfaz_destino((Interface)null);
				return;
			case SimilumlPackage.HERENCIA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimilumlPackage.HERENCIA__HERENCIA_CLASE_ORIGEN:
				return herenciaClase_Origen != null;
			case SimilumlPackage.HERENCIA__HEREDA_CLASE_DESTINO:
				return hereda_Clase_Destino != null;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_ORIGEN:
				return hereda_Interfaz_Origen != null;
			case SimilumlPackage.HERENCIA__HEREDA_INTERFAZ_DESTINO:
				return hereda_Interfaz_destino != null;
			case SimilumlPackage.HERENCIA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //HerenciaImpl
