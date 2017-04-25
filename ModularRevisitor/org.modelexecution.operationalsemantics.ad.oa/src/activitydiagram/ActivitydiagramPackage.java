/**
 */
package activitydiagram;

import activitydiagramoa.ActivitydiagramoaPackage;

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
 * @see activitydiagram.ActivitydiagramFactory
 * @model kind="package"
 *        annotation="aleParent uri='http://activitydiagramoa/1.0'"
 * @generated
 */
public interface ActivitydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activitydiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramPackage eINSTANCE = activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagram.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.OpaqueAction_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction_Aspect()
	 * @generated
	 */
	int OPAQUE_ACTION_ASPECT = 3;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Variable_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getVariable_Aspect()
	 * @generated
	 */
	int VARIABLE_ASPECT = 17;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.MergeNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode_Aspect()
	 * @generated
	 */
	int MERGE_NODE_ASPECT = 30;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ControlFlow_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow_Aspect()
	 * @generated
	 */
	int CONTROL_FLOW_ASPECT = 14;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.BooleanVariable_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable_Aspect()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASPECT = 24;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.TokenImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 4;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.TraceImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 10;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.DecisionNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode_Aspect()
	 * @generated
	 */
	int DECISION_NODE_ASPECT = 28;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ForkedTokenImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 23;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Action_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getAction_Aspect()
	 * @generated
	 */
	int ACTION_ASPECT = 9;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_NODE_ASPECT = 12;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.JoinNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode_Aspect()
	 * @generated
	 */
	int JOIN_NODE_ASPECT = 1;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ControlNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode_Aspect()
	 * @generated
	 */
	int CONTROL_NODE_ASPECT = 6;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.BooleanBinaryExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT = 13;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InputValueImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 22;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.IntegerComparisonExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression_Aspect()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT = 11;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.IntegerVariable_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable_Aspect()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASPECT = 21;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.Activity_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivity_Aspect()
	 * @generated
	 */
	int ACTIVITY_ASPECT = 8;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.BooleanExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_ASPECT = 2;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.FinalNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode_Aspect()
	 * @generated
	 */
	int FINAL_NODE_ASPECT = 27;


	/**
	 * Returns the meta object for class '{@link activitydiagram.OpaqueAction_Aspect <em>Opaque Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Aspect</em>'.
	 * @see activitydiagram.OpaqueAction_Aspect
	 * @generated
	 */
	EClass getOpaqueAction_Aspect();

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ControlTokenImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 29;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.IntegerCalculationExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression_Aspect()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT = 19;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ExecutableNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode_Aspect()
	 * @generated
	 */
	int EXECUTABLE_NODE_ASPECT = 7;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InitialNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode_Aspect()
	 * @generated
	 */
	int INITIAL_NODE_ASPECT = 5;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.OfferImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 16;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityFinalNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_ASPECT = 18;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.InputImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 15;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.IntegerExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression_Aspect()
	 * @generated
	 */
	int INTEGER_EXPRESSION_ASPECT = 20;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ForkNode_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode_Aspect()
	 * @generated
	 */
	int FORK_NODE_ASPECT = 26;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.BooleanUnaryExpression_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT = 0;

	/**
	 * The meta object id for the '{@link activitydiagram.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagram.impl.ActivityEdge_AspectImpl
	 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge_Aspect()
	 * @generated
	 */
	int ACTIVITY_EDGE_ASPECT = 25;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__ASSIGNEE = ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERAND = ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERATOR = ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__NAME = ActivitydiagramoaPackage.JOIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.JOIN_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.JOIN_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.JOIN_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.JOIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.JOIN_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.JOIN_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT__ASSIGNEE = ActivitydiagramoaPackage.BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The number of structural features of the '<em>Boolean Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__NAME = ActivitydiagramoaPackage.OPAQUE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__OUTGOING = ActivitydiagramoaPackage.OPAQUE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__INCOMING = ActivitydiagramoaPackage.OPAQUE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__ACTIVITY = ActivitydiagramoaPackage.OPAQUE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__EXPRESSIONS = ActivitydiagramoaPackage.OPAQUE_ACTION__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.OPAQUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__RUNNING = ActivitydiagramoaPackage.OPAQUE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.OPAQUE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__NAME = ActivitydiagramoaPackage.INITIAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.INITIAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.INITIAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.INITIAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.INITIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.INITIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.INITIAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__NAME = ActivitydiagramoaPackage.CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__NAME = ActivitydiagramoaPackage.EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NAME = ActivitydiagramoaPackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NODES = ActivitydiagramoaPackage.ACTIVITY__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__EDGES = ActivitydiagramoaPackage.ACTIVITY__EDGES;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__LOCALS = ActivitydiagramoaPackage.ACTIVITY__LOCALS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__INPUTS = ActivitydiagramoaPackage.ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__TRACE = ActivitydiagramoaPackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__NAME = ActivitydiagramoaPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__OUTGOING = ActivitydiagramoaPackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__INCOMING = ActivitydiagramoaPackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__ACTIVITY = ActivitydiagramoaPackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__RUNNING = ActivitydiagramoaPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.ACTION_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND2 = ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND1 = ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__ASSIGNEE = ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERATOR = ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__NAME = ActivitydiagramoaPackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__ASSIGNEE = ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND1 = ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND2 = ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERATOR = ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__NAME = ActivitydiagramoaPackage.CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__SOURCE = ActivitydiagramoaPackage.CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__TARGET = ActivitydiagramoaPackage.CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__GUARD = ActivitydiagramoaPackage.CONTROL_FLOW__GUARD;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__OFFERS = ActivitydiagramoaPackage.CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.CONTROL_FLOW_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__INITIAL_VALUE = ActivitydiagramoaPackage.VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__NAME = ActivitydiagramoaPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__CURRENT_VALUE = ActivitydiagramoaPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__NAME = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND2 = ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND1 = ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__ASSIGNEE = ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERATOR = ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND2 = ActivitydiagramoaPackage.INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND1 = ActivitydiagramoaPackage.INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The number of structural features of the '<em>Integer Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__INITIAL_VALUE = ActivitydiagramoaPackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__NAME = ActivitydiagramoaPackage.INTEGER_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__CURRENT_VALUE = ActivitydiagramoaPackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Holder</b></em>' reference.
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
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__INITIAL_VALUE = ActivitydiagramoaPackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__NAME = ActivitydiagramoaPackage.BOOLEAN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__CURRENT_VALUE = ActivitydiagramoaPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__NAME = ActivitydiagramoaPackage.ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__SOURCE = ActivitydiagramoaPackage.ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__TARGET = ActivitydiagramoaPackage.ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__OFFERS = ActivitydiagramoaPackage.ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__NAME = ActivitydiagramoaPackage.FORK_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.FORK_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.FORK_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.FORK_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.FORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.FORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.FORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__NAME = ActivitydiagramoaPackage.FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__NAME = ActivitydiagramoaPackage.DECISION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.DECISION_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.DECISION_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.DECISION_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.DECISION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.DECISION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.DECISION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
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
	int MERGE_NODE_ASPECT__NAME = ActivitydiagramoaPackage.MERGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__OUTGOING = ActivitydiagramoaPackage.MERGE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__INCOMING = ActivitydiagramoaPackage.MERGE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__ACTIVITY = ActivitydiagramoaPackage.MERGE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__HELD_TOKENS = ActivitydiagramoaPackage.MERGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__RUNNING = ActivitydiagramoaPackage.MERGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT_FEATURE_COUNT = ActivitydiagramoaPackage.MERGE_NODE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link activitydiagram.Variable_Aspect <em>Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Aspect</em>'.
	 * @see activitydiagram.Variable_Aspect
	 * @generated
	 */
	EClass getVariable_Aspect();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.Variable_Aspect#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see activitydiagram.Variable_Aspect#getCurrentValue()
	 * @see #getVariable_Aspect()
	 * @generated
	 */
	EReference getVariable_Aspect_CurrentValue();

	/**
	 * Returns the meta object for class '{@link activitydiagram.MergeNode_Aspect <em>Merge Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Aspect</em>'.
	 * @see activitydiagram.MergeNode_Aspect
	 * @generated
	 */
	EClass getMergeNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ControlFlow_Aspect <em>Control Flow Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Aspect</em>'.
	 * @see activitydiagram.ControlFlow_Aspect
	 * @generated
	 */
	EClass getControlFlow_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.BooleanVariable_Aspect <em>Boolean Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Aspect</em>'.
	 * @see activitydiagram.BooleanVariable_Aspect
	 * @generated
	 */
	EClass getBooleanVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see activitydiagram.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see activitydiagram.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link activitydiagram.BooleanExpression_Aspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Aspect</em>'.
	 * @see activitydiagram.BooleanExpression_Aspect
	 * @generated
	 */
	EClass getBooleanExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.FinalNode_Aspect <em>Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Aspect</em>'.
	 * @see activitydiagram.FinalNode_Aspect
	 * @generated
	 */
	EClass getFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see activitydiagram.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see activitydiagram.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for class '{@link activitydiagram.DecisionNode_Aspect <em>Decision Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Aspect</em>'.
	 * @see activitydiagram.DecisionNode_Aspect
	 * @generated
	 */
	EClass getDecisionNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see activitydiagram.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see activitydiagram.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see activitydiagram.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Action_Aspect <em>Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Aspect</em>'.
	 * @see activitydiagram.Action_Aspect
	 * @generated
	 */
	EClass getAction_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ActivityNode_Aspect <em>Activity Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Aspect</em>'.
	 * @see activitydiagram.ActivityNode_Aspect
	 * @generated
	 */
	EClass getActivityNode_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.ActivityNode_Aspect#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see activitydiagram.ActivityNode_Aspect#getHeldTokens()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EReference getActivityNode_Aspect_HeldTokens();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagram.ActivityNode_Aspect#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see activitydiagram.ActivityNode_Aspect#isRunning()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EAttribute getActivityNode_Aspect_Running();

	/**
	 * Returns the meta object for class '{@link activitydiagram.JoinNode_Aspect <em>Join Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Aspect</em>'.
	 * @see activitydiagram.JoinNode_Aspect
	 * @generated
	 */
	EClass getJoinNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ControlNode_Aspect <em>Control Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Aspect</em>'.
	 * @see activitydiagram.ControlNode_Aspect
	 * @generated
	 */
	EClass getControlNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.BooleanBinaryExpression_Aspect <em>Boolean Binary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Aspect</em>'.
	 * @see activitydiagram.BooleanBinaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanBinaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see activitydiagram.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see activitydiagram.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activitydiagram.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activitydiagram.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link activitydiagram.IntegerComparisonExpression_Aspect <em>Integer Comparison Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Aspect</em>'.
	 * @see activitydiagram.IntegerComparisonExpression_Aspect
	 * @generated
	 */
	EClass getIntegerComparisonExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.IntegerVariable_Aspect <em>Integer Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Aspect</em>'.
	 * @see activitydiagram.IntegerVariable_Aspect
	 * @generated
	 */
	EClass getIntegerVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Activity_Aspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Aspect</em>'.
	 * @see activitydiagram.Activity_Aspect
	 * @generated
	 */
	EClass getActivity_Aspect();

	/**
	 * Returns the meta object for the containment reference '{@link activitydiagram.Activity_Aspect#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see activitydiagram.Activity_Aspect#getTrace()
	 * @see #getActivity_Aspect()
	 * @generated
	 */
	EReference getActivity_Aspect_Trace();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see activitydiagram.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link activitydiagram.IntegerCalculationExpression_Aspect <em>Integer Calculation Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression Aspect</em>'.
	 * @see activitydiagram.IntegerCalculationExpression_Aspect
	 * @generated
	 */
	EClass getIntegerCalculationExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ExecutableNode_Aspect <em>Executable Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node Aspect</em>'.
	 * @see activitydiagram.ExecutableNode_Aspect
	 * @generated
	 */
	EClass getExecutableNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.InitialNode_Aspect <em>Initial Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Aspect</em>'.
	 * @see activitydiagram.InitialNode_Aspect
	 * @generated
	 */
	EClass getInitialNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see activitydiagram.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagram.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagram.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ActivityFinalNode_Aspect <em>Activity Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Aspect</em>'.
	 * @see activitydiagram.ActivityFinalNode_Aspect
	 * @generated
	 */
	EClass getActivityFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see activitydiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see activitydiagram.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link activitydiagram.IntegerExpression_Aspect <em>Integer Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Aspect</em>'.
	 * @see activitydiagram.IntegerExpression_Aspect
	 * @generated
	 */
	EClass getIntegerExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ForkNode_Aspect <em>Fork Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Aspect</em>'.
	 * @see activitydiagram.ForkNode_Aspect
	 * @generated
	 */
	EClass getForkNode_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.BooleanUnaryExpression_Aspect <em>Boolean Unary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Aspect</em>'.
	 * @see activitydiagram.BooleanUnaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanUnaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link activitydiagram.ActivityEdge_Aspect <em>Activity Edge Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Aspect</em>'.
	 * @see activitydiagram.ActivityEdge_Aspect
	 * @generated
	 */
	EClass getActivityEdge_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagram.ActivityEdge_Aspect#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see activitydiagram.ActivityEdge_Aspect#getOffers()
	 * @see #getActivityEdge_Aspect()
	 * @generated
	 */
	EReference getActivityEdge_Aspect_Offers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramFactory getActivitydiagramFactory();

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
		 * The meta object literal for the '{@link activitydiagram.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.OpaqueAction_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction_Aspect()
		 * @generated
		 */
		EClass OPAQUE_ACTION_ASPECT = eINSTANCE.getOpaqueAction_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.Variable_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getVariable_Aspect()
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
		 * The meta object literal for the '{@link activitydiagram.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.MergeNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode_Aspect()
		 * @generated
		 */
		EClass MERGE_NODE_ASPECT = eINSTANCE.getMergeNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ControlFlow_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow_Aspect()
		 * @generated
		 */
		EClass CONTROL_FLOW_ASPECT = eINSTANCE.getControlFlow_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.BooleanVariable_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_ASPECT = eINSTANCE.getBooleanVariable_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.TokenImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.BooleanExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION_ASPECT = eINSTANCE.getBooleanExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.FinalNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode_Aspect()
		 * @generated
		 */
		EClass FINAL_NODE_ASPECT = eINSTANCE.getFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.TraceImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
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
		 * The meta object literal for the '{@link activitydiagram.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.DecisionNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode_Aspect()
		 * @generated
		 */
		EClass DECISION_NODE_ASPECT = eINSTANCE.getDecisionNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ForkedTokenImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
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
		 * The meta object literal for the '{@link activitydiagram.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.Action_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getAction_Aspect()
		 * @generated
		 */
		EClass ACTION_ASPECT = eINSTANCE.getAction_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode_Aspect()
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
		 * The meta object literal for the '{@link activitydiagram.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.JoinNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode_Aspect()
		 * @generated
		 */
		EClass JOIN_NODE_ASPECT = eINSTANCE.getJoinNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ControlNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode_Aspect()
		 * @generated
		 */
		EClass CONTROL_NODE_ASPECT = eINSTANCE.getControlNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.BooleanBinaryExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanBinaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InputValueImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
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
		 * The meta object literal for the '{@link activitydiagram.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.IntegerComparisonExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION_ASPECT = eINSTANCE.getIntegerComparisonExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.IntegerVariable_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable_Aspect()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_ASPECT = eINSTANCE.getIntegerVariable_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.Activity_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivity_Aspect()
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
		 * The meta object literal for the '{@link activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ControlTokenImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.IntegerCalculationExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION_ASPECT = eINSTANCE.getIntegerCalculationExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ExecutableNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode_Aspect()
		 * @generated
		 */
		EClass EXECUTABLE_NODE_ASPECT = eINSTANCE.getExecutableNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InitialNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode_Aspect()
		 * @generated
		 */
		EClass INITIAL_NODE_ASPECT = eINSTANCE.getInitialNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.OfferImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
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
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityFinalNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE_ASPECT = eINSTANCE.getActivityFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.InputImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
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
		 * The meta object literal for the '{@link activitydiagram.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.IntegerExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION_ASPECT = eINSTANCE.getIntegerExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ForkNode_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode_Aspect()
		 * @generated
		 */
		EClass FORK_NODE_ASPECT = eINSTANCE.getForkNode_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.BooleanUnaryExpression_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanUnaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link activitydiagram.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagram.impl.ActivityEdge_AspectImpl
		 * @see activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge_Aspect()
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

	}

} //ActivitydiagramPackage
