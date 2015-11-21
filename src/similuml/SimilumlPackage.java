/**
 */
package similuml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see similuml.SimilumlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SimilumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "similuml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://similuml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "similuml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimilumlPackage eINSTANCE = similuml.impl.SimilumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link similuml.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.DiagramaClasesImpl
	 * @see similuml.impl.SimilumlPackageImpl#getDiagramaClases()
	 * @generated
	 */
	int DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Interfaces del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA = 1;

	/**
	 * The feature id for the '<em><b>Clases del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA = 2;

	/**
	 * The feature id for the '<em><b>Realizaciones del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Herencias del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA = 4;

	/**
	 * The feature id for the '<em><b>Asociaciones del diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA = 5;

	/**
	 * The feature id for the '<em><b>Agregaciones del diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA = 6;

	/**
	 * The feature id for the '<em><b>Composiciones del diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA = 7;

	/**
	 * The number of structural features of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_CLASES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.InterfaceImpl
	 * @see similuml.impl.SimilumlPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Operaciones iterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERACIONES_ITERFACES = 1;

	/**
	 * The feature id for the '<em><b>Contantes Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTANTES_INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Herencias Interfaz contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS = 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.ClaseImpl
	 * @see similuml.impl.SimilumlPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Operaciones clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__OPERACIONES_CLASES = 1;

	/**
	 * The feature id for the '<em><b>Atributos clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ATRIBUTOS_CLASES = 2;

	/**
	 * The feature id for the '<em><b>Es Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ES_ABSTRACTA = 3;

	/**
	 * The feature id for the '<em><b>Asociaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ASOCIACIONES_CONTENIDAS = 4;

	/**
	 * The feature id for the '<em><b>Composiciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__COMPOSICIONES_CONTENIDAS = 5;

	/**
	 * The feature id for the '<em><b>Agregaciones contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__AGREGACIONES_CONTENIDAS = 6;

	/**
	 * The feature id for the '<em><b>Realizacion contenida</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__REALIZACION_CONTENIDA = 7;

	/**
	 * The feature id for the '<em><b>Herencias Clases contenidas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__HERENCIAS_CLASES_CONTENIDAS = 8;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.RelacionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Cardinalidad Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__CARDINALIDAD_INFERIOR = 1;

	/**
	 * The feature id for the '<em><b>Cardinalidad Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__CARDINALIDAD_SUPERIOR = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__DESTINO = 4;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.AsociacionImpl <em>Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.AsociacionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getAsociacion()
	 * @generated
	 */
	int ASOCIACION = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__NOMBRE = RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Cardinalidad Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__CARDINALIDAD_INFERIOR = RELACION__CARDINALIDAD_INFERIOR;

	/**
	 * The feature id for the '<em><b>Cardinalidad Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__CARDINALIDAD_SUPERIOR = RELACION__CARDINALIDAD_SUPERIOR;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__ORIGEN = RELACION__ORIGEN;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__DESTINO = RELACION__DESTINO;

	/**
	 * The feature id for the '<em><b>Desde Clasea Interfaz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__DESDE_CLASEA_INTERFAZ = RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hacia Interfazdesde Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__HACIA_INTERFAZDESDE_CLASE = RELACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_FEATURE_COUNT = RELACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link similuml.impl.AgregacionImpl <em>Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.AgregacionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getAgregacion()
	 * @generated
	 */
	int AGREGACION = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__NOMBRE = RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Cardinalidad Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__CARDINALIDAD_INFERIOR = RELACION__CARDINALIDAD_INFERIOR;

	/**
	 * The feature id for the '<em><b>Cardinalidad Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__CARDINALIDAD_SUPERIOR = RELACION__CARDINALIDAD_SUPERIOR;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__ORIGEN = RELACION__ORIGEN;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__DESTINO = RELACION__DESTINO;

	/**
	 * The number of structural features of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link similuml.impl.ComposicionImpl <em>Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.ComposicionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getComposicion()
	 * @generated
	 */
	int COMPOSICION = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__NOMBRE = RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Cardinalidad Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__CARDINALIDAD_INFERIOR = RELACION__CARDINALIDAD_INFERIOR;

	/**
	 * The feature id for the '<em><b>Cardinalidad Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__CARDINALIDAD_SUPERIOR = RELACION__CARDINALIDAD_SUPERIOR;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__ORIGEN = RELACION__ORIGEN;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__DESTINO = RELACION__DESTINO;

	/**
	 * The number of structural features of the '<em>Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link similuml.impl.OperacionImpl <em>Operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.OperacionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getOperacion()
	 * @generated
	 */
	int OPERACION = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__TIPO_RETORNO = 1;

	/**
	 * The feature id for the '<em><b>Parametros contenidos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__PARAMETROS_CONTENIDOS = 2;

	/**
	 * The feature id for the '<em><b>Es Abstracto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_ABSTRACTO = 3;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__VISIBILIDAD = 4;

	/**
	 * The number of structural features of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.AtributoImpl
	 * @see similuml.impl.SimilumlPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__VISIBILIDAD = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.ParametroImpl
	 * @see similuml.impl.SimilumlPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.RealizacionImpl <em>Realizacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.RealizacionImpl
	 * @see similuml.impl.SimilumlPackageImpl#getRealizacion()
	 * @generated
	 */
	int REALIZACION = 10;

	/**
	 * The feature id for the '<em><b>Origen Realizacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION__ORIGEN_REALIZACION = 0;

	/**
	 * The feature id for the '<em><b>Destino Realizacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION__DESTINO_REALIZACION = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Realizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Realizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.HerenciaImpl
	 * @see similuml.impl.SimilumlPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 11;

	/**
	 * The feature id for the '<em><b>Herencia Clase Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__HERENCIA_CLASE_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Hereda Clase Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__HEREDA_CLASE_DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Hereda Interfaz Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__HEREDA_INTERFAZ_ORIGEN = 2;

	/**
	 * The feature id for the '<em><b>Hereda Interfaz destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__HEREDA_INTERFAZ_DESTINO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__NOMBRE = 4;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.impl.ConstantesInterfacesImpl <em>Constantes Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.impl.ConstantesInterfacesImpl
	 * @see similuml.impl.SimilumlPackageImpl#getConstantesInterfaces()
	 * @generated
	 */
	int CONSTANTES_INTERFACES = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_INTERFACES__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_INTERFACES__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Constantes Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_INTERFACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constantes Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTES_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link similuml.Tipo_Predefinido_Retorno <em>Tipo Predefinido Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.Tipo_Predefinido_Retorno
	 * @see similuml.impl.SimilumlPackageImpl#getTipo_Predefinido_Retorno()
	 * @generated
	 */
	int TIPO_PREDEFINIDO_RETORNO = 13;

	/**
	 * The meta object id for the '{@link similuml.Tipo_Visibilidad <em>Tipo Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.Tipo_Visibilidad
	 * @see similuml.impl.SimilumlPackageImpl#getTipo_Visibilidad()
	 * @generated
	 */
	int TIPO_VISIBILIDAD = 14;

	/**
	 * The meta object id for the '{@link similuml.Tipo_Predefinido <em>Tipo Predefinido</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see similuml.Tipo_Predefinido
	 * @see similuml.impl.SimilumlPackageImpl#getTipo_Predefinido()
	 * @generated
	 */
	int TIPO_PREDEFINIDO = 15;


	/**
	 * Returns the meta object for class '{@link similuml.DiagramaClases <em>Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama Clases</em>'.
	 * @see similuml.DiagramaClases
	 * @generated
	 */
	EClass getDiagramaClases();

	/**
	 * Returns the meta object for the attribute '{@link similuml.DiagramaClases#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.DiagramaClases#getNombre()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EAttribute getDiagramaClases_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getInterfaces_del_Diagrama <em>Interfaces del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces del Diagrama</em>'.
	 * @see similuml.DiagramaClases#getInterfaces_del_Diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Interfaces_del_Diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getClases_del_Diagrama <em>Clases del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clases del Diagrama</em>'.
	 * @see similuml.DiagramaClases#getClases_del_Diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Clases_del_Diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getRealizaciones_del_Diagrama <em>Realizaciones del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizaciones del Diagrama</em>'.
	 * @see similuml.DiagramaClases#getRealizaciones_del_Diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Realizaciones_del_Diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getHerencias_del_Diagrama <em>Herencias del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias del Diagrama</em>'.
	 * @see similuml.DiagramaClases#getHerencias_del_Diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Herencias_del_Diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getAsociaciones_del_diagrama <em>Asociaciones del diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asociaciones del diagrama</em>'.
	 * @see similuml.DiagramaClases#getAsociaciones_del_diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Asociaciones_del_diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getAgregaciones_del_diagrama <em>Agregaciones del diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agregaciones del diagrama</em>'.
	 * @see similuml.DiagramaClases#getAgregaciones_del_diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Agregaciones_del_diagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.DiagramaClases#getComposiciones_del_diagrama <em>Composiciones del diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composiciones del diagrama</em>'.
	 * @see similuml.DiagramaClases#getComposiciones_del_diagrama()
	 * @see #getDiagramaClases()
	 * @generated
	 */
	EReference getDiagramaClases_Composiciones_del_diagrama();

	/**
	 * Returns the meta object for class '{@link similuml.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see similuml.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Interface#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Interface#getNombre()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Interface#getOperaciones_iterfaces <em>Operaciones iterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones iterfaces</em>'.
	 * @see similuml.Interface#getOperaciones_iterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operaciones_iterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Interface#getContantes_Interfaces <em>Contantes Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contantes Interfaces</em>'.
	 * @see similuml.Interface#getContantes_Interfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Contantes_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Interface#getHerenciasInterfaz_contenidas <em>Herencias Interfaz contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias Interfaz contenidas</em>'.
	 * @see similuml.Interface#getHerenciasInterfaz_contenidas()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HerenciasInterfaz_contenidas();

	/**
	 * Returns the meta object for class '{@link similuml.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see similuml.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Clase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Clase#getNombre()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getOperaciones_clases <em>Operaciones clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones clases</em>'.
	 * @see similuml.Clase#getOperaciones_clases()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Operaciones_clases();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getAtributos_clases <em>Atributos clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos clases</em>'.
	 * @see similuml.Clase#getAtributos_clases()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Atributos_clases();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Clase#isEsAbstracta <em>Es Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Abstracta</em>'.
	 * @see similuml.Clase#isEsAbstracta()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_EsAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getAsociaciones_contenidas <em>Asociaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asociaciones contenidas</em>'.
	 * @see similuml.Clase#getAsociaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Asociaciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getComposiciones_contenidas <em>Composiciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composiciones contenidas</em>'.
	 * @see similuml.Clase#getComposiciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Composiciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getAgregaciones_contenidas <em>Agregaciones contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agregaciones contenidas</em>'.
	 * @see similuml.Clase#getAgregaciones_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Agregaciones_contenidas();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getRealizacion_contenida <em>Realizacion contenida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realizacion contenida</em>'.
	 * @see similuml.Clase#getRealizacion_contenida()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Realizacion_contenida();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Clase#getHerenciasClases_contenidas <em>Herencias Clases contenidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias Clases contenidas</em>'.
	 * @see similuml.Clase#getHerenciasClases_contenidas()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_HerenciasClases_contenidas();

	/**
	 * Returns the meta object for class '{@link similuml.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asociacion</em>'.
	 * @see similuml.Asociacion
	 * @generated
	 */
	EClass getAsociacion();

	/**
	 * Returns the meta object for the reference '{@link similuml.Asociacion#getDesdeClaseaInterfaz <em>Desde Clasea Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desde Clasea Interfaz</em>'.
	 * @see similuml.Asociacion#getDesdeClaseaInterfaz()
	 * @see #getAsociacion()
	 * @generated
	 */
	EReference getAsociacion_DesdeClaseaInterfaz();

	/**
	 * Returns the meta object for the reference '{@link similuml.Asociacion#getHaciaInterfazdesdeClase <em>Hacia Interfazdesde Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hacia Interfazdesde Clase</em>'.
	 * @see similuml.Asociacion#getHaciaInterfazdesdeClase()
	 * @see #getAsociacion()
	 * @generated
	 */
	EReference getAsociacion_HaciaInterfazdesdeClase();

	/**
	 * Returns the meta object for class '{@link similuml.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregacion</em>'.
	 * @see similuml.Agregacion
	 * @generated
	 */
	EClass getAgregacion();

	/**
	 * Returns the meta object for class '{@link similuml.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see similuml.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Relacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Relacion#getNombre()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Relacion#getCardinalidadInferior <em>Cardinalidad Inferior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidad Inferior</em>'.
	 * @see similuml.Relacion#getCardinalidadInferior()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_CardinalidadInferior();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Relacion#getCardinalidadSuperior <em>Cardinalidad Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinalidad Superior</em>'.
	 * @see similuml.Relacion#getCardinalidadSuperior()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_CardinalidadSuperior();

	/**
	 * Returns the meta object for the reference '{@link similuml.Relacion#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see similuml.Relacion#getOrigen()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Origen();

	/**
	 * Returns the meta object for the reference '{@link similuml.Relacion#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see similuml.Relacion#getDestino()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_Destino();

	/**
	 * Returns the meta object for class '{@link similuml.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composicion</em>'.
	 * @see similuml.Composicion
	 * @generated
	 */
	EClass getComposicion();

	/**
	 * Returns the meta object for class '{@link similuml.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion</em>'.
	 * @see similuml.Operacion
	 * @generated
	 */
	EClass getOperacion();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Operacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Operacion#getNombre()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Operacion#getTipo_retorno <em>Tipo retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo retorno</em>'.
	 * @see similuml.Operacion#getTipo_retorno()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Tipo_retorno();

	/**
	 * Returns the meta object for the containment reference list '{@link similuml.Operacion#getParametros_contenidos <em>Parametros contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros contenidos</em>'.
	 * @see similuml.Operacion#getParametros_contenidos()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Parametros_contenidos();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Operacion#isEsAbstracto <em>Es Abstracto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Abstracto</em>'.
	 * @see similuml.Operacion#isEsAbstracto()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_EsAbstracto();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Operacion#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see similuml.Operacion#getVisibilidad()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Visibilidad();

	/**
	 * Returns the meta object for class '{@link similuml.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see similuml.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see similuml.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Atributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see similuml.Atributo#getVisibilidad()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Visibilidad();

	/**
	 * Returns the meta object for class '{@link similuml.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see similuml.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Parametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Parametro#getNombre()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Parametro#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see similuml.Parametro#getTipo()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Tipo();

	/**
	 * Returns the meta object for class '{@link similuml.Realizacion <em>Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizacion</em>'.
	 * @see similuml.Realizacion
	 * @generated
	 */
	EClass getRealizacion();

	/**
	 * Returns the meta object for the reference '{@link similuml.Realizacion#getOrigenRealizacion <em>Origen Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen Realizacion</em>'.
	 * @see similuml.Realizacion#getOrigenRealizacion()
	 * @see #getRealizacion()
	 * @generated
	 */
	EReference getRealizacion_OrigenRealizacion();

	/**
	 * Returns the meta object for the reference '{@link similuml.Realizacion#getDestinoRealizacion <em>Destino Realizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino Realizacion</em>'.
	 * @see similuml.Realizacion#getDestinoRealizacion()
	 * @see #getRealizacion()
	 * @generated
	 */
	EReference getRealizacion_DestinoRealizacion();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Realizacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Realizacion#getNombre()
	 * @see #getRealizacion()
	 * @generated
	 */
	EAttribute getRealizacion_Nombre();

	/**
	 * Returns the meta object for class '{@link similuml.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see similuml.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for the reference '{@link similuml.Herencia#getHerenciaClase_Origen <em>Herencia Clase Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herencia Clase Origen</em>'.
	 * @see similuml.Herencia#getHerenciaClase_Origen()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_HerenciaClase_Origen();

	/**
	 * Returns the meta object for the reference '{@link similuml.Herencia#getHereda_Clase_Destino <em>Hereda Clase Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hereda Clase Destino</em>'.
	 * @see similuml.Herencia#getHereda_Clase_Destino()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Hereda_Clase_Destino();

	/**
	 * Returns the meta object for the reference '{@link similuml.Herencia#getHereda_Interfaz_Origen <em>Hereda Interfaz Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hereda Interfaz Origen</em>'.
	 * @see similuml.Herencia#getHereda_Interfaz_Origen()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Hereda_Interfaz_Origen();

	/**
	 * Returns the meta object for the reference '{@link similuml.Herencia#getHereda_Interfaz_destino <em>Hereda Interfaz destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hereda Interfaz destino</em>'.
	 * @see similuml.Herencia#getHereda_Interfaz_destino()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Hereda_Interfaz_destino();

	/**
	 * Returns the meta object for the attribute '{@link similuml.Herencia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.Herencia#getNombre()
	 * @see #getHerencia()
	 * @generated
	 */
	EAttribute getHerencia_Nombre();

	/**
	 * Returns the meta object for class '{@link similuml.ConstantesInterfaces <em>Constantes Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constantes Interfaces</em>'.
	 * @see similuml.ConstantesInterfaces
	 * @generated
	 */
	EClass getConstantesInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link similuml.ConstantesInterfaces#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see similuml.ConstantesInterfaces#getNombre()
	 * @see #getConstantesInterfaces()
	 * @generated
	 */
	EAttribute getConstantesInterfaces_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link similuml.ConstantesInterfaces#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see similuml.ConstantesInterfaces#getTipo()
	 * @see #getConstantesInterfaces()
	 * @generated
	 */
	EAttribute getConstantesInterfaces_Tipo();

	/**
	 * Returns the meta object for enum '{@link similuml.Tipo_Predefinido_Retorno <em>Tipo Predefinido Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Predefinido Retorno</em>'.
	 * @see similuml.Tipo_Predefinido_Retorno
	 * @generated
	 */
	EEnum getTipo_Predefinido_Retorno();

	/**
	 * Returns the meta object for enum '{@link similuml.Tipo_Visibilidad <em>Tipo Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Visibilidad</em>'.
	 * @see similuml.Tipo_Visibilidad
	 * @generated
	 */
	EEnum getTipo_Visibilidad();

	/**
	 * Returns the meta object for enum '{@link similuml.Tipo_Predefinido <em>Tipo Predefinido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Predefinido</em>'.
	 * @see similuml.Tipo_Predefinido
	 * @generated
	 */
	EEnum getTipo_Predefinido();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimilumlFactory getSimilumlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link similuml.impl.DiagramaClasesImpl <em>Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.DiagramaClasesImpl
		 * @see similuml.impl.SimilumlPackageImpl#getDiagramaClases()
		 * @generated
		 */
		EClass DIAGRAMA_CLASES = eINSTANCE.getDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMA_CLASES__NOMBRE = eINSTANCE.getDiagramaClases_Nombre();

		/**
		 * The meta object literal for the '<em><b>Interfaces del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__INTERFACES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Interfaces_del_Diagrama();

		/**
		 * The meta object literal for the '<em><b>Clases del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__CLASES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Clases_del_Diagrama();

		/**
		 * The meta object literal for the '<em><b>Realizaciones del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__REALIZACIONES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Realizaciones_del_Diagrama();

		/**
		 * The meta object literal for the '<em><b>Herencias del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__HERENCIAS_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Herencias_del_Diagrama();

		/**
		 * The meta object literal for the '<em><b>Asociaciones del diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__ASOCIACIONES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Asociaciones_del_diagrama();

		/**
		 * The meta object literal for the '<em><b>Agregaciones del diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__AGREGACIONES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Agregaciones_del_diagrama();

		/**
		 * The meta object literal for the '<em><b>Composiciones del diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA_CLASES__COMPOSICIONES_DEL_DIAGRAMA = eINSTANCE.getDiagramaClases_Composiciones_del_diagrama();

		/**
		 * The meta object literal for the '{@link similuml.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.InterfaceImpl
		 * @see similuml.impl.SimilumlPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NOMBRE = eINSTANCE.getInterface_Nombre();

		/**
		 * The meta object literal for the '<em><b>Operaciones iterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERACIONES_ITERFACES = eINSTANCE.getInterface_Operaciones_iterfaces();

		/**
		 * The meta object literal for the '<em><b>Contantes Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONTANTES_INTERFACES = eINSTANCE.getInterface_Contantes_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Herencias Interfaz contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HERENCIAS_INTERFAZ_CONTENIDAS = eINSTANCE.getInterface_HerenciasInterfaz_contenidas();

		/**
		 * The meta object literal for the '{@link similuml.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.ClaseImpl
		 * @see similuml.impl.SimilumlPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__NOMBRE = eINSTANCE.getClase_Nombre();

		/**
		 * The meta object literal for the '<em><b>Operaciones clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__OPERACIONES_CLASES = eINSTANCE.getClase_Operaciones_clases();

		/**
		 * The meta object literal for the '<em><b>Atributos clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ATRIBUTOS_CLASES = eINSTANCE.getClase_Atributos_clases();

		/**
		 * The meta object literal for the '<em><b>Es Abstracta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__ES_ABSTRACTA = eINSTANCE.getClase_EsAbstracta();

		/**
		 * The meta object literal for the '<em><b>Asociaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ASOCIACIONES_CONTENIDAS = eINSTANCE.getClase_Asociaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Composiciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__COMPOSICIONES_CONTENIDAS = eINSTANCE.getClase_Composiciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Agregaciones contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__AGREGACIONES_CONTENIDAS = eINSTANCE.getClase_Agregaciones_contenidas();

		/**
		 * The meta object literal for the '<em><b>Realizacion contenida</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__REALIZACION_CONTENIDA = eINSTANCE.getClase_Realizacion_contenida();

		/**
		 * The meta object literal for the '<em><b>Herencias Clases contenidas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__HERENCIAS_CLASES_CONTENIDAS = eINSTANCE.getClase_HerenciasClases_contenidas();

		/**
		 * The meta object literal for the '{@link similuml.impl.AsociacionImpl <em>Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.AsociacionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getAsociacion()
		 * @generated
		 */
		EClass ASOCIACION = eINSTANCE.getAsociacion();

		/**
		 * The meta object literal for the '<em><b>Desde Clasea Interfaz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASOCIACION__DESDE_CLASEA_INTERFAZ = eINSTANCE.getAsociacion_DesdeClaseaInterfaz();

		/**
		 * The meta object literal for the '<em><b>Hacia Interfazdesde Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASOCIACION__HACIA_INTERFAZDESDE_CLASE = eINSTANCE.getAsociacion_HaciaInterfazdesdeClase();

		/**
		 * The meta object literal for the '{@link similuml.impl.AgregacionImpl <em>Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.AgregacionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getAgregacion()
		 * @generated
		 */
		EClass AGREGACION = eINSTANCE.getAgregacion();

		/**
		 * The meta object literal for the '{@link similuml.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.RelacionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NOMBRE = eINSTANCE.getRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Cardinalidad Inferior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__CARDINALIDAD_INFERIOR = eINSTANCE.getRelacion_CardinalidadInferior();

		/**
		 * The meta object literal for the '<em><b>Cardinalidad Superior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__CARDINALIDAD_SUPERIOR = eINSTANCE.getRelacion_CardinalidadSuperior();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ORIGEN = eINSTANCE.getRelacion_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__DESTINO = eINSTANCE.getRelacion_Destino();

		/**
		 * The meta object literal for the '{@link similuml.impl.ComposicionImpl <em>Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.ComposicionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getComposicion()
		 * @generated
		 */
		EClass COMPOSICION = eINSTANCE.getComposicion();

		/**
		 * The meta object literal for the '{@link similuml.impl.OperacionImpl <em>Operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.OperacionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getOperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getOperacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__NOMBRE = eINSTANCE.getOperacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__TIPO_RETORNO = eINSTANCE.getOperacion_Tipo_retorno();

		/**
		 * The meta object literal for the '<em><b>Parametros contenidos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__PARAMETROS_CONTENIDOS = eINSTANCE.getOperacion_Parametros_contenidos();

		/**
		 * The meta object literal for the '<em><b>Es Abstracto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ES_ABSTRACTO = eINSTANCE.getOperacion_EsAbstracto();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__VISIBILIDAD = eINSTANCE.getOperacion_Visibilidad();

		/**
		 * The meta object literal for the '{@link similuml.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.AtributoImpl
		 * @see similuml.impl.SimilumlPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__VISIBILIDAD = eINSTANCE.getAtributo_Visibilidad();

		/**
		 * The meta object literal for the '{@link similuml.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.ParametroImpl
		 * @see similuml.impl.SimilumlPackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NOMBRE = eINSTANCE.getParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__TIPO = eINSTANCE.getParametro_Tipo();

		/**
		 * The meta object literal for the '{@link similuml.impl.RealizacionImpl <em>Realizacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.RealizacionImpl
		 * @see similuml.impl.SimilumlPackageImpl#getRealizacion()
		 * @generated
		 */
		EClass REALIZACION = eINSTANCE.getRealizacion();

		/**
		 * The meta object literal for the '<em><b>Origen Realizacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION__ORIGEN_REALIZACION = eINSTANCE.getRealizacion_OrigenRealizacion();

		/**
		 * The meta object literal for the '<em><b>Destino Realizacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZACION__DESTINO_REALIZACION = eINSTANCE.getRealizacion_DestinoRealizacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALIZACION__NOMBRE = eINSTANCE.getRealizacion_Nombre();

		/**
		 * The meta object literal for the '{@link similuml.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.HerenciaImpl
		 * @see similuml.impl.SimilumlPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '<em><b>Herencia Clase Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__HERENCIA_CLASE_ORIGEN = eINSTANCE.getHerencia_HerenciaClase_Origen();

		/**
		 * The meta object literal for the '<em><b>Hereda Clase Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__HEREDA_CLASE_DESTINO = eINSTANCE.getHerencia_Hereda_Clase_Destino();

		/**
		 * The meta object literal for the '<em><b>Hereda Interfaz Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__HEREDA_INTERFAZ_ORIGEN = eINSTANCE.getHerencia_Hereda_Interfaz_Origen();

		/**
		 * The meta object literal for the '<em><b>Hereda Interfaz destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__HEREDA_INTERFAZ_DESTINO = eINSTANCE.getHerencia_Hereda_Interfaz_destino();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HERENCIA__NOMBRE = eINSTANCE.getHerencia_Nombre();

		/**
		 * The meta object literal for the '{@link similuml.impl.ConstantesInterfacesImpl <em>Constantes Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.impl.ConstantesInterfacesImpl
		 * @see similuml.impl.SimilumlPackageImpl#getConstantesInterfaces()
		 * @generated
		 */
		EClass CONSTANTES_INTERFACES = eINSTANCE.getConstantesInterfaces();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTES_INTERFACES__NOMBRE = eINSTANCE.getConstantesInterfaces_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTES_INTERFACES__TIPO = eINSTANCE.getConstantesInterfaces_Tipo();

		/**
		 * The meta object literal for the '{@link similuml.Tipo_Predefinido_Retorno <em>Tipo Predefinido Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.Tipo_Predefinido_Retorno
		 * @see similuml.impl.SimilumlPackageImpl#getTipo_Predefinido_Retorno()
		 * @generated
		 */
		EEnum TIPO_PREDEFINIDO_RETORNO = eINSTANCE.getTipo_Predefinido_Retorno();

		/**
		 * The meta object literal for the '{@link similuml.Tipo_Visibilidad <em>Tipo Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.Tipo_Visibilidad
		 * @see similuml.impl.SimilumlPackageImpl#getTipo_Visibilidad()
		 * @generated
		 */
		EEnum TIPO_VISIBILIDAD = eINSTANCE.getTipo_Visibilidad();

		/**
		 * The meta object literal for the '{@link similuml.Tipo_Predefinido <em>Tipo Predefinido</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see similuml.Tipo_Predefinido
		 * @see similuml.impl.SimilumlPackageImpl#getTipo_Predefinido()
		 * @generated
		 */
		EEnum TIPO_PREDEFINIDO = eINSTANCE.getTipo_Predefinido();

	}

} //SimilumlPackage
