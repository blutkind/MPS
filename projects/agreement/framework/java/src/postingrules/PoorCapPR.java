package postingrules;

import mf.*;

public class PoorCapPR extends PostingRule {
    public PoorCapPR(AccountType type, boolean isTaxable) {
        super(type, isTaxable);
    }
    protected Money calculateAmount(AccountingEvent evt) {
        Quantity amountUsed = ((Usage) evt).getAmount();
        Quantity usageLimit = (Quantity) evt.getAgreement().getValue("CAP", evt.getWhenOccurred());
        final double reducedRate = (Double) evt.getAgreement().getValue("REDUCED_RATE", evt.getWhenOccurred());
        return (amountUsed.isGreaterThan(usageLimit)) ?
                Money.dollars(amountUsed.getAmount() * (Double) evt.getAgreement().getValue("BASE_RATE", evt.getWhenOccurred())) :
                Money.dollars(amountUsed.getAmount() * reducedRate);
    }
}
