package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import com.agilePro.interfaces.Manager;

public class PublicMessaging implements Admin {

    Manager manager;

    public PublicMessaging(Manager manager) {
        this.manager = manager;
    }

    public void manageMessages() {
        System.out.println(20 + manager.getMessages()+ " Public messages have been sent...");
    }
}
