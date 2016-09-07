package demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 07/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Person sheni = new Person("Sheni", 18);
        Person sheni2 = new Person("Sheni", 18);
        System.out.println(sheni.equals(sheni2));

        List<String> strings = Arrays.asList("1", "2", "3");
        strings.forEach(System.out::println);


    }
}
