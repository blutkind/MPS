package postingrules;

import mf.*;
import mf.Currency;

import java.util.*;

public class AccountTester extends junit.framework.TestCase {
    private Account receivables = new Account(Currency.USD);
    private Account revenue = new Account(Currency.USD);
    private Account deferred = new Account(Currency.USD);

    public AccountTester(String name) {
        super(name);
    }
    public void setUp() {
        receivables.addEntry(Money.dollars(500), new MfDate(1999, 12, 4));
        receivables.addEntry(Money.dollars(300), new MfDate(2000, 1, 4));
        receivables.addEntry(new Entry(Money.dollars(-400), new MfDate(2000, 2, 15)));
    }
    public void testNewAccountIsValid() {
        assertTrue(receivables.isValid());
    }
    public void testEntriesAreAddedCorrectly() { //condsider ditching this one
        List<Entry> entries = new ArrayList<Entry>();
        entries.add(new Entry(Money.dollars(500), MfDate.today()));
        entries.add(new Entry(Money.dollars(300), MfDate.today()));
        entries.add(new Entry(Money.dollars(-400), MfDate.today()));
        assertEquals(Money.dollars(400), Entry.total(entries));
    }
    public void testAddingOtherCurrencyCausesException() {
        try {
            receivables.addEntry(new Money(10, Currency.DEM), new MfDate(1999, 12, 4));
            fail();
        } catch (IllegalArgumentException correctReponse) {
        }
        assertEquals(Money.dollars(400), receivables.balance());
    }
    public void testBalanceOfEmptyAccountIsZero() {
        Account empty = new Account(Currency.USD);
        assertEquals(Money.dollars(0), empty.balance());
    }
    public void testBalanceIsSumOfEntries() {
        assertEquals(Money.dollars(400), receivables.balance());
        assertEquals(Money.dollars(800), receivables.balance(new MfDate(2000, 2, 1)));
        assertEquals(Money.dollars(-100), receivables.balance(new DateRange(new MfDate(2000, 1, 1), new MfDate(2000, 12, 31))));
    }
    public void testBalanceWorksUsingTransactions() {
        receivables = new Account(Currency.USD);
        revenue.withdraw(Money.dollars(500), receivables, new MfDate(1, 4, 99));
        revenue.withdraw(Money.dollars(200), deferred, new MfDate(1, 4, 99));
        assertEquals(Money.dollars(500), receivables.balance());
        assertEquals(Money.dollars(200), deferred.balance());
        assertEquals(Money.dollars(-700), revenue.balance());
    }
    public void testCopyMakesCopiesOfEntriesInNewAccount() {
        Account copy = receivables.copy();
        assertEquals(Money.dollars(400), copy.balance());
        copy.addEntry(Money.dollars(200), MfDate.today());
        assertEquals(Money.dollars(600), copy.balance());
        assertEquals(Money.dollars(400), receivables.balance());
        assertTrue(copy.isValid());

    }
    public void testDepositsSumsPositiveEntries() {
        assertEquals(Money.dollars(300), receivables.deposits(new DateRange(new MfDate(2000, 1, 1), new MfDate(2000, 12, 31))));
    }
    public void testBalanceSumsCorrectlyWithNonDollars() { //consider remove
        Account newAccount = new Account(Currency.DEM);
        newAccount.addEntry(new Money(10, Currency.DEM), MfDate.today());
        assertEquals(new Money(10, Currency.DEM), newAccount.balance());
        DateRange range = new DateRange(MfDate.today(), MfDate.today());
        assertEquals(new Money(10, Currency.DEM), newAccount.deposits(range));
        assertEquals(new Money(0, Currency.DEM), newAccount.withdrawels(range));
    }
    public void testWithdrawelsSumsNegativeEntries() {
        assertEquals(Money.dollars(-400), receivables.withdrawels(new DateRange(new MfDate(2000, 1, 1), new MfDate(2000, 12, 31))));
        assertEquals(Money.dollars(0), receivables.withdrawels(new DateRange(new MfDate(1999, 1, 1), new MfDate(1999, 12, 31))));
    }
}
