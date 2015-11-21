/**
 */
package similuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import similuml.Asociacion;
import similuml.Clase;
import similuml.Interface;
import similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asociacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link similuml.impl.AsociacionImpl#getDesdeClaseaInterfaz <em>Desde Clasea Interfaz</em>}</li>
 *   <li>{@link similuml.impl.AsociacionImpl#getHaciaInterfazdesdeClase <em>Hacia Interfazdesde Clase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsociacionImpl extends RelacionImpl implements Asociacion {
	/**
	 * The cached value of the '{@link #getDesdeClaseaInterfaz() <em>Desde Clasea Interfaz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesdeClaseaInterfaz()
	 * @generated
	 * @ordered
	 */
	protected Clase desdeClaseaInterfaz;

	/**
	 * The cached value of the '{@link #getHaciaInterfazdesdeClase() <em>Hacia Interfazdesde Clase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaciaInterfazdesdeClase()
	 * @generated
	 * @ordered
	 */
	protected Interface haciaInterfazdesdeClase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsociacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.ASOCIACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getDesdeClaseaInterfaz() {
		if (desdeClaseaInterfaz != null && desdeClaseaInterfaz.eIsProxy()) {
			InternalEObject oldDesdeClaseaInterfaz = (InternalEObject)desdeClaseaInterfaz;
			desdeClaseaInterfaz = (Clase)eResolveProxy(oldDesdeClaseaInterfaz);
			if (desdeClaseaInterfaz != oldDesdeClaseaInterfaz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ, oldDesdeClaseaInterfaz, desdeClaseaInterfaz));
			}
		}
		return desdeClaseaInterfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetDesdeClaseaInterfaz() {
		return desdeClaseaInterfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesdeClaseaInterfaz(Clase newDesdeClaseaInterfaz) {
		Clase oldDesdeClaseaInterfaz = desdeClaseaInterfaz;
		desdeClaseaInterfaz = newDesdeClaseaInterfaz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ, oldDesdeClaseaInterfaz, desdeClaseaInterfaz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getHaciaInterfazdesdeClase() {
		if (haciaInterfazdesdeClase != null && haciaInterfazdesdeClase.eIsProxy()) {
			InternalEObject oldHaciaInterfazdesdeClase = (InternalEObject)haciaInterfazdesdeClase;
			haciaInterfazdesdeClase = (Interface)eResolveProxy(oldHaciaInterfazdesdeClase);
			if (haciaInterfazdesdeClase != oldHaciaInterfazdesdeClase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE, oldHaciaInterfazdesdeClase, haciaInterfazdesdeClase));
			}
		}
		return haciaInterfazdesdeClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetHaciaInterfazdesdeClase() {
		return haciaInterfazdesdeClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaciaInterfazdesdeClase(Interface newHaciaInterfazdesdeClase) {
		Interface oldHaciaInterfazdesdeClase = haciaInterfazdesdeClase;
		haciaInterfazdesdeClase = newHaciaInterfazdesdeClase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE, oldHaciaInterfazdesdeClase, haciaInterfazdesdeClase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ:
				if (resolve) return getDesdeClaseaInterfaz();
				return basicGetDesdeClaseaInterfaz();
			case SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE:
				if (resolve) return getHaciaInterfazdesdeClase();
				return basicGetHaciaInterfazdesdeClase();
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
			case SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ:
				setDesdeClaseaInterfaz((Clase)newValue);
				return;
			case SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE:
				setHaciaInterfazdesdeClase((Interface)newValue);
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
			case SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ:
				setDesdeClaseaInterfaz((Clase)null);
				return;
			case SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE:
				setHaciaInterfazdesdeClase((Interface)null);
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
			case SimilumlPackage.ASOCIACION__DESDE_CLASEA_INTERFAZ:
				return desdeClaseaInterfaz != null;
			case SimilumlPackage.ASOCIACION__HACIA_INTERFAZDESDE_CLASE:
				return haciaInterfazdesdeClase != null;
		}
		return super.eIsSet(featureID);
	}

} //AsociacionImpl
