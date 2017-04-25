package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.impl;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityFinalNodeOperationImpl;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityEdgeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityFinalNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanBinaryExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanUnaryExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanValueOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanVariableOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlFlowOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlTokenOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultDecisionNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultExecutableNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultFinalNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultForkNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultForkedTokenOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultInitialNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultInputOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultInputValueOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerCalculationExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerComparisonExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerExpressionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerValueOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerVariableOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultJoinNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultMergeNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultOfferOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultOpaqueActionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultTokenOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultTraceOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultValueOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultVariableOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramActivityNodeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramNamedElementOperation;

public interface MonolithicRevisitorImpl extends
		org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.MonolithicRevisitor<Activitydiagram$defaultActionOperation, Activitydiagram$defaultActivityOperation, Activitydiagram$defaultActivityEdgeOperation, Activitydiagram$defaultActivityFinalNodeOperation, ActivitydiagramActivityNodeOperation, Activitydiagram$defaultBooleanBinaryExpressionOperation, Activitydiagram$defaultBooleanExpressionOperation, Activitydiagram$defaultBooleanUnaryExpressionOperation, Activitydiagram$defaultBooleanValueOperation, Activitydiagram$defaultBooleanVariableOperation, Activitydiagram$defaultControlFlowOperation, Activitydiagram$defaultControlNodeOperation, Activitydiagram$defaultControlTokenOperation, Activitydiagram$defaultDecisionNodeOperation, Activitydiagram$defaultExecutableNodeOperation, Activitydiagram$defaultExpressionOperation, Activitydiagram$defaultFinalNodeOperation, Activitydiagram$defaultForkNodeOperation, Activitydiagram$defaultForkedTokenOperation, Activitydiagram$defaultInitialNodeOperation, Activitydiagram$defaultInputOperation, Activitydiagram$defaultInputValueOperation, Activitydiagram$defaultIntegerCalculationExpressionOperation, Activitydiagram$defaultIntegerComparisonExpressionOperation, Activitydiagram$defaultIntegerExpressionOperation, Activitydiagram$defaultIntegerValueOperation, Activitydiagram$defaultIntegerVariableOperation, Activitydiagram$defaultJoinNodeOperation, Activitydiagram$defaultMergeNodeOperation, ActivitydiagramNamedElementOperation, Activitydiagram$defaultOfferOperation, Activitydiagram$defaultOpaqueActionOperation, Activitydiagram$defaultTokenOperation, Activitydiagram$defaultTraceOperation, Activitydiagram$defaultValueOperation, Activitydiagram$defaultVariableOperation> {
	@Override
	default Activitydiagram$defaultActivityOperation activity(final activitydiagram.Activity activity) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityOperationImpl(activity, this);
	}

	@Override
	default Activitydiagram$defaultActivityOperation namedElement_activity(final activitydiagram.Activity activity) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityOperationImpl(activity, this);
	}

	@Override
	default Activitydiagram$defaultActivityFinalNodeOperation activityFinalNode(
			final activitydiagram.ActivityFinalNode activityFinalNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityFinalNodeOperationImpl(
				activityFinalNode, this);
	}

	@Override
	default Activitydiagram$defaultActivityFinalNodeOperation namedElement_activityFinalNode(
			final activitydiagram.ActivityFinalNode activityFinalNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityFinalNodeOperationImpl(
				activityFinalNode, this);
	}

	@Override
	default Activitydiagram$defaultActivityFinalNodeOperation finalNode_activityFinalNode(
			final activitydiagram.ActivityFinalNode activityFinalNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityFinalNodeOperationImpl(
				activityFinalNode, this);
	}

	@Override
	default Activitydiagram$defaultActivityFinalNodeOperation controlNode_activityFinalNode(
			final activitydiagram.ActivityFinalNode activityFinalNode) {
		return new ActivitydiagramActivityFinalNodeOperationImpl(activityFinalNode, this);
	}

	@Override
	default Activitydiagram$defaultActivityFinalNodeOperation activityNode_activityFinalNode(
			final activitydiagram.ActivityFinalNode activityFinalNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramActivityFinalNodeOperationImpl(
				activityFinalNode, this);
	}

	@Override
	default Activitydiagram$defaultBooleanBinaryExpressionOperation booleanBinaryExpression(
			final activitydiagram.BooleanBinaryExpression booleanBinaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanBinaryExpressionOperationImpl(
				booleanBinaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanBinaryExpressionOperation expression_booleanBinaryExpression(
			final activitydiagram.BooleanBinaryExpression booleanBinaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanBinaryExpressionOperationImpl(
				booleanBinaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanBinaryExpressionOperation booleanExpression_booleanBinaryExpression(
			final activitydiagram.BooleanBinaryExpression booleanBinaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanBinaryExpressionOperationImpl(
				booleanBinaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanUnaryExpressionOperation booleanUnaryExpression(
			final activitydiagram.BooleanUnaryExpression booleanUnaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanUnaryExpressionOperationImpl(
				booleanUnaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanUnaryExpressionOperation expression_booleanUnaryExpression(
			final activitydiagram.BooleanUnaryExpression booleanUnaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanUnaryExpressionOperationImpl(
				booleanUnaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanUnaryExpressionOperation booleanExpression_booleanUnaryExpression(
			final activitydiagram.BooleanUnaryExpression booleanUnaryExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanUnaryExpressionOperationImpl(
				booleanUnaryExpression, this);
	}

	@Override
	default Activitydiagram$defaultBooleanValueOperation booleanValue(final activitydiagram.BooleanValue booleanValue) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanValueOperationImpl(booleanValue, this);
	}

	@Override
	default Activitydiagram$defaultBooleanValueOperation value_booleanValue(
			final activitydiagram.BooleanValue booleanValue) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanValueOperationImpl(booleanValue, this);
	}

	@Override
	default Activitydiagram$defaultBooleanVariableOperation booleanVariable(
			final activitydiagram.BooleanVariable booleanVariable) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanVariableOperationImpl(booleanVariable,
				this);
	}

	@Override
	default Activitydiagram$defaultBooleanVariableOperation variable_booleanVariable(
			final activitydiagram.BooleanVariable booleanVariable) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramBooleanVariableOperationImpl(booleanVariable,
				this);
	}

	@Override
	default Activitydiagram$defaultControlFlowOperation controlFlow(final activitydiagram.ControlFlow controlFlow) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramControlFlowOperationImpl(controlFlow, this);
	}

	@Override
	default Activitydiagram$defaultControlFlowOperation namedElement_controlFlow(
			final activitydiagram.ControlFlow controlFlow) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramControlFlowOperationImpl(controlFlow, this);
	}

	@Override
	default Activitydiagram$defaultControlFlowOperation activityEdge_controlFlow(
			final activitydiagram.ControlFlow controlFlow) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramControlFlowOperationImpl(controlFlow, this);
	}

	@Override
	default Activitydiagram$defaultControlTokenOperation controlToken(final activitydiagram.ControlToken controlToken) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramControlTokenOperationImpl(controlToken, this);
	}

	@Override
	default Activitydiagram$defaultControlTokenOperation token_controlToken(
			final activitydiagram.ControlToken controlToken) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramControlTokenOperationImpl(controlToken, this);
	}

	@Override
	default Activitydiagram$defaultDecisionNodeOperation decisionNode(final activitydiagram.DecisionNode decisionNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramDecisionNodeOperationImpl(decisionNode, this);
	}

	@Override
	default Activitydiagram$defaultDecisionNodeOperation activityNode_decisionNode(
			final activitydiagram.DecisionNode decisionNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramDecisionNodeOperationImpl(decisionNode, this);
	}

	@Override
	default Activitydiagram$defaultDecisionNodeOperation namedElement_decisionNode(
			final activitydiagram.DecisionNode decisionNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramDecisionNodeOperationImpl(decisionNode, this);
	}

	@Override
	default Activitydiagram$defaultDecisionNodeOperation controlNode_decisionNode(
			final activitydiagram.DecisionNode decisionNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramDecisionNodeOperationImpl(decisionNode, this);
	}

	@Override
	default Activitydiagram$defaultForkNodeOperation forkNode(final activitydiagram.ForkNode forkNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkNodeOperationImpl(forkNode, this);
	}

	@Override
	default Activitydiagram$defaultForkNodeOperation activityNode_forkNode(final activitydiagram.ForkNode forkNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkNodeOperationImpl(forkNode, this);
	}

	@Override
	default Activitydiagram$defaultForkNodeOperation namedElement_forkNode(final activitydiagram.ForkNode forkNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkNodeOperationImpl(forkNode, this);
	}

	@Override
	default Activitydiagram$defaultForkNodeOperation controlNode_forkNode(final activitydiagram.ForkNode forkNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkNodeOperationImpl(forkNode, this);
	}

	@Override
	default Activitydiagram$defaultForkedTokenOperation forkedToken(final activitydiagram.ForkedToken forkedToken) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkedTokenOperationImpl(forkedToken, this);
	}

	@Override
	default Activitydiagram$defaultForkedTokenOperation token_forkedToken(
			final activitydiagram.ForkedToken forkedToken) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramForkedTokenOperationImpl(forkedToken, this);
	}

	@Override
	default Activitydiagram$defaultInitialNodeOperation initialNode(final activitydiagram.InitialNode initialNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInitialNodeOperationImpl(initialNode, this);
	}

	@Override
	default Activitydiagram$defaultInitialNodeOperation activityNode_initialNode(
			final activitydiagram.InitialNode initialNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInitialNodeOperationImpl(initialNode, this);
	}

	@Override
	default Activitydiagram$defaultInitialNodeOperation namedElement_initialNode(
			final activitydiagram.InitialNode initialNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInitialNodeOperationImpl(initialNode, this);
	}

	@Override
	default Activitydiagram$defaultInitialNodeOperation controlNode_initialNode(
			final activitydiagram.InitialNode initialNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInitialNodeOperationImpl(initialNode, this);
	}

	@Override
	default Activitydiagram$defaultInputOperation input(final activitydiagram.Input input) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInputOperationImpl(input, this);
	}

	@Override
	default Activitydiagram$defaultInputValueOperation inputValue(final activitydiagram.InputValue inputValue) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramInputValueOperationImpl(inputValue, this);
	}

	@Override
	default Activitydiagram$defaultIntegerCalculationExpressionOperation integerCalculationExpression(
			final activitydiagram.IntegerCalculationExpression integerCalculationExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerCalculationExpressionOperationImpl(
				integerCalculationExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerCalculationExpressionOperation expression_integerCalculationExpression(
			final activitydiagram.IntegerCalculationExpression integerCalculationExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerCalculationExpressionOperationImpl(
				integerCalculationExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerCalculationExpressionOperation integerExpression_integerCalculationExpression(
			final activitydiagram.IntegerCalculationExpression integerCalculationExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerCalculationExpressionOperationImpl(
				integerCalculationExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerComparisonExpressionOperation integerComparisonExpression(
			final activitydiagram.IntegerComparisonExpression integerComparisonExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerComparisonExpressionOperationImpl(
				integerComparisonExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerComparisonExpressionOperation expression_integerComparisonExpression(
			final activitydiagram.IntegerComparisonExpression integerComparisonExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerComparisonExpressionOperationImpl(
				integerComparisonExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerComparisonExpressionOperation integerExpression_integerComparisonExpression(
			final activitydiagram.IntegerComparisonExpression integerComparisonExpression) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerComparisonExpressionOperationImpl(
				integerComparisonExpression, this);
	}

	@Override
	default Activitydiagram$defaultIntegerValueOperation integerValue(final activitydiagram.IntegerValue integerValue) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerValueOperationImpl(integerValue, this);
	}

	@Override
	default Activitydiagram$defaultIntegerValueOperation value_integerValue(
			final activitydiagram.IntegerValue integerValue) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerValueOperationImpl(integerValue, this);
	}

	@Override
	default Activitydiagram$defaultIntegerVariableOperation integerVariable(
			final activitydiagram.IntegerVariable integerVariable) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerVariableOperationImpl(integerVariable,
				this);
	}

	@Override
	default Activitydiagram$defaultIntegerVariableOperation variable_integerVariable(
			final activitydiagram.IntegerVariable integerVariable) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramIntegerVariableOperationImpl(integerVariable,
				this);
	}

	@Override
	default Activitydiagram$defaultJoinNodeOperation joinNode(final activitydiagram.JoinNode joinNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramJoinNodeOperationImpl(joinNode, this);
	}

	@Override
	default Activitydiagram$defaultJoinNodeOperation activityNode_joinNode(final activitydiagram.JoinNode joinNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramJoinNodeOperationImpl(joinNode, this);
	}

	@Override
	default Activitydiagram$defaultJoinNodeOperation namedElement_joinNode(final activitydiagram.JoinNode joinNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramJoinNodeOperationImpl(joinNode, this);
	}

	@Override
	default Activitydiagram$defaultJoinNodeOperation controlNode_joinNode(final activitydiagram.JoinNode joinNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramJoinNodeOperationImpl(joinNode, this);
	}

	@Override
	default Activitydiagram$defaultMergeNodeOperation mergeNode(final activitydiagram.MergeNode mergeNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramtMergeNodeOperation(mergeNode, this);
	}

	@Override
	default Activitydiagram$defaultMergeNodeOperation activityNode_mergeNode(
			final activitydiagram.MergeNode mergeNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramtMergeNodeOperation(mergeNode, this);
	}

	@Override
	default Activitydiagram$defaultMergeNodeOperation namedElement_mergeNode(
			final activitydiagram.MergeNode mergeNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramtMergeNodeOperation(mergeNode, this);
	}

	@Override
	default Activitydiagram$defaultMergeNodeOperation controlNode_mergeNode(final activitydiagram.MergeNode mergeNode) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramtMergeNodeOperation(mergeNode, this);
	}

	@Override
	default Activitydiagram$defaultOfferOperation offer(final activitydiagram.Offer offer) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramtOfferOperationImpl(offer, this);
	}

	@Override
	default Activitydiagram$defaultOpaqueActionOperation opaqueAction(final activitydiagram.OpaqueAction opaqueAction) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramOpaqueActionOperationImpl(opaqueAction, this);
	}

	@Override
	default Activitydiagram$defaultOpaqueActionOperation namedElement_opaqueAction(
			final activitydiagram.OpaqueAction opaqueAction) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramOpaqueActionOperationImpl(opaqueAction, this);
	}

	@Override
	default Activitydiagram$defaultOpaqueActionOperation activityNode_opaqueAction(
			final activitydiagram.OpaqueAction opaqueAction) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramOpaqueActionOperationImpl(opaqueAction, this);
	}

	@Override
	default Activitydiagram$defaultOpaqueActionOperation action_opaqueAction(
			final activitydiagram.OpaqueAction opaqueAction) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramOpaqueActionOperationImpl(opaqueAction, this);
	}

	@Override
	default Activitydiagram$defaultOpaqueActionOperation executableNode_opaqueAction(
			final activitydiagram.OpaqueAction opaqueAction) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramOpaqueActionOperationImpl(opaqueAction, this);
	}

	@Override
	default Activitydiagram$defaultTraceOperation trace(final activitydiagram.Trace trace) {
		return new org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation.ActivitydiagramTraceOperationImpl(trace, this);
	}
}
