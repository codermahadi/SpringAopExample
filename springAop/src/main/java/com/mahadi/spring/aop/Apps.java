package com.mahadi.spring.aop;

import com.mahadi.spring.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahadi on 10/21/2017.
 */
public class Apps {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Lens lens     = (Lens) context.getBean("lens");

        camera.snap();
        camera.snap(1200);
        camera.snap("Mahadi");
        camera.nightSnap();
        lens.zoom(500);
        context.close();
    }
}
