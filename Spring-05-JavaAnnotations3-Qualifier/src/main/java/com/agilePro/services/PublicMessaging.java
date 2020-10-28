package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import com.agilePro.interfaces.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class PublicMessaging implements Admin {

    // like this or....
//    @Autowired
//    @Qualifier("groupMessaging")
    private Manager manager;


    // like this.
    public PublicMessaging(@Qualifier("groupMessaging")Manager manager) {
        this.manager = manager;
    }

    @Override
    public void manageMessages() {

        System.out.println("Public messages have been sent=>..."+(4+manager.getMessages()));
    }

}
