package com.gmail.liftiwan1996.service;

import com.gmail.liftiwan1996.expense.Expense;
import com.gmail.liftiwan1996.expense.ExpenseServiceImpl;
import com.gmail.liftiwan1996.income.SalaryServiceImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CostAccountingService {

  private ExpenseServiceImpl expenseService = new ExpenseServiceImpl();
  private SalaryServiceImpl salaryService = new SalaryServiceImpl();
  private CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
  private ListExpense listExpense = new ListExpense();
  private ListIncome listIncome = new ListIncome();
  public String category;
  public double sumCurrency;
  public LocalDate inputDate;
  public LocalDate checkDate;
  public long period;

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
  LocalDate today = LocalDate.now();

  public void expenseOrIncome() {
    boolean isCategory = true;
    Scanner sc = new Scanner(System.in);
    while (isCategory) {
      System.out.println("Input, what you want to count (Income or Expense or Result)");
      category = sc.nextLine();
      if (category.equals("Result")) {
        break;
      }
      if (NewAccountingCost.EXPENSE.name.equals(category)) {
        calculateExpense();
      } else if (NewAccountingCost.INCOME.name.equals(category)) {
        calculateIncome();
      }
    }
  }

  public double calculateExpense() {
    Scanner sc = new Scanner(System.in);
    Scanner sq = new Scanner(System.in);
    boolean isExpense = true;
    String expense = "";
    double sumExpense = 0;

    while (isExpense) {
      System.out.println("Which type of expense do you want to count (Food or Transport or Home or Result)?");
      expense = sc.nextLine();
      if (expense.equals("Result")) {
        isExpense = false;
        break;
      }
      System.out.println("Input your expense, please");
      sumExpense = sq.nextDouble();
      expenseService.checkExpense(expense, sumExpense);
    }
    return currencyService.currency = expenseService.expense;
  }


  public double calculateIncome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your salary, please");
    return currencyService.currency = salaryService.addSalary(sc.nextDouble());
  }

  public double typeOfCurrency() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input in which currency do you want to count?");
    String currency = sc.nextLine();
    sumCurrency = currencyService.checkCurrency(currency);
    if (category.equals("Expense")) {
      listExpense.setExpense(sumCurrency);
      listExpense.setCurrency(currency);
    }
   /* if(category.equals("Income")){
      listIncome.setIncome(sumCurrency);
    }*/
    return sumCurrency;
  }

  public void inputDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input date your " + category + " in format d/M/yyyy");
    inputDate = LocalDate.parse(sc.nextLine(), formatter);
    checkDate();
  }

  public void checkDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("For what period do you want see your " + category + " in days");
    period = sc.nextLong();
    if (category.equals("Expense")) {
      listExpense.setDays(period);
    }

    checkDate = today.minusDays(period);
    if (inputDate.isAfter(checkDate)) {
      typeOfCurrency();
    } else {
      sumCurrency = 0;
    }
  }

  @Override
  public String toString() {
    return "Your " + category + " is " + sumCurrency + " for " + period + " days";
  }
}


