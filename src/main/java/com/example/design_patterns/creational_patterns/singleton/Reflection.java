package com.example.design_patterns.creational_patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//not singleton
public class Reflection {

    private Reflection() {};

    private static class ReflectionHolder {
        private static final Reflection REFLECTION = new Reflection();
    }

    public static Reflection getInstance() {
        return ReflectionHolder.REFLECTION;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflection instance = Reflection.getInstance();
        Constructor<Reflection> constructor = Reflection.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Reflection instance1 = Reflection.getInstance();
        Reflection instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);
    }

}
