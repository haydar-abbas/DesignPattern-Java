package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BankFactory bankFactory = new BankFactory();

        IBank bankOne = bankFactory.getBank("111");
        IBank bankTwo = bankFactory.getBank("123");
        IBank bankThree = bankFactory.getBank("111");
        IBank bankFour = bankFactory.getBank("123");
        IBank bankFive = bankFactory.getBank("1234");

        List<IBank> banks = new ArrayList<>();
        banks.add(bankOne);
        banks.add(bankTwo);
        banks.add(bankThree);
        banks.add(bankFour);
        banks.add(bankFive);

        for (IBank bank : banks) {
            if (bank != null) {
                System.out.printf("1- %s: %d\n", bank.createBank(), bank.hashCode());
            } else {
                System.out.println("Bank code is invalid!!");
            }
        }
    }
}
