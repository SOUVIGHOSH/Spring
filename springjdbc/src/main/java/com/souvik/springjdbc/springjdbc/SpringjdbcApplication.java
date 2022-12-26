package com.souvik.springjdbc.springjdbc;

import com.souvik.springjdbc.springjdbc.dao.PersonDao;
import com.souvik.springjdbc.springjdbc.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.souvik.springjdbc.springjdbc", "com.souvik.springjdbc.springjdbc.dao" })
public class SpringjdbcApplication implements CommandLineRunner {
    public static Logger logger=LoggerFactory.getLogger(SpringjdbcApplication.class);
    @Autowired
    PersonDao personDao;
    public static void main(String[] args) {
        SpringApplication.run(SpringjdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("{}",personDao.retrieveAllUsers());
        logger.info("{}",personDao.findById(2));
        logger.info("total rows updated: {}", personDao.update(3));
        logger.info("total rows created: {}", personDao.insert(new Person(4,"Rahul","London")));
        logger.info("total rows deleted: {}", personDao.delete(2));

    }
}
