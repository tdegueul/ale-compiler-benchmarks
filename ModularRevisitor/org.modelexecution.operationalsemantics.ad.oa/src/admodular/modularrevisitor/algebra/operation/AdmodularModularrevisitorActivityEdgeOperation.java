package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorActivityEdgeOperation extends admodular.$default.algebra.operation.Admodular$defaultNamedElementOperation {
	org.eclipse.emf.common.util.EList<modularrevisitor.Offer> getOffers();
	Boolean isControlFlow();
	admodular.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	org.eclipse.emf.common.util.EList<modularrevisitor.Token> takeOfferedTokens();
	Boolean hasOffer();
}