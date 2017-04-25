package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.Token;
import activitydiagram.Trace;
import activitydiagram.Variable;

public class ActivitydiagramActivityOperationImpl implements Activitydiagram$defaultActivityOperation {

	private final activitydiagram.Activity self;
	private MonolithicRevisitorImpl algebra;

	public ActivitydiagramActivityOperationImpl(final activitydiagram.Activity self, MonolithicRevisitorImpl algebra) {
		this.self = self;
		this.algebra = algebra;
	}

	@Override
	public void main(List<InputValue> inputValues) {
		this.initialize(inputValues);
		this.initializeTrace();
		this.run();

	}

	private void run() {
		this.runNodes();

		this.fireInitialNode();

		List<ActivityNode> enabledNodes = this.getEnabledNodes();
		while (enabledNodes.size() > 0) {
			final ActivityNode nextNode = this.selectNextNode(enabledNodes);
			this.fireNode(nextNode);
			enabledNodes = this.getEnabledNodes();
		}

	}

	private void fireNode(ActivityNode node) {
		final List<Token> tokens = this.algebra.$(node).takeOfferdTokens(); // node.accept(this.getTakOfferd(),
																			// null);
		this.algebra.$(node).fire(tokens);
		self.getTrace().getExecutedNodes().add(node);
	}

	private ActivityNode selectNextNode(List<ActivityNode> enabledNodes) {
		return enabledNodes.get(0);
	}

	private List<ActivityNode> getEnabledNodes() {
		final List<ActivityNode> enabledNodes = new ArrayList<ActivityNode>();
		for (final ActivityNode node : self.getNodes()) {
			if (this.algebra.$(node).isReady()) {
				enabledNodes.add(node);
			}
		}
		return enabledNodes;
	}

	private void fireInitialNode() {
		final InitialNode initialNode = this.getInitialNode();
		this.fireNode(initialNode);

	}

	private InitialNode getInitialNode() {
		for (final ActivityNode node : self.getNodes()) {
			if (node instanceof InitialNode) {
				return (InitialNode) node;
			}
		}
		return null;
	}

	private void runNodes() {
		for (final ActivityNode node : self.getNodes()) {
			this.algebra.$(node).run();
		}
	}

	private void initializeTrace() {
		final Trace trace = ActivitydiagramFactory.eINSTANCE.createTrace();
		self.setTrace(trace);
	}

	private void initialize(List<InputValue> inputValues) {
		for (final Variable v : self.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if (inputValues != null) {
			for (final InputValue v : inputValues) {
				v.getVariable().setCurrentValue(v.getValue());
			}
		}
	}

	@Override
	public void terminate() {
		for (final ActivityNode node : self.getNodes()) {
			this.algebra.$(node).terminate();
		}
	}

}
