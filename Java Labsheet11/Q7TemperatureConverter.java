import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7TemperatureConverter extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    ButtonGroup group;
    JButton convert, clear;
    JLabel result;

    Q7TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Enter Temperature:"));
        temperature = new JTextField();
        add(temperature);

        add(new JLabel("Conversion:"));

        JPanel p = new JPanel();
        cToF = new JRadioButton("Celsius to Fahrenheit");
        fToC = new JRadioButton("Fahrenheit to Celsius");

        group = new ButtonGroup();
        group.add(cToF);
        group.add(fToC);

        p.add(cToF);
        p.add(fToC);
        add(p);

        convert = new JButton("Convert");
        clear = new JButton("Clear");
        add(convert);
        add(clear);

        result = new JLabel("Result will appear here");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double temp = Double.parseDouble(temperature.getText());
                double answer;

                if (cToF.isSelected()) {
                    answer = (temp * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + answer + " F");
                } else if (fToC.isSelected()) {
                    answer = (temp - 32) * 5 / 9;
                    result.setText("Celsius: " + answer + " C");
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Please select a conversion.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Please enter a valid temperature.");
            }
        } else {
            temperature.setText("");
            group.clearSelection();
            result.setText("Result will appear here");
        }
    }

    public static void main(String[] args) {
        new Q7TemperatureConverter();
    }
}
