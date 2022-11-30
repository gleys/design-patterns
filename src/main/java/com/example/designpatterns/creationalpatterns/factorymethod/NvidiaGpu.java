package com.example.designpatterns.creationalpatterns.factorymethod;

public class NvidiaGpu extends Gpu{

    public NvidiaGpu() {
        setManufacturer("NVIDIA");
        setChipset("RTX4090");
        setClock(2235);
        setNumberOfFan(3);
        setVramCapacity(24);
    }

    @Override
    void isCudaAvailable() {
        System.out.println("쿠다를 지원합니다.");
    }

    @Override
    void isDlssAvailable() {
        System.out.println("dlss를 지원합니다.");
    }
}
