package com.agilePro;

import com.agilePro.interfaces.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrmApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Admin admin1 = container.getBean("publicMessaging",Admin.class);

        Admin admin2 = container.getBean("publicMessaging",Admin.class);

        System.out.println("Pointing to the same object: "+ (admin1==admin2));

        System.out.println("Memory Location for the admin1 => "+admin1);
        System.out.println("Memory Location for the admin2 => "+admin2);

        System.out.println("admin1.hashCode() = " + admin1.hashCode());
        System.out.println("admin2.hashCode() = " + admin2.hashCode());


        //admin.manageMessages();

    }
}
