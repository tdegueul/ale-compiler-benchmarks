package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation;

import activitydiagram.ActivityNode;
import activitydiagram.Token;

public interface Activitydiagram$defaultTokenOperation  {

	void withdraw();

	boolean isWithdrawn();

	Token transfer(ActivityNode holder);
}