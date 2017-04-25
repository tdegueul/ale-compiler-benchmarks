package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActionOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Token;

public abstract class ActivitydiagramActionOperationImpl extends ActivitydiagramtExecutableNodeOperationImpl implements Activitydiagram$defaultActionOperation {


	private final activitydiagram.Action action;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramActionOperationImpl(final activitydiagram.Action self, MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.action = self;
		this.alg = algebra;
	}

	@Override
	public void fire(final List<Token> tokens) {
		this.doAction();
		this.sendOffers();
	}
		
	abstract void doAction();

	public void sendOffers() {
		if(this.action.getOutgoing().size() > 0) {
			final List<Token> tokens = new ArrayList<Token>();
			tokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken());
			this.addTokens(tokens);
			this.alg.$(this.action.getOutgoing().get(0)).sendOffer(tokens);
		}
	}
	
	@Override
	public boolean isReady() {
		return super.isReady() && this.hasOffers();
	}



}
