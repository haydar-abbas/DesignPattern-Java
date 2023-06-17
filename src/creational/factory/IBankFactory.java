package creational.factory;

import creational.factory.banks.IBank;

public interface IBankFactory {
    IBank getBank(String bankCode);
}
