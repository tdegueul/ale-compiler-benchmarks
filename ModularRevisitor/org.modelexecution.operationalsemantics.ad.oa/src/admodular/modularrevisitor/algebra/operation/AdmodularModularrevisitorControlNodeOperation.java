package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorControlNodeOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	Boolean isReady();
}