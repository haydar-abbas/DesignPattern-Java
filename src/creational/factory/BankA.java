package creational.factory;

public class BankA implements Bank {
    @Override
    public String createAccountBank() {
        return "Bank A!";
    }
}
