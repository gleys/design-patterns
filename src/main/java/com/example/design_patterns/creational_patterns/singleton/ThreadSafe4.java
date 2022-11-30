package com.example.design_patterns.creational_patterns.singleton;

public class ThreadSafe4 {

    private ThreadSafe4() {};

    private static class ThreadSafeHolder {
        private static final ThreadSafe4 SAFE = new ThreadSafe4();
    }

    // inner 클래스의 메소드를 실행 하기 전 까지 객체의 초기화가 일어나지 않는다.
    // 그리고 inenr 클래스는 outer class의 필드에 접근 가능함.
    public static ThreadSafe4 getInstance() {
        return ThreadSafeHolder.SAFE;
    }
}
