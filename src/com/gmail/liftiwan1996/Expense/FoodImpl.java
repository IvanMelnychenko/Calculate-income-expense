package com.gmail.liftiwan1996.Expense;


public class FoodImpl implements Expense {

  private double expenseFood = 0;

  @Override
  public double addExpense(double expense) {
    return expenseFood = expenseFood + expense;
  }
}
