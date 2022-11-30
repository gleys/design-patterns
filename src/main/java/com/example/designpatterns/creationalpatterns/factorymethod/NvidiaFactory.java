package com.example.designpatterns.creationalpatterns.factorymethod;

/**
 * NVIDIA 공장에서는 NVIDIA GPU를 생산
 * 만약 제조사에 인텔이 추가된다면 이전의 엔비디아와 amd의 공장을 변경하지 않고 gpu factory를 구체화한
 * intel factory를 만들면 됨. (확장엔 열려있고 변경엔 닫혀있음 : OCP 원칙 준수)
 * 구현인지 상속인지는 중요하지 않음 단지 각각의 팩토리와 상품들의 계층이 존재하고 실제 구현체는 구현 또는 상속받은 곳에서 만든다는 사실이 중요함.
 */
public class NvidiaFactory implements GpuFactory{
    @Override
    public Gpu createGpu() {
        return new NvidiaGpu();
    }
}
