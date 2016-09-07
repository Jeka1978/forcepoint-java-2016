package neveruseswitch;

import lombok.Getter;

/**
 * Created by Jeka on 07/09/2016.
 */
@Getter
public enum  MailType {
    WELCOME(1,new WelcomeMailGenerator(),"welcome mail"),
    EMAIL_CALLBACK(2, new CallbackMailGenerator(), "call back");

    private final int code;
    private final MailGenerator mailGenerator;
    private final String desc;

    MailType(int code, MailGenerator mailGenerator, String desc) {
        this.code = code;
        this.mailGenerator = mailGenerator;
        this.desc = desc;
    }
    public static MailType findByDbCode(int dbCode) {
        MailType[] mailTypes = values();
        for (MailType mailType : mailTypes) {
            if (mailType.code == dbCode) {
                return mailType;
            }
        }
        throw new RuntimeException("dbcode " + dbCode + " not bound");
    }
}
