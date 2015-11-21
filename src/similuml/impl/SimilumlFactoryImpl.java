/**
 */
package similuml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import similuml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimilumlFactoryImpl extends EFactoryImpl implements SimilumlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimilumlFactory init() {
		try {
			SimilumlFactory theSimilumlFactory = (SimilumlFactory)EPackage.Registry.INSTANCE.getEFactory(SimilumlPackage.eNS_URI);
			if (theSimilumlFactory != null) {
				return theSimilumlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimilumlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilumlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimilumlPackage.DIAGRAMA_CLASES: return createDiagramaClases();
			case SimilumlPackage.INTERFACE: return createInterface();
			case SimilumlPackage.CLASE: return createClase();
			case SimilumlPackage.ASOCIACION: return createAsociacion();
			case SimilumlPackage.AGREGACION: return createAgregacion();
			case SimilumlPackage.RELACION: return createRelacion();
			case SimilumlPackage.COMPOSICION: return createComposicion();
			case SimilumlPackage.OPERACION: return createOperacion();
			case SimilumlPackage.ATRIBUTO: return createAtributo();
			case SimilumlPackage.PARAMETRO: return createParametro();
			case SimilumlPackage.REALIZACION: return createRealizacion();
			case SimilumlPackage.HERENCIA: return createHerencia();
			case SimilumlPackage.CONSTANTES_INTERFACES: return createConstantesInterfaces();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimilumlPackage.TIPO_PREDEFINIDO_RETORNO:
				return createTipo_Predefinido_RetornoFromString(eDataType, initialValue);
			case SimilumlPackage.TIPO_VISIBILIDAD:
				return createTipo_VisibilidadFromString(eDataType, initialValue);
			case SimilumlPackage.TIPO_PREDEFINIDO:
				return createTipo_PredefinidoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimilumlPackage.TIPO_PREDEFINIDO_RETORNO:
				return convertTipo_Predefinido_RetornoToString(eDataType, instanceValue);
			case SimilumlPackage.TIPO_VISIBILIDAD:
				return convertTipo_VisibilidadToString(eDataType, instanceValue);
			case SimilumlPackage.TIPO_PREDEFINIDO:
				return convertTipo_PredefinidoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaClases createDiagramaClases() {
		DiagramaClasesImpl diagramaClases = new DiagramaClasesImpl();
		return diagramaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociacion createAsociacion() {
		AsociacionImpl asociacion = new AsociacionImpl();
		return asociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregacion createAgregacion() {
		AgregacionImpl agregacion = new AgregacionImpl();
		return agregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composicion createComposicion() {
		ComposicionImpl composicion = new ComposicionImpl();
		return composicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro createParametro() {
		ParametroImpl parametro = new ParametroImpl();
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realizacion createRealizacion() {
		RealizacionImpl realizacion = new RealizacionImpl();
		return realizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantesInterfaces createConstantesInterfaces() {
		ConstantesInterfacesImpl constantesInterfaces = new ConstantesInterfacesImpl();
		return constantesInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Predefinido_Retorno createTipo_Predefinido_RetornoFromString(EDataType eDataType, String initialValue) {
		Tipo_Predefinido_Retorno result = Tipo_Predefinido_Retorno.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipo_Predefinido_RetornoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Visibilidad createTipo_VisibilidadFromString(EDataType eDataType, String initialValue) {
		Tipo_Visibilidad result = Tipo_Visibilidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipo_VisibilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo_Predefinido createTipo_PredefinidoFromString(EDataType eDataType, String initialValue) {
		Tipo_Predefinido result = Tipo_Predefinido.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipo_PredefinidoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilumlPackage getSimilumlPackage() {
		return (SimilumlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimilumlPackage getPackage() {
		return SimilumlPackage.eINSTANCE;
	}

} //SimilumlFactoryImpl
