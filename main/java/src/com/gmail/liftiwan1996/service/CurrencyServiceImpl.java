package com.gmail.liftiwan1996.service;

public class CurrencyServiceImpl implements Currency {

  public double currency;


  public double checkCurrency(String category) {
    if (NewCurrency.GRIVNA.name.equals(category)) {
      this.currency = grivnaCurrencyService(currency);
    } else if (NewCurrency.DOLLAR.name.equals(category)) {
      this.currency = dollarCurrencyService(currency);
    } else if (NewCurrency.EURO.name.equals(category)) {
      this.currency = euroCurrencyService(currency);
    }
    return currency;
  }


  @Override
  public double grivnaCurrencyService(double currency) {
    return currency;
  }

  @Override
  public double dollarCurrencyService(double currency) {
    return currency / 25;
  }

  @Override
  public double euroCurrencyService(double currency) {
    return currency / 27;
  }
}