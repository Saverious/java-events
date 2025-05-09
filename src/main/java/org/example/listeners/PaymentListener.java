package org.example.listeners;

import org.example.events.PaymentMade;

public interface PaymentListener {
    void sendSMS(PaymentMade event);
}
