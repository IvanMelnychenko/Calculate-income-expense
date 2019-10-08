package com.gmail.liftiwan1996.Service;

public class DollarServiceImpl implements Currency {

  private double currencyDollar;

  @Override
  public double currencyService(double currency) {
    return currencyDollar = currency / 25;
  }
}


