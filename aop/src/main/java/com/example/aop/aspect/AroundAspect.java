package com.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

    Logger logger = LoggerFactory.getLogger(AroundAspect.class);

    @Around("com.example.aop.CommonJointPointConfig.ServiceLayer()")
    public void around(ProceedingJoinPoint joinPoint){
        long startTime = System.currentTimeMillis();

        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken calculated with Around aspect is {}",timeTaken);

    }
}
