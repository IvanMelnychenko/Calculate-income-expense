package com.gmail.liftiwan1996.income;

import java.time.LocalDate;

public class Income {

  private double incomeGrivna = 0;
  private double incomeDollar = 0;
  private double incomeEuro = 0;
  private LocalDate incomedate;

  public Income() {
  }

  public double getIncomeGrivna() {
    return incomeGrivna;
  }

  public void setIncomeGrivna(double incomeGrivna) {
    this.incomeGrivna = incomeGrivna;
  }

  public double getIncomeDollar() {
    return incomeDollar;
  }

  public void setIncomeDollar(double incomeDollar) {
    this.incomeDollar = incomeDollar;
  }

  public double getIncomeEuro() {
    return incomeEuro;
  }

  public void setIncomeEuro(double incomeEuro) {
    this.incomeEuro = incomeEuro;
  }

  public LocalDate getIncomedate() {
    return incomedate;
  }

  public void setIncomedate(LocalDate incomedate) {
    this.incomedate = incomedate;
  }
}
