package com.example.design_patterns.creational_patterns.factory_method;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new NvidiaFactory(), "NVIDIA", "우리집");
        client.print(new AmdFactory(), "AMD", "우리집");
    }

    private void print(GpuFactory factory, String manufacture, String address) {
        factory.orderGpu(manufacture, address).info();
        System.out.println("\n");
    }
}
