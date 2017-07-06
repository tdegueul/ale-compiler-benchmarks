package evalexp.revisitor;

public interface EvalexpRevisitor<Exp__ExpressionT>
	 extends exp.revisitor.ExpRevisitor<Exp__ExpressionT>
	
	 {
	
	default Exp__ExpressionT $(final exp.Expression self) {
		return expression(self);
	}
}
