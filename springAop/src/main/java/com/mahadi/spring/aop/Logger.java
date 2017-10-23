package com.mahadi.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/21/2017.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.mahadi.spring.aop.Camera.*(..))")
    public void cameraSnap(){}

        @Before("cameraSnap()")
        public void aboutToTakePhoto(){
            System.out.println("About To Take photo...");
        }

        @After("cameraSnap()")
        public void afterAdvice(){
            System.out.println("After Advice..");
        }

        @AfterReturning("cameraSnap()")
        public void afterReturning(){
            System.out.println("After Returning advice");
        }

        @AfterThrowing("cameraSnap()")
        public void afterThrow(){
            System.out.println("After throw advice");

        }

        @Around("cameraSnap()")
        public void aroundAdvice(ProceedingJoinPoint point){
            System.out.println("Around advice...(before)");

            try{
                point.proceed();
            }catch (Throwable throwable){
                System.out.println("In around device " + throwable.getMessage());
            }
            System.out.println("Around advice...(after)");
        }


}
