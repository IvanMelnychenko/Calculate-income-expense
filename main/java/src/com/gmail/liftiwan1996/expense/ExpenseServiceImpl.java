package com.gmail.liftiwan1996.expense;


public class ExpenseServiceImpl implements Expense {

  public double expense;

  public double checkExpense(String category, double expense) {
    if (NewExpense.FOOD.name.equals(category)) {
      addExpense(expense);
    } else if (NewExpense.HOME.name.equals(category)) {
      addExpense(expense);
    } else if (NewExpense.TRANSPORT.name.equals(category)) {
      addExpense(expense);
    }
    return expense;
  }


  @Override
  public double addExpense(double expense) {
    return this.expense = this.expense + expense;
  }
}
