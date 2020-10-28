package com.agilePro;

import com.agilePro.configs.CrmAppConfig;
import com.agilePro.interfaces.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CrmApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CrmAppConfig.class);

        Admin admin = container.getBean("publicMessaging", Admin.class);

        admin.getTeachingHours();

        System.out.println("admin.toString() = " + admin.toString());


    }
}
