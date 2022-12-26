package com.example.springjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@Table annotation optional when class name and table name are same
//@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQuery(name="find_all_persons",query = "select p from Person p")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //@Column(name = "name")
    private String name;
    //@Column(name = "location")
    private String location;

    public Person(String name,String location){
        super();
        this.name=name;
        this.location=location;
    }

}
