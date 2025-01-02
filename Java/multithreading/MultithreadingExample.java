package Java.src.multithreading;

import java.util.concurrent.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MyThread extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);

    @Override
    public void run() {
        logger.info("{} is running.", Thread.currentThread().getName());
    }
}

public class MultithreadingExample {
    private static final Logger logger = LoggerFactory.getLogger(MultithreadingExample.class);

    public static void main(String[] args) {
        // Thread example
        MyThread thread1 = new MyThread();
        thread1.start();

        // Executor Service Example
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> logger.info("Task 1 executed"));
        executor.submit(() -> logger.info("Task 2 executed"));
        executor.shutdown();

        // Volatile Example
        VolatileExample example = new VolatileExample();
        new Thread(example::increment).start();
        new Thread(example::increment).start();
    }
}

class VolatileExample {
    private static final Logger logger = LoggerFactory.getLogger(VolatileExample.class);
    private volatile int counter = 0;

    public synchronized void increment() {
        counter++;
        logger.info("Counter: {}", counter);
    }
}
