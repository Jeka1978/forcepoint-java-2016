package heroes;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Jeka on 11/09/2016.
 */
public class CharacterFactory {
    private Reflections scanner = new Reflections("heroes");
    private List<Class<? extends Character>> charactersTypes = new ArrayList<>();
    private static CharacterFactory ourInstance = new CharacterFactory();

    public static CharacterFactory getInstance() {
        return ourInstance;
    }

    private CharacterFactory() {
        Set<Class<? extends Character>> classes = scanner.getSubTypesOf(Character.class);
        for (Class<? extends Character> c : classes) {
            if (!Modifier.isAbstract(c.getModifiers())) {
                charactersTypes.add(c);
            }
        }
    }

    @SneakyThrows
    public Character getRandom() {
        Random random = new Random();
        Class<? extends Character> c =
                charactersTypes.get(random.nextInt(charactersTypes.size()));
        return c.newInstance();

    }
}











