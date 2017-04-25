package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation;

import java.util.List;

import activitydiagram.InputValue;

public interface Activitydiagram$defaultActivityOperation extends org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramNamedElementOperation {

	void main(List<InputValue> inputValues);

	void terminate();
}