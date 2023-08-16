package behavioural.chainofresponsibility;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return this.next;
    }

    public abstract boolean handle(String username, String passwd);

    protected boolean handleNext(String username, String passwd) {
        if (this.next == null) {
            return true;
        }
        return this.next.handle(username, passwd);
    }
}
