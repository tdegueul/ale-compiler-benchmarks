package monolithicactivitydiagram.revisitor.operations;

public interface ActivityFinalNodeOperation extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
}
