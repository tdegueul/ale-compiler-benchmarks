package monolithicactivitydiagram.revisitor.operations;

public interface OfferOperation {
	Boolean hasTokens();
	void removeWithdrawnTokens();
}
