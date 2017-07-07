package monolithicactivitydiagram.revisitor.operations;

public interface ControlNodeOperation extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}
