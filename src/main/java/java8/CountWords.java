package java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Created by Jeka on 09/10/2016.
 */
public class CountWords {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("C:\\temp\\song.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
        OptionalDouble average = lines.map(String::toLowerCase).filter(s -> !s.isEmpty())
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .mapToDouble(String::length).average();
        System.out.println("sum = " + average.getAsDouble());

    }
}
