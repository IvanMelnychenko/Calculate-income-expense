package com.gmail.liftiwan1996.service;

import com.gmail.liftiwan1996.expense.ExpenseServiceImpl;
import com.gmail.liftiwan1996.income.SalaryServiceImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CostAccountingService {

  private ExpenseServiceImpl expenseService = new ExpenseServiceImpl();
  private SalaryServiceImpl salaryService = new SalaryServiceImpl();
  private CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
  public String type;
  public double sum2;
  public LocalDate inputDate;
  public LocalDate checkDate;
  public long period;

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
  LocalDate today = LocalDate.now();

  public void expenseOrIncome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input, what you want to count (Income or Expense)");
    String category = sc.nextLine();
    if (NewAccountingCost.EXPENSE.name.equals(category)) {
      calculateExpense();
    } else if (NewAccountingCost.INCOME.name.equals(category)) {
      calculateIncome();
    }
    type = category;
  }

  public double calculateExpense() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which type of expense do you want to count (Food or Transport or Home)?");
    String expense = sc.nextLine();
    Scanner sq = new Scanner(System.in);
    System.out.println("Input your expense, please");
    return currencyService.currency = expenseService.checkExpense(expense, sq.nextDouble());
  }

  public double calculateIncome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your salary, please");
    return currencyService.currency = salaryService.addSalary(sc.nextDouble());
  }

  public double typeOfCurrency() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input in which currency do you want to count?");
    return sum2 = currencyService.checkCurrency(sc.nextLine());
  }

  public void inputDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input date your " + type + " in format d/M/yyyy");
    inputDate = LocalDate.parse(sc.nextLine(), formatter);
    checkDate();
  }

  public void checkDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("For what period do you want see your " + type + " in days");
    period = sc.nextLong();
    checkDate = today.minusDays(period);
    if (inputDate.isAfter(checkDate)) {
      typeOfCurrency();
    } else {
      sum2 = 0;
    }
  }

  @Override
  public String toString() {
    return "Your " + type + " is " + sum2 + " for " + period + " days";
  }
}


