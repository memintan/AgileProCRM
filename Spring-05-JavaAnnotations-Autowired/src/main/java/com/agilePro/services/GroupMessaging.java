package com.agilePro.services;

import com.agilePro.interfaces.Manager;
import org.springframework.stereotype.Component;

@Component
public class GroupMessaging implements Manager {
    @Override
    public int getMessages() {
        return 4;
    }
}
