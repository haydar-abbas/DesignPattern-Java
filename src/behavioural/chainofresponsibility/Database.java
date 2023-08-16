package behavioural.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("Haydar", "admin");
        users.put("Abbas", "user");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPasswd(String username, String passwd) {
        return users.get(username).equals(passwd);
    }
}
