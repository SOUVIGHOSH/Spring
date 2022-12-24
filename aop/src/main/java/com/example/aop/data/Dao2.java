package com.example.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    public String retrieveData(){
         return (" Retrieving data via DAO2");
    }
}
