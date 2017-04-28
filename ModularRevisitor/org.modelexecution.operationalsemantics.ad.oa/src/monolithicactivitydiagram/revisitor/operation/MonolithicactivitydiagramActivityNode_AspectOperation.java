package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityNode_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation 
{
	Boolean isInitialNode();
	activitydiagram.InitialNode asInitialNode();
	void run();
	Boolean isRunning();
	void terminate();
	Boolean isReady();
	void sendOffers(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	void addTokens(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean hasOffers();
	void removeToken(adruntime.Token token);
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
}