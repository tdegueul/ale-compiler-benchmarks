package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorInitialNode_AspectOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorInitialNodeOperation, modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	admodular.InitialNode asInitialNode();
}