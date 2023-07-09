package creational.factory;

import creational.factory.banks.IBank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write your Bank Code: ");
        String bankCode = scan.next();

        BankFactory bankFactory = new BankFactory();
        IBank bank = bankFactory.getBank(bankCode);

        if(bank == null) {
            System.out.println("The Bank Code is invalid!");
            return;
        }
        System.out.println(bank.createAccountBank());
        scan.close();
    }
}
