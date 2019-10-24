package com.gmail.liftiwan1996.service;

import com.gmail.liftiwan1996.expense.Expense;
import com.gmail.liftiwan1996.income.Income;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CostAccountingService {

  private int sumExpense;
  private int sumIncome;
  private LocalDate inputDate;
  private LocalDate checkDate;
  private long period;
  private String category;
  private String currency;
  private List<Expense> listExpense = new ArrayList<>();
  private List<Income> listIncome = new ArrayList<>();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

  public void expenseOrIncome() {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    while (true) {
      System.out.println("Input, what you want to count (Income or Expense or Result)");
    category = sc.nextLine();
      if (category.equals("Result")) {
        break;
      }
      if (NewAccountingCost.EXPENSE.name.equals(category)) {
        mainExpense();
      } else if (NewAccountingCost.INCOME.name.equals(category)) {
        mainIncome();
      }
    }
  }

  public void mainExpense() {
    Expense expense = new Expense();
    String expensetext = typeOfExpense();
    expense.setCategory(expensetext);
    calculateExpense();
    if (currency.equals(NewCurrency.GRIVNA.name)) {
      expense.setExpenseGrivna(sumExpense);
    }
    if (currency.equals(NewCurrency.DOLLAR.name)) {
      expense.setExpenseDollar(sumExpense);
    }
    if (currency.equals(NewCurrency.EURO.name)) {
      expense.setExpenseEuro(sumExpense);
    }
    inputDate();
    expense.setDate(inputDate);
    listExpense.add(expense);
  }

  public void mainIncome() {
    Income income = new Income();
    calculateIncome();
    if (currency.equals(NewCurrency.GRIVNA.name)) {
      income.setIncomeGrivna(sumIncome);
    }
    if (currency.equals(NewCurrency.DOLLAR.name)) {
      income.setIncomeDollar(sumIncome);
    }
    if (currency.equals(NewCurrency.EURO.name)) {
      income.setIncomeEuro(sumIncome);
    }
    inputDate();
    income.setIncomedate(inputDate);
    listIncome.add(income);
  }

  public String typeOfExpense() {
    Scanner sc = new Scanner(System.in);
    String expenseType= "";
    System.out.println("Which type of expense do you want to count (Food or Transport or Home)?");
    expenseType = sc.nextLine();
    return  expenseType;
  }
  public int calculateExpense() {
    Scanner sq = new Scanner(System.in);
    System.out.println("Input your expense with type of currency, please, for example 11 (Grivna or Dollar Euro)");
    String expenseWithCurrency = sq.nextLine();
    String [] partOfExpense = expenseWithCurrency.split(" ");
    sumExpense = Integer.parseInt(partOfExpense[0]);
    currency = partOfExpense[1];
    return sumExpense;
  }

  public int calculateIncome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your salary with type of currency, please, for example 11 (Grivna or Dollar Euro)");
    String incomeWithCurrency = sc.nextLine();
    String [] partOfIncome = incomeWithCurrency.split(" ");
    sumIncome = Integer.parseInt(partOfIncome[0]);
    currency = partOfIncome[1];
    return sumIncome;
  }

  public void inputDate() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input date your " + category + " in format d/M/yyyy");
    inputDate = LocalDate.parse(sc.nextLine(), formatter);
  }

  public void checkDate() {
    LocalDate today = LocalDate.now();
    Scanner sc = new Scanner(System.in);
    System.out.println("For what period do you want see expense and income in days");
    period = sc.nextLong();
    checkDate = today.minusDays(period);
  }

  public long getPeriod() {
    return period;
  }

  public LocalDate getCheckDate() {
    return checkDate;
  }

  public List<Expense> getListExpense() {
    return listExpense;
  }

  public void setListExpense(List<Expense> listExpense) {
    this.listExpense = listExpense;
  }

  public List<Income> getListIncome() {
    return listIncome;
  }

  public void setListIncome(List<Income> listIncome) {
    this.listIncome = listIncome;
  }
}


