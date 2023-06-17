package creational.abstractfactory;

import creational.abstractfactory.banks.IBank;
import creational.abstractfactory.payments.IPaymentCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write your Bank Code: ");
        String bankCode = scan.next();

        System.out.print("Write your Card Number: ");
        String cardNumber = scan.next();

        IBankFactory bankFactory = new BankFactory();
        IBank bank = bankFactory.getBank(bankCode);
        IPaymentCard paymentCard = bankFactory.getPaymentCard(cardNumber);

        if(bank == null) {
            System.out.println("The Bank Code is invalid!");
            return;
        }
        if(paymentCard == null) {
            System.out.println("The Card Number is invalid!");
            return;
        }
        System.out.println(bank.createAccountBank());
        System.out.println(paymentCard.getPaymentCard());

        scan.close();
    }
}
