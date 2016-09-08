package stam;

/**
 * Created by Jeka on 08/09/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Point point = new Point();
        ReflectionFieldSetter fieldSetter = new ReflectionFieldSetter();
        fieldSetter.set42ToAllXVars(point);
        System.out.println("point = " + point);
    }
}
