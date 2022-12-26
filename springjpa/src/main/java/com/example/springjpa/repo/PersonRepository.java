package com.example.springjpa.repo;

import com.example.springjpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> findAll(){
        //using hql/jpql
        TypedQuery<Person> query = entityManager.createNamedQuery("find_all_persons",Person.class);
        return query.getResultList();
    }

    public Person findById(int id){
        return entityManager.find(Person.class,id);
    }
    public Person update(Person person){
        return entityManager.merge(person);
    }

    public Person insert(Person person){
        // merge checks if id is present, if yes then updates or creates otherwise
        return entityManager.merge(person);
    }

    public int delete(int id){
        Person person = findById(id);
        entityManager.remove(person);
        return 1;
    }

}
