package game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Jeka on 11/09/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Comparable<Player>{
    private String name;
    private int score;

    @Override
    public int compareTo(Player o) {
        return o.getScore() - this.getScore();
    }
}
