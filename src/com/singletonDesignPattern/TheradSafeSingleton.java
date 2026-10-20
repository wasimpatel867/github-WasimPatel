package com.singletonDesignPattern;

public class TheradSafeSingleton {
    private static volatile TheradSafeSingleton instance;

    // Private constructor to prevent instantiation
    private TheradSafeSingleton() {
    }

    // Double-Checked Locking - more efficient than synchronizing entire method
    public static TheradSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (TheradSafeSingleton.class) {
                if (instance == null) {
                    instance = new TheradSafeSingleton();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        TheradSafeSingleton s = TheradSafeSingleton.getInstance();
    }
}
