package io;

import demo.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Created by Jeka on 08/09/2016.
 */
public class MainReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\temp\\persons\\p.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        if (o instanceof List) {
            List list = (List) o;
            list.forEach(System.out::println);

        }

    }
}


