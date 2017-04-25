package activitydiagramoa.activitydiagram.algebra.operation;

public interface ActivitydiagramoaActivitydiagramActionOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}