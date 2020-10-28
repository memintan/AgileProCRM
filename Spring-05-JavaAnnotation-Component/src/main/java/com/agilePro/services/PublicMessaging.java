package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import org.springframework.stereotype.Component;

@Component
public class PublicMessaging implements Admin {
    @Override
    public void manageMessages() {

        System.out.println("Public messages have been sent...");
    }

}
