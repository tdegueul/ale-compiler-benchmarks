package activitydiagramoa.activitydiagram.algebra.operation;

public interface ActivitydiagramoaActivitydiagramControlNodeOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}