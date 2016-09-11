package heroes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Jeka on 11/09/2016.
 */
@Getter
@Setter
@ToString
public abstract class Character {
    private int power;
    private int hp;



    abstract void kick(Character enemy);

    public void decreaseHp(int delta) {
        hp -= delta;
    }
}
