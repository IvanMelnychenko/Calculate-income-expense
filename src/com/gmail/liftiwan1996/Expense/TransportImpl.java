package com.gmail.liftiwan1996.Expense;

public class TransportImpl implements Expense {

  private double expenseTr = 0;

  @Override
  public double addExpense(double expense) {
    return expenseTr = expenseTr + expense;
  }
}

