package postingrules;

import mf.*;
import mf.Currency;

import java.util.*;

public class Customer extends NamedObject implements Subject {
//<codeFragment name = "serviceAgreement">
    private ServiceAgreement serviceAgreement;
//</codeFragment>

//<codeFragment name = "accounts">
    private Map<AccountType, Account> accounts;
    public Customer(String name) {
        _name = name;
        setUpAccounts();
    }
    void setUpAccounts() {
        accounts = new HashMap<AccountType, Account>();
        for (AccountType type : AccountType.values())
            accounts.put(type, new Account(Currency.USD, type));
    }
    public Account accountFor(AccountType type) {
        assert accounts.containsKey(type);
        return accounts.get(type);
    }
    public void addEntry(Entry arg, AccountType type) {
        accountFor(type).addEntry(arg);
    }
    public Money balanceFor(AccountType key) {
        return accountFor(key).balance();
    }
//</codeFragment>

    void clearEntries() {
        setUpAccounts();
    }
    /**
     * I
     *
     * @return java.util.Map
     */
    public java.util.Map getAccounts() {
        return accounts;
    }
    public Subject getAdjuster() {
        return this;
    }
    public ServiceAgreement getServiceAgreement() {
        return serviceAgreement;
    }
    public void reverseEntry(Entry arg) {
        Entry reversingEntry = new Entry(arg.getAmount().negate(),
                arg.getDate());
        accountFor(arg.getAccount().type()).addEntry(reversingEntry);
    }
//<codeFragment name = "process">
    public void process(AccountingEvent e) {
        serviceAgreement.process(e);
    }
//</codeFragment>

    public void setAccounts(Map arg) {
        accounts = arg;
    }
    public void setServiceAgreement(ServiceAgreement arg) {
        serviceAgreement = arg;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        AccountType[] types = accountTypes();
        for (int i = 0; i < types.length; i++) {
            result.append(types[i]);
            result.append(": ");
            result.append(accountFor(types[i]).balance());
            result.append("\n");
        }
        return result.toString();
    }
    AccountType[] accountTypes() {
        return (AccountType[]) accounts.keySet().toArray(new AccountType[0]);
    }

}
