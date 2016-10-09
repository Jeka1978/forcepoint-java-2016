package java8;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Jeka on 09/10/2016.
 */
public class ListUtil {

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
            Thread.sleep(delay);
        }
    }



    public static <T> int calcDuplicates(List<T> list, T t, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t, t1)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "scala2", "groovy");
        int num = calcDuplicates(strings, "123456", (t1, t2) -> t1.length() == t2.length());

        Collections.sort(strings, (o1, o2) -> {
            return o1.length() - o2.length();
        });

        /*strings.forEach(System.out::println);*/
        forEachWithDelay(strings,1000,System.out::println);
    }


}
