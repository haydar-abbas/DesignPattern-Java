package creational.factory;

public class BankA implements IBank {
    @Override
    public void withDrow() {
        System.out.println("From Bank A!");
    }
}
