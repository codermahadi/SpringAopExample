package com.mahadi.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("within( com.mahadi.spring.aop.*)")
    public void withinDemo(){}

    @Pointcut("target(com.mahadi.spring.aop.Camera)")
    public void targetDemo(){}

        @Before("withinDemo()")
        public void withinDemoBefore(){
            System.out.println("****** WITHIN DEMO *****");
        }

        @Before("targetDemo()")
        public void targetDemoBefore(){
            System.out.println("****** TARGET DEMO *****");

        }


}
