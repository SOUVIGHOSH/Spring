package com.souvik.springjdbc.springjdbc.dao;

import com.souvik.springjdbc.springjdbc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> retrieveAllUsers(){
        List<Person> list = jdbcTemplate.query("select * from person",new BeanPropertyRowMapper<Person>(Person.class));
        return list;
    }

    public Person findById(int id){
        Person person = jdbcTemplate.queryForObject("select * from person where id= ?",
                new BeanPropertyRowMapper<Person>(Person.class),new Object[]{id});
        return person;
    }
    public int insert(Person person){
        return jdbcTemplate.update("insert into person (id,name ,location) values(?,?,?)",new Object[]{person.getId(),person.getName(),person.getLocation()});
    }
    public int update(int id){
        Person person = findById(id);
        person.setLocation("NewYork");
        return jdbcTemplate.update(String.format("update person set name=?, location=? where id=?"),new Object[]{person.getName(),person.getLocation(),person.getId()});
    }
    public int delete(int id){
        return jdbcTemplate.update(String.format("delete from person where id=?"),new Object[]{id});
    }
}
