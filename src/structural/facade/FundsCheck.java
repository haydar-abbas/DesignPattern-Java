package structural.facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashWithdrawal) {
        if (cashWithdrawal > getCashInAccount()) {
            System.out.println("Error: You don't have enough money!");
            System.out.println("Current balance: " + getCashInAccount());
            return false;
        }
        decreaseCashInAccount(cashWithdrawal);
        System.out.println("Withdrawal complete, current balance is: " + getCashInAccount());
        return true;
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete, current balance is: " + getCashInAccount());
    }

}
