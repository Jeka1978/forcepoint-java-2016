package heroes;

import java.util.Random;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CharacterFactory factory = CharacterFactory.getInstance();
        System.out.println(factory.getRandom());
        System.out.println(factory.getRandom());
        System.out.println(factory.getRandom());
        System.out.println(factory.getRandom());

       /* King king = new King();
        King king1 = new King();
        Random random = new Random();
        while (true) {
            System.out.println(king1.getHp());
            king.kick(king1);
            Thread.sleep(2000);
            if (random.nextInt(3) == 2) {
                king.setWeapon(new Shotgun());
            }else {

                king.setWeapon(new Sword());
            }
        }
*/
    }
}
