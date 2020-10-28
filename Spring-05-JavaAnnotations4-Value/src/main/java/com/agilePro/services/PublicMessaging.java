package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import com.agilePro.interfaces.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class PublicMessaging implements Admin {

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "PublicMessaging{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

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
