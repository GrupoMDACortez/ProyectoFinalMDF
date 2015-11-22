/**
 */
package proyectofinalmdf.similuml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proyectofinalmdf.similuml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proyectofinalmdf.similuml.SimilumlPackage
 * @generated
 */
public class SimilumlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimilumlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilumlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimilumlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimilumlSwitch modelSwitch =
		new SimilumlSwitch() {
			public Object caseDiagramaClases(DiagramaClases object) {
				return createDiagramaClasesAdapter();
			}
			public Object caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			public Object caseClase(Clase object) {
				return createClaseAdapter();
			}
			public Object caseAsociacion(Asociacion object) {
				return createAsociacionAdapter();
			}
			public Object caseAgregacion(Agregacion object) {
				return createAgregacionAdapter();
			}
			public Object caseRelacion(Relacion object) {
				return createRelacionAdapter();
			}
			public Object caseComposicion(Composicion object) {
				return createComposicionAdapter();
			}
			public Object caseOperacion(Operacion object) {
				return createOperacionAdapter();
			}
			public Object caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			public Object caseParametro(Parametro object) {
				return createParametroAdapter();
			}
			public Object caseRealizacion(Realizacion object) {
				return createRealizacionAdapter();
			}
			public Object caseHerencia(Herencia object) {
				return createHerenciaAdapter();
			}
			public Object caseConstantesInterfaces(ConstantesInterfaces object) {
				return createConstantesInterfacesAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.DiagramaClases <em>Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.DiagramaClases
	 * @generated
	 */
	public Adapter createDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Clase
	 * @generated
	 */
	public Adapter createClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Asociacion
	 * @generated
	 */
	public Adapter createAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Agregacion
	 * @generated
	 */
	public Adapter createAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Relacion
	 * @generated
	 */
	public Adapter createRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Composicion
	 * @generated
	 */
	public Adapter createComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Operacion
	 * @generated
	 */
	public Adapter createOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Parametro
	 * @generated
	 */
	public Adapter createParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Realizacion <em>Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Realizacion
	 * @generated
	 */
	public Adapter createRealizacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectofinalmdf.similuml.ConstantesInterfaces <em>Constantes Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectofinalmdf.similuml.ConstantesInterfaces
	 * @generated
	 */
	public Adapter createConstantesInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimilumlAdapterFactory
