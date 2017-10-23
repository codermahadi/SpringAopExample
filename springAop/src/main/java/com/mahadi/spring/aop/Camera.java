package com.mahadi.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */

@Component
public class Camera {

    public void snap() {
        System.out.println("SNAP");
    }

    public void snap(int exposure) {
        System.out.println("exposure : " + exposure);
    }

    public void snap(String name) {
        System.out.println("Name : " + name);
    }


}
