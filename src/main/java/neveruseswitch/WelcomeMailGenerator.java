package neveruseswitch;

/**
 * Created by Jeka on 07/09/2016.
 */
@MailCode(1)
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //60 lines code
        return "welcome " + mailInfo.getClientName();
    }
}
