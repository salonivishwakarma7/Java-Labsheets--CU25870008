import java.awt.*;
import java.awt.event.*;

public class Q2SimpleCalculator extends Frame implements ActionListener {
    TextField num1, num2;
    Label result;
    Button add, sub, mul, div;

    Q2SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(350, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Second Number:"));
        num2 = new TextField();
        add(num2);

        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        add(add);
        add(sub);
        add(mul);
        add(div);

        result = new Label("Result: ");
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double r = 0;

            if (e.getSource() == add)
                r = a + b;
            else if (e.getSource() == sub)
                r = a - b;
            else if (e.getSource() == mul)
                r = a * b;
            else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                r = a / b;
            }

            result.setText("Result: " + r);
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Q2SimpleCalculator();
    }
}
