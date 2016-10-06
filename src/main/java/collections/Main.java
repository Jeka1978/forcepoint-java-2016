package collections;

/**
 * Created by Jeka on 06/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        for (int i = 0; i < 5; i++) {
            System.out.println(personService.findPersonById(2));
        }
    }
}
