package com.company;

public class testClass implements TestInterface {
    public void show(){
        System.out.println("method declared in interface and defined in test class");
    }

    public String display() {
        return "hii";
    }
}
