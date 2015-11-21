/**
 */
package similuml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import similuml.Agregacion;
import similuml.Asociacion;
import similuml.Atributo;
import similuml.Clase;
import similuml.Composicion;
import similuml.ConstantesInterfaces;
import similuml.DiagramaClases;
import similuml.Herencia;
import similuml.Interface;
import similuml.Operacion;
import similuml.Parametro;
import similuml.Realizacion;
import similuml.Relacion;
import similuml.SimilumlFactory;
import similuml.SimilumlPackage;
import similuml.Tipo_Predefinido;
import similuml.Tipo_Predefinido_Retorno;
import similuml.Tipo_Visibilidad;

import similuml.util.SimilumlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimilumlPackageImpl extends EPackageImpl implements SimilumlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asociacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantesInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_Predefinido_RetornoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_VisibilidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_PredefinidoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see similuml.SimilumlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimilumlPackageImpl() {
		super(eNS_URI, SimilumlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimilumlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimilumlPackage init() {
		if (isInited) return (SimilumlPackage)EPackage.Registry.INSTANCE.getEPackage(SimilumlPackage.eNS_URI);

		// Obtain or create and register package
		SimilumlPackageImpl theSimilumlPackage = (SimilumlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimilumlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimilumlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimilumlPackage.createPackageContents();

		// Initialize created meta-data
		theSimilumlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimilumlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimilumlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimilumlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimilumlPackage.eNS_URI, theSimilumlPackage);
		return theSimilumlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramaClases() {
		return diagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramaClases_Nombre() {
		return (EAttribute)diagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Interfaces_del_Diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Clases_del_Diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Realizaciones_del_Diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Herencias_del_Diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Asociaciones_del_diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Agregaciones_del_diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramaClases_Composiciones_del_diagrama() {
		return (EReference)diagramaClasesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Nombre() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Operaciones_iterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Contantes_Interfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_HerenciasInterfaz_contenidas() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClase() {
		return claseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClase_Nombre() {
		return (EAttribute)claseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Operaciones_clases() {
		return (EReference)claseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Atributos_clases() {
		return (EReference)claseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClase_EsAbstracta() {
		return (EAttribute)claseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Asociaciones_contenidas() {
		return (EReference)claseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Composiciones_contenidas() {
		return (EReference)claseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Agregaciones_contenidas() {
		return (EReference)claseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_Realizacion_contenida() {
		return (EReference)claseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClase_HerenciasClases_contenidas() {
		return (EReference)claseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsociacion() {
		return asociacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsociacion_DesdeClaseaInterfaz() {
		return (EReference)asociacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsociacion_HaciaInterfazdesdeClase() {
		return (EReference)asociacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgregacion() {
		return agregacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Nombre() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_CardinalidadInferior() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_CardinalidadSuperior() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Origen() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Destino() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposicion() {
		return composicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Nombre() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Tipo_retorno() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Parametros_contenidos() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_EsAbstracto() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Visibilidad() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Tipo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Visibilidad() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametro() {
		return parametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Nombre() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Tipo() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizacion() {
		return realizacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacion_OrigenRealizacion() {
		return (EReference)realizacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizacion_DestinoRealizacion() {
		return (EReference)realizacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizacion_Nombre() {
		return (EAttribute)realizacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerencia() {
		return herenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_HerenciaClase_Origen() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_Hereda_Clase_Destino() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_Hereda_Interfaz_Origen() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_Hereda_Interfaz_destino() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHerencia_Nombre() {
		return (EAttribute)herenciaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantesInterfaces() {
		return constantesInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantesInterfaces_Nombre() {
		return (EAttribute)constantesInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantesInterfaces_Tipo() {
		return (EAttribute)constantesInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipo_Predefinido_Retorno() {
		return tipo_Predefinido_RetornoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipo_Visibilidad() {
		return tipo_VisibilidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipo_Predefinido() {
		return tipo_PredefinidoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilumlFactory getSimilumlFactory() {
		return (SimilumlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diagramaClasesEClass = createEClass(DIAGRAMA_CLASES);
		createEAttribute(diagramaClasesEClass, DIAGRAMA_CLASES__NOMBRE);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA);
		createEReference(diagramaClasesEClass, DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NOMBRE);
		createEReference(interfaceEClass, INTERFACE__OPERACIONES_ITERFACES);
		createEReference(interfaceEClass, INTERFACE__CONTANTES_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS);

		claseEClass = createEClass(CLASE);
		createEAttribute(claseEClass, CLASE__NOMBRE);
		createEReference(claseEClass, CLASE__OPERACIONES_CLASES);
		createEReference(claseEClass, CLASE__ATRIBUTOS_CLASES);
		createEAttribute(claseEClass, CLASE__ES_ABSTRACTA);
		createEReference(claseEClass, CLASE__ASOCIACIONES_CONTENIDAS);
		createEReference(claseEClass, CLASE__COMPOSICIONES_CONTENIDAS);
		createEReference(claseEClass, CLASE__AGREGACIONES_CONTENIDAS);
		createEReference(claseEClass, CLASE__REALIZACION_CONTENIDA);
		createEReference(claseEClass, CLASE__HERENCIAS_CLASES_CONTENIDAS);

		asociacionEClass = createEClass(ASOCIACION);
		createEReference(asociacionEClass, ASOCIACION__DESDE_CLASEA_INTERFAZ);
		createEReference(asociacionEClass, ASOCIACION__HACIA_INTERFAZDESDE_CLASE);

		agregacionEClass = createEClass(AGREGACION);

		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__NOMBRE);
		createEAttribute(relacionEClass, RELACION__CARDINALIDAD_INFERIOR);
		createEAttribute(relacionEClass, RELACION__CARDINALIDAD_SUPERIOR);
		createEReference(relacionEClass, RELACION__ORIGEN);
		createEReference(relacionEClass, RELACION__DESTINO);

		composicionEClass = createEClass(COMPOSICION);

		operacionEClass = createEClass(OPERACION);
		createEAttribute(operacionEClass, OPERACION__NOMBRE);
		createEAttribute(operacionEClass, OPERACION__TIPO_RETORNO);
		createEReference(operacionEClass, OPERACION__PARAMETROS_CONTENIDOS);
		createEAttribute(operacionEClass, OPERACION__ES_ABSTRACTO);
		createEAttribute(operacionEClass, OPERACION__VISIBILIDAD);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);
		createEAttribute(atributoEClass, ATRIBUTO__VISIBILIDAD);

		parametroEClass = createEClass(PARAMETRO);
		createEAttribute(parametroEClass, PARAMETRO__NOMBRE);
		createEAttribute(parametroEClass, PARAMETRO__TIPO);

		realizacionEClass = createEClass(REALIZACION);
		createEReference(realizacionEClass, REALIZACION__ORIGEN_REALIZACION);
		createEReference(realizacionEClass, REALIZACION__DESTINO_REALIZACION);
		createEAttribute(realizacionEClass, REALIZACION__NOMBRE);

		herenciaEClass = createEClass(HERENCIA);
		createEReference(herenciaEClass, HERENCIA__HERENCIA_CLASE_ORIGEN);
		createEReference(herenciaEClass, HERENCIA__HEREDA_CLASE_DESTINO);
		createEReference(herenciaEClass, HERENCIA__HEREDA_INTERFAZ_ORIGEN);
		createEReference(herenciaEClass, HERENCIA__HEREDA_INTERFAZ_DESTINO);
		createEAttribute(herenciaEClass, HERENCIA__NOMBRE);

		constantesInterfacesEClass = createEClass(CONSTANTES_INTERFACES);
		createEAttribute(constantesInterfacesEClass, CONSTANTES_INTERFACES__NOMBRE);
		createEAttribute(constantesInterfacesEClass, CONSTANTES_INTERFACES__TIPO);

		// Create enums
		tipo_Predefinido_RetornoEEnum = createEEnum(TIPO_PREDEFINIDO_RETORNO);
		tipo_VisibilidadEEnum = createEEnum(TIPO_VISIBILIDAD);
		tipo_PredefinidoEEnum = createEEnum(TIPO_PREDEFINIDO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		asociacionEClass.getESuperTypes().add(this.getRelacion());
		agregacionEClass.getESuperTypes().add(this.getRelacion());
		composicionEClass.getESuperTypes().add(this.getRelacion());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramaClasesEClass, DiagramaClases.class, "DiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramaClases_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Interfaces_del_Diagrama(), this.getInterface(), null, "interfaces_del_Diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Clases_del_Diagrama(), this.getClase(), null, "clases_del_Diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Realizaciones_del_Diagrama(), this.getRealizacion(), null, "realizaciones_del_Diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Herencias_del_Diagrama(), this.getHerencia(), null, "Herencias_del_Diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Asociaciones_del_diagrama(), this.getAsociacion(), null, "asociaciones_del_diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Agregaciones_del_diagrama(), this.getAgregacion(), null, "agregaciones_del_diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramaClases_Composiciones_del_diagrama(), this.getComposicion(), null, "composiciones_del_diagrama", null, 0, -1, DiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Operaciones_iterfaces(), this.getOperacion(), null, "operaciones_iterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Contantes_Interfaces(), this.getConstantesInterfaces(), null, "contantes_Interfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_HerenciasInterfaz_contenidas(), this.getHerencia(), null, "herenciasInterfaz_contenidas", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Operaciones_clases(), this.getOperacion(), null, "operaciones_clases", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Atributos_clases(), this.getAtributo(), null, "atributos_clases", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClase_EsAbstracta(), ecorePackage.getEBoolean(), "esAbstracta", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Asociaciones_contenidas(), this.getAsociacion(), null, "asociaciones_contenidas", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Composiciones_contenidas(), this.getComposicion(), null, "composiciones_contenidas", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Agregaciones_contenidas(), this.getAgregacion(), null, "agregaciones_contenidas", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_Realizacion_contenida(), this.getRealizacion(), null, "realizacion_contenida", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClase_HerenciasClases_contenidas(), this.getHerencia(), null, "herenciasClases_contenidas", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asociacionEClass, Asociacion.class, "Asociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsociacion_DesdeClaseaInterfaz(), this.getClase(), null, "desdeClaseaInterfaz", null, 0, 1, Asociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsociacion_HaciaInterfazdesdeClase(), this.getInterface(), null, "haciaInterfazdesdeClase", null, 0, 1, Asociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agregacionEClass, Agregacion.class, "Agregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_CardinalidadInferior(), ecorePackage.getEInt(), "cardinalidadInferior", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_CardinalidadSuperior(), ecorePackage.getEInt(), "cardinalidadSuperior", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Origen(), this.getClase(), null, "origen", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Destino(), this.getClase(), null, "destino", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composicionEClass, Composicion.class, "Composicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Tipo_retorno(), this.getTipo_Predefinido_Retorno(), "tipo_retorno", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Parametros_contenidos(), this.getParametro(), null, "parametros_contenidos", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_EsAbstracto(), ecorePackage.getEBoolean(), "esAbstracto", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Visibilidad(), this.getTipo_Visibilidad(), "visibilidad", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), this.getTipo_Predefinido(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Visibilidad(), this.getTipo_Visibilidad(), "visibilidad", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroEClass, Parametro.class, "Parametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametro_Tipo(), this.getTipo_Predefinido(), "tipo", null, 0, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizacionEClass, Realizacion.class, "Realizacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizacion_OrigenRealizacion(), this.getClase(), null, "origenRealizacion", null, 0, 1, Realizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizacion_DestinoRealizacion(), this.getInterface(), null, "destinoRealizacion", null, 0, 1, Realizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Realizacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herenciaEClass, Herencia.class, "Herencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHerencia_HerenciaClase_Origen(), this.getClase(), null, "herenciaClase_Origen", null, 0, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_Hereda_Clase_Destino(), this.getClase(), null, "hereda_Clase_Destino", null, 0, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_Hereda_Interfaz_Origen(), this.getInterface(), null, "hereda_Interfaz_Origen", null, 0, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_Hereda_Interfaz_destino(), this.getInterface(), null, "hereda_Interfaz_destino", null, 0, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHerencia_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantesInterfacesEClass, ConstantesInterfaces.class, "ConstantesInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantesInterfaces_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ConstantesInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstantesInterfaces_Tipo(), this.getTipo_Predefinido_Retorno(), "tipo", null, 0, 1, ConstantesInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.class, "Tipo_Predefinido_Retorno");
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.INT);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.FLOAT);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.CHAR);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.BOOLEAN);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.STRING);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.DOUBLE);
		addEEnumLiteral(tipo_Predefinido_RetornoEEnum, Tipo_Predefinido_Retorno.VOID);

		initEEnum(tipo_VisibilidadEEnum, Tipo_Visibilidad.class, "Tipo_Visibilidad");
		addEEnumLiteral(tipo_VisibilidadEEnum, Tipo_Visibilidad.PRIVATE);
		addEEnumLiteral(tipo_VisibilidadEEnum, Tipo_Visibilidad.PUBLIC);
		addEEnumLiteral(tipo_VisibilidadEEnum, Tipo_Visibilidad.PACKAGE);
		addEEnumLiteral(tipo_VisibilidadEEnum, Tipo_Visibilidad.PROTECTED);

		initEEnum(tipo_PredefinidoEEnum, Tipo_Predefinido.class, "Tipo_Predefinido");
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.INT);
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.FLOAT);
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.CHAR);
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.BOOLEAN);
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.STRING);
		addEEnumLiteral(tipo_PredefinidoEEnum, Tipo_Predefinido.DOUBLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (claseEClass, 
		   source, 
		   new String[] {
			 "constraints", "clase_distinta_de_alumno"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (claseEClass, 
		   source, 
		   new String[] {
			 "constraints", ""
		   });
	}

} //SimilumlPackageImpl
