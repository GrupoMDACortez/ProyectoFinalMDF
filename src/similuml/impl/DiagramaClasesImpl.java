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

import similuml.Agregacion;
import similuml.Asociacion;
import similuml.Clase;
import similuml.Composicion;
import similuml.DiagramaClases;
import similuml.Herencia;
import similuml.Interface;
import similuml.Realizacion;
import similuml.SimilumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getInterfaces_del_Diagrama <em>Interfaces del Diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getClases_del_Diagrama <em>Clases del Diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getRealizaciones_del_Diagrama <em>Realizaciones del Diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getHerencias_del_Diagrama <em>Herencias del Diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getAsociaciones_del_diagrama <em>Asociaciones del diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getAgregaciones_del_diagrama <em>Agregaciones del diagrama</em>}</li>
 *   <li>{@link similuml.impl.DiagramaClasesImpl#getComposiciones_del_diagrama <em>Composiciones del diagrama</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaClasesImpl extends MinimalEObjectImpl.Container implements DiagramaClases {
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
	 * The cached value of the '{@link #getInterfaces_del_Diagrama() <em>Interfaces del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces_del_Diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces_del_Diagrama;

	/**
	 * The cached value of the '{@link #getClases_del_Diagrama() <em>Clases del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClases_del_Diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Clase> clases_del_Diagrama;

	/**
	 * The cached value of the '{@link #getRealizaciones_del_Diagrama() <em>Realizaciones del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizaciones_del_Diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Realizacion> realizaciones_del_Diagrama;

	/**
	 * The cached value of the '{@link #getHerencias_del_Diagrama() <em>Herencias del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerencias_del_Diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Herencia> herencias_del_Diagrama;

	/**
	 * The cached value of the '{@link #getAsociaciones_del_diagrama() <em>Asociaciones del diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociaciones_del_diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Asociacion> asociaciones_del_diagrama;

	/**
	 * The cached value of the '{@link #getAgregaciones_del_diagrama() <em>Agregaciones del diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregaciones_del_diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Agregacion> agregaciones_del_diagrama;

	/**
	 * The cached value of the '{@link #getComposiciones_del_diagrama() <em>Composiciones del diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposiciones_del_diagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Composicion> composiciones_del_diagrama;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimilumlPackage.Literals.DIAGRAMA_CLASES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimilumlPackage.DIAGRAMA_CLASES__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces_del_Diagrama() {
		if (interfaces_del_Diagrama == null) {
			interfaces_del_Diagrama = new EObjectContainmentEList<Interface>(Interface.class, this, SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA);
		}
		return interfaces_del_Diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clase> getClases_del_Diagrama() {
		if (clases_del_Diagrama == null) {
			clases_del_Diagrama = new EObjectContainmentEList<Clase>(Clase.class, this, SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA);
		}
		return clases_del_Diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realizacion> getRealizaciones_del_Diagrama() {
		if (realizaciones_del_Diagrama == null) {
			realizaciones_del_Diagrama = new EObjectContainmentEList<Realizacion>(Realizacion.class, this, SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA);
		}
		return realizaciones_del_Diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Herencia> getHerencias_del_Diagrama() {
		if (herencias_del_Diagrama == null) {
			herencias_del_Diagrama = new EObjectContainmentEList<Herencia>(Herencia.class, this, SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA);
		}
		return herencias_del_Diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asociacion> getAsociaciones_del_diagrama() {
		if (asociaciones_del_diagrama == null) {
			asociaciones_del_diagrama = new EObjectContainmentEList<Asociacion>(Asociacion.class, this, SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA);
		}
		return asociaciones_del_diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agregacion> getAgregaciones_del_diagrama() {
		if (agregaciones_del_diagrama == null) {
			agregaciones_del_diagrama = new EObjectContainmentEList<Agregacion>(Agregacion.class, this, SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA);
		}
		return agregaciones_del_diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composicion> getComposiciones_del_diagrama() {
		if (composiciones_del_diagrama == null) {
			composiciones_del_diagrama = new EObjectContainmentEList<Composicion>(Composicion.class, this, SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA);
		}
		return composiciones_del_diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getInterfaces_del_Diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getClases_del_Diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getRealizaciones_del_Diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA:
				return ((InternalEList<?>)getHerencias_del_Diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAsociaciones_del_diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAgregaciones_del_diagrama()).basicRemove(otherEnd, msgs);
			case SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getComposiciones_del_diagrama()).basicRemove(otherEnd, msgs);
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
			case SimilumlPackage.DIAGRAMA_CLASES__NOMBRE:
				return getNombre();
			case SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA:
				return getInterfaces_del_Diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA:
				return getClases_del_Diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA:
				return getRealizaciones_del_Diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA:
				return getHerencias_del_Diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA:
				return getAsociaciones_del_diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA:
				return getAgregaciones_del_diagrama();
			case SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA:
				return getComposiciones_del_diagrama();
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
			case SimilumlPackage.DIAGRAMA_CLASES__NOMBRE:
				setNombre((String)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA:
				getInterfaces_del_Diagrama().clear();
				getInterfaces_del_Diagrama().addAll((Collection<? extends Interface>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA:
				getClases_del_Diagrama().clear();
				getClases_del_Diagrama().addAll((Collection<? extends Clase>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA:
				getRealizaciones_del_Diagrama().clear();
				getRealizaciones_del_Diagrama().addAll((Collection<? extends Realizacion>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA:
				getHerencias_del_Diagrama().clear();
				getHerencias_del_Diagrama().addAll((Collection<? extends Herencia>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA:
				getAsociaciones_del_diagrama().clear();
				getAsociaciones_del_diagrama().addAll((Collection<? extends Asociacion>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA:
				getAgregaciones_del_diagrama().clear();
				getAgregaciones_del_diagrama().addAll((Collection<? extends Agregacion>)newValue);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA:
				getComposiciones_del_diagrama().clear();
				getComposiciones_del_diagrama().addAll((Collection<? extends Composicion>)newValue);
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
			case SimilumlPackage.DIAGRAMA_CLASES__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA:
				getInterfaces_del_Diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA:
				getClases_del_Diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA:
				getRealizaciones_del_Diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA:
				getHerencias_del_Diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA:
				getAsociaciones_del_diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA:
				getAgregaciones_del_diagrama().clear();
				return;
			case SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA:
				getComposiciones_del_diagrama().clear();
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
			case SimilumlPackage.DIAGRAMA_CLASES__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case SimilumlPackage.DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA:
				return interfaces_del_Diagrama != null && !interfaces_del_Diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA:
				return clases_del_Diagrama != null && !clases_del_Diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA:
				return realizaciones_del_Diagrama != null && !realizaciones_del_Diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA:
				return herencias_del_Diagrama != null && !herencias_del_Diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA:
				return asociaciones_del_diagrama != null && !asociaciones_del_diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA:
				return agregaciones_del_diagrama != null && !agregaciones_del_diagrama.isEmpty();
			case SimilumlPackage.DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA:
				return composiciones_del_diagrama != null && !composiciones_del_diagrama.isEmpty();
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

} //DiagramaClasesImpl
