package com.example.design_patterns.creational_patterns.factory_method;

/**
 * gpu 공장의 공통적인 작업 orderGpu(주문전체 과정), delivery(배송), validate(제조사, 주소 검증) 부분은
 * 어떤 gpu를 주문하던지 항상 같다.
 * 하지만 createGpu의 경우 제조사별로 칩셋의 설계가 다르기 때문에 만드는 방법도 다를것이다.
 * 해당 부분은 GpuFactory를 구현하는 구체 클래스(NVIDA, AMD) 공장에서 구현한다.
 */
public interface GpuFactory {

    default Gpu orderGpu(String name, String address) {
        validate(name, address);
        Gpu gpu = createGpu();
        delivery(address);
        return gpu;
    }

    private void delivery(String address) {
        System.out.println("상품을 배송지로 배송하였습니다.");
        System.out.println("배송지 주소 : " + address);
    };

    private void validate(String name, String address) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("제조사를 입력하세요.");
        }

        if(address == null || address.isBlank()) {
            throw new IllegalArgumentException("배송지를 입력하세요.");
        }
    }

    Gpu createGpu();
}
