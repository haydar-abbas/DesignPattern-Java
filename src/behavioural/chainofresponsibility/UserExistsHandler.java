package behavioural.chainofresponsibility;

public class UserExistsHandler extends Handler {
    private final Database db;

    public UserExistsHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(String username, String passwd) {
        if (!db.isValidUser(username)) {
            System.out.println("This user is not registered!");
            System.out.println("Sign up to out app now.");
            return false;
        }
        return this.handleNext(username, passwd);
    }
}
