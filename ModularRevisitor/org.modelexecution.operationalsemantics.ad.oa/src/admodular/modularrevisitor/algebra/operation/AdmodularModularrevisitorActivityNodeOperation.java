package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorActivityNodeOperation extends admodular.$default.algebra.operation.Admodular$defaultNamedElementOperation {
	org.eclipse.emf.common.util.EList<modularrevisitor.Token> getHeldTokens();
	Boolean getRunning();
	void setRunning(Boolean running);
	Boolean isInitialNode();
	admodular.InitialNode asInitialNode();
	void run();
	Boolean isRunning();
	void terminate();
	Boolean isReady();
	void sendOffers(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	org.eclipse.emf.common.util.EList<modularrevisitor.Token> takeOfferedTokens();
	void addTokens(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
	Boolean hasOffers();
	void removeToken(modularrevisitor.Token token);
	void fire(org.eclipse.emf.common.util.EList<modularrevisitor.Token> tokens);
}