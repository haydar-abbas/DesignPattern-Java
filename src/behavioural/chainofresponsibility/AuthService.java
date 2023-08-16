package behavioural.chainofresponsibility;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String passwd) {
        if (handler.handle(username, passwd)) {
            System.out.println("Authorization was successful!");
            //  Do stuff for authorized users
            return true;
        }
        return false;
    }
}
