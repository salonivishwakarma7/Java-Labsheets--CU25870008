import java.awt.*;
import java.awt.event.*;

public class Q6EmployeeRegistration extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice department;
    TextArea result;
    Button submit, clear;

    Q6EmployeeRegistration() {
        setTitle("Employee Registration");
        setSize(450, 500);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new Label("Employee ID:"));
        id = new TextField();
        add(id);

        add(new Label("Employee Name:"));
        name = new TextField();
        add(name);

        add(new Label("Designation:"));
        designation = new TextField();
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField();
        add(salary);

        add(new Label("Gender:"));
        Panel p = new Panel();
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        p.add(male);
        p.add(female);
        add(p);

        add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Marketing");
        add(department);

        submit = new Button("Submit");
        clear = new Button("Clear");
        add(submit);
        add(clear);

        result = new TextArea(5, 30);
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

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

            try {
                double s = Double.parseDouble(salary.getText());

                result.setText(
                    "Employee ID: " + id.getText() +
                    "\nName: " + name.getText() +
                    "\nDesignation: " + designation.getText() +
                    "\nSalary: " + s +
                    "\nGender: " + g +
                    "\nDepartment: " + department.getSelectedItem()
                );
            } catch (NumberFormatException ex) {
                result.setText("Please enter a valid salary.");
            }
        } else {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            gender.setSelectedCheckbox(null);
            department.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new Q6EmployeeRegistration();
    }
}
