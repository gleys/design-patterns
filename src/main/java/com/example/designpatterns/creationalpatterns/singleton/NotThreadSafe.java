package com.example.designpatterns.creationalpatterns.singleton;

public class Normal {
    private static Normal instance;

    private Normal() {};

    public static Normal getInstance() {
        if(instance == null) {
            instance = new Normal();
        }
        return instance;
    }

    public static void main(String[] args) {
        Normal instance1 = Normal.getInstance();
        Normal instance2 = Normal.getInstance();

        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("instance1");
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Normal.getInstance());
                    }
                }
        );

        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("instance2");
                        System.out.println(Normal.getInstance());
                    }
                }
        );

        thread1.start();
        thread2.start();

    }
}
