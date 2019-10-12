package com.gmail.liftiwan1996.income;

public class SalaryServiceImpl implements Income {

  private double salary;

  public void checkSalary(String category) {
    if (NewIncome.SALARY.name.equals(category)) {
      addSalary(salary);
    }
  }

  @Override
  public double addSalary(double income) {
    return salary = income + salary;
  }
}