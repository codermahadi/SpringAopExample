package com.mahadi.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahadi on 10/21/2017.
 */
public class Apps {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        camera.snap();
        context.close();
    }
}
