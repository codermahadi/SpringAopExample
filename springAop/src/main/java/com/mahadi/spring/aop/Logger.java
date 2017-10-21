package com.mahadi.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.mahadi.spring.aop.Camera.snap())")
    public void cameraSnap(){}

        @Before("cameraSnap()")
        public void aboutToTakePhoto(){
            System.out.println("About To Take photo...");
        }
}
