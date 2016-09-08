package stam;

import lombok.ToString;

/**
 * Created by Jeka on 08/09/2016.
 */
@ToString
public class Point {

    private int y;
    private int x;
    static {
        System.out.println(456);
    }

    {
        System.out.println(123);
    }

    public Point() {

        System.out.println("contstructor");
    }

    public Point(int x) {
        System.out.println(x);
    }

}
