package behavioural.interpreter;

public class IntToBinaryExpression implements Expression {

    private final int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
