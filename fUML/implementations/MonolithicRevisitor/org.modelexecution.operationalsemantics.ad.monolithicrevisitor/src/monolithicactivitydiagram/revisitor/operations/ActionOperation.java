package monolithicactivitydiagram.revisitor.operations;

public interface ActionOperation extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}
