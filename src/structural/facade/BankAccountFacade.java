package structural.facade;

public class BankAccountFacade {

    private final int accountNumber;
    private final int securityCode;

    WelcomeToBank bankWelcome;
    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withDrawCash(double cashToGet) {
        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)
        ) {
            fundChecker.makeWithDraw(cashToGet);
            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())
        ) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }
}
