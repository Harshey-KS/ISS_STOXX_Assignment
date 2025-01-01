package Java.src.multithreading;

import java.util.concurrent.*;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Thread example
        MyThread thread1 = new MyThread();
        thread1.start();

        // Executor Service Example
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 executed"));
        executor.submit(() -> System.out.println("Task 2 executed"));
        executor.shutdown();

        // Volatile Example
        VolatileExample example = new VolatileExample();
        new Thread(example::increment).start();
        new Thread(example::increment).start();
    }
}

class VolatileExample {
    private volatile int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println("Counter: " + counter);
    }
}