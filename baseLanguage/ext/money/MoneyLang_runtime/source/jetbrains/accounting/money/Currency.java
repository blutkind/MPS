package jetbrains.accounting.money;

import java.math.BigDecimal;

public class Currency {
  private String myCurrency;
  private BigDecimal myAmount;

  public Currency(String amount,String currency) {
    this(new BigDecimal(amount),currency);
  }

  public Currency(BigDecimal amount, String currency) {
    myCurrency = currency;
    this.myAmount = amount;
  }

  public String getCurrency() {
    return myCurrency;
  }

  public String getAmount() {
    return myAmount.toString();
  }

  protected void checkCurrencyCompability(Currency c) throws NotCompatibleCurrencies {
    if (!myCurrency .equals(c.myCurrency ) ){
      throw new NotCompatibleCurrencies();
    }
  }

  public Currency add(Currency c) throws NotCompatibleCurrencies {
    checkCurrencyCompability(c);
    return new Currency(myAmount.add(c.myAmount),myCurrency);
  }

  public Currency sub(Currency c) throws NotCompatibleCurrencies {
    checkCurrencyCompability(c);
    return new Currency(myAmount.add(c.myAmount.negate()),myCurrency);
  }

  public Currency mul(int n){
    return new Currency(this.myAmount.multiply(new BigDecimal(n)),myCurrency);
  }

  public Currency div(int n){
    return new Currency(this.myAmount.divide(new BigDecimal(n)),myCurrency);
  }

  public int compareTo(Currency c) throws NotCompatibleCurrencies {
    checkCurrencyCompability(c);
    return myAmount.compareTo(c.myAmount);
  }

  public String toString() {
    return myAmount + myCurrency;
  }

  public boolean isZero(){
    return myAmount.compareTo(new BigDecimal("0.00")) == 0;
  }

  public boolean equals(Object o){
    if (!(o instanceof Currency)){
      return false;
    }else{
      Currency c = (Currency) o;
      if ((myCurrency .equals(c.myCurrency)) &&(myAmount.equals(c.myAmount))){
        return true;
      }else{
        return false;
      }
    }
  }

  public int hashCode() {
    return myAmount.hashCode() * 283 + myCurrency.hashCode();
  }
}
