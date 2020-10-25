package com.agilePro.services;

import com.agilePro.interfaces.Admin;

public class PublicMessaging implements Admin {

    GroupMessaging groupMessaging;

    public void manageMessages() {
        System.out.println(20 + groupMessaging.getMessages()+ "Public messages have been sent...");
    }
}
