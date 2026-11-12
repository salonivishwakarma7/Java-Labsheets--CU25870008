class BankAccountBlock {
    int balance = 2000;

    Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }
    }
}

public class Q12SynchronizedBlock {
    public static void main(String[] args) {

        BankAccountBlock account = new BankAccountBlock();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                account.withdraw(1);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                account.withdraw(1);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + account.balance);
    }
}
