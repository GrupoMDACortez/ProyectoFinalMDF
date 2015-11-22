/**
 */
package proyectofinalmdf.similuml.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import proyectofinalmdf.similuml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see proyectofinalmdf.similuml.SimilumlPackage
 * @generated
 */
public class SimilumlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimilumlValidator INSTANCE = new SimilumlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "proyectofinalmdf.similuml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimilumlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return SimilumlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case SimilumlPackage.DIAGRAMA_CLASES:
				return validateDiagramaClases((DiagramaClases)value, diagnostics, context);
			case SimilumlPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case SimilumlPackage.CLASE:
				return validateClase((Clase)value, diagnostics, context);
			case SimilumlPackage.ASOCIACION:
				return validateAsociacion((Asociacion)value, diagnostics, context);
			case SimilumlPackage.AGREGACION:
				return validateAgregacion((Agregacion)value, diagnostics, context);
			case SimilumlPackage.RELACION:
				return validateRelacion((Relacion)value, diagnostics, context);
			case SimilumlPackage.COMPOSICION:
				return validateComposicion((Composicion)value, diagnostics, context);
			case SimilumlPackage.OPERACION:
				return validateOperacion((Operacion)value, diagnostics, context);
			case SimilumlPackage.ATRIBUTO:
				return validateAtributo((Atributo)value, diagnostics, context);
			case SimilumlPackage.PARAMETRO:
				return validateParametro((Parametro)value, diagnostics, context);
			case SimilumlPackage.REALIZACION:
				return validateRealizacion((Realizacion)value, diagnostics, context);
			case SimilumlPackage.HERENCIA:
				return validateHerencia((Herencia)value, diagnostics, context);
			case SimilumlPackage.CONSTANTES_INTERFACES:
				return validateConstantesInterfaces((ConstantesInterfaces)value, diagnostics, context);
			case SimilumlPackage.TIPO_PREDEFINIDO_RETORNO:
				return validateTipo_Predefinido_Retorno((Tipo_Predefinido_Retorno)value, diagnostics, context);
			case SimilumlPackage.TIPO_VISIBILIDAD:
				return validateTipo_Visibilidad((Tipo_Visibilidad)value, diagnostics, context);
			case SimilumlPackage.TIPO_PREDEFINIDO:
				return validateTipo_Predefinido((Tipo_Predefinido)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagramaClases(DiagramaClases diagramaClases, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(diagramaClases, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClase(Clase clase, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(clase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClase_clase_distinta_de_alumno(clase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the clase_distinta_de_alumno constraint of '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClase_clase_distinta_de_alumno(Clase clase, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "clase_distinta_de_alumno", getObjectLabel(clase, context) }),
						 new Object[] { clase }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsociacion(Asociacion asociacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(asociacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgregacion(Agregacion agregacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(agregacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelacion(Relacion relacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(relacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposicion(Composicion composicion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(composicion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperacion(Operacion operacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(operacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(atributo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametro(Parametro parametro, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(parametro, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealizacion(Realizacion realizacion, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(realizacion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHerencia(Herencia herencia, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(herencia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantesInterfaces(ConstantesInterfaces constantesInterfaces, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(constantesInterfaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipo_Predefinido_Retorno(Tipo_Predefinido_Retorno tipo_Predefinido_Retorno, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipo_Visibilidad(Tipo_Visibilidad tipo_Visibilidad, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipo_Predefinido(Tipo_Predefinido tipo_Predefinido, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //SimilumlValidator
