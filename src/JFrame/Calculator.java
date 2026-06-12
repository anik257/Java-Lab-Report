package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField num1Field, num2Field, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        addBtn = new JButton("ADD");
        subBtn = new JButton("SUB");
        mulBtn = new JButton("MUL");
        divBtn = new JButton("DIV");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(num1Field.getText());
        double n2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        if (e.getSource() == addBtn) result = n1 + n2;
        else if (e.getSource() == subBtn) result = n1 - n2;
        else if (e.getSource() == mulBtn) result = n1 * n2;
        else if (e.getSource() == divBtn) {
            if (n2 == 0) {
                resultField.setText("Cannot divide by zero");
                return;
            }
            result = n1 / n2;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}