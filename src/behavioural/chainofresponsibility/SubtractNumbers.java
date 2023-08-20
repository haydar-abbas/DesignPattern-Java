package behavioural.chainofresponsibility;

public class SubtractNumbers implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getOperation().equals("-")) {
            System.out.printf("%d - %d = %d\n", request.getNumOne(), request.getNumTwo(), (request.getNumOne() - request.getNumTwo()));
        } else {
            this.nextChain.calculate(request);
        }
    }
}
