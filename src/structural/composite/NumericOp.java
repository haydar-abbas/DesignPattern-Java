package structural.composite;

public class NumericOp extends ArithmeticExpression{

    private final int value;

    public NumericOp(int value) {
        this.value = value;
    }

    @Override
    int getValue() {
        return this.value;
    }
}
