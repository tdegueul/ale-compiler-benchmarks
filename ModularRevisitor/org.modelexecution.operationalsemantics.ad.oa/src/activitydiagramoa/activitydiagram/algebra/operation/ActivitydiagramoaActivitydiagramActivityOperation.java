package activitydiagramoa.activitydiagram.algebra.operation;

import admodular.ActivityNode;
import admodular.InitialNode;

public interface ActivitydiagramoaActivitydiagramActivityOperation extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation {
	activitydiagram.Trace getTrace();
	void setTrace(activitydiagram.Trace trace);
	void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void run();
	ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(ActivityNode node);
	InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}