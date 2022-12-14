package com.souvik.springdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner {

    @Autowired
    PersonDataJPARepo repo;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaApplication.class, args);
    }
    private static Logger logger= LoggerFactory.getLogger(SpringdatajpaApplication.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("{}",repo.findAll());
    }
}
