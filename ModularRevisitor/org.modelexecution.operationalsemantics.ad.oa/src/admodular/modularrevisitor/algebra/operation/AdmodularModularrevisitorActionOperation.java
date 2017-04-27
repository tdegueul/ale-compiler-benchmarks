package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorActionOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExecutableNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}