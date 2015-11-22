/**
 */
package proyectofinalmdf.similuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import proyectofinalmdf.similuml.Clase;
import proyectofinalmdf.similuml.Relacion;
import proyectofinalmdf.similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.impl.RelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RelacionImpl#getCardinalidadInferior <em>Cardinalidad Inferior</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RelacionImpl#getCardinalidadSuperior <em>Cardinalidad Superior</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RelacionImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.RelacionImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends EObjectImpl implements Relacion {
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
	 * The default value of the '{@link #getCardinalidadInferior() <em>Cardinalidad Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadInferior()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALIDAD_INFERIOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalidadInferior() <em>Cardinalidad Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadInferior()
	 * @generated
	 * @ordered
	 */
	protected int cardinalidadInferior = CARDINALIDAD_INFERIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalidadSuperior() <em>Cardinalidad Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadSuperior()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALIDAD_SUPERIOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalidadSuperior() <em>Cardinalidad Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalidadSuperior()
	 * @generated
	 * @ordered
	 */
	protected int cardinalidadSuperior = CARDINALIDAD_SUPERIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Clase origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Clase destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.RELACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.RELACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinalidadInferior() {
		return cardinalidadInferior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalidadInferior(int newCardinalidadInferior) {
		int oldCardinalidadInferior = cardinalidadInferior;
		cardinalidadInferior = newCardinalidadInferior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.RELACION__CARDINALIDAD_INFERIOR, oldCardinalidadInferior, cardinalidadInferior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinalidadSuperior() {
		return cardinalidadSuperior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalidadSuperior(int newCardinalidadSuperior) {
		int oldCardinalidadSuperior = cardinalidadSuperior;
		cardinalidadSuperior = newCardinalidadSuperior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.RELACION__CARDINALIDAD_SUPERIOR, oldCardinalidadSuperior, cardinalidadSuperior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Clase)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.RELACION__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Clase newOrigen) {
		Clase oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.RELACION__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Clase)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimilumlPackage.RELACION__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Clase newDestino) {
		Clase oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.RELACION__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.RELACION__NOMBRE:
				return getNombre();
			case SimilumlPackage.RELACION__CARDINALIDAD_INFERIOR:
				return new Integer(getCardinalidadInferior());
			case SimilumlPackage.RELACION__CARDINALIDAD_SUPERIOR:
				return new Integer(getCardinalidadSuperior());
			case SimilumlPackage.RELACION__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case SimilumlPackage.RELACION__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
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
			case SimilumlPackage.RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimilumlPackage.RELACION__CARDINALIDAD_INFERIOR:
				setCardinalidadInferior(((Integer)newValue).intValue());
				return;
			case SimilumlPackage.RELACION__CARDINALIDAD_SUPERIOR:
				setCardinalidadSuperior(((Integer)newValue).intValue());
				return;
			case SimilumlPackage.RELACION__ORIGEN:
				setOrigen((Clase)newValue);
				return;
			case SimilumlPackage.RELACION__DESTINO:
				setDestino((Clase)newValue);
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
			case SimilumlPackage.RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimilumlPackage.RELACION__CARDINALIDAD_INFERIOR:
				setCardinalidadInferior(CARDINALIDAD_INFERIOR_EDEFAULT);
				return;
			case SimilumlPackage.RELACION__CARDINALIDAD_SUPERIOR:
				setCardinalidadSuperior(CARDINALIDAD_SUPERIOR_EDEFAULT);
				return;
			case SimilumlPackage.RELACION__ORIGEN:
				setOrigen((Clase)null);
				return;
			case SimilumlPackage.RELACION__DESTINO:
				setDestino((Clase)null);
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
			case SimilumlPackage.RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimilumlPackage.RELACION__CARDINALIDAD_INFERIOR:
				return cardinalidadInferior != CARDINALIDAD_INFERIOR_EDEFAULT;
			case SimilumlPackage.RELACION__CARDINALIDAD_SUPERIOR:
				return cardinalidadSuperior != CARDINALIDAD_SUPERIOR_EDEFAULT;
			case SimilumlPackage.RELACION__ORIGEN:
				return origen != null;
			case SimilumlPackage.RELACION__DESTINO:
				return destino != null;
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
		result.append(", cardinalidadInferior: ");
		result.append(cardinalidadInferior);
		result.append(", cardinalidadSuperior: ");
		result.append(cardinalidadSuperior);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
