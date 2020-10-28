package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import com.agilePro.interfaces.Manager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class PublicMessaging implements Admin {

    private Manager manager;

    public PublicMessaging(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Public message has been sent...=> " +(30+manager.getMessages()));
    }

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "PublicMessaging{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
