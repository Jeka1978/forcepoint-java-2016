package java8;

import java.util.ArrayList;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Stam implements A,B {
    @Override
    public void x() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.forEach((x)-> System.out.println(x));
        B.super.x();
    }

}
