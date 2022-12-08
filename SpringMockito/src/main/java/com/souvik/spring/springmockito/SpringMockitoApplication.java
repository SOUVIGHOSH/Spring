package com.souvik.spring.springmockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMockitoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext=SpringApplication.run(SpringMockitoApplication.class, args);
        BusinessServiceImpl service= applicationContext.getBean(BusinessServiceImpl.class);
        System.out.println(service.findGreatest());
    }

}
