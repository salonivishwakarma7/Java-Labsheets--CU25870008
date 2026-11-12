class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Q13GenericStudent {
    public static void main(String[] args) {

        Student<Integer, String, Double> s1 =
                new Student<>(101, "Rahul", 85.5);

        Student<Integer, String, Double> s2 =
                new Student<>(102, "Priya", 90.5);

        Student<Integer, String, Double> s3 =
                new Student<>(103, "Amit", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
