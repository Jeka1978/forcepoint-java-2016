package heroes;

import lombok.Setter;
import lombok.ToString;

import java.util.Random;

/**
 * Created by Jeka on 11/09/2016.
 */
@ToString
@Setter
public class King extends Character {

    public King() {
        Random random = new Random();
        setHp(5 + random.nextInt(10));
        setPower(5 + random.nextInt(10));
    }

    private Weapon weapon = new Sword();


    @Override
    public void kick(Character enemy) {
        weapon.kick(this, enemy);
    }

}
