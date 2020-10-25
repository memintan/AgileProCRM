import interfaces.Admin;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CrmApp {
    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        //Admin admin = (Admin)container.getBean("privateMessaging");
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Admin admin = container.getBean("publicMessaging",Admin.class);

        admin.manageMessages();

    }
}
