package behavioural.chainofresponsibility;

public class Numbers {

    private final int num1;
    private final int num2;
    private final String operation;

    public Numbers(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNumOne() {
        return num1;
    }

    public int getNumTwo() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }
}
