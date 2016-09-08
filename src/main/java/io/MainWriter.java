package io;

import demo.Person;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeka on 08/09/2016.
 */
public class MainWriter {
    @SneakyThrows
    public static void main(String[] args)  {
        File file = new File("C:\\temp\\persons\\p.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        Person sheni = new Person("Shani", 18);
        Person itzhak = new Person("Ithak", 35);
        List<Person> persons = new ArrayList<>();
        persons.add(sheni);
        persons.add(itzhak);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(persons);
        oos.close();

    }
}







