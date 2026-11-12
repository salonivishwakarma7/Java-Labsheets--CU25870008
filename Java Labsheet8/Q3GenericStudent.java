class StudentID<T> {
    T id;

    StudentID(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class Q3GenericStudent {
    public static void main(String[] args) {

        StudentID<Integer> s1 = new StudentID<>(101);

        s1.display();
    }
}
