package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import org.springframework.stereotype.Component;

@Component
public class API implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("API respond has been waited...");
    }
}
