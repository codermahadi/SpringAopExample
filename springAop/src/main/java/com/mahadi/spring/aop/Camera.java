package com.mahadi.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */

@Component
public class Camera {
    public void snap() throws Exception {
        System.out.println("SNAP");

        throw new Exception("bye bye");
    }



}
