package com.company.atm;

/**
 * ATMInstance class provides overridden from ATMBehavior interface methods for billing.
 */
public class ATMInstance implements ATMBehavior {
    private volatile int money;
    private static Object key = new Object();

    public boolean getMoney(int amount) {
        synchronized (key) {
            if (amount <= money) {
                money -= amount;
                System.out.println("Now amount: " + money);
                return true;
            } else {
                System.out.println("Not enough money!");
                return false;
            }
        }
    }

    public void putMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be more than 0! Amount: " + amount);
        } else {
            synchronized (key) {
                money += amount;
                System.out.println("Now amount: " + money);
            }
        }
    }
}