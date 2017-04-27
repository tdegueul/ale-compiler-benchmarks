/**
 */
package modularrevisitor;

import admodular.AdmodularPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modularrevisitor.ModularrevisitorFactory
 * @model kind="package"
 *        annotation="aleParent uri='http://activitydiagramoa/1.0'"
 * @generated
 */
public interface ModularrevisitorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modularrevisitor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modularrevisitor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modularrevisitor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularrevisitorPackage eINSTANCE = modularrevisitor.impl.ModularrevisitorPackageImpl.init();

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.OfferImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 25;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.InputImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 4;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.BooleanExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_ASPECT = 29;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.BooleanValue_AspectImpl <em>Boolean Value Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.BooleanValue_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanValue_Aspect()
	 * @generated
	 */
	int BOOLEAN_VALUE_ASPECT = 2;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.Variable_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getVariable_Aspect()
	 * @generated
	 */
	int VARIABLE_ASPECT = 3;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.TokenImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 1;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.Activity_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivity_Aspect()
	 * @generated
	 */
	int ACTIVITY_ASPECT = 26;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.BooleanVariable_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanVariable_Aspect()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASPECT = 7;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.Action_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getAction_Aspect()
	 * @generated
	 */
	int ACTION_ASPECT = 27;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.TraceImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 23;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ControlFlow_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlFlow_Aspect()
	 * @generated
	 */
	int CONTROL_FLOW_ASPECT = 9;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.OpaqueAction_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getOpaqueAction_Aspect()
	 * @generated
	 */
	int OPAQUE_ACTION_ASPECT = 17;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ForkedTokenImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 22;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.FinalNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getFinalNode_Aspect()
	 * @generated
	 */
	int FINAL_NODE_ASPECT = 0;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ActivityEdge_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityEdge_Aspect()
	 * @generated
	 */
	int ACTIVITY_EDGE_ASPECT = 32;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ControlNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlNode_Aspect()
	 * @generated
	 */
	int CONTROL_NODE_ASPECT = 12;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.IntegerExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerExpression_Aspect()
	 * @generated
	 */
	int INTEGER_EXPRESSION_ASPECT = 8;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ControlTokenImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 20;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ActivityNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_NODE_ASPECT = 5;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.MergeNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getMergeNode_Aspect()
	 * @generated
	 */
	int MERGE_NODE_ASPECT = 28;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.DecisionNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getDecisionNode_Aspect()
	 * @generated
	 */
	int DECISION_NODE_ASPECT = 21;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ExecutableNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getExecutableNode_Aspect()
	 * @generated
	 */
	int EXECUTABLE_NODE_ASPECT = 6;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.InitialNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInitialNode_Aspect()
	 * @generated
	 */
	int INITIAL_NODE_ASPECT = 30;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.BooleanBinaryExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanBinaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT = 16;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.IntegerValue_AspectImpl <em>Integer Value Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.IntegerValue_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerValue_Aspect()
	 * @generated
	 */
	int INTEGER_VALUE_ASPECT = 31;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.JoinNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getJoinNode_Aspect()
	 * @generated
	 */
	int JOIN_NODE_ASPECT = 14;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ActivityFinalNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityFinalNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_ASPECT = 11;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.InputValueImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 10;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.IntegerVariable_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerVariable_Aspect()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASPECT = 19;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.ForkNode_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getForkNode_Aspect()
	 * @generated
	 */
	int FORK_NODE_ASPECT = 13;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.BooleanUnaryExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanUnaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT = 24;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.IntegerComparisonExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerComparisonExpression_Aspect()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT = 15;

	/**
	 * The meta object id for the '{@link modularrevisitor.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modularrevisitor.impl.IntegerCalculationExpression_AspectImpl
	 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerCalculationExpression_Aspect()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__NAME = AdmodularPackage.FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__OUTGOING = AdmodularPackage.FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__INCOMING = AdmodularPackage.FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__ACTIVITY = AdmodularPackage.FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__RUNNING = AdmodularPackage.FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_ASPECT__VALUE = AdmodularPackage.BOOLEAN_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Value Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_ASPECT_FEATURE_COUNT = AdmodularPackage.BOOLEAN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__INITIAL_VALUE = AdmodularPackage.VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__NAME = AdmodularPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__CURRENT_VALUE = AdmodularPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT_FEATURE_COUNT = AdmodularPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__NAME = AdmodularPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__OUTGOING = AdmodularPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__INCOMING = AdmodularPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__ACTIVITY = AdmodularPackage.ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__RUNNING = AdmodularPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__NAME = AdmodularPackage.EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__OUTGOING = AdmodularPackage.EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__INCOMING = AdmodularPackage.EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__ACTIVITY = AdmodularPackage.EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__RUNNING = AdmodularPackage.EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__INITIAL_VALUE = AdmodularPackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__NAME = AdmodularPackage.BOOLEAN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__CURRENT_VALUE = AdmodularPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT_FEATURE_COUNT = AdmodularPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND2 = AdmodularPackage.INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND1 = AdmodularPackage.INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The number of structural features of the '<em>Integer Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__NAME = AdmodularPackage.CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__SOURCE = AdmodularPackage.CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__TARGET = AdmodularPackage.CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__GUARD = AdmodularPackage.CONTROL_FLOW__GUARD;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__OFFERS = AdmodularPackage.CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT_FEATURE_COUNT = AdmodularPackage.CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__NAME = AdmodularPackage.ACTIVITY_FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__OUTGOING = AdmodularPackage.ACTIVITY_FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__INCOMING = AdmodularPackage.ACTIVITY_FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__ACTIVITY = AdmodularPackage.ACTIVITY_FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__RUNNING = AdmodularPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__NAME = AdmodularPackage.CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__OUTGOING = AdmodularPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__INCOMING = AdmodularPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__ACTIVITY = AdmodularPackage.CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__RUNNING = AdmodularPackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__NAME = AdmodularPackage.FORK_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__OUTGOING = AdmodularPackage.FORK_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__INCOMING = AdmodularPackage.FORK_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__ACTIVITY = AdmodularPackage.FORK_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.FORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__RUNNING = AdmodularPackage.FORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.FORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__NAME = AdmodularPackage.JOIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__OUTGOING = AdmodularPackage.JOIN_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__INCOMING = AdmodularPackage.JOIN_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__ACTIVITY = AdmodularPackage.JOIN_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.JOIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__RUNNING = AdmodularPackage.JOIN_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.JOIN_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND2 = AdmodularPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND1 = AdmodularPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__ASSIGNEE = AdmodularPackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERATOR = AdmodularPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__ASSIGNEE = AdmodularPackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND1 = AdmodularPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND2 = AdmodularPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERATOR = AdmodularPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__NAME = AdmodularPackage.OPAQUE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__OUTGOING = AdmodularPackage.OPAQUE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__INCOMING = AdmodularPackage.OPAQUE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__ACTIVITY = AdmodularPackage.OPAQUE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__EXPRESSIONS = AdmodularPackage.OPAQUE_ACTION__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__HELD_TOKENS = AdmodularPackage.OPAQUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__RUNNING = AdmodularPackage.OPAQUE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT_FEATURE_COUNT = AdmodularPackage.OPAQUE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND2 = AdmodularPackage.INTEGER_CALCULATION_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND1 = AdmodularPackage.INTEGER_CALCULATION_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__ASSIGNEE = AdmodularPackage.INTEGER_CALCULATION_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERATOR = AdmodularPackage.INTEGER_CALCULATION_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__INITIAL_VALUE = AdmodularPackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__NAME = AdmodularPackage.INTEGER_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__CURRENT_VALUE = AdmodularPackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT_FEATURE_COUNT = AdmodularPackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__NAME = AdmodularPackage.DECISION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__OUTGOING = AdmodularPackage.DECISION_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__INCOMING = AdmodularPackage.DECISION_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__ACTIVITY = AdmodularPackage.DECISION_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.DECISION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__RUNNING = AdmodularPackage.DECISION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.DECISION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__REMAINING_OFFERS_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EXECUTED_NODES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__ASSIGNEE = AdmodularPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERAND = AdmodularPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERATOR = AdmodularPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFERED_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NAME = AdmodularPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NODES = AdmodularPackage.ACTIVITY__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__EDGES = AdmodularPackage.ACTIVITY__EDGES;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__LOCALS = AdmodularPackage.ACTIVITY__LOCALS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__INPUTS = AdmodularPackage.ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__TRACE = AdmodularPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT_FEATURE_COUNT = AdmodularPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__NAME = AdmodularPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__OUTGOING = AdmodularPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__INCOMING = AdmodularPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__ACTIVITY = AdmodularPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__HELD_TOKENS = AdmodularPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__RUNNING = AdmodularPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT_FEATURE_COUNT = AdmodularPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__NAME = AdmodularPackage.MERGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__OUTGOING = AdmodularPackage.MERGE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__INCOMING = AdmodularPackage.MERGE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__ACTIVITY = AdmodularPackage.MERGE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.MERGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__RUNNING = AdmodularPackage.MERGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.MERGE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT__ASSIGNEE = AdmodularPackage.BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The number of structural features of the '<em>Boolean Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT = AdmodularPackage.BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__NAME = AdmodularPackage.INITIAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__OUTGOING = AdmodularPackage.INITIAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__INCOMING = AdmodularPackage.INITIAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__ACTIVITY = AdmodularPackage.INITIAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__HELD_TOKENS = AdmodularPackage.INITIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__RUNNING = AdmodularPackage.INITIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT_FEATURE_COUNT = AdmodularPackage.INITIAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_ASPECT__VALUE = AdmodularPackage.INTEGER_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Integer Value Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_ASPECT_FEATURE_COUNT = AdmodularPackage.INTEGER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__NAME = AdmodularPackage.ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__SOURCE = AdmodularPackage.ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__TARGET = AdmodularPackage.ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__OFFERS = AdmodularPackage.ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT_FEATURE_COUNT = AdmodularPackage.ACTIVITY_EDGE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link modularrevisitor.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see modularrevisitor.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the reference list '{@link modularrevisitor.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see modularrevisitor.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see modularrevisitor.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link modularrevisitor.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see modularrevisitor.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.BooleanExpression_Aspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Aspect</em>'.
	 * @see modularrevisitor.BooleanExpression_Aspect
	 * @generated
	 */
	EClass getBooleanExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.BooleanValue_Aspect <em>Boolean Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Aspect</em>'.
	 * @see modularrevisitor.BooleanValue_Aspect
	 * @generated
	 */
	EClass getBooleanValue_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Variable_Aspect <em>Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Aspect</em>'.
	 * @see modularrevisitor.Variable_Aspect
	 * @generated
	 */
	EClass getVariable_Aspect();

	/**
	 * Returns the meta object for the reference '{@link modularrevisitor.Variable_Aspect#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see modularrevisitor.Variable_Aspect#getCurrentValue()
	 * @see #getVariable_Aspect()
	 * @generated
	 */
	EReference getVariable_Aspect_CurrentValue();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see modularrevisitor.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the container reference '{@link modularrevisitor.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Holder</em>'.
	 * @see modularrevisitor.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Activity_Aspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Aspect</em>'.
	 * @see modularrevisitor.Activity_Aspect
	 * @generated
	 */
	EClass getActivity_Aspect();

	/**
	 * Returns the meta object for the containment reference '{@link modularrevisitor.Activity_Aspect#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see modularrevisitor.Activity_Aspect#getTrace()
	 * @see #getActivity_Aspect()
	 * @generated
	 */
	EReference getActivity_Aspect_Trace();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.BooleanVariable_Aspect <em>Boolean Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Aspect</em>'.
	 * @see modularrevisitor.BooleanVariable_Aspect
	 * @generated
	 */
	EClass getBooleanVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Action_Aspect <em>Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Aspect</em>'.
	 * @see modularrevisitor.Action_Aspect
	 * @generated
	 */
	EClass getAction_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see modularrevisitor.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link modularrevisitor.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see modularrevisitor.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ControlFlow_Aspect <em>Control Flow Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Aspect</em>'.
	 * @see modularrevisitor.ControlFlow_Aspect
	 * @generated
	 */
	EClass getControlFlow_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.OpaqueAction_Aspect <em>Opaque Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Aspect</em>'.
	 * @see modularrevisitor.OpaqueAction_Aspect
	 * @generated
	 */
	EClass getOpaqueAction_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see modularrevisitor.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link modularrevisitor.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see modularrevisitor.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link modularrevisitor.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see modularrevisitor.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.FinalNode_Aspect <em>Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Aspect</em>'.
	 * @see modularrevisitor.FinalNode_Aspect
	 * @generated
	 */
	EClass getFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ActivityEdge_Aspect <em>Activity Edge Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Aspect</em>'.
	 * @see modularrevisitor.ActivityEdge_Aspect
	 * @generated
	 */
	EClass getActivityEdge_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link modularrevisitor.ActivityEdge_Aspect#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see modularrevisitor.ActivityEdge_Aspect#getOffers()
	 * @see #getActivityEdge_Aspect()
	 * @generated
	 */
	EReference getActivityEdge_Aspect_Offers();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ControlNode_Aspect <em>Control Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Aspect</em>'.
	 * @see modularrevisitor.ControlNode_Aspect
	 * @generated
	 */
	EClass getControlNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.IntegerExpression_Aspect <em>Integer Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Aspect</em>'.
	 * @see modularrevisitor.IntegerExpression_Aspect
	 * @generated
	 */
	EClass getIntegerExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see modularrevisitor.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ActivityNode_Aspect <em>Activity Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Aspect</em>'.
	 * @see modularrevisitor.ActivityNode_Aspect
	 * @generated
	 */
	EClass getActivityNode_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link modularrevisitor.ActivityNode_Aspect#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see modularrevisitor.ActivityNode_Aspect#getHeldTokens()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EReference getActivityNode_Aspect_HeldTokens();

	/**
	 * Returns the meta object for the attribute '{@link modularrevisitor.ActivityNode_Aspect#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see modularrevisitor.ActivityNode_Aspect#isRunning()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EAttribute getActivityNode_Aspect_Running();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.MergeNode_Aspect <em>Merge Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Aspect</em>'.
	 * @see modularrevisitor.MergeNode_Aspect
	 * @generated
	 */
	EClass getMergeNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.DecisionNode_Aspect <em>Decision Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Aspect</em>'.
	 * @see modularrevisitor.DecisionNode_Aspect
	 * @generated
	 */
	EClass getDecisionNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ExecutableNode_Aspect <em>Executable Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node Aspect</em>'.
	 * @see modularrevisitor.ExecutableNode_Aspect
	 * @generated
	 */
	EClass getExecutableNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.InitialNode_Aspect <em>Initial Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Aspect</em>'.
	 * @see modularrevisitor.InitialNode_Aspect
	 * @generated
	 */
	EClass getInitialNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.BooleanBinaryExpression_Aspect <em>Boolean Binary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Aspect</em>'.
	 * @see modularrevisitor.BooleanBinaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanBinaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.IntegerValue_Aspect <em>Integer Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Aspect</em>'.
	 * @see modularrevisitor.IntegerValue_Aspect
	 * @generated
	 */
	EClass getIntegerValue_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.JoinNode_Aspect <em>Join Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Aspect</em>'.
	 * @see modularrevisitor.JoinNode_Aspect
	 * @generated
	 */
	EClass getJoinNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ActivityFinalNode_Aspect <em>Activity Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Aspect</em>'.
	 * @see modularrevisitor.ActivityFinalNode_Aspect
	 * @generated
	 */
	EClass getActivityFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see modularrevisitor.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link modularrevisitor.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see modularrevisitor.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link modularrevisitor.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see modularrevisitor.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.IntegerVariable_Aspect <em>Integer Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Aspect</em>'.
	 * @see modularrevisitor.IntegerVariable_Aspect
	 * @generated
	 */
	EClass getIntegerVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.ForkNode_Aspect <em>Fork Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Aspect</em>'.
	 * @see modularrevisitor.ForkNode_Aspect
	 * @generated
	 */
	EClass getForkNode_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.BooleanUnaryExpression_Aspect <em>Boolean Unary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Aspect</em>'.
	 * @see modularrevisitor.BooleanUnaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanUnaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.IntegerComparisonExpression_Aspect <em>Integer Comparison Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Aspect</em>'.
	 * @see modularrevisitor.IntegerComparisonExpression_Aspect
	 * @generated
	 */
	EClass getIntegerComparisonExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link modularrevisitor.IntegerCalculationExpression_Aspect <em>Integer Calculation Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression Aspect</em>'.
	 * @see modularrevisitor.IntegerCalculationExpression_Aspect
	 * @generated
	 */
	EClass getIntegerCalculationExpression_Aspect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModularrevisitorFactory getModularrevisitorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.OfferImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__OFFERED_TOKENS = eINSTANCE.getOffer_OfferedTokens();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.InputImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_VALUES = eINSTANCE.getInput_InputValues();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.BooleanExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION_ASPECT = eINSTANCE.getBooleanExpression_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.BooleanValue_AspectImpl <em>Boolean Value Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.BooleanValue_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanValue_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_ASPECT = eINSTANCE.getBooleanValue_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.Variable_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getVariable_Aspect()
		 * @generated
		 */
		EClass VARIABLE_ASPECT = eINSTANCE.getVariable_Aspect();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASPECT__CURRENT_VALUE = eINSTANCE.getVariable_Aspect_CurrentValue();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.TokenImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.Activity_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivity_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_ASPECT = eINSTANCE.getActivity_Aspect();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ASPECT__TRACE = eINSTANCE.getActivity_Aspect_Trace();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.BooleanVariable_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanVariable_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_ASPECT = eINSTANCE.getBooleanVariable_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.Action_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getAction_Aspect()
		 * @generated
		 */
		EClass ACTION_ASPECT = eINSTANCE.getAction_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.TraceImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EXECUTED_NODES = eINSTANCE.getTrace_ExecutedNodes();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ControlFlow_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlFlow_Aspect()
		 * @generated
		 */
		EClass CONTROL_FLOW_ASPECT = eINSTANCE.getControlFlow_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.OpaqueAction_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getOpaqueAction_Aspect()
		 * @generated
		 */
		EClass OPAQUE_ACTION_ASPECT = eINSTANCE.getOpaqueAction_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ForkedTokenImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getForkedToken_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_RemainingOffersCount();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.FinalNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getFinalNode_Aspect()
		 * @generated
		 */
		EClass FINAL_NODE_ASPECT = eINSTANCE.getFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ActivityEdge_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityEdge_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_ASPECT = eINSTANCE.getActivityEdge_Aspect();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_ASPECT__OFFERS = eINSTANCE.getActivityEdge_Aspect_Offers();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ControlNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlNode_Aspect()
		 * @generated
		 */
		EClass CONTROL_NODE_ASPECT = eINSTANCE.getControlNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.IntegerExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION_ASPECT = eINSTANCE.getIntegerExpression_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ControlTokenImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ActivityNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityNode_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ASPECT = eINSTANCE.getActivityNode_Aspect();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ASPECT__HELD_TOKENS = eINSTANCE.getActivityNode_Aspect_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ASPECT__RUNNING = eINSTANCE.getActivityNode_Aspect_Running();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.MergeNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getMergeNode_Aspect()
		 * @generated
		 */
		EClass MERGE_NODE_ASPECT = eINSTANCE.getMergeNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.DecisionNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getDecisionNode_Aspect()
		 * @generated
		 */
		EClass DECISION_NODE_ASPECT = eINSTANCE.getDecisionNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ExecutableNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getExecutableNode_Aspect()
		 * @generated
		 */
		EClass EXECUTABLE_NODE_ASPECT = eINSTANCE.getExecutableNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.InitialNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInitialNode_Aspect()
		 * @generated
		 */
		EClass INITIAL_NODE_ASPECT = eINSTANCE.getInitialNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.BooleanBinaryExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanBinaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanBinaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.IntegerValue_AspectImpl <em>Integer Value Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.IntegerValue_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerValue_Aspect()
		 * @generated
		 */
		EClass INTEGER_VALUE_ASPECT = eINSTANCE.getIntegerValue_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.JoinNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getJoinNode_Aspect()
		 * @generated
		 */
		EClass JOIN_NODE_ASPECT = eINSTANCE.getJoinNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ActivityFinalNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getActivityFinalNode_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE_ASPECT = eINSTANCE.getActivityFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.InputValueImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VALUE = eINSTANCE.getInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VARIABLE = eINSTANCE.getInputValue_Variable();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.IntegerVariable_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerVariable_Aspect()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_ASPECT = eINSTANCE.getIntegerVariable_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.ForkNode_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getForkNode_Aspect()
		 * @generated
		 */
		EClass FORK_NODE_ASPECT = eINSTANCE.getForkNode_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.BooleanUnaryExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getBooleanUnaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanUnaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.IntegerComparisonExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerComparisonExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION_ASPECT = eINSTANCE.getIntegerComparisonExpression_Aspect();

		/**
		 * The meta object literal for the '{@link modularrevisitor.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modularrevisitor.impl.IntegerCalculationExpression_AspectImpl
		 * @see modularrevisitor.impl.ModularrevisitorPackageImpl#getIntegerCalculationExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION_ASPECT = eINSTANCE.getIntegerCalculationExpression_Aspect();

	}

} //ModularrevisitorPackage
