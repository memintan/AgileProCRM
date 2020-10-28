package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import org.springframework.stereotype.Component;

@Component
public class PrivateMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Private messages have been sent...");

    }
}
