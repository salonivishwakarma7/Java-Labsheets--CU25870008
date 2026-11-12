import java.util.Random;

class TaskThread extends Thread {
    public void run() {
        Random r = new Random();

        try {
            Thread.sleep(r.nextInt(501));
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " is executing.");
    }
}

public class Q5RandomSleep {
    public static void main(String[] args) {

        TaskThread t1 = new TaskThread();
        TaskThread t2 = new TaskThread();
        TaskThread t3 = new TaskThread();

        t1.setName("Reader");
        t2.setName("Writer");
        t3.setName("Logger");

        t1.start();
        t2.start();
        t3.start();
    }
}

