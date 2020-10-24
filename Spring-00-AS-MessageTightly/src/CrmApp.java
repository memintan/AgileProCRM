public class CrmApp {
    public static void main(String[] args) {
        PrivateMessaging priv = new PrivateMessaging();
        PublicMessaging pub = new PublicMessaging();

        Admin admin = new Admin(priv,pub);
        admin.manageMessages();


    }
}
