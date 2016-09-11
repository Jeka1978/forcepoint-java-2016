package zoo;

import java.util.ArrayList;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Integer(300));

        Integer x =1;
        x++;

        AnimalDoctor animalDoctor = new AnimalDoctor();
        animalDoctor.treat(new Cat());
        animalDoctor.treat(new Dog());
    }
}
