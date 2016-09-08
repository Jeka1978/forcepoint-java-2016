package stam;

import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * Created by Jeka on 08/09/2016.
 */
public class ReflectionFieldSetter {
    public void set42ToAllXVars(Object o) throws IllegalAccessException {
        Class<?> c = o.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equalsIgnoreCase("x") && field.getType().equals(int.class)) {
                field.setAccessible(true);
                field.set(o,42);
            }
        }
    }
}
