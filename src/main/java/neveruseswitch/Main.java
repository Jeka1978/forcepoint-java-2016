package neveruseswitch;

/**
 * Created by Jeka on 07/09/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}
