package java8;

/**
 * Created by Jeka on 09/10/2016.
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2);
}
