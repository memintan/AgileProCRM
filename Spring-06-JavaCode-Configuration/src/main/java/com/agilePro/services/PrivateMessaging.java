package com.agilePro.services;

import com.agilePro.interfaces.Admin;

public class PrivateMessaging implements Admin {
    @Override
    public void getTeachingHours() {
        System.out.println("Private message has been sent...");
    }
}
