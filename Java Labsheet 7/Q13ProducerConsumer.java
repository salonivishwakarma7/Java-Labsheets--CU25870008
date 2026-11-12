class Buffer {
    int value;
    boolean available = false;

    synchronized void produce(int num) {
        try {
            while (available) {
                wait();
            }

            value = num;
            System.out.println("Produced: " + value);

            available = true;
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + value);

            available = false;
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q13ProducerConsumer {
    public static void main(String[] args) {

        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
