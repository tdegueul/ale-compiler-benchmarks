package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramIntegerValueOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation 
{
	Boolean isIntegerValue();
	activitydiagram.IntegerValue asIntegerValue();
}