package neveruseswitch;

/**
 * Created by Jeka on 07/09/2016.
 */
@MailCode(2)
public class CallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //60 lines code
        return "don't call us we call you";
    }
}
