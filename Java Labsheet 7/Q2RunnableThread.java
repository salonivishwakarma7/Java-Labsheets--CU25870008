class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Saloni");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q2RunnableThread {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
