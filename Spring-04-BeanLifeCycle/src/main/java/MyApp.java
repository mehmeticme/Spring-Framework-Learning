import com.practice.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = (Course) container.getBean("javaClass");

        course.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();
    }
}
