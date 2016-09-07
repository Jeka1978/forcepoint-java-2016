package neveruseswitch;

/**
 * Created by Jeka on 07/09/2016.
 */
public class MailSender {
    public void sendMail() {
        MailInfo mailInfo = DBUtils.getMailInfo();
        MailType mailType = MailType.findByDbCode(mailInfo.getMailType());
        String html = mailType.getMailGenerator().generateHtml(mailInfo);
        send(html);

    }

    private void send(String html) {
        System.out.println("sending " + html);
    }
}
