package com.ly.myspringmvc.service;

import com.ly.myspringmvc.annotation.MyService;

@MyService
public class Car {
    public void print() {
        System.out.println("this is a car");
    }
}
