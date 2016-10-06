package tdd;

import lombok.SneakyThrows;
import org.omg.CORBA.Object;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.Set;

/**
 * Created by Jeka on 06/10/2016.
 */
public class TestRunner {
    @SneakyThrows
    public static void main(String[] args) {
        Reflections reflections = new Reflections("tdd");
        Set<Class<? extends Object>> classes = reflections.getSubTypesOf(Object.class);
        for (Class<? extends Object> aClass : classes) {
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
               /* if (method.isAnnotationPresent(Test.class)) {
                    Object object = aClass.newInstance();
                    method.invoke(object);
                }*/
            }
        }
    }
}
