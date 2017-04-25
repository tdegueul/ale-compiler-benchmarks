package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramForkedTokenOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation {
	activitydiagram.Token getBaseToken();
	void setBaseToken(activitydiagram.Token baseToken);
	Integer getRemainingOffersCount();
	void setRemainingOffersCount(Integer remainingOffersCount);
	void withdraw();
}