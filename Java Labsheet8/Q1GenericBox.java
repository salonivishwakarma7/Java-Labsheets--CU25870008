class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Q1GenericBox {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Hello Java");
        Box<Double> b3 = new Box<>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}