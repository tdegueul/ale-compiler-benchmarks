package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityNodeOperation
extends common.revisitor.operation.CommonNamedElementOperation 
{
	Boolean isReady();
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isInitialNode();
	activitydiagram.InitialNode asInitialNode();
	void run();
	void terminate();
	void removeToken(adruntime.Token token);
}