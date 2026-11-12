import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q9StudentFeedback extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    ButtonGroup rating;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;

    Q9StudentFeedback() {
        setTitle("Student Feedback Form");
        setSize(500, 550);
        setLayout(new GridLayout(8, 2, 5, 5));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));

        JPanel ratingPanel = new JPanel();
        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        rating = new ButtonGroup();
        rating.add(excellent);
        rating.add(veryGood);
        rating.add(good);
        rating.add(average);
        rating.add(poor);

        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);
        add(ratingPanel);

        add(new JLabel("Feedback Areas:"));

        JPanel feedbackPanel = new JPanel();
        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        feedbackPanel.add(teaching);
        feedbackPanel.add(laboratory);
        feedbackPanel.add(material);
        feedbackPanel.add(assignments);
        add(feedbackPanel);

        add(new JLabel("Comments:"));
        comments = new JTextArea(3, 20);
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String r = "";

            if (excellent.isSelected()) r = "Excellent";
            else if (veryGood.isSelected()) r = "Very Good";
            else if (good.isSelected()) r = "Good";
            else if (average.isSelected()) r = "Average";
            else if (poor.isSelected()) r = "Poor";
            else r = "Not selected";

            String f = "";
            if (teaching.isSelected()) f += "Teaching, ";
            if (laboratory.isSelected()) f += "Laboratory, ";
            if (material.isSelected()) f += "Course Material, ";
            if (assignments.isSelected()) f += "Assignments, ";

            if (f.isEmpty()) f = "None";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + r +
                "\nFeedback: " + f +
                "\nComments: " + comments.getText());

        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            rating.clearSelection();

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new Q9StudentFeedback();
    }
}
