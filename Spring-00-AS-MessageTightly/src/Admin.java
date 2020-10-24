public class Admin {
    PrivateMessaging privateMessaging;
    PublicMessaging publicMessaging;

    public Admin(PrivateMessaging privateMessaging, PublicMessaging publicMessaging) {
        this.privateMessaging = privateMessaging;
        this.publicMessaging = publicMessaging;
    }

    public void manageMessages(){
        privateMessaging.sendMessage();
        publicMessaging.sendMessage();
    }
}
