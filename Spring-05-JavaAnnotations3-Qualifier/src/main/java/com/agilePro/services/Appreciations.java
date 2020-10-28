package com.agilePro.services;

import com.agilePro.interfaces.Manager;
import org.springframework.stereotype.Component;

@Component
public class Appreciations implements Manager {
    @Override
    public int getMessages() {
        return 12;
    }
}
