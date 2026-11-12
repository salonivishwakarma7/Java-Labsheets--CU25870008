class CountThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Q4TwoThreads {
    public static void main(String[] args) {

        CountThread t1 = new CountThread();
        CountThread t2 = new CountThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
