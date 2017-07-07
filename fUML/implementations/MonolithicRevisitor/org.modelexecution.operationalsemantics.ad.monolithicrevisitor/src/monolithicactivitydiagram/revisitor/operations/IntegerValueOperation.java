package monolithicactivitydiagram.revisitor.operations;

public interface IntegerValueOperation extends monolithicactivitydiagram.revisitor.operations.ValueOperation {
	Boolean isIntegerValue();
	activitydiagram.IntegerValue asIntegerValue();
}
