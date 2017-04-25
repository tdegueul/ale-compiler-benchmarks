package activitydiagramoa.activitydiagram.algebra.operation;

public interface ActivitydiagramoaActivitydiagramDecisionNodeOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}