package com.company.atm;

public class ATMRunnable implements Runnable {
    private final ATMInstance atm = new ATMInstance();

    @Override
    public void run() {
        atm.putMoney(100);
        atm.getMoney(110);

    }

}
