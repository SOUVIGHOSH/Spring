package com.souvik.spring.springproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProxyApplication {

    private static Logger LOGGER= LoggerFactory.getLogger(SpringProxyApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext= SpringApplication.run(SpringProxyApplication.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getJdbcConnection());
        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getJdbcConnection());
    }

}
