package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class PublicMessaging implements Admin {
    @Override
    public void getTeachingHours() {
        System.out.println("Public message has been sent...");
    }
}
