package monolithicactivitydiagram.revisitor.operations;

public interface InitialNodeOperation extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	activitydiagram.InitialNode asInitialNode();
}
