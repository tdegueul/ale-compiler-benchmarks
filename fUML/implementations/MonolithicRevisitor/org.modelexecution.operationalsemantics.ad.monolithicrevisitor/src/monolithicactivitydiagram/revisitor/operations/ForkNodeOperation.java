package monolithicactivitydiagram.revisitor.operations;

public interface ForkNodeOperation extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
}
