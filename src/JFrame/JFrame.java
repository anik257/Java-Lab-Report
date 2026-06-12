package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame {
    public static void main(String[] args) {

        javax.swing.JFrame frame =
                new javax.swing.JFrame("Anik's Frame");

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.getContentPane().setBackground(Color.PINK);

        JLabel label = new JLabel("Welcome, Ajaj Anwar Anik!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(label);

        frame.setVisible(true);
    }
}