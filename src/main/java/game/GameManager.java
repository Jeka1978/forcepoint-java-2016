package game;

import javax.swing.*;
import java.util.*;

/**
 * Created by Jeka on 11/09/2016.
 */
public class GameManager {
    private List<Player> players = new ArrayList<>();

    public void printBestScores() {
        players.sort(Player::compareTo);
        players.stream().limit(5).forEach(System.out::println);
        /*Collections.sort(players);
        for (int i = 0; i < 5; i++) {
            if (players.size() <= i) {
                break;
            }
            System.out.println(players.get(i));
        }*/
    }

    public void play(int max) {
        Random random = new Random();
        int num = random.nextInt(max);
        int userGuess = -1;
        int numberOfGuesses=0;
        while (userGuess != num) {
            numberOfGuesses++;
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
            if (userGuess > num) {
                JOptionPane.showMessageDialog(null,"too big");
            }
            if (userGuess < num) {
                JOptionPane.showMessageDialog(null,"too small");
            }
        }
        finish(numberOfGuesses);
    }

    private void finish(int numberOfGuesses) {
        String userName = JOptionPane.showInputDialog("you won!!!, what is your name");
        players.add(new Player(userName,numberOfGuesses));
    }


}
