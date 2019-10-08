package com.gmail.liftiwan1996.Service;

import com.gmail.liftiwan1996.Expense.FoodImpl;
import com.gmail.liftiwan1996.Expense.HomeImpl;
import com.gmail.liftiwan1996.Expense.TransportImpl;
import com.gmail.liftiwan1996.Income.SalaryImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Service {


  private DollarServiceImpl dollar = new DollarServiceImpl();
  private EuroServiceImpl euro = new EuroServiceImpl();
  private GrivnaServiceImpl grivna = new GrivnaServiceImpl();
  private FoodImpl food = new FoodImpl();
  private TransportImpl transport = new TransportImpl();
  private HomeImpl home = new HomeImpl();
  private SalaryImpl salary = new SalaryImpl();
  private double expenseFood;
  private double expenseHome;
  private double expenseTransport;
  private double expenseTotal;
  private double incomeSalary;
  private double incomeTotal;


  public void getService() {
    expenseTotal = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
    LocalDate today = LocalDate.now();
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите что вы хотите подсчитать Ваши расходы или доходы");
    String txt1 = sc.nextLine();
    switch (txt1) {
      case "расходы":
        Scanner sq = new Scanner(System.in);
        System.out.println("Введите расходы на еду c датой Ваших растрат в формате: сумма растрат дд/мм/гггг");
        String txt2 = sq.nextLine();
        String[] txt3 = txt2.split(" ");
        expenseFood = Integer.parseInt(txt3[0]);
        LocalDate inputDateF = LocalDate.parse(txt3[1], formatter);

        Scanner sw = new Scanner(System.in);
        System.out.println("Введите расходы на Ваш дом c датой Ваших растрат в формате: сумма растрат дд/мм/гггг");
        String txt4 = sw.nextLine();
        String[] txt5 = txt4.split(" ");
        expenseHome = Integer.parseInt(txt5[0]);
        LocalDate inputDateH = LocalDate.parse(txt5[1], formatter);

        Scanner se = new Scanner(System.in);
        System.out.println(
            "Введите расходы на проезд в транспорте c датой Ваших поездок в формате: сумма растрат дд/мм/гггг");
        String txt6 = se.nextLine();
        String[] txt7 = txt6.split(" ");
        expenseTransport = Integer.parseInt(txt7[0]);
        LocalDate inputDateTr = LocalDate.parse(txt7[1], formatter);

        Scanner sr = new Scanner(System.in);
        System.out.println("Введите за какой промежуток времени вы хотите подсчитать Ваши расходы (в днях)");
        long date1 = sr.nextLong();
        LocalDate expenseDate = today.minusDays(date1);

        if (inputDateF.isAfter(expenseDate) == true) {
          expenseTotal = expenseTotal + food.addExpense(expenseFood);
        }
        if (inputDateH.isAfter(expenseDate) == true) {
          expenseTotal = expenseTotal + home.addExpense(expenseHome);
        }
        if (inputDateTr.isAfter(expenseDate) == true) {
          expenseTotal = expenseTotal + transport.addExpense(expenseTransport);
        }
        Scanner su = new Scanner(System.in);
        System.out.println("Введите тип валюты(доллар или гривна или евро)");
        String txtCurrency = su.nextLine();
        switch (txtCurrency) {
          case "гривна":
            System.out.println(
                "Ваши расходы за " + date1 + " дней cоставили " + grivna.currencyService(expenseTotal) + " гривен");
            break;
          case "евро":
            System.out.println(
                "Ваши расходы за " + date1 + " дней cоставили " + euro.currencyService(expenseTotal) + " евро");
            break;
          case "доллар":
            System.out.println(
                "Ваши расходы за " + date1 + " дней cоставили " + dollar.currencyService(expenseTotal) + " долларов");
            break;
          default:
            System.out.println("Введите тип валюты");
        }

        break;

      case "доходы":
        Scanner st = new Scanner(System.in);
        System.out.println("Введите Ваши доходы с датой в формате: сумма дохода дд/мм/гггг");
        String txt8 = st.nextLine();
        String[] txt9 = txt8.split(" ");
        incomeSalary = Integer.parseInt(txt9[0]);
        LocalDate inputDateIncome = LocalDate.parse(txt9[1], formatter);
        Scanner sy = new Scanner(System.in);
        System.out.println("Введите за какой промежуток времени вы хотите подсчитать Ваши расходы (в днях)");
        long date2 = sy.nextLong();
        LocalDate incomeDate = today.minusDays(date2);
        if (inputDateIncome.isAfter(incomeDate) == true) {
          incomeTotal = incomeTotal + salary.addSalary(incomeSalary);
        }
        Scanner sp = new Scanner(System.in);
        System.out.println("Введите тип валюты(доллар или гривна или евро)");
        String txtIncome = sp.nextLine();
        switch (txtIncome) {
          case "гривна":
            System.out.println(
                "Ваши доходы за " + date2 + " дней cоставили " + grivna.currencyService(incomeTotal) + " гривен");
            break;
          case "евро":
            System.out
                .println("Ваши доходы за " + date2 + " дней cоставили " + euro.currencyService(incomeTotal) + " евро");
            break;
          case "доллар":
            System.out.println(
                "Ваши доходы за " + date2 + " дней cоставили " + dollar.currencyService(incomeTotal) + " долларов");
            break;
          default:
            System.out.println("Введите тип валюты");
        }

      default:
        String outputText = "Введите слово расходы или доходы";
    }

  }

  public Service() {
  }
}

