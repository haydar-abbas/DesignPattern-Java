package creational.factory;

public class BankB implements IBank {
    @Override
    public void withDrow() {
        System.out.println("From Bank B!");
    }
}
