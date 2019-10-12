package com.gmail.liftiwan1996;

import com.gmail.liftiwan1996.service.CostAccountingService;

public class Main {

    public static void main(String[] args) {
        CostAccountingService service = new CostAccountingService();
        service.expenseOrIncome();
        service.inputDate();
        System.out.println(service.toString());
    }
}
