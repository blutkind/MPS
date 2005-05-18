package postingrules;

/*Generated by MPS*/


import formulaAdapter.*;
import jetbrains.mps.formulaLanguage.api.DoubleConstant;
import jetbrains.mps.formulaLanguage.api.IfFunction;
import jetbrains.mps.formulaLanguage.api.MultiplyOperation;
import mf.*;

public class AgreementRegistryBuilder_prototype {
  public void setUp(AgreementRegistry registry) {
    System.out.println("!!!!! setUp: " + this);
    registry.register("regular", this.setUpRegular());
    registry.register("lowPay", this.setUpLowPay());
  }
  public ServiceAgreement setUpRegular() {
    ServiceAgreement result = new ServiceAgreement();
    result.registerValue("BASE_RATE");
    result.setValue("BASE_RATE", 10.0, MfDate.PAST);
    result.registerValue("CAP");
    result.setValue("CAP", new Quantity(50, Unit.KWH), MfDate.PAST);
    result.setValue("CAP", new Quantity(60, Unit.KWH), new MfDate(1999, 12, 1));
    result.registerValue("REDUCED_RATE");
    result.setValue("REDUCED_RATE", 5.0, MfDate.PAST);
    result.addPostingRule(EventType.USAGE, new PostingRule_Formula(AccountType.BASE_USAGE, true, new MoneyAdapter(new MultiplyOperation(new DoubleConstant(10.0), new UsageDouble()), Currency.USD)), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyAddOperation(new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.5)), new MoneyConstant(10.0, Currency.USD))), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyAddOperation(new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.5)), new MoneyConstant(15.0, Currency.USD))), new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.TAX, new PostingRule_Formula(AccountType.TAX, false, new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.055))), new MfDate(1999, 10, 1));
    return result;
  }
  public ServiceAgreement setUpLowPay() {
    ServiceAgreement result = new ServiceAgreement();
    result.registerValue("BASE_RATE");
    result.setValue("BASE_RATE", 10.0, MfDate.PAST);
    result.setValue("BASE_RATE", 12.0, new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.USAGE, new PostingRule_Formula(AccountType.BASE_USAGE, true, new IfFunction<Money>(new QuantityGreaterThenOperation(new UsageQuantity(), new QuantityConstant(50.0, Unit.KWH)), new MoneyAdapter(new MultiplyOperation(new DoubleConstant(10.0), new UsageDouble()), Currency.USD), new MoneyAdapter(new MultiplyOperation(new DoubleConstant(5.0), new UsageDouble()), Currency.USD))), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyConstant(10.0, Currency.USD)), new MfDate(1999, 10, 1));
    result.addPostingRule(EventType.SERVICE_CALL, new PostingRule_Formula(AccountType.SERVICE, true, new MoneyAddOperation(new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.5)), new MoneyConstant(15.0, Currency.USD))), new MfDate(1999, 12, 1));
    result.addPostingRule(EventType.TAX, new PostingRule_Formula(AccountType.TAX, false, new MoneyMultiplyOperation(new FeeMoney(), new DoubleConstant(0.055))), new MfDate(1999, 10, 1));
    return result;
  }
}
