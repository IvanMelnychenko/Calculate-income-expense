package com.gmail.liftiwan1996.Service;

public class EuroServiceImpl implements Currency {

  private double currencyEuro;


  @Override
  public double currencyService(double currency) {
    return currencyEuro = currency / 27;
  }

}
