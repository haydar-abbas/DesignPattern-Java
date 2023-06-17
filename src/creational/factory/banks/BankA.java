package creational.factory.banks;

public class BankA implements IBank {
    @Override
    public String createAccountBank() {
        return "Bank A!";
    }
}
