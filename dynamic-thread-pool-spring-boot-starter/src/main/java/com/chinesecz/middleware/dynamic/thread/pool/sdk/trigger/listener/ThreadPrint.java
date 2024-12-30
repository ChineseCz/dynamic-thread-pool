package com.chinesecz.middleware.dynamic.thread.pool.sdk.trigger.listener;



import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

public class ThreadPrint {
    private static int count = 0;
    private static final int MAX = 10000;

    static class Worker extends Thread {
        private final int id;

        public Worker(int id) {
            this.id = id;
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {}

        }

        @Override
        public void run() {
            while (count <= MAX) {
//                synchronized (ThreadPrint.class) {
                    if (count % 3 == id) {
                        System.out.println(Thread.currentThread().getName() + " " + count);
                        count++;
                    }
                System.out.println(Thread.currentThread().getName() + "X" + count);
//                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker thread0 = new Worker(0);
        Worker thread1 = new Worker(1);
        Worker thread2 = new Worker(2);


        thread1.start();
        thread0.start();
        thread2.start();

    }
}
