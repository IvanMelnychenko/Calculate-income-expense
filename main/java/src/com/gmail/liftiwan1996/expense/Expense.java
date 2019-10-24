package com.gmail.liftiwan1996.expense;

import java.time.LocalDate;

public class Expense {

  private double expenseGrivna = 0;
  private double expenseDollar = 0;
  private double expenseEuro = 0;
  private LocalDate expensedate;
  private String category;

  public Expense() {
  }

  public double getExpenseGrivna() {
    return expenseGrivna;
  }

  public void setExpenseGrivna(double expenseGrivna) {
    this.expenseGrivna = expenseGrivna;
  }

  public double getExpenseDollar() {
    return expenseDollar;
  }

  public void setExpenseDollar(double expenseDollar) {
    this.expenseDollar = expenseDollar;
  }

  public double getExpenseEuro() {
    return expenseEuro;
  }

  public void setExpenseEuro(double expenseEuro) {
    this.expenseEuro = expenseEuro;
  }

  public LocalDate getExpensedate() {
    return expensedate;
  }

  public void setDate(LocalDate expensedate) {
    this.expensedate = expensedate;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}