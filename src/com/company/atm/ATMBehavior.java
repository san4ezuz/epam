package com.company.atm;

/**
 * Provides  billing methods for ATMInstance class.
 */
public interface ATMBehavior {
    boolean getMoney(int amount);

    void putMoney(int amount);
}
