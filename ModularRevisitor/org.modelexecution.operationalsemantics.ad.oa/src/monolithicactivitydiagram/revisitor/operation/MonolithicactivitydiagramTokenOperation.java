package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramTokenOperation
{
	void withdraw();
	Boolean isWithdrawn();
	adruntime.Token transfer(activitydiagram.ActivityNode holder);
}