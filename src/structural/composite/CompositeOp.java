package structural.composite;

public class CompositeOp extends ArithmeticExpression{

    ArithmeticExpression firstOp;
    ArithmeticExpression secondOp;
    private final char sign;

    public CompositeOp(ArithmeticExpression firstOp, ArithmeticExpression secondOp, char sign) {
        this.firstOp = firstOp;
        this.secondOp = secondOp;
        this.sign = sign;
    }

    @Override
    int getValue() {

        return switch (this.sign) {
            case '+' -> this.firstOp.getValue() + this.secondOp.getValue();
            case '-' -> this.firstOp.getValue() - this.secondOp.getValue();
            case '*' -> this.firstOp.getValue() * this.secondOp.getValue();
            case '/' -> this.firstOp.getValue() / this.secondOp.getValue();
            default -> throw new RuntimeException("Unknown sign!");
        };

    }
}
