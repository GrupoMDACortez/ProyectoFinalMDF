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

import proyectofinalmdf.similuml.Agregacion;
import proyectofinalmdf.similuml.Asociacion;
import proyectofinalmdf.similuml.Atributo;
import proyectofinalmdf.similuml.Clase;
import proyectofinalmdf.similuml.Composicion;
import proyectofinalmdf.similuml.Herencia;
import proyectofinalmdf.similuml.Operacion;
import proyectofinalmdf.similuml.Realizacion;
import proyectofinalmdf.similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getOperaciones_clases <em>Operaciones clases</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getAtributos_clases <em>Atributos clases</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#isEsAbstracta <em>Es Abstracta</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getAsociaciones_contenidas <em>Asociaciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getComposiciones_contenidas <em>Composiciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getAgregaciones_contenidas <em>Agregaciones contenidas</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getRealizacion_contenida <em>Realizacion contenida</em>}</li>
 *   <li>{@link proyectofinalmdf.similuml.impl.ClaseImpl#getHerenciasClases_contenidas <em>Herencias Clases contenidas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseImpl extends EObjectImpl implements Clase {
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
	 * The cached value of the '{@link #getOperaciones_clases() <em>Operaciones clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones_clases()
	 * @generated
	 * @ordered
	 */
	protected EList operaciones_clases;

	/**
	 * The cached value of the '{@link #getAtributos_clases() <em>Atributos clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos_clases()
	 * @generated
	 * @ordered
	 */
	protected EList atributos_clases;

	/**
	 * The default value of the '{@link #isEsAbstracta() <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_ABSTRACTA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsAbstracta() <em>Es Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsAbstracta()
	 * @generated
	 * @ordered
	 */
	protected boolean esAbstracta = ES_ABSTRACTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAsociaciones_contenidas() <em>Asociaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList asociaciones_contenidas;

	/**
	 * The cached value of the '{@link #getComposiciones_contenidas() <em>Composiciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposiciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList composiciones_contenidas;

	/**
	 * The cached value of the '{@link #getAgregaciones_contenidas() <em>Agregaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList agregaciones_contenidas;

	/**
	 * The cached value of the '{@link #getRealizacion_contenida() <em>Realizacion contenida</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizacion_contenida()
	 * @generated
	 * @ordered
	 */
	protected EList realizacion_contenida;

	/**
	 * The cached value of the '{@link #getHerenciasClases_contenidas() <em>Herencias Clases contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciasClases_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList herenciasClases_contenidas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.CLASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperaciones_clases() {
		if (operaciones_clases == null) {
			operaciones_clases = new EObjectContainmentEList(Operacion.class, this, SimilumlPackage.CLASE__OPERACIONES_CLASES);
		}
		return operaciones_clases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAtributos_clases() {
		if (atributos_clases == null) {
			atributos_clases = new EObjectContainmentEList(Atributo.class, this, SimilumlPackage.CLASE__ATRIBUTOS_CLASES);
		}
		return atributos_clases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsAbstracta() {
		return esAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsAbstracta(boolean newEsAbstracta) {
		boolean oldEsAbstracta = esAbstracta;
		esAbstracta = newEsAbstracta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.CLASE__ES_ABSTRACTA, oldEsAbstracta, esAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAsociaciones_contenidas() {
		if (asociaciones_contenidas == null) {
			asociaciones_contenidas = new EObjectContainmentEList(Asociacion.class, this, SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS);
		}
		return asociaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComposiciones_contenidas() {
		if (composiciones_contenidas == null) {
			composiciones_contenidas = new EObjectContainmentEList(Composicion.class, this, SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS);
		}
		return composiciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAgregaciones_contenidas() {
		if (agregaciones_contenidas == null) {
			agregaciones_contenidas = new EObjectContainmentEList(Agregacion.class, this, SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS);
		}
		return agregaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRealizacion_contenida() {
		if (realizacion_contenida == null) {
			realizacion_contenida = new EObjectContainmentEList(Realizacion.class, this, SimilumlPackage.CLASE__REALIZACION_CONTENIDA);
		}
		return realizacion_contenida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHerenciasClases_contenidas() {
		if (herenciasClases_contenidas == null) {
			herenciasClases_contenidas = new EObjectContainmentEList(Herencia.class, this, SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS);
		}
		return herenciasClases_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimilumlPackage.CLASE__OPERACIONES_CLASES:
				return ((InternalEList)getOperaciones_clases()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__ATRIBUTOS_CLASES:
				return ((InternalEList)getAtributos_clases()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS:
				return ((InternalEList)getAsociaciones_contenidas()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS:
				return ((InternalEList)getComposiciones_contenidas()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS:
				return ((InternalEList)getAgregaciones_contenidas()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__REALIZACION_CONTENIDA:
				return ((InternalEList)getRealizacion_contenida()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS:
				return ((InternalEList)getHerenciasClases_contenidas()).basicRemove(otherEnd, msgs);
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
			case SimilumlPackage.CLASE__NOMBRE:
				return getNombre();
			case SimilumlPackage.CLASE__OPERACIONES_CLASES:
				return getOperaciones_clases();
			case SimilumlPackage.CLASE__ATRIBUTOS_CLASES:
				return getAtributos_clases();
			case SimilumlPackage.CLASE__ES_ABSTRACTA:
				return isEsAbstracta() ? Boolean.TRUE : Boolean.FALSE;
			case SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS:
				return getAsociaciones_contenidas();
			case SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS:
				return getComposiciones_contenidas();
			case SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS:
				return getAgregaciones_contenidas();
			case SimilumlPackage.CLASE__REALIZACION_CONTENIDA:
				return getRealizacion_contenida();
			case SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS:
				return getHerenciasClases_contenidas();
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
			case SimilumlPackage.CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimilumlPackage.CLASE__OPERACIONES_CLASES:
				getOperaciones_clases().clear();
				getOperaciones_clases().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__ATRIBUTOS_CLASES:
				getAtributos_clases().clear();
				getAtributos_clases().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__ES_ABSTRACTA:
				setEsAbstracta(((Boolean)newValue).booleanValue());
				return;
			case SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS:
				getAsociaciones_contenidas().clear();
				getAsociaciones_contenidas().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS:
				getComposiciones_contenidas().clear();
				getComposiciones_contenidas().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS:
				getAgregaciones_contenidas().clear();
				getAgregaciones_contenidas().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__REALIZACION_CONTENIDA:
				getRealizacion_contenida().clear();
				getRealizacion_contenida().addAll((Collection)newValue);
				return;
			case SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS:
				getHerenciasClases_contenidas().clear();
				getHerenciasClases_contenidas().addAll((Collection)newValue);
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
			case SimilumlPackage.CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimilumlPackage.CLASE__OPERACIONES_CLASES:
				getOperaciones_clases().clear();
				return;
			case SimilumlPackage.CLASE__ATRIBUTOS_CLASES:
				getAtributos_clases().clear();
				return;
			case SimilumlPackage.CLASE__ES_ABSTRACTA:
				setEsAbstracta(ES_ABSTRACTA_EDEFAULT);
				return;
			case SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS:
				getAsociaciones_contenidas().clear();
				return;
			case SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS:
				getComposiciones_contenidas().clear();
				return;
			case SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS:
				getAgregaciones_contenidas().clear();
				return;
			case SimilumlPackage.CLASE__REALIZACION_CONTENIDA:
				getRealizacion_contenida().clear();
				return;
			case SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS:
				getHerenciasClases_contenidas().clear();
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
			case SimilumlPackage.CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimilumlPackage.CLASE__OPERACIONES_CLASES:
				return operaciones_clases != null && !operaciones_clases.isEmpty();
			case SimilumlPackage.CLASE__ATRIBUTOS_CLASES:
				return atributos_clases != null && !atributos_clases.isEmpty();
			case SimilumlPackage.CLASE__ES_ABSTRACTA:
				return esAbstracta != ES_ABSTRACTA_EDEFAULT;
			case SimilumlPackage.CLASE__ASOCIACIONES_CONTENIDAS:
				return asociaciones_contenidas != null && !asociaciones_contenidas.isEmpty();
			case SimilumlPackage.CLASE__COMPOSICIONES_CONTENIDAS:
				return composiciones_contenidas != null && !composiciones_contenidas.isEmpty();
			case SimilumlPackage.CLASE__AGREGACIONES_CONTENIDAS:
				return agregaciones_contenidas != null && !agregaciones_contenidas.isEmpty();
			case SimilumlPackage.CLASE__REALIZACION_CONTENIDA:
				return realizacion_contenida != null && !realizacion_contenida.isEmpty();
			case SimilumlPackage.CLASE__HERENCIAS_CLASES_CONTENIDAS:
				return herenciasClases_contenidas != null && !herenciasClases_contenidas.isEmpty();
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
		result.append(", esAbstracta: ");
		result.append(esAbstracta);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
