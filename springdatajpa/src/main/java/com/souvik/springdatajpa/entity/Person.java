package com.souvik.springdatajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity

public class Person {
    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private String location;

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
