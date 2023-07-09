package structural.composite;

public class Main {

    public static void main(String[] args) {
        ArithmeticExpression add = new CompositeOp(new NumericOp(1), new NumericOp(2), '+');
        ArithmeticExpression multiOp = new CompositeOp(new NumericOp(3), add, '*');
        System.out.println(multiOp.getValue());
    }
}
