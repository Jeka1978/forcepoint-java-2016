package neveruseswitch;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * Created by Jeka on 07/09/2016.
 */
public class DBUtils {

    private static Random random= new Random();
    private static DataFactory dataFactory = new DataFactory();

    public static MailInfo getMailInfo() {

        return new MailInfo(dataFactory.getName(),random.nextInt(3)+1);
    }
}
