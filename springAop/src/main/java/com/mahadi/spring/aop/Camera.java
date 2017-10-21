package com.mahadi.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */

@Component
public class Camera {
    public void snap(){
        System.out.println("SNAP");
    }

    public void snap(int exposure){
        System.out.println("SNAP !! with Exposure: " + exposure);
    }

    public String snap(String name){
        System.out.println("SNAP !! with Name: " + name);
        return  name;
    }

    public void nightSnap(){
        System.out.println("SNAP !! with Name: Night Snap");
    }
}
