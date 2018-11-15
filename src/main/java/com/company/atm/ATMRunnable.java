package com.company.atm;

/**
 * Creates a process that deposits 100 funds on the account and then tries to withdraw 110 funds.
 */
public class ATMRunnable implements Runnable {
    private final ATMInstance atm = new ATMInstance();

    @Override
    public void run() {
        atm.putMoney(100);
        atm.getMoney(110);
    }
}