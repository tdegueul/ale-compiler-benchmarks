package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivity_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation 
{
	void initialize(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues);
	void run();
	activitydiagram.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(activitydiagram.ActivityNode node);
	activitydiagram.InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}