/**
 */
package modularrevisitor.impl;

import modularrevisitor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModularrevisitorFactoryImpl extends EFactoryImpl implements ModularrevisitorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModularrevisitorFactory init() {
		try {
			ModularrevisitorFactory theModularrevisitorFactory = (ModularrevisitorFactory)EPackage.Registry.INSTANCE.getEFactory(ModularrevisitorPackage.eNS_URI);
			if (theModularrevisitorFactory != null) {
				return theModularrevisitorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModularrevisitorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularrevisitorFactoryImpl() {
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
			case ModularrevisitorPackage.FINAL_NODE_ASPECT: return createFinalNode_Aspect();
			case ModularrevisitorPackage.TOKEN: return createToken();
			case ModularrevisitorPackage.BOOLEAN_VALUE_ASPECT: return createBooleanValue_Aspect();
			case ModularrevisitorPackage.VARIABLE_ASPECT: return createVariable_Aspect();
			case ModularrevisitorPackage.INPUT: return createInput();
			case ModularrevisitorPackage.ACTIVITY_NODE_ASPECT: return createActivityNode_Aspect();
			case ModularrevisitorPackage.EXECUTABLE_NODE_ASPECT: return createExecutableNode_Aspect();
			case ModularrevisitorPackage.BOOLEAN_VARIABLE_ASPECT: return createBooleanVariable_Aspect();
			case ModularrevisitorPackage.INTEGER_EXPRESSION_ASPECT: return createIntegerExpression_Aspect();
			case ModularrevisitorPackage.CONTROL_FLOW_ASPECT: return createControlFlow_Aspect();
			case ModularrevisitorPackage.INPUT_VALUE: return createInputValue();
			case ModularrevisitorPackage.ACTIVITY_FINAL_NODE_ASPECT: return createActivityFinalNode_Aspect();
			case ModularrevisitorPackage.CONTROL_NODE_ASPECT: return createControlNode_Aspect();
			case ModularrevisitorPackage.FORK_NODE_ASPECT: return createForkNode_Aspect();
			case ModularrevisitorPackage.JOIN_NODE_ASPECT: return createJoinNode_Aspect();
			case ModularrevisitorPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT: return createIntegerComparisonExpression_Aspect();
			case ModularrevisitorPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT: return createBooleanBinaryExpression_Aspect();
			case ModularrevisitorPackage.OPAQUE_ACTION_ASPECT: return createOpaqueAction_Aspect();
			case ModularrevisitorPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT: return createIntegerCalculationExpression_Aspect();
			case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT: return createIntegerVariable_Aspect();
			case ModularrevisitorPackage.CONTROL_TOKEN: return createControlToken();
			case ModularrevisitorPackage.DECISION_NODE_ASPECT: return createDecisionNode_Aspect();
			case ModularrevisitorPackage.FORKED_TOKEN: return createForkedToken();
			case ModularrevisitorPackage.TRACE: return createTrace();
			case ModularrevisitorPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT: return createBooleanUnaryExpression_Aspect();
			case ModularrevisitorPackage.OFFER: return createOffer();
			case ModularrevisitorPackage.ACTIVITY_ASPECT: return createActivity_Aspect();
			case ModularrevisitorPackage.ACTION_ASPECT: return createAction_Aspect();
			case ModularrevisitorPackage.MERGE_NODE_ASPECT: return createMergeNode_Aspect();
			case ModularrevisitorPackage.BOOLEAN_EXPRESSION_ASPECT: return createBooleanExpression_Aspect();
			case ModularrevisitorPackage.INITIAL_NODE_ASPECT: return createInitialNode_Aspect();
			case ModularrevisitorPackage.INTEGER_VALUE_ASPECT: return createIntegerValue_Aspect();
			case ModularrevisitorPackage.ACTIVITY_EDGE_ASPECT: return createActivityEdge_Aspect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression_Aspect createBooleanExpression_Aspect() {
		BooleanExpression_AspectImpl booleanExpression_Aspect = new BooleanExpression_AspectImpl();
		return booleanExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue_Aspect createBooleanValue_Aspect() {
		BooleanValue_AspectImpl booleanValue_Aspect = new BooleanValue_AspectImpl();
		return booleanValue_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_Aspect createVariable_Aspect() {
		Variable_AspectImpl variable_Aspect = new Variable_AspectImpl();
		return variable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_Aspect createActivity_Aspect() {
		Activity_AspectImpl activity_Aspect = new Activity_AspectImpl();
		return activity_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_Aspect createBooleanVariable_Aspect() {
		BooleanVariable_AspectImpl booleanVariable_Aspect = new BooleanVariable_AspectImpl();
		return booleanVariable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_Aspect createAction_Aspect() {
		Action_AspectImpl action_Aspect = new Action_AspectImpl();
		return action_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow_Aspect createControlFlow_Aspect() {
		ControlFlow_AspectImpl controlFlow_Aspect = new ControlFlow_AspectImpl();
		return controlFlow_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction_Aspect createOpaqueAction_Aspect() {
		OpaqueAction_AspectImpl opaqueAction_Aspect = new OpaqueAction_AspectImpl();
		return opaqueAction_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken createForkedToken() {
		ForkedTokenImpl forkedToken = new ForkedTokenImpl();
		return forkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode_Aspect createFinalNode_Aspect() {
		FinalNode_AspectImpl finalNode_Aspect = new FinalNode_AspectImpl();
		return finalNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_Aspect createActivityEdge_Aspect() {
		ActivityEdge_AspectImpl activityEdge_Aspect = new ActivityEdge_AspectImpl();
		return activityEdge_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode_Aspect createControlNode_Aspect() {
		ControlNode_AspectImpl controlNode_Aspect = new ControlNode_AspectImpl();
		return controlNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression_Aspect createIntegerExpression_Aspect() {
		IntegerExpression_AspectImpl integerExpression_Aspect = new IntegerExpression_AspectImpl();
		return integerExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlToken createControlToken() {
		ControlTokenImpl controlToken = new ControlTokenImpl();
		return controlToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_Aspect createActivityNode_Aspect() {
		ActivityNode_AspectImpl activityNode_Aspect = new ActivityNode_AspectImpl();
		return activityNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode_Aspect createMergeNode_Aspect() {
		MergeNode_AspectImpl mergeNode_Aspect = new MergeNode_AspectImpl();
		return mergeNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode_Aspect createDecisionNode_Aspect() {
		DecisionNode_AspectImpl decisionNode_Aspect = new DecisionNode_AspectImpl();
		return decisionNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode_Aspect createExecutableNode_Aspect() {
		ExecutableNode_AspectImpl executableNode_Aspect = new ExecutableNode_AspectImpl();
		return executableNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode_Aspect createInitialNode_Aspect() {
		InitialNode_AspectImpl initialNode_Aspect = new InitialNode_AspectImpl();
		return initialNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression_Aspect createBooleanBinaryExpression_Aspect() {
		BooleanBinaryExpression_AspectImpl booleanBinaryExpression_Aspect = new BooleanBinaryExpression_AspectImpl();
		return booleanBinaryExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue_Aspect createIntegerValue_Aspect() {
		IntegerValue_AspectImpl integerValue_Aspect = new IntegerValue_AspectImpl();
		return integerValue_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode_Aspect createJoinNode_Aspect() {
		JoinNode_AspectImpl joinNode_Aspect = new JoinNode_AspectImpl();
		return joinNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode_Aspect createActivityFinalNode_Aspect() {
		ActivityFinalNode_AspectImpl activityFinalNode_Aspect = new ActivityFinalNode_AspectImpl();
		return activityFinalNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue createInputValue() {
		InputValueImpl inputValue = new InputValueImpl();
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_Aspect createIntegerVariable_Aspect() {
		IntegerVariable_AspectImpl integerVariable_Aspect = new IntegerVariable_AspectImpl();
		return integerVariable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode_Aspect createForkNode_Aspect() {
		ForkNode_AspectImpl forkNode_Aspect = new ForkNode_AspectImpl();
		return forkNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression_Aspect createBooleanUnaryExpression_Aspect() {
		BooleanUnaryExpression_AspectImpl booleanUnaryExpression_Aspect = new BooleanUnaryExpression_AspectImpl();
		return booleanUnaryExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression_Aspect createIntegerComparisonExpression_Aspect() {
		IntegerComparisonExpression_AspectImpl integerComparisonExpression_Aspect = new IntegerComparisonExpression_AspectImpl();
		return integerComparisonExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression_Aspect createIntegerCalculationExpression_Aspect() {
		IntegerCalculationExpression_AspectImpl integerCalculationExpression_Aspect = new IntegerCalculationExpression_AspectImpl();
		return integerCalculationExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularrevisitorPackage getModularrevisitorPackage() {
		return (ModularrevisitorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModularrevisitorPackage getPackage() {
		return ModularrevisitorPackage.eINSTANCE;
	}

} //ModularrevisitorFactoryImpl
