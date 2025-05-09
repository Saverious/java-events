package org.example.events;

import java.util.EventObject;

public class PaymentMade extends EventObject {
    private int balance;
    private String message;

    public PaymentMade(Object source, String sender, int amount) {
        super(source);
        int oldBalance = this.balance;
        this.setNewBalance(amount);
        this.setMessage(sender, amount, oldBalance);
    }

    private void setNewBalance (int amount) {
        this.balance += amount;
    }

    private void setMessage (String sender, int amount, int oldBalance) {
        this.message = String.format("%s has sent Ksh %d to your account. Previous balance: %d, new balance: %d", sender, amount, oldBalance,  balance);
    }

    public int getBalance () { return balance; }

    public void sendMessage () {
        System.out.println(message);
    }
}
