package com.gmail.liftiwan1996.Expense;

public class HomeImpl implements Expense {

  private double expenseHome = 0;

  @Override
  public double addExpense(double expense) {
    return expenseHome = expense + expenseHome;
  }
}