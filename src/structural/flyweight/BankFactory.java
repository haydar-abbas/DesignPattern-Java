package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BankFactory {

    private final Map<String, IBank> banks = new HashMap<>();

    public IBank getBank(String bankCode) {
        if (this.banks.containsKey(bankCode)) {
            return this.banks.get(bankCode);
        }

        switch (bankCode) {
            case "111" -> this.banks.put(bankCode, new BankA());
            case "123" -> this.banks.put(bankCode, new BankB());
            default -> {
                return null;
            }
        }
        return this.banks.get(bankCode);
    }
}
