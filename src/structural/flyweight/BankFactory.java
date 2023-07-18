package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BankFactory {

    private final Map<String, IBank> banks = new HashMap<>();

    public IBank getBank(String bankCode) {
        if (this.banks.containsKey(bankCode)) {
            return this.banks.get(bankCode);
        }
        IBank newBank;
        switch (bankCode) {
            case "111" -> {
                newBank = new BankA();
                this.banks.put(bankCode, newBank);
            }
            case "123" -> {
                newBank = new BankB();
                this.banks.put(bankCode, newBank);
            }
            default -> newBank = null;
        }
        return newBank;
    }
}
