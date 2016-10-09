package listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Jeka on 11/09/2016.
 */
public class ColorFrame extends JFrame {

    public ColorFrame() {
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("click to change color");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                getContentPane().setBackground(new Color(random.nextInt(255)));
            }
        });
        setVisible(true);
    }
}






