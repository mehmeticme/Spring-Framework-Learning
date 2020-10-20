import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class MyApp {

    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");

        mentor.createAccount();

        mentor = (Mentor) container.getBean("partTimeMentor");
        mentor.createAccount();

    }
}
