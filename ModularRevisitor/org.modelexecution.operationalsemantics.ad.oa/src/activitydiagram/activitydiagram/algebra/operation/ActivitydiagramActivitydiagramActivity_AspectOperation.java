package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActivity_AspectOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation {
	activitydiagram.Trace getTrace();
	void setTrace(activitydiagram.Trace trace);
	void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void run();
	activitydiagramoa.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<activitydiagramoa.ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(activitydiagramoa.ActivityNode node);
	activitydiagramoa.InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}