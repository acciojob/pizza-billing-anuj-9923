package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);

    System.out.println(dp.getPrice());
    dp.addExtraCheese();
    dp.addExtraCheese();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    p.getBill();
    p.getBill();
    System.out.println(p.getBill());
  }
}