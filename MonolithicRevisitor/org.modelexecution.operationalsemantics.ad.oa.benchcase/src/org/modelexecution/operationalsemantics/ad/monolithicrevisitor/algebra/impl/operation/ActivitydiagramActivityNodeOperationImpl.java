package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivityEdge;
import activitydiagram.Token;

public abstract class ActivitydiagramActivityNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.ActivitydiagramActivityNodeOperation {

	private final activitydiagram.ActivityNode activityNode;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramActivityNodeOperationImpl(final activitydiagram.ActivityNode self,
			MonolithicRevisitorImpl algebra) {
		this.activityNode = self;
		this.alg = algebra;
	}

	@Override
	public boolean hasOffers() {
		boolean hasOffer = true;
		for (final ActivityEdge edge : this.activityNode.getIncoming()) {
			if (!this.alg.$(edge).hasOffer()) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	@Override
	public void sendOffers(final List<Token> tokens) {
		for (final ActivityEdge edge : this.activityNode.getOutgoing()) {
			this.alg.$(edge).sendOffer(tokens);
		}
	}

	@Override
	public void addTokens(final List<Token> tokens) {
		for (final Token token : tokens) {
			final Token transferredToken = this.alg.$(token).transfer(this.activityNode);
			this.activityNode.getHeldTokens().add(transferredToken);
		}
	}

	@Override
	public List<Token> takeOfferdTokens() {
		final List<Token> allTokens = new ArrayList<Token>();
		for (final ActivityEdge edge : this.activityNode.getIncoming()) {
			final List<Token> tokens = this.alg.$(edge).takeOfferedTokens();
			for (final Token token : tokens) {
				this.alg.$(token).withdraw();
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}

	@Override
	public abstract void fire(List<Token> tokens);

	@Override
	public boolean isReady() {
		return this.isRunning();
	}

	private boolean isRunning() {
		return this.activityNode.isRunning();
	}

	@Override
	public void run() {
		this.activityNode.setRunning(true);
	}

	@Override
	public void terminate() {
		this.activityNode.setRunning(false);
	}

	@Override
	public void removeToken(final Token token) {
		this.activityNode.getHeldTokens().remove(token);
	}

}
