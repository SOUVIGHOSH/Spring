package com.example.aop;

import com.example.aop.service.Business1;
import com.example.aop.service.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

    Logger logger= LoggerFactory.getLogger(AopApplication.class);
    @Autowired
    Business1 bu1;
    @Autowired
    Business2 bu2;
    public static void main(String[] args) {

        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(bu1.doSomething());
        logger.info(bu2.doSomething());
    }
}
