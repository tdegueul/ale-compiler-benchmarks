package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramAction_AspectOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}