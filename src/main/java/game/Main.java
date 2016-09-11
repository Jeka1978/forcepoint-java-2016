package game;

import javax.swing.*;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.play(10);
        gameManager.printBestScores();
        gameManager.play(20);
        gameManager.printBestScores();
    }
}
