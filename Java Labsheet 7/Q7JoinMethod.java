class CalculationThread extends Thread {
    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }
}

public class Q7JoinMethod {
    public static void main(String[] args) {

        CalculationThread t = new CalculationThread();

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Task finished.");
    }
}
