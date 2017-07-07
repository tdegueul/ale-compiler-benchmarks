package monolithicactivitydiagram.revisitor.operations;

public interface TokenOperation {
	void withdraw();
	Boolean isWithdrawn();
	activitydiagram.Token transfer(activitydiagram.ActivityNode holder);
}
