package service;

import interfaces.Admin;

public class PublicMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Public message has been sent...");
    }
}
