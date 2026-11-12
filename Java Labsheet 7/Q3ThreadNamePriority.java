public class Q3ThreadNamePriority {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());

        t.setName("MyMainThread");

        System.out.println("New Thread Name: " + t.getName());
    }
}
