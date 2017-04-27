package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorTokenOperation  {
	admodular.ActivityNode getHolder();
	void setHolder(admodular.ActivityNode holder);
	void withdraw();
	Boolean isWithdrawn();
	modularrevisitor.Token transfer(admodular.ActivityNode holder);
}