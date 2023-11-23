package poolpattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TelephonePoolManager {
    private static final TelephonePoolManager poolManager = new TelephonePoolManager();
    private static final int POOL_SIZE = 3;
    private final BlockingQueue<Telephone> pool;

    private TelephonePoolManager() {
        pool = new LinkedBlockingQueue<>(POOL_SIZE);
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < POOL_SIZE; i++) {
            Telephone telephone = new Telephone(i);
            boolean successfullyAdded = pool.offer(telephone);
            if (!successfullyAdded) {
                System.err.println("Failed to add Telephone to the pool during initialization. Pool may be full.");
            }
        }
    }

    public static Telephone borrowClient() throws InterruptedException {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] is waiting for borrow request");
        return poolManager.pool.take();
    }

    public static void returnClient(Telephone client) {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] is returning PhoneNum with Phone Number: [" + client.getPhoneNum() + "]");
        if (!poolManager.pool.offer(client)) {
            System.out.println("Failed to return PhoneNum to the pool. Pool is full.");
        }
    }

}