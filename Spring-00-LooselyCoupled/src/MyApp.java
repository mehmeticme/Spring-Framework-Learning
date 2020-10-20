import service.FullTimeMentor;
import service.MentorAccount;

public class MyApp {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTimeMentor);
        mentor.manageAccount();
    }



}
