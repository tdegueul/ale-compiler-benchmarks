package activitydiagram.activitydiagram.algebra.impl.operation;
public class ActivitydiagramActivitydiagramActivity_AspectOperationImpl implements activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation { 
			
			
	private class EListCollector<T> implements java.util.stream.Collector<T, org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> {

		@Override
		public java.util.function.Supplier<org.eclipse.emf.common.util.EList<T>> supplier() {
			return org.eclipse.emf.common.util.BasicEList::new;
		}

		@Override
		public java.util.function.BiConsumer<org.eclipse.emf.common.util.EList<T>, T> accumulator() {
			return (a, b) -> a.add(b);
		}

		@Override
		public java.util.function.BinaryOperator<org.eclipse.emf.common.util.EList<T>> combiner() {
			return (a, b) -> {
				a.addAll(b);
				return a;
			};
		}

		@Override
		public java.util.function.Function<org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> finisher() {
			return java.util.function.Function.identity();
		}

		@Override
		public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
			java.util.HashSet<java.util.stream.Collector.Characteristics> hashSet = new java.util.HashSet<>();
			hashSet.add(java.util.stream.Collector.Characteristics.UNORDERED);
			return hashSet;
		}

	}
		
	private final activitydiagram.Activity_Aspect self;
	private final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra;
	
	public ActivitydiagramActivitydiagramActivity_AspectOperationImpl(final activitydiagram.Activity_Aspect self, final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra) {
		this.self = self;
		this.algebra = algebra;
	}
	
	
	
	
	public activitydiagram.Trace getTrace() {
		return this.self.getTrace();
			}
	public void setTrace(activitydiagram.Trace trace) {
		this.self.setTrace(trace);
	}
	public void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues) {
for(activitydiagramoa.Variable v: self.getLocals()) {
	algebra.$(v).setCurrentValue(v.getInitialValue());
}
if(inputValues != null) {
			for(activitydiagram.InputValue v: inputValues) {
				algebra.$(v.getVariable()).setCurrentValue(v.getValue());
			}
		} 
	}
	public void main(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues) {
this.initialize(inputValues);
this.initializeTrace();
this.run();
	}
	public void run() {
this.runNodes();
this.fireInitialNode();
org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> enabledNodes = this.getEnabledNodes();
while(enabledNodes.size() > 0) {
	activitydiagramoa.ActivityNode nextNode = this.selectNextNode(enabledNodes);
	this.fireNode(nextNode);
	enabledNodes = this.getEnabledNodes();
}
	}
	public activitydiagramoa.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> activityNodes) {
return activityNodes.get(0);
	}
	public org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> getEnabledNodes() {
org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> enabledNodes = new org.eclipse.emf.common.util.BasicEList<>();;
for(activitydiagramoa.ActivityNode node: self.getNodes()) {
	if(algebra.$(node).isReady()) {
				enabledNodes.add(node);
			} 
}
return enabledNodes;
	}
	public void fireInitialNode() {
activitydiagramoa.InitialNode initialNode = this.getInitialNode();
this.fireNode(initialNode);
	}
	public void fireNode(activitydiagramoa.ActivityNode node) {
org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = algebra.$(node).takeOfferedTokens();
algebra.$(node).fire(tokens);
self.getTrace().getExecutedNodes().add(node);
	}
	public activitydiagramoa.InitialNode getInitialNode() {
for(activitydiagramoa.ActivityNode node: self.getNodes()) {
	if(node instanceof activitydiagramoa.InitialNode) {
				return ((activitydiagramoa.InitialNode)node);
			} 
}
return null;
	}
	public void runNodes() {
for(activitydiagramoa.ActivityNode node: self.getNodes()) {
	algebra.$(node).run();
}
	}
	public void initializeTrace() {
activitydiagram.Trace trace = activitydiagram.ActivitydiagramFactory.eINSTANCE.createTrace();
self.setTrace(trace);
	}
	public void terminate() {
for(activitydiagramoa.ActivityNode node: self.getNodes()) {
	algebra.$(node).terminate();
}
	}
}
