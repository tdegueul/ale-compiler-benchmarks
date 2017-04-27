package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorOfferOperation  {
	org.eclipse.emf.common.util.EList<modularrevisitor.Token> getOfferedTokens();
	Boolean hasTokens();
	void removeWithdrawnTokens();
}