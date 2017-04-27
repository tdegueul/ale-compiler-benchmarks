/**
 */
package modularrevisitor.util;

import admodular.Action;
import admodular.Activity;
import admodular.ActivityEdge;
import admodular.ActivityFinalNode;
import admodular.ActivityNode;
import admodular.BooleanBinaryExpression;
import admodular.BooleanExpression;
import admodular.BooleanUnaryExpression;
import admodular.BooleanValue;
import admodular.BooleanVariable;
import admodular.ControlFlow;
import admodular.ControlNode;
import admodular.DecisionNode;
import admodular.ExecutableNode;
import admodular.Expression;
import admodular.FinalNode;
import admodular.ForkNode;
import admodular.InitialNode;
import admodular.IntegerCalculationExpression;
import admodular.IntegerComparisonExpression;
import admodular.IntegerExpression;
import admodular.IntegerValue;
import admodular.IntegerVariable;
import admodular.JoinNode;
import admodular.MergeNode;
import admodular.NamedElement;
import admodular.OpaqueAction;
import admodular.Value;
import admodular.Variable;

import modularrevisitor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modularrevisitor.ModularrevisitorPackage
 * @generated
 */
public class ModularrevisitorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularrevisitorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularrevisitorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModularrevisitorPackage.eINSTANCE;
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
	protected ModularrevisitorSwitch<Adapter> modelSwitch =
		new ModularrevisitorSwitch<Adapter>() {
			@Override
			public Adapter caseFinalNode_Aspect(FinalNode_Aspect object) {
				return createFinalNode_AspectAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseBooleanValue_Aspect(BooleanValue_Aspect object) {
				return createBooleanValue_AspectAdapter();
			}
			@Override
			public Adapter caseVariable_Aspect(Variable_Aspect object) {
				return createVariable_AspectAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseActivityNode_Aspect(ActivityNode_Aspect object) {
				return createActivityNode_AspectAdapter();
			}
			@Override
			public Adapter caseExecutableNode_Aspect(ExecutableNode_Aspect object) {
				return createExecutableNode_AspectAdapter();
			}
			@Override
			public Adapter caseBooleanVariable_Aspect(BooleanVariable_Aspect object) {
				return createBooleanVariable_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerExpression_Aspect(IntegerExpression_Aspect object) {
				return createIntegerExpression_AspectAdapter();
			}
			@Override
			public Adapter caseControlFlow_Aspect(ControlFlow_Aspect object) {
				return createControlFlow_AspectAdapter();
			}
			@Override
			public Adapter caseInputValue(InputValue object) {
				return createInputValueAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode_Aspect(ActivityFinalNode_Aspect object) {
				return createActivityFinalNode_AspectAdapter();
			}
			@Override
			public Adapter caseControlNode_Aspect(ControlNode_Aspect object) {
				return createControlNode_AspectAdapter();
			}
			@Override
			public Adapter caseForkNode_Aspect(ForkNode_Aspect object) {
				return createForkNode_AspectAdapter();
			}
			@Override
			public Adapter caseJoinNode_Aspect(JoinNode_Aspect object) {
				return createJoinNode_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression_Aspect(IntegerComparisonExpression_Aspect object) {
				return createIntegerComparisonExpression_AspectAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression_Aspect(BooleanBinaryExpression_Aspect object) {
				return createBooleanBinaryExpression_AspectAdapter();
			}
			@Override
			public Adapter caseOpaqueAction_Aspect(OpaqueAction_Aspect object) {
				return createOpaqueAction_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerCalculationExpression_Aspect(IntegerCalculationExpression_Aspect object) {
				return createIntegerCalculationExpression_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerVariable_Aspect(IntegerVariable_Aspect object) {
				return createIntegerVariable_AspectAdapter();
			}
			@Override
			public Adapter caseControlToken(ControlToken object) {
				return createControlTokenAdapter();
			}
			@Override
			public Adapter caseDecisionNode_Aspect(DecisionNode_Aspect object) {
				return createDecisionNode_AspectAdapter();
			}
			@Override
			public Adapter caseForkedToken(ForkedToken object) {
				return createForkedTokenAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression_Aspect(BooleanUnaryExpression_Aspect object) {
				return createBooleanUnaryExpression_AspectAdapter();
			}
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
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
			public Adapter caseMergeNode_Aspect(MergeNode_Aspect object) {
				return createMergeNode_AspectAdapter();
			}
			@Override
			public Adapter caseBooleanExpression_Aspect(BooleanExpression_Aspect object) {
				return createBooleanExpression_AspectAdapter();
			}
			@Override
			public Adapter caseInitialNode_Aspect(InitialNode_Aspect object) {
				return createInitialNode_AspectAdapter();
			}
			@Override
			public Adapter caseIntegerValue_Aspect(IntegerValue_Aspect object) {
				return createIntegerValue_AspectAdapter();
			}
			@Override
			public Adapter caseActivityEdge_Aspect(ActivityEdge_Aspect object) {
				return createActivityEdge_AspectAdapter();
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
			public Adapter caseFinalNode(FinalNode object) {
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
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
			public Adapter caseActivityFinalNode(ActivityFinalNode object) {
				return createActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseIntegerComparisonExpression(IntegerComparisonExpression object) {
				return createIntegerComparisonExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression(BooleanBinaryExpression object) {
				return createBooleanBinaryExpressionAdapter();
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
			public Adapter caseIntegerCalculationExpression(IntegerCalculationExpression object) {
				return createIntegerCalculationExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseBooleanUnaryExpression(BooleanUnaryExpression object) {
				return createBooleanUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.BooleanExpression_Aspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.BooleanExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.BooleanValue_Aspect <em>Boolean Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.BooleanValue_Aspect
	 * @generated
	 */
	public Adapter createBooleanValue_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Variable_Aspect <em>Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Variable_Aspect
	 * @generated
	 */
	public Adapter createVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Activity_Aspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Activity_Aspect
	 * @generated
	 */
	public Adapter createActivity_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.BooleanVariable_Aspect <em>Boolean Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.BooleanVariable_Aspect
	 * @generated
	 */
	public Adapter createBooleanVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Action_Aspect <em>Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Action_Aspect
	 * @generated
	 */
	public Adapter createAction_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ControlFlow_Aspect <em>Control Flow Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ControlFlow_Aspect
	 * @generated
	 */
	public Adapter createControlFlow_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.OpaqueAction_Aspect <em>Opaque Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.OpaqueAction_Aspect
	 * @generated
	 */
	public Adapter createOpaqueAction_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ForkedToken
	 * @generated
	 */
	public Adapter createForkedTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.FinalNode_Aspect <em>Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.FinalNode_Aspect
	 * @generated
	 */
	public Adapter createFinalNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ActivityEdge_Aspect <em>Activity Edge Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ActivityEdge_Aspect
	 * @generated
	 */
	public Adapter createActivityEdge_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ControlNode_Aspect <em>Control Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ControlNode_Aspect
	 * @generated
	 */
	public Adapter createControlNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.IntegerExpression_Aspect <em>Integer Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.IntegerExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ControlToken
	 * @generated
	 */
	public Adapter createControlTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ActivityNode_Aspect <em>Activity Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ActivityNode_Aspect
	 * @generated
	 */
	public Adapter createActivityNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.MergeNode_Aspect <em>Merge Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.MergeNode_Aspect
	 * @generated
	 */
	public Adapter createMergeNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.DecisionNode_Aspect <em>Decision Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.DecisionNode_Aspect
	 * @generated
	 */
	public Adapter createDecisionNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ExecutableNode_Aspect <em>Executable Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ExecutableNode_Aspect
	 * @generated
	 */
	public Adapter createExecutableNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.InitialNode_Aspect <em>Initial Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.InitialNode_Aspect
	 * @generated
	 */
	public Adapter createInitialNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.BooleanBinaryExpression_Aspect <em>Boolean Binary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.BooleanBinaryExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanBinaryExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.IntegerValue_Aspect <em>Integer Value Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.IntegerValue_Aspect
	 * @generated
	 */
	public Adapter createIntegerValue_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.JoinNode_Aspect <em>Join Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.JoinNode_Aspect
	 * @generated
	 */
	public Adapter createJoinNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ActivityFinalNode_Aspect <em>Activity Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ActivityFinalNode_Aspect
	 * @generated
	 */
	public Adapter createActivityFinalNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.InputValue
	 * @generated
	 */
	public Adapter createInputValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.IntegerVariable_Aspect <em>Integer Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.IntegerVariable_Aspect
	 * @generated
	 */
	public Adapter createIntegerVariable_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.ForkNode_Aspect <em>Fork Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.ForkNode_Aspect
	 * @generated
	 */
	public Adapter createForkNode_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.BooleanUnaryExpression_Aspect <em>Boolean Unary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.BooleanUnaryExpression_Aspect
	 * @generated
	 */
	public Adapter createBooleanUnaryExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.IntegerComparisonExpression_Aspect <em>Integer Comparison Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.IntegerComparisonExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerComparisonExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modularrevisitor.IntegerCalculationExpression_Aspect <em>Integer Calculation Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modularrevisitor.IntegerCalculationExpression_Aspect
	 * @generated
	 */
	public Adapter createIntegerCalculationExpression_AspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.OpaqueAction
	 * @generated
	 */
	public Adapter createOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.BooleanBinaryExpression
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.BooleanUnaryExpression
	 * @generated
	 */
	public Adapter createBooleanUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.IntegerComparisonExpression
	 * @generated
	 */
	public Adapter createIntegerComparisonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link admodular.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see admodular.IntegerCalculationExpression
	 * @generated
	 */
	public Adapter createIntegerCalculationExpressionAdapter() {
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

} //ModularrevisitorAdapterFactory
