package com.souvik.spring.springproperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:project.properties")
public class SpringPropertyApplication {

    public static Logger LOGGER = LoggerFactory.getLogger(SpringPropertyApplication.class);

    public static void main(String[] args) {

       ApplicationContext applicationContext= SpringApplication.run(SpringPropertyApplication.class, args);
       PropertyReader reader = applicationContext.getBean(PropertyReader.class);
       LOGGER.info("{}",reader.getApiEndPointURL());

    }

}
