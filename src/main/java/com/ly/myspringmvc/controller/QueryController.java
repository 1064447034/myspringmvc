package com.ly.myspringmvc.controller;

import com.ly.myspringmvc.annotation.MyAutowired;
import com.ly.myspringmvc.annotation.MyController;
import com.ly.myspringmvc.annotation.MyRequestMapping;
import com.ly.myspringmvc.service.Car;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MyRequestMapping("/test")
@MyController
public class QueryController {
    @MyAutowired
    private Car car;

    @MyRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse respones, String name) {
        car.print();
    }
}
