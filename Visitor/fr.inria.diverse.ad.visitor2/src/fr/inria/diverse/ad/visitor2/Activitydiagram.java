package fr.inria.diverse.ad.visitor2;

import java.util.List;

import activitydiagram.Activity;
import activitydiagram.InputValue;
import fr.inria.diverse.ad.visitor2.visitor.ActivityMainVisitor;

public class Activitydiagram {


	// public void init() {
	// System.out.println("ActivitydiagramInit");
	// SpringInjector.start();
	// System.out.println("ActivitydiagramStarted");
	// this.activityMainVisitor =
	// SpringInjector.getBean(ActivityMainVisitor.class);
	// System.out.println("Activitydiagram Main: " + this.activityMainVisitor);
	// }

	public void init() {
//		SpringInjector.start();
//		activityMainVisitor = SpringInjector.getBean(ActivityMainVisitor.class);
//		SpringInjector.getBean(ActivityEdgeHasOfferVisitor.class);
//		SpringInjector.getBean(ActivityEdgeSendOfferVisitor.class);
////		SpringInjector.getBean(ActivityMainVisitor.class);
//		SpringInjector.getBean(ActivityNodeFireVisitor.class);
//		SpringInjector.getBean(ActivityNodeIsReadyVisitor.class);
//		SpringInjector.getBean(ActivityNodeRemoveTokenVisitor.class);
//		SpringInjector.getBean(ActivityNodeRunVisitor.class);
//		SpringInjector.getBean(ActivityNodeTakeOfferdTokensVisitor.class);
//		SpringInjector.getBean(ActivityNodeTerminateVisitor.class);
//		SpringInjector.getBean(ActivityTerminalVisitor.class);
//		SpringInjector.getBean(ExpressionExecutionVisitor.class);
//		SpringInjector.getBean(OfferHasTokensVisitor.class);
//		SpringInjector.getBean(TokenIsWithdrawVisitor.class);
//		SpringInjector.getBean(TokenTakeOfferedTokensVisitor.class);
//		SpringInjector.getBean(TokenTransfertVisitor.class);
//		SpringInjector.getBean(TokenWithdrawVisitor.class);

	}

	public long execute(final Activity activity, final List<InputValue> inputValues) {

		final long start = System.currentTimeMillis();
		activity.accept(ActivityMainVisitor.INSTANCE, inputValues);
		final long stop = System.currentTimeMillis();
//		SpringInjector.close();
		return stop - start;
	}

	public void stop() {
//		SpringInjector.close();
	}

}
