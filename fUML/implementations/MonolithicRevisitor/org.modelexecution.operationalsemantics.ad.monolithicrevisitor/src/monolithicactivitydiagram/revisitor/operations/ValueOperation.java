package monolithicactivitydiagram.revisitor.operations;

public interface ValueOperation {
	Boolean isBooleanValue();
	activitydiagram.BooleanValue asBooleanValue();
	Boolean isIntegerValue();
	activitydiagram.IntegerValue asIntegerValue();
}
