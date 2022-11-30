package com.example.design_patterns.creational_patterns.factory_method;

public class AmdGpu extends Gpu{

    public AmdGpu() {
        setManufacturer("AMD");
        setChipset("rx7900xt");
        setClock(1800);
        setNumberOfFan(3);
        setVramCapacity(24);
    }

    @Override
    void isCudaAvailable() {
        System.out.println("쿠다를 지원하지 않습니다.");
    }

    @Override
    void isDlssAvailable() {
        System.out.println("dlss를 지원하지 않습니다.");
    }
}
