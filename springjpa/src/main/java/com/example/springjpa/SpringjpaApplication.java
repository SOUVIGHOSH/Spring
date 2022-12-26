package com.example.springjpa;

import com.example.springjpa.entity.Person;
import com.example.springjpa.repo.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpaApplication.class, args);
    }
    public static Logger logger=LoggerFactory.getLogger(SpringjpaApplication.class);

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("{}",personRepository.findById(1));
        logger.info("{}",personRepository.insert(new Person("Tuk","Sea")));
        Person person = personRepository.findById(1);
        person.setLocation("Moon");
        logger.info("{}",personRepository.update(person));
        logger.info("Number of records deleted: {}",personRepository.delete(20));
    }
}
