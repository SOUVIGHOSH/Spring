package com.souvik.springdatajpa;

import com.souvik.springdatajpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDataJPARepo extends JpaRepository<Person,Integer> {
}
