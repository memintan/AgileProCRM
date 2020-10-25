package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import com.agilePro.interfaces.Manager;
import lombok.Setter;

@Setter
public class PublicMessaging implements Admin {

private Manager manager;
/*
    public void setGroupMessaging(GroupMessaging groupMessaging) {
        this.groupMessaging = groupMessaging;
    }

 */

    public void manageMessages() {
        System.out.println(20 + manager.getMessages()+ " Public messages have been sent...");
    }
}