/**
 */
package proyectofinalmdf.similuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import proyectofinalmdf.similuml.Clase;
import proyectofinalmdf.similuml.Interface;
import proyectofinalmdf.similuml.Realizacion;
import proyectofinalmdf.similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realizacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.impl.RealizacionImpl#getOrigenRealizacion <em>Origen Realizacion</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RealizacionImpl#getDestinoRealizacion <em>Destino Realizacion</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RealizacionImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealizacionImpl extends EObjectImpl implements Realizacion {
	/**
	 * The cached value of the '{@link #getOrigenRealizacion() <em>Origen Realizacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigenRealizacion()
	 * @generated
	 * @ordered
	 */
	protected Clase origenRealizacion;

	/**
	 * The cached value of the '{@link #getDestinoRealizacion() <em>Destino Realizacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinoRealizacion()
	 * @generated
	 * @ordered
	 */
	protected Interface destinoRealizacion;

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
	protected RealizacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.REALIZACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getOrigenRealizacion() {
		if (origenRealizacion != null && origenRealizacion.eIsProxy()) {
			InternalEObject oldOrigenRealizacion = (InternalEObject)origenRealizacion;
			origenRealizacion = (Clase)eResolveProxy(oldOrigenRealizacion);
			if (origenRealizacion != oldOrigenRealizacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.REALIZACION__ORIGEN_REALIZACION, oldOrigenRealizacion, origenRealizacion));
			}
		}
		return origenRealizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetOrigenRealizacion() {
		return origenRealizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigenRealizacion(Clase newOrigenRealizacion) {
		Clase oldOrigenRealizacion = origenRealizacion;
		origenRealizacion = newOrigenRealizacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.REALIZACION__ORIGEN_REALIZACION, oldOrigenRealizacion, origenRealizacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getDestinoRealizacion() {
		if (destinoRealizacion != null && destinoRealizacion.eIsProxy()) {
			InternalEObject oldDestinoRealizacion = (InternalEObject)destinoRealizacion;
			destinoRealizacion = (Interface)eResolveProxy(oldDestinoRealizacion);
			if (destinoRealizacion != oldDestinoRealizacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.REALIZACION__DESTINO_REALIZACION, oldDestinoRealizacion, destinoRealizacion));
			}
		}
		return destinoRealizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetDestinoRealizacion() {
		return destinoRealizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinoRealizacion(Interface newDestinoRealizacion) {
		Interface oldDestinoRealizacion = destinoRealizacion;
		destinoRealizacion = newDestinoRealizacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.REALIZACION__DESTINO_REALIZACION, oldDestinoRealizacion, destinoRealizacion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.REALIZACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.REALIZACION__ORIGEN_REALIZACION:
				if (resolve) return getOrigenRealizacion();
				return basicGetOrigenRealizacion();
			case SimilumlPackage.REALIZACION__DESTINO_REALIZACION:
				if (resolve) return getDestinoRealizacion();
				return basicGetDestinoRealizacion();
			case SimilumlPackage.REALIZACION__NOMBRE:
				return getNombre();
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
			case SimilumlPackage.REALIZACION__ORIGEN_REALIZACION:
				setOrigenRealizacion((Clase)newValue);
				return;
			case SimilumlPackage.REALIZACION__DESTINO_REALIZACION:
				setDestinoRealizacion((Interface)newValue);
				return;
			case SimilumlPackage.REALIZACION__NOMBRE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimilumlPackage.REALIZACION__ORIGEN_REALIZACION:
				setOrigenRealizacion((Clase)null);
				return;
			case SimilumlPackage.REALIZACION__DESTINO_REALIZACION:
				setDestinoRealizacion((Interface)null);
				return;
			case SimilumlPackage.REALIZACION__NOMBRE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimilumlPackage.REALIZACION__ORIGEN_REALIZACION:
				return origenRealizacion != null;
			case SimilumlPackage.REALIZACION__DESTINO_REALIZACION:
				return destinoRealizacion != null;
			case SimilumlPackage.REALIZACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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

} //RealizacionImpl
