package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import org.springframework.stereotype.Component;

@Component
public class PublicMessaging implements Admin {

    private GroupMessaging groupMessaging;

    @Override
    public void manageMessages() {

        System.out.println("Public messages have been sent=>..."+(3+groupMessaging.getMessages()));
    }

}
