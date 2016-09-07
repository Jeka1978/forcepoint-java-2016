package neveruseswitch;

/**
 * Created by Jeka on 07/09/2016.
 */
@MailCode(3)
public class DinnerReminderMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "Lets go eat";
    }
}
