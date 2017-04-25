package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation;

import java.util.List;

import activitydiagram.Token;

public interface Activitydiagram$defaultActivityEdgeOperation extends org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramNamedElementOperation {

	List<Token> takeOfferedTokens();

	void sendOffer(List<Token> tokens);

	boolean hasOffer();
}