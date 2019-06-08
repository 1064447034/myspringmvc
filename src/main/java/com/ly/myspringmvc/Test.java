package com.ly.myspringmvc;

import java.io.File;
import java.lang.reflect.Field;

interface eagle {
    public void fly();
}

interface whale {
    public void swim();
}

public class Test implements eagle,whale{
    private eagle e;
    private whale w;

    private String name = "小明";
    private int id = 10001;
    public void Speak(String name){
        System.out.println("我的名字"+name+" "+ "编号"+ id);
    }
    @Override
    public void fly() {
        System.out.println("I can Fly!!!");
    }

    @Override
    public void swim() {
        System.out.println("I can swimming!!!");
    }
    public static void main(String args[]){
        Test person = new Test();
        Field[] fields = person.getClass().getDeclaredFields();

        person.Speak("小明");
        person.fly();
        person.swim();
        System.out.println("---------------");
        Class<?> string01 = person.getClass().getInterfaces()[0];
        Class<Test> string02 = (Class<Test>) person.getClass().getInterfaces()[1];
        System.out.println(string01);
        System.out.println(string02);
    }
}
