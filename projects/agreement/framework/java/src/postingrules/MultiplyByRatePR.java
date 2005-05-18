package postingrules;

import mf.*;

//<codeFragment name = "all">
public class MultiplyByRatePR extends PostingRule {
    public MultiplyByRatePR(AccountType type, boolean isTaxable) {
        super(type, isTaxable);
    }
    protected Money calculateAmount(AccountingEvent evt) {
        Usage usageEvent = (Usage) evt;
        return Money.dollars(usageEvent.getAmount().getAmount() *
                (Double) usageEvent.getAgreement().getValue("BASE_RATE", usageEvent.getWhenOccurred()));
    }
}
//</codeFragment>

