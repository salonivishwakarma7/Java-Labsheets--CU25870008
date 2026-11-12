class PriorityTask extends Thread {
    public void run() {
        System.out.println(getName() +
                " Priority: " + getPriority());
    }
}

public class Q9MultiplePriorities {
    public static void main(String[] args) {

        PriorityTask t1 = new PriorityTask();
        PriorityTask t2 = new PriorityTask();
        PriorityTask t3 = new PriorityTask();
        PriorityTask t4 = new PriorityTask();
        PriorityTask t5 = new PriorityTask();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");

        t1.setPriority(1);
        t2.setPriority(3);
        t3.setPriority(5);
        t4.setPriority(7);
        t5.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}