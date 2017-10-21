package com.mahadi.spring.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */
@Component
public class Lens {

    public void zoom(int factor){
        System.out.println("Zooming Lens: "+ factor);
    }
}
