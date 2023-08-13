package structural.facade;

public class Main {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withDrawCash(50.00);
        accessingBank.withDrawCash(900.00);
        accessingBank.depositCash(200.00);
    }
}
