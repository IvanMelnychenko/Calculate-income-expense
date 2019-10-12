package com.gmail.liftiwan1996.expense;


public class ExpenseServiceImpl implements Expense {

  public double expense;


  public double checkExpense(String category, double expense) {
    if (NewExpense.FOOD.name.equals(category)) {
      addExpenseFood(expense);
    } else if (NewExpense.HOME.name.equals(category)) {
      addExpenseHome(expense);
    } else if (NewExpense.TRANSPORT.name.equals(category)) {
      addExpenseTransport(expense);
    }
    return this.expense = expense;
  }


  @Override
  public double addExpenseFood(double expense) {
    return expense;
  }

  @Override
  public double addExpenseHome(double expense) {
    return expense;
  }

  @Override
  public double addExpenseTransport(double expense) {
    return expense;
  }
}
