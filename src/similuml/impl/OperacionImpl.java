/**
 */
package similuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import similuml.Operacion;
import similuml.Parametro;
import similuml.SimilumlPackage;
import similuml.Tipo_Predefinido_Retorno;
import similuml.Tipo_Visibilidad;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link similuml.impl.OperacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link similuml.impl.OperacionImpl#getTipo_retorno <em>Tipo retorno</em>}</li>
 *   <li>{@link similuml.impl.OperacionImpl#getParametros_contenidos <em>Parametros contenidos</em>}</li>
 *   <li>{@link similuml.impl.OperacionImpl#isEsAbstracto <em>Es Abstracto</em>}</li>
 *   <li>{@link similuml.impl.OperacionImpl#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionImpl extends MinimalEObjectImpl.Container implements Operacion {
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
	 * The default value of the '{@link #getTipo_retorno() <em>Tipo retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo_retorno()
	 * @generated
	 * @ordered
	 */
	protected static final Tipo_Predefinido_Retorno TIPO_RETORNO_EDEFAULT = Tipo_Predefinido_Retorno.INT;

	/**
	 * The cached value of the '{@link #getTipo_retorno() <em>Tipo retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo_retorno()
	 * @generated
	 * @ordered
	 */
	protected Tipo_Predefinido_Retorno tipo_retorno = TIPO_RETORNO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametros_contenidos() <em>Parametros contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametro> parametros_contenidos;

	/**
	 * The default value of the '{@link #isEsAbstracto() <em>Es Abstracto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_ABSTRACTO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsAbstracto() <em>Es Abstracto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracto()
	 * @generated
	 * @ordered
	 */
	protected boolean esAbstracto = ES_ABSTRACTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final Tipo_Visibilidad VISIBILIDAD_EDEFAULT = Tipo_Visibilidad.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected Tipo_Visibilidad visibilidad = VISIBILIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.OPERACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.OPERACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Predefinido_Retorno getTipo_retorno() {
		return tipo_retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo_retorno(Tipo_Predefinido_Retorno newTipo_retorno) {
		Tipo_Predefinido_Retorno oldTipo_retorno = tipo_retorno;
		tipo_retorno = newTipo_retorno == null ? TIPO_RETORNO_EDEFAULT : newTipo_retorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.OPERACION__TIPO_RETORNO, oldTipo_retorno, tipo_retorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros_contenidos() {
		if (parametros_contenidos == null) {
			parametros_contenidos = new EObjectContainmentEList<Parametro>(Parametro.class, this, SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS);
		}
		return parametros_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsAbstracto() {
		return esAbstracto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsAbstracto(boolean newEsAbstracto) {
		boolean oldEsAbstracto = esAbstracto;
		esAbstracto = newEsAbstracto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.OPERACION__ES_ABSTRACTO, oldEsAbstracto, esAbstracto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Visibilidad getVisibilidad() {
		return visibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilidad(Tipo_Visibilidad newVisibilidad) {
		Tipo_Visibilidad oldVisibilidad = visibilidad;
		visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.OPERACION__VISIBILIDAD, oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS:
				return ((InternalEList<?>)getParametros_contenidos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimilumlPackage.OPERACION__NOMBRE:
				return getNombre();
			case SimilumlPackage.OPERACION__TIPO_RETORNO:
				return getTipo_retorno();
			case SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS:
				return getParametros_contenidos();
			case SimilumlPackage.OPERACION__ES_ABSTRACTO:
				return isEsAbstracto();
			case SimilumlPackage.OPERACION__VISIBILIDAD:
				return getVisibilidad();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimilumlPackage.OPERACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimilumlPackage.OPERACION__TIPO_RETORNO:
				setTipo_retorno((Tipo_Predefinido_Retorno)newValue);
				return;
			case SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS:
				getParametros_contenidos().clear();
				getParametros_contenidos().addAll((Collection<? extends Parametro>)newValue);
				return;
			case SimilumlPackage.OPERACION__ES_ABSTRACTO:
				setEsAbstracto((Boolean)newValue);
				return;
			case SimilumlPackage.OPERACION__VISIBILIDAD:
				setVisibilidad((Tipo_Visibilidad)newValue);
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
			case SimilumlPackage.OPERACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimilumlPackage.OPERACION__TIPO_RETORNO:
				setTipo_retorno(TIPO_RETORNO_EDEFAULT);
				return;
			case SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS:
				getParametros_contenidos().clear();
				return;
			case SimilumlPackage.OPERACION__ES_ABSTRACTO:
				setEsAbstracto(ES_ABSTRACTO_EDEFAULT);
				return;
			case SimilumlPackage.OPERACION__VISIBILIDAD:
				setVisibilidad(VISIBILIDAD_EDEFAULT);
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
			case SimilumlPackage.OPERACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimilumlPackage.OPERACION__TIPO_RETORNO:
				return tipo_retorno != TIPO_RETORNO_EDEFAULT;
			case SimilumlPackage.OPERACION__PARAMETROS_CONTENIDOS:
				return parametros_contenidos != null && !parametros_contenidos.isEmpty();
			case SimilumlPackage.OPERACION__ES_ABSTRACTO:
				return esAbstracto != ES_ABSTRACTO_EDEFAULT;
			case SimilumlPackage.OPERACION__VISIBILIDAD:
				return visibilidad != VISIBILIDAD_EDEFAULT;
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
		result.append(", tipo_retorno: ");
		result.append(tipo_retorno);
		result.append(", esAbstracto: ");
		result.append(esAbstracto);
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl
