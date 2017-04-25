/**
 */
package activitydiagram.util;

import activitydiagram.*;

import activitydiagramoa.Action;
import activitydiagramoa.Activity;
import activitydiagramoa.ActivityEdge;
import activitydiagramoa.ActivityFinalNode;
import activitydiagramoa.ActivityNode;
import activitydiagramoa.BooleanBinaryExpression;
import activitydiagramoa.BooleanExpression;
import activitydiagramoa.BooleanUnaryExpression;
import activitydiagramoa.BooleanVariable;
import activitydiagramoa.ControlFlow;
import activitydiagramoa.ControlNode;
import activitydiagramoa.DecisionNode;
import activitydiagramoa.ExecutableNode;
import activitydiagramoa.Expression;
import activitydiagramoa.FinalNode;
import activitydiagramoa.ForkNode;
import activitydiagramoa.InitialNode;
import activitydiagramoa.IntegerCalculationExpression;
import activitydiagramoa.IntegerComparisonExpression;
import activitydiagramoa.IntegerExpression;
import activitydiagramoa.IntegerVariable;
import activitydiagramoa.JoinNode;
import activitydiagramoa.MergeNode;
import activitydiagramoa.NamedElement;
import activitydiagramoa.OpaqueAction;
import activitydiagramoa.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagram.ActivitydiagramPackage
 * @generated
 */
public class ActivitydiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitydiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActivitydiagramPackage.eINSTANCE;
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
	@Override
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
	protected ActivitydiagramSwitch<Adapter> modelSwitch =
		new ActivitydiagramSwitch<Adapter>() {
			@Override
			public Adapter caseBooleanUnaryExpression_Aspect(BooleanUnaryExpression_Aspect object) {
				return createBooleanUnaryExpression_AspectAdapter();
			}
			@Override
			public Adapter caseJoinNode_Aspect(JoinNode_Aspect object) {
				return createJoinNode_AspectAdapter();
			}
			@Override
			public Adapter caseBooleanExpression_Aspect(BooleanExpression_Aspect object) {
				return createBooleanExpression_AspectAdapter();
			}
			@Override
			public Adapter caseOpaqueAction_Aspect(OpaqueAction_Aspect object) {
				return createOpaqueAction_AspectAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseInitialNode_Aspect(InitialNode_Aspect object) {
				return createInitialNode_AspectAdapter();
			}
			@Override
			public Adapter caseControlNode_Aspect(ControlNode_Aspect object) {
				return createControlNode_AspectAdapter();
			}
			@Override
			public Adapter caseExecutableNode_Aspect(ExecutableNode_Aspect object) {
				return createExecutableNode_AspectAdapter();
			}
			@Override
			public Adapter caseActivity_Aspect(Activity_Aspect object) {
				return createActivity_AspectAdapter();
			}
			@Override
			public Adapter caseAction_Aspect(Action_Aspect object) {
				return createAction_AspectAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression_Aspect(IntegerComparisonExpression_Aspect object) {
				return createIntegerComparisonExpression_AspectAdapter();
			}
			@Override
			public Adapter caseActivityNode_Aspect(ActivityNode_Aspect object) {
				return createActivityNode_AspectAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression_Aspect(BooleanBinaryExpression_Aspect object) {
				return createBooleanBinaryExpression_AspectAdapter();
			}
			@Override
			public Adapter caseControlFlow_Aspect(ControlFlow_Aspect object) {
				return createControlFlow_AspectAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
			}
			@Override
			public Adapter caseVariable_Aspect(Variable_Aspect object) {
				return createVariable_AspectAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode_Aspect(ActivityFinalNode_Aspect object) {
				return createActivityFinalNode_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression_Aspect(IntegerCalculationExpression_Aspect object) {
				return createIntegerCalculationExpression_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerExpression_Aspect(IntegerExpression_Aspect object) {
				return createIntegerExpression_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerVariable_Aspect(IntegerVariable_Aspect object) {
				return createIntegerVariable_AspectAdapter();
			}
			@Override
			public Adapter caseInputValue(InputValue object) {
				return createInputValueAdapter();
			}
			@Override
			public Adapter caseForkedToken(ForkedToken object) {
				return createForkedTokenAdapter();
			}
			@Override
			public Adapter caseBooleanVariable_Aspect(BooleanVariable_Aspect object) {
				return createBooleanVariable_AspectAdapter();
			}
			@Override
			public Adapter caseActivityEdge_Aspect(ActivityEdge_Aspect object) {
				return createActivityEdge_AspectAdapter();
			}
			@Override
			public Adapter caseForkNode_Aspect(ForkNode_Aspect object) {
				return createForkNode_AspectAdapter();
			}
			@Override
			public Adapter caseFinalNode_Aspect(FinalNode_Aspect object) {
				return createFinalNode_AspectAdapter();
			}
			@Override
			public Adapter caseDecisionNode_Aspect(DecisionNode_Aspect object) {
				return createDecisionNode_AspectAdapter();
			}
			@Override
			public Adapter caseControlToken(ControlToken object) {
				return createControlTokenAdapter();
			}
			@Override
			public Adapter caseMergeNode_Aspect(MergeNode_Aspect object) {
				return createMergeNode_AspectAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression(BooleanUnaryExpression object) {
				return createBooleanUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object) {
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseOpaqueAction(OpaqueAction object) {
				return createOpaqueActionAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression(IntegerComparisonExpression object) {
				return createIntegerComparisonExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression(BooleanBinaryExpression object) {
				return createBooleanBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseActivityEdge(ActivityEdge object) {
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseFinalNode(FinalNode object) {
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode(ActivityFinalNode object) {
				return createActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression(IntegerCalculationExpression object) {
				return createIntegerCalculationExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.OpaqueAction_Aspect <em>Opaque Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.OpaqueAction_Aspect
	 * @generated
	 */
	public Adapter createOpaqueAction_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Variable_Aspect <em>Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Variable_Aspect
	 * @generated
	 */
	public Adapter createVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.MergeNode_Aspect <em>Merge Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.MergeNode_Aspect
	 * @generated
	 */
	public Adapter createMergeNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ControlFlow_Aspect <em>Control Flow Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ControlFlow_Aspect
	 * @generated
	 */
	public Adapter createControlFlow_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanVariable_Aspect <em>Boolean Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanVariable_Aspect
	 * @generated
	 */
	public Adapter createBooleanVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanExpression_Aspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.FinalNode_Aspect <em>Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.FinalNode_Aspect
	 * @generated
	 */
	public Adapter createFinalNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.DecisionNode_Aspect <em>Decision Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.DecisionNode_Aspect
	 * @generated
	 */
	public Adapter createDecisionNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ForkedToken
	 * @generated
	 */
	public Adapter createForkedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Action_Aspect <em>Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Action_Aspect
	 * @generated
	 */
	public Adapter createAction_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ActivityNode_Aspect <em>Activity Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ActivityNode_Aspect
	 * @generated
	 */
	public Adapter createActivityNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.JoinNode_Aspect <em>Join Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.JoinNode_Aspect
	 * @generated
	 */
	public Adapter createJoinNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ControlNode_Aspect <em>Control Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ControlNode_Aspect
	 * @generated
	 */
	public Adapter createControlNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanBinaryExpression_Aspect <em>Boolean Binary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanBinaryExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanBinaryExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.InputValue
	 * @generated
	 */
	public Adapter createInputValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerComparisonExpression_Aspect <em>Integer Comparison Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerComparisonExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerComparisonExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerVariable_Aspect <em>Integer Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerVariable_Aspect
	 * @generated
	 */
	public Adapter createIntegerVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Activity_Aspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Activity_Aspect
	 * @generated
	 */
	public Adapter createActivity_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ControlToken
	 * @generated
	 */
	public Adapter createControlTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerCalculationExpression_Aspect <em>Integer Calculation Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerCalculationExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerCalculationExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ExecutableNode_Aspect <em>Executable Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ExecutableNode_Aspect
	 * @generated
	 */
	public Adapter createExecutableNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.InitialNode_Aspect <em>Initial Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.InitialNode_Aspect
	 * @generated
	 */
	public Adapter createInitialNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ActivityFinalNode_Aspect <em>Activity Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ActivityFinalNode_Aspect
	 * @generated
	 */
	public Adapter createActivityFinalNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.IntegerExpression_Aspect <em>Integer Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.IntegerExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ForkNode_Aspect <em>Fork Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ForkNode_Aspect
	 * @generated
	 */
	public Adapter createForkNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.BooleanUnaryExpression_Aspect <em>Boolean Unary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.BooleanUnaryExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanUnaryExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagram.ActivityEdge_Aspect <em>Activity Edge Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagram.ActivityEdge_Aspect
	 * @generated
	 */
	public Adapter createActivityEdge_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.OpaqueAction
	 * @generated
	 */
	public Adapter createOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.IntegerCalculationExpression
	 * @generated
	 */
	public Adapter createIntegerCalculationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.BooleanBinaryExpression
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.BooleanUnaryExpression
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.IntegerComparisonExpression
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link activitydiagramoa.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see activitydiagramoa.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
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

} //ActivitydiagramAdapterFactory
