package structural.flyweight;

public class Main {

    public static void main(String[] args) {

        BankFactory bankFactory = new BankFactory();

        IBank bankOne = bankFactory.getBank("111");
        System.out.printf("1- %s: %d\n", bankOne.createBank(), bankOne.hashCode());

        IBank bankTwo = bankFactory.getBank("123");
        System.out.printf("2- %s: %d\n", bankTwo.createBank(), bankTwo.hashCode());

        IBank bankThree = bankFactory.getBank("111");
        System.out.printf("3- %s: %d\n", bankThree.createBank(), bankThree.hashCode());

        IBank bankFour = bankFactory.getBank("123");
        System.out.printf("4- %s: %d\n", bankFour.createBank(), bankFour.hashCode());
    }
}
