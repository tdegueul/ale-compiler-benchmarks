package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorActivity_AspectOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityOperation {
	modularrevisitor.Trace getTrace();
	void setTrace(modularrevisitor.Trace trace);
	void initialize(org.eclipse.emf.common.util.EList<modularrevisitor.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<modularrevisitor.InputValue> inputValues);
	void run();
	admodular.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<admodular.ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<admodular.ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(admodular.ActivityNode node);
	admodular.InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}