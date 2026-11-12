class AliveThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread is running.");
    }
}

public class Q6IsAlive {
    public static void main(String[] args) {

        AliveThread t = new AliveThread();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("While running: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After completion: " + t.isAlive());
    }
}
