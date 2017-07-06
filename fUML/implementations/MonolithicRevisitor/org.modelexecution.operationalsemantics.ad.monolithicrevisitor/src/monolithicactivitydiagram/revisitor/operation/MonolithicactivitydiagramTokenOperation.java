package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramTokenOperation
{
	void withdraw();
	Boolean isWithdrawn();
	activitydiagram.Token transfer(activitydiagram.ActivityNode holder);
}