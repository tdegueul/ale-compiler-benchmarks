package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramTokenOperation  {
	activitydiagramoa.ActivityNode getHolder();
	void setHolder(activitydiagramoa.ActivityNode holder);
	void withdraw();
	Boolean isWithdrawn();
	activitydiagram.Token transfer(activitydiagramoa.ActivityNode holder);
}