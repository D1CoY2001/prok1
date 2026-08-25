package org.example;

public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishment = 1_100;

        int bonus = 0;

        if (replenishment > 1_000) {
            bonus = replenishment / 100;
        }

        int totalBalance = initialBalance + replenishment + bonus;

        System.out.println("Итоговый счёт: " + totalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}