public class Q8ThreeValues {

    static <T> void display(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        display(10, 20, 30);

        display("Java", "Python", "C++");

        display(10.5, 20.5, 30.5);
    }
}
