package com.gmail.liftiwan1996.expense;

public enum NewExpense {

  FOOD("Food"),

  HOME("Home"),

  TRANSPORT("Transport");

  public String name;

  NewExpense(String name) {
    this.name = name;
  }
}
