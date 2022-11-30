package com.example.design_patterns.creational_patterns.singleton;

/**
 * eager init 을 사용하여 유일한 객체 생성 보장.
 * 단점으로 lazy init 이 불가능하다.
 */

public class ThreadSafe1 {

    private static final ThreadSafe1 instance = new ThreadSafe1();

    private ThreadSafe1() {};


    /**
     * 만약 default 생성자에서 checked 예외를 던질경우
     * static 블록을 이용하여 초기화시에 예외를 처리 해야한다.
     */
//    static {
//        try {
//            instance = new ThreadSafe1();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private ThreadSafe1() throws Exception {
//        throw new Exception("test");
//    };

    public static ThreadSafe1 getInstance() {
        return instance;
    }
}
