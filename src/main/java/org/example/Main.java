package org.example;

import org.example.emitters.Creditor;
import org.example.listeners.Messenger;

public class Main {
    public static void main(String[] args) {
        Creditor creditor = new Creditor("John");
        creditor.setPaymentListener(new Messenger());
        creditor.sendMoney("Jane", 5000);
    }
}