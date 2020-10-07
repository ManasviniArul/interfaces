package com.company;

public interface TestInterface {
    //void show();
    default void demo1(){
        System.out.println("default method defined inside interface");
    }
    static void demo2(){
        System.out.println("static method defined inside interface");
    }
}
