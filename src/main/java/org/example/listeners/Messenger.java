package org.example.listeners;

import org.example.events.PaymentMade;

public class Messenger implements PaymentListener {
    public void sendSMS (PaymentMade event) {
        event.sendMessage();
    }
}
