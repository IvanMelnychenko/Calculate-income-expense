package com.gmail.liftiwan1996.Service;

public class GrivnaServiceImpl implements Currency {
  private double currencyGrivna;


  @Override
  public double currencyService(double currency) {
    return currencyGrivna = currency ;
  }

}