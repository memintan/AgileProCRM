package com.agilePro.services;

import com.agilePro.interfaces.Admin;

public class PublicMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Public messages have been sent...");
    }

    public void myInitMethod(){
        System.out.println("Executing my init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing my destroy method");
    }
}
