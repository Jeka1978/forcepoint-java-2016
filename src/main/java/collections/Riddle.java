package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jeka on 06/10/2016.
 */
public class Riddle {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Arnold");
        strings.add("Chuck Norris");
        strings.add("Stallone");

        String personToRemove = "Arnold";

        strings.removeIf(s -> s.equals(personToRemove));

/*
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals(personToRemove)) {
                iterator.remove();
            }
        }*/

        System.out.println("strings = " + strings);
    }
}







