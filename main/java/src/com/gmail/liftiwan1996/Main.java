package com.gmail.liftiwan1996;

import com.gmail.liftiwan1996.expense.Expense;
import com.gmail.liftiwan1996.expense.NewExpense;
import com.gmail.liftiwan1996.income.Income;
import com.gmail.liftiwan1996.service.CostAccountingService;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws Exception {
    double expenseFoodGrivna = 0;
    double expenseFoodDollar = 0;
    double expenseFoodEuro = 0;

    double expenseHomeGrivna = 0;
    double expenseHomeDollar = 0;
    double expenseHomeEuro = 0;

    double expenseTransportGrivna = 0;
    double expenseTransportDollar = 0;
    double expenseTransportEuro = 0;

    double incomeGrivna = 0;
    double incomeDollar = 0;
    double incomeEuro = 0;

    CostAccountingService service = new CostAccountingService();
    service.checkDate();
    service.expenseOrIncome();
    ArrayList<Expense> listExpenseFood = new ArrayList<>();
    ArrayList<Expense> listExpenseHome = new ArrayList<>();
    ArrayList<Expense> listExpenseTransport = new ArrayList<>();
    for (Expense expense : service.getListExpense()) {
      if (expense.getCategory().equals(NewExpense.FOOD.name)) {
        listExpenseFood.add(expense);
      }
      if (expense.getCategory().equals(NewExpense.HOME.name)) {
        listExpenseHome.add(expense);
      }
      if (expense.getCategory().equals(NewExpense.TRANSPORT.name)) {
        listExpenseTransport.add(expense);
      }
    }
    for (Expense expense : listExpenseFood) {
      if (expense.getExpensedate().isAfter(service.getCheckDate())) {
        expenseFoodDollar += expense.getExpenseDollar();
        expenseFoodGrivna += expense.getExpenseGrivna();
        expenseFoodEuro += expense.getExpenseEuro();
      }
    }
    for (Expense expense : listExpenseHome) {
      if (expense.getExpensedate().isAfter(service.getCheckDate())) {
        expenseHomeDollar += expense.getExpenseDollar();
        expenseHomeGrivna += expense.getExpenseGrivna();
        expenseHomeEuro += expense.getExpenseEuro();
      }
    }
    for (Expense expense : listExpenseTransport) {
      if (expense.getExpensedate().isAfter(service.getCheckDate())) {
        expenseTransportDollar += expense.getExpenseDollar();
        expenseTransportGrivna += expense.getExpenseGrivna();
        expenseTransportEuro += expense.getExpenseEuro();
      }
    }
    for (Income income : service.getListIncome()) {
      if (income.getIncomedate().isAfter(service.getCheckDate())) {
        incomeDollar += income.getIncomeDollar();
        incomeGrivna += income.getIncomeGrivna();
        incomeEuro += income.getIncomeEuro();
      }
    }
    System.out.println("calculate for " + service.getPeriod() + " days");
    System.out.println();
    System.out.println("Your expense");
    System.out.println("Food");
    System.out.println("in Dollars " + expenseFoodDollar);
    System.out.println("in Grivna " + expenseFoodGrivna);
    System.out.println("in Euro " + expenseFoodEuro);
    System.out.println();
    System.out.println("Home");
    System.out.println("in Dollars " + expenseHomeDollar);
    System.out.println("in Grivna " + expenseHomeGrivna);
    System.out.println("in Euro " + expenseHomeEuro);
    System.out.println();
    System.out.println("Transport");
    System.out.println("in Dollars " + expenseTransportDollar);
    System.out.println("in Grivna " + expenseTransportGrivna);
    System.out.println("in Euro " + expenseTransportEuro);
    System.out.println();
    System.out.println("Your income");
    System.out.println("in Dollars " + incomeDollar);
    System.out.println("in Grivna " + incomeGrivna);
    System.out.println("in Euro " + incomeEuro);
  }
}
