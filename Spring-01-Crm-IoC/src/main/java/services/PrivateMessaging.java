package services;

import interfaces.Admin;

public class PrivateMessaging implements Admin {

    @Override
    public void manageMessages() {
        System.out.println("Private Message has been sent...");
    }
}
