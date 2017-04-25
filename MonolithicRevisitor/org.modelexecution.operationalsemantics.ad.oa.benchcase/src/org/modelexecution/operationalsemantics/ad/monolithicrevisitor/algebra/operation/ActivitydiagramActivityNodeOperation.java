package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation;

import java.util.List;

import activitydiagram.Token;

public interface ActivitydiagramActivityNodeOperation
		extends org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramNamedElementOperation {

	List<Token> takeOfferdTokens();

	void fire(List<Token> tokens);

	boolean isReady();

	void run();

	void terminate();

	void removeToken(Token token);
	
	void addTokens(final List<Token> tokens);
	
	void sendOffers(final List<Token> tokens);
	
	boolean hasOffers();
}