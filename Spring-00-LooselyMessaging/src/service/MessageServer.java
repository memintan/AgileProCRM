package service;

import interfaces.Admin;

public class MessageServer {

    Admin admin;

    public MessageServer(Admin admin) {
        this.admin = admin;
    }
    public void sendMessages(){
        this.admin.manageMessages();
    }
}
