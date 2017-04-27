package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorActivityEdge_AspectOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityEdgeOperation {
	org.eclipse.emf.common.util.EList<modularrevisitor.Offer> getOffers();
	Boolean isControlFlow();
	admodular.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	org.eclipse.emf.common.util.EList<modularrevisitor.Token> takeOfferedTokens();
	Boolean hasOffer();
}