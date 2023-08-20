package behavioural.chainofresponsibility;

public class DivideNumbers implements Chain {

    @Override
    public void setNextChain(Chain nextChain) {
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperation().equals("/")) {
            System.out.printf("%d / %d = %d\n", request.getNumOne(), request.getNumTwo(), (request.getNumOne() / request.getNumTwo()));
        } else {
            System.out.println("Only works for add, sub, multi and div");
        }
    }
}
