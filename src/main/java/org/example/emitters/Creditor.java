package org.example.emitters;

import org.example.events.PaymentMade;
import org.example.listeners.PaymentListener;

import java.util.ArrayList;
import java.util.List;

public class Creditor {
    private final String name;
    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public Creditor(String name) {
        this.name = name;
    };

    public void setPaymentListener(PaymentListener listener) {
        paymentListeners.add(listener);
    }

    public void sendMoney (String receiver, int amount) {
        System.out.printf("Confirmed. Ksh %d sent to %s\n", amount, receiver);
        firePaymentEvent(name, amount);
    }

    private void firePaymentEvent (String receiver, int amount) {
        PaymentMade payment = new PaymentMade(this, name, amount);
        for(PaymentListener listener: paymentListeners) {
            listener.sendSMS(payment);
        }
    }
}