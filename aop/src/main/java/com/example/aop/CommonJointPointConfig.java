package com.example.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

    @Pointcut("execution(* com.example.aop.service.*.*(..)))")
    public void ServiceLayer(){}

    // we can also have pointcut on bean name , bean start with ,contains with wild card & also custom Annotation
}
