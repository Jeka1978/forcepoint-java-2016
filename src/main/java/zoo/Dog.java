package zoo;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("gav gav");
    }

    public void fetchSteak() {
        System.out.println("fetching...");
    }
}
