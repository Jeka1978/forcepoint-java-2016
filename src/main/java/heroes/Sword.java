package heroes;

import java.util.Random;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Sword implements Weapon {
    @Override
    public void kick(Character c1, Character c2) {
        System.out.println("sword will cut your head");
        Random random = new Random();
        int damage = random.nextInt(c1.getPower());
        c2.decreaseHp(damage);
    }
}
