package com.example.designpatterns.creationalpatterns.factorymethod;

/**
 * AMD 공장에서는 AMD GPU를 생산
 */
public class AmdFactory implements GpuFactory{
    @Override
    public Gpu createGpu() {
        return new AmdGpu();
    }
}
