package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorDecisionNodeOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	Boolean isReady();
}