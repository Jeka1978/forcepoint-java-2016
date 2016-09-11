package zoo;

/**
 * Created by Jeka on 11/09/2016.
 */
public class AnimalDoctor {
    public void treat(Animal animal) {
        animal.makeVoice();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetchSteak();
        }
    }
}
