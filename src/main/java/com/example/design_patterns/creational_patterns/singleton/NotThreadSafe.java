package com.example.design_patterns.creational_patterns.singleton;

/**
 * 해당 싱글톤은 thread safe 하지 않는다
 *           1번 쓰레드                              2번 쓰레드
 * 1.   if(instance == null) {
 * 2.                                       if(instance == null) {
 * 3.   instance = new NotThreadSafe();
 * 4.                                       instance = new NotThreadSafe();
 * 5.   return instance; }
 * 6.                                       return instance; }
 *
 * result       object1                             object2
 * 결론 : 쓰레드 1번의 초기화 시점에 쓰레드 2번도 초기화를 하게되면 서로 다른 객체가 생성된다.
 *
 */
public class NotThreadSafe {
    private static NotThreadSafe instance;

    //생성자를 private으로 선언하여 외부에서 생성 불가능
    private NotThreadSafe() {};

    /**
     * getInstance 메소드가 static이 아닐경우 기본 생성자가 private 이기 때문에
     * 해당 객체의 인스턴스에 접근할 방법이 아예 없어지게 됨.
     * static으로 선언시 컴파일 시점에 메모리의 static 영역에 해당 메소드가 올라가고
     * static 영역은 쓰레드에서 공유하므로 밖에서 항상 해당 메소드를 통해 객체 접근 가능해짐.
     */
    public static NotThreadSafe getInstance() {
        if(instance == null) {
            instance = new NotThreadSafe();
        }
        return instance;
    }
}
