package com.agilePro;

import com.agilePro.interfaces.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrmApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Admin admin = container.getBean("privateMessaging", Admin.class);
        admin.manageMessages();
    }
}
