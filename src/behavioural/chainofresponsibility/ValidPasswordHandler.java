package behavioural.chainofresponsibility;

public class ValidPasswordHandler extends Handler {
    private final Database db;

    public ValidPasswordHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(String username, String passwd) {
        if (!db.isValidPasswd(username, passwd)) {
            System.out.println("Wrong password!");
            return false;
        }
        return this.handleNext(username, passwd);
    }
}
