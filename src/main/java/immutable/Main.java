package immutable;

/**
 * Created by Jeka on 08/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        Client.Builder builder = new Client.Builder();
        Client shani = builder.bonus(2000).name("Shani").debt(50).build();
        System.out.println(shani);
    }
}
