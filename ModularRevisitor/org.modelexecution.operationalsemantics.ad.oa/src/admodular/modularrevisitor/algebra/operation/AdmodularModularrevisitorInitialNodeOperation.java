package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorInitialNodeOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	admodular.InitialNode asInitialNode();
}