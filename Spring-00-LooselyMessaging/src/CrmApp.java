import interfaces.Admin;
import service.MessageServer;
import service.PrivateMessaging;
import service.PublicMessaging;

public class CrmApp {

    public static void main(String[] args) {
        PrivateMessaging pri = new PrivateMessaging();
        PublicMessaging pub = new PublicMessaging();


        MessageServer ms = new MessageServer(pub);

        ms.sendMessages();

    }
}
