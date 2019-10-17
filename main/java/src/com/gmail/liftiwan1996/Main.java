package com.gmail.liftiwan1996;

import com.gmail.liftiwan1996.service.CostAccountingService;
import com.gmail.liftiwan1996.service.ListExpense;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
       CostAccountingService service = new CostAccountingService();
        service.expenseOrIncome();
        service.inputDate();
    ArrayList<Object> list = new ArrayList<Object>();
    ListExpense expense = new ListExpense();
    list.add(expense);
    System.out.println(list.get(0));
  }
}
