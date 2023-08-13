package structural.facade;

public class AccountNumberCheck {

    public int getAccountNumber() {
        return 12345678;
    }

    public boolean accountActive(int acctNumToCheck) {
        return (acctNumToCheck == getAccountNumber());
    }
}
