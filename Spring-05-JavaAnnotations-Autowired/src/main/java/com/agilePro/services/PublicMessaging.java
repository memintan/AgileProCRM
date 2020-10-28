package com.agilePro.services;

import com.agilePro.interfaces.Admin;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//with lombok
//@AllArgsConstructor
public class PublicMessaging implements Admin {

    @Autowired
    private GroupMessaging groupMessaging;

    /*
    //Constructor Injection
    //@Autowired
    public PublicMessaging(GroupMessaging groupMessaging) {
        this.groupMessaging = groupMessaging;
    }

     */

    /*
    //Setter Injection
    public GroupMessaging getGroupMessaging() {
        return groupMessaging;
    }

    @Autowired
    public void setGroupMessaging(GroupMessaging groupMessaging) {
        this.groupMessaging = groupMessaging;
    }

     */

    @Override
    public void manageMessages() {

        System.out.println("Public messages have been sent=>..."+(3+groupMessaging.getMessages()));
    }

}
