package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {
    private Logger logger = LoggerFactory.getLogger(BeforeAspect.class);
    // Aspect is combination of pointcut and Advice
    //pointcut * com.example.aop.service.*.*(..))
    // Process of implementing AOP around methods is Weaving and framework that implements it is weaver
    @Before("com.example.aop.CommonJointPointConfig.ServiceLayer()")
    public void before(JoinPoint joinPoint){
        //Advice
        logger.info("Intercepted method calls {}",joinPoint);
    }
}
