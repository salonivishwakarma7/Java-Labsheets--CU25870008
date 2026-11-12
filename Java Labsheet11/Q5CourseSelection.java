import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q5CourseSelection extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    ButtonGroup gender;
    JCheckBox java, python, dbms;
    JButton submit, reset;

    Q5CourseSelection() {
        setTitle("Course Selection Form");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(new String[]{"BCA", "BBA", "BSc", "MCA"});
        add(course);

        add(new JLabel("Gender:"));
        JPanel p = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        p.add(male);
        p.add(female);
        add(p);

        add(new JLabel("Subjects:"));
        JPanel subjects = new JPanel();
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");
        subjects.add(java);
        subjects.add(python);
        subjects.add(dbms);
        add(subjects);

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
            String g = male.isSelected() ? "Male" :
                       female.isSelected() ? "Female" : "Not selected";

            String s = "";
            if (java.isSelected()) s += "Java ";
            if (python.isSelected()) s += "Python ";
            if (dbms.isSelected()) s += "DBMS ";

            if (s.isEmpty()) s = "None";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + g +
                "\nSubjects: " + s);
        } else {
            name.setText("");
            course.setSelectedIndex(0);
            gender.clearSelection();
            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q5CourseSelection();
    }
}
