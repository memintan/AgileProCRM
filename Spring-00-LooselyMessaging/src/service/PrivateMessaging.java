package service;

import interfaces.Admin;

public class PrivateMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Private message has been sent...");
    }
}
