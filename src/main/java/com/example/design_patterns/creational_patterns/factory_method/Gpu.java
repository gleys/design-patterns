package com.example.design_patterns.creational_patterns.factory_method;

public abstract class Gpu {
    String manufacturer;
    String chipset;
    int clock;
    int numberOfFan;
    int vramCapacity;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public void setNumberOfFan(int numberOfFan) {
        this.numberOfFan = numberOfFan;
    }

    public void setVramCapacity(int vramCapacity) {
        this.vramCapacity = vramCapacity;
    }

    void info() {
        System.out.println("제조사 : " + manufacturer);
        System.out.println("칩셋 : " + chipset);
        System.out.println("클럭 : " + clock + " MHz");
        System.out.println("팬 개수 : " + numberOfFan + " 개");
        System.out.println("vram 용량 : " + vramCapacity + " GB");
        isCudaAvailable();
        isDlssAvailable();
    }

    abstract void isCudaAvailable();
    abstract void isDlssAvailable();

}
