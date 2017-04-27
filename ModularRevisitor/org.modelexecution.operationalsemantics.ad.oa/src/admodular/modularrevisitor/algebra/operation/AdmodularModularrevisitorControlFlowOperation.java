package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorControlFlowOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityEdgeOperation {
	Boolean isControlFlow();
	admodular.ControlFlow asControlFlow();
}