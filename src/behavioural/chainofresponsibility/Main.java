package behavioural.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database));
        handler.setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("Haydar", "admin");
    }
}
