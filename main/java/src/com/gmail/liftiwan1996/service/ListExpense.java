package com.gmail.liftiwan1996.service;

public class ListExpense {
  private double expense;
  private String currency;
  private long days;

  public ListExpense() {
  }

  public double getExpense() {
    return expense;
  }

  public void setExpense(double expense) {
    this.expense = expense;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public long getDays() {
    return days;
  }

  public void setDays(long days) {
    this.days = days;
  }
}
