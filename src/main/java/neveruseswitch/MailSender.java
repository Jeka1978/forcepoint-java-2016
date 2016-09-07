package neveruseswitch;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jeka on 07/09/2016.
 */
public class MailSender {
    private Map<Integer, MailGenerator> map = new HashMap<>();

    public MailSender() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("neveruseswitch");
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> clazz : classes) {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
                MailCode annotation = clazz.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new RuntimeException("if you implement " + MailGenerator.class.getName() + " you need to annotated it with @MailCode");
                }
                int value = annotation.value();
                if (map.containsKey(value)) {
                    throw new RuntimeException(value + " already exists");
                }
                map.put(value, clazz.newInstance());
            }
        }
    }

    public void sendMail() {
        MailInfo mailInfo = DBUtils.getMailInfo();
        int mailType = mailInfo.getMailType();
        MailGenerator mailGenerator = map.get(mailType);
        if (mailGenerator == null) {
            throw new RuntimeException("dbcode " + mailType + " not bound");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html);

    }

    private void send(String html) {
        System.out.println("sending " + html);
    }
}
