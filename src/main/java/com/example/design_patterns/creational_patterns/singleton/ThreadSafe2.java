package com.example.design_patterns.creational_patterns.singleton;

/**
 * getInstance 메소드 전체에 lock을 걸기 때문에
 * instance가 초기화 된 이후에도 매번 lock이 걸려 성능저하
 */
public class ThreadSafe2 {

    private static ThreadSafe2 instance;

    private ThreadSafe2() {};

    /**
     * 자바의 모든 객체는 고유의 lock을 가지고 있다.
     * 한 클래스의 서로 다른 메소드가 synchronized 블록을 가지고 있을시에
     * 여러개의 쓰레드가 각자 다른 메소드를 실행하여도 최초 메소드를 실행한
     * 쓰레드에서 해당 class의 lock을 획득하기(고유락 재진입) 때문에 기다려야 한다.
     *
     * 반면 static synchronized 경우
     * 각 클래스 단위로 락을 걸기 때문에 각각의 쓰레드마다 lock을 공유하지 않는다.
     */
    public static synchronized ThreadSafe2 getInstance() {
        if(instance == null) {
            instance = new ThreadSafe2();
        }
        return instance;
    }
}
