import java.awt.*;
import java.awt.event.*;

public class Q1StudentRegistration extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice semester;
    Button submit, reset;
    Label result;

    Q1StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(400, 450);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new Label("Student Name:"));
        name = new TextField();
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField();
        add(roll);

        add(new Label("Course:"));
        course = new TextField();
        add(course);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        Panel p = new Panel();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        p.add(male);
        p.add(female);
        add(p);

        add(new Label("Semester:"));
        semester = new Choice();
        for (int i = 1; i <= 8; i++)
            semester.add("Semester " + i);
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");
        add(submit);
        add(reset);

        result = new Label("");
        add(result);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = gender.getSelectedCheckbox() == null ?
                       "Not selected" : gender.getSelectedCheckbox().getLabel();

            result.setText("Registered: " + name.getText());

            System.out.println("Name: " + name.getText());
            System.out.println("Roll Number: " + roll.getText());
            System.out.println("Course: " + course.getText());
            System.out.println("Gender: " + g);
            System.out.println("Semester: " + semester.getSelectedItem());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(null);
            semester.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new Q1StudentRegistration();
    }
}