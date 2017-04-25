package activitydiagram.activitydiagram.algebra.impl.operation;
public class ActivitydiagramActivitydiagramAction_AspectOperationImpl implements activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation { 
			
			
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
		
	private final activitydiagram.Action_Aspect self;
	private final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperationImpl delegateExecutableNode;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperationImpl delegateActivityNode;
	
	public ActivitydiagramActivitydiagramAction_AspectOperationImpl(final activitydiagram.Action_Aspect self, final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra) {
		this.self = self;
		this.algebra = algebra;
		this.delegateExecutableNode = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperationImpl(self, algebra);
		this.delegateActivityNode = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperationImpl(self, algebra);
	}
	
	
	
	
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> getHeldTokens() {
		return this.delegateActivityNode.getHeldTokens();
			}
	public Boolean getRunning() {
		return this.delegateActivityNode.getRunning();
			}
	public void setRunning(Boolean running) {
		this.delegateActivityNode.setRunning(running);
	}
	public void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
algebra.$(self).doAction();
algebra.$(self).sendOffers();
	}
	public void doAction() {
	}
	public void sendOffers() {
if(self.getOutgoing().size() > 0) {
			org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = new org.eclipse.emf.common.util.BasicEList<>();;
			tokens.add(activitydiagram.ActivitydiagramFactory.eINSTANCE.createToken());
			algebra.$(self).addTokens(tokens);
			algebra.$(self.getOutgoing().get(0)).sendOffer(tokens);
		} 
	}
	public Boolean isReady() {
return this.delegateActivityNode.isReady() && algebra.$(self).hasOffers();
	}
	public void run() {
this.delegateActivityNode.setRunning(true);
	}
	public Boolean isRunning() {
return algebra.$(self).getRunning();
	}
	public void terminate() {
this.delegateActivityNode.setRunning(false);
	}
	public void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
for(activitydiagramoa.ActivityEdge edge: self.getOutgoing()) {
	algebra.$(edge).sendOffer(tokens);
}
	}
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
org.eclipse.emf.common.util.EList<activitydiagram.Token> allTokens = new org.eclipse.emf.common.util.BasicEList<>();;
for(activitydiagramoa.ActivityEdge edge: self.getIncoming()) {
	org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = algebra.$(edge).takeOfferedTokens();
	for(activitydiagram.Token token: tokens) {
		algebra.$(token).withdraw();
	}
	allTokens.addAll(tokens);
}
return allTokens;
	}
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
for(activitydiagram.Token token: tokens) {
	activitydiagram.Token transferredToken = algebra.$(token).transfer(self);
	this.delegateActivityNode.getHeldTokens().add(transferredToken);
}
	}
	public Boolean hasOffers() {
Boolean hasOffer = true;
for(activitydiagramoa.ActivityEdge edge: self.getIncoming()) {
	if(!algebra.$(edge).hasOffer()) {
				hasOffer = false;
			} 
}
return hasOffer;
	}
	public void removeToken(activitydiagram.Token token) {
this.delegateActivityNode.getHeldTokens().remove(token);
	}
}
