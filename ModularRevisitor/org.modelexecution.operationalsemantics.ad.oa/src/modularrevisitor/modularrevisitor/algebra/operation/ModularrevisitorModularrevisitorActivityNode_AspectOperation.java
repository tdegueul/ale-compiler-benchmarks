package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorActivityNode_AspectOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityNodeOperation {
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