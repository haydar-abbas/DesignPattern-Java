package creational.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write your code-bank: ");
        String codeBank = scan.next();

        IBank bank = BankFactory.getBank(codeBank);

        if(bank != null) {
            bank.withDrow();
        } else {
            System.out.println("The code-bank is invalid!");
        }
    }
}
