package com.example.design_patterns.creational_patterns.singleton;

public class ThreadSafe3 {

    private static volatile ThreadSafe3 instance;

    private ThreadSafe3() {};

    /**
     * getInstance 메소드 전체에 lock을 걸지않고
     * 초기화 할 때만 lock을 걸기 때문에 최초 실행 이후 lock이 걸리지 않음.
     */
    public static ThreadSafe3 getInstance() {
        if(instance == null) {
            synchronized (ThreadSafe3.class) {
                //한번 더 확인을 해야 뒤따라 실행한 쓰레드를 거를 수 있음
                if(instance == null){
                    instance = new ThreadSafe3();
                }
            }
        }
        return instance;
    }
}
