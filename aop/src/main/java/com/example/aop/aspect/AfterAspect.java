package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @AfterReturning( value = "com.example.aop.CommonJointPointConfig.ServiceLayer()",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){

        logger.info("Intercepting {} and returning {}",joinPoint,result);

    }

    @AfterThrowing( value = "com.example.aop.CommonJointPointConfig.ServiceLayer()",throwing = "exception")
    public void afterThrow(JoinPoint joinPoint,Throwable exception){

        logger.info("Intercepting {} and returning {}",joinPoint,exception);

    }

    @After( value = "com.example.aop.CommonJointPointConfig.ServiceLayer()")
    public void afterThrow(JoinPoint joinPoint){

        logger.info("Intercepting {} at After call",joinPoint);

    }
}
