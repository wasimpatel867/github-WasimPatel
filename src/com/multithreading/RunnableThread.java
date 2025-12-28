package com.multithreading;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThread(), "Thread-1");
        Thread t2 = new Thread(new RunnableThread(), "Thread-2");

        t1.start();
        t2.start();
    }
}
