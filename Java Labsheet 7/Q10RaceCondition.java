class BankAccount {
    int balance = 2000;

    void withdraw(int amount) {
        if (balance >= amount) {
            int temp = balance;
            Thread.yield();
            balance = temp - amount;
        }
    }
}

public class Q10RaceCondition {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

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
