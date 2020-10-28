package com.agilePro;

import com.agilePro.interfaces.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.plaf.IconUIResource;

@Component
public class  CrmApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Admin admin = container.getBean("publicMessaging", Admin.class);

        admin.manageMessages();

        System.out.println("admin.toString() = " + admin.toString());


    }
}
