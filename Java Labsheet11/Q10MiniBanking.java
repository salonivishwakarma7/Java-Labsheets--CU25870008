import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10MiniBanking extends JFrame implements ActionListener {
    JTextField account, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    double currentBalance = 1000.0;

    Q10MiniBanking() {
        setTitle("Mini Banking Application");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField("1000.0");
        balance.setEditable(false);
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deposit) {
            try {
                double a = Double.parseDouble(amount.getText());

                if (a <= 0) {
                    JOptionPane.showMessageDialog(this,
                        "Enter a valid amount");
                    return;
                }

                currentBalance += a;
                balance.setText(String.valueOf(currentBalance));

                JOptionPane.showMessageDialog(this,
                    "Amount Deposited Successfully");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Enter a valid amount");
            }
        }

        else if (e.getSource() == withdraw) {
            try {
                double a = Double.parseDouble(amount.getText());

                if (a <= 0) {
                    JOptionPane.showMessageDialog(this,
                        "Enter a valid amount");
                } else if (a <= currentBalance) {
                    currentBalance -= a;
                    balance.setText(String.valueOf(currentBalance));

                    JOptionPane.showMessageDialog(this,
                        "Amount Withdrawn Successfully");
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Insufficient Balance");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Enter a valid amount");
            }
        }

        else if (e.getSource() == check) {
            JOptionPane.showMessageDialog(this,
                "Account Number: " + account.getText() +
                "\nCustomer Name: " + name.getText() +
                "\nCurrent Balance: " + currentBalance);
        }

        else if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            amount.setText("");
        }
    }

    public static void main(String[] args) {
        new Q10MiniBanking();
    }
}