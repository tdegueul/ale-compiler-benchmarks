package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramValueOperation
{
	Boolean isBooleanValue();
	activitydiagram.BooleanValue asBooleanValue();
	Boolean isIntegerValue();
	activitydiagram.IntegerValue asIntegerValue();
}