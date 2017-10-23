package com.mahadi.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/23/2017.
 */
@Component
public class Car {

    public void start(){
        System.out.println("Car Engine Started...");
    }
}
