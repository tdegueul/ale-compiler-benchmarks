package exp.revisitor;

public interface ExpRevisitor<Exp__ExpressionT>
	
	 {
Exp__ExpressionT expression(final exp.Expression expression);

	
	default Exp__ExpressionT $(final exp.Expression self) {
		return expression(self);
	}
}
