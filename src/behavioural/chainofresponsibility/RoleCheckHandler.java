package behavioural.chainofresponsibility;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String passwd) {
        if ("Haydar".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return this.handleNext(username, passwd);
    }
}
