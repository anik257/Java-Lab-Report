package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame {
    public static void main(String[] args) {
        javax.swing.JFrame f1 = new javax.swing.JFrame("Checker");;

        JTextField t = new JTextField(4);
        JLabel a = new JLabel("Enter 1st number");
        JLabel a1 = new JLabel("Enter 2st number");
        JButton b = new JButton("ADD");
        JLabel j = new JLabel("Result");
        JTextField t1 = new JTextField(4);
        JButton b1 = new JButton("SUB");
        JButton b2 = new JButton("DIV");
        JButton b4 = new JButton("MUL");

        f1.setLayout(new FlowLayout());

        f1.add(a);
        f1.add(t);
        f1.add(a1);
        f1.add(t1);
        f1.add(b);
        f1.add(b1);
        f1.add(b2);
        f1.add(b4);
        f1.add(j);

        f1.getContentPane().setBackground(Color.PINK);
        
        f1.setSize(250, 300);
        f1.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}