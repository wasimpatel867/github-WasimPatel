package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () ->
                System.out.println(Thread.currentThread().getName() + "executing task");
        executor.submit(task);
        executor.submit(task);
        executor.submit(task);

        executor.shutdown();

    }
}
