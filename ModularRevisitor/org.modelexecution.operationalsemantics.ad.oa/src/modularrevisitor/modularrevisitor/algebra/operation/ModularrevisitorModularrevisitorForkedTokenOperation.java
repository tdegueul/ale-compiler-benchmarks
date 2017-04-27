package modularrevisitor.modularrevisitor.algebra.operation;

public interface ModularrevisitorModularrevisitorForkedTokenOperation extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorTokenOperation {
	modularrevisitor.Token getBaseToken();
	void setBaseToken(modularrevisitor.Token baseToken);
	Integer getRemainingOffersCount();
	void setRemainingOffersCount(Integer remainingOffersCount);
	void withdraw();
}