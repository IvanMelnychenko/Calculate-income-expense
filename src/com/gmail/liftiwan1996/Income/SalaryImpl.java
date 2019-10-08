package com.gmail.liftiwan1996.Income;

public class SalaryImpl implements Income {

  private double salary;

  @Override
  public double addSalary(double income) {
    return salary = income + salary;
  }
}