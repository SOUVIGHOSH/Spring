package com.example.aop.service;

import com.example.aop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    Dao1 dao1;

    public String doSomething(){
        return dao1.retrieveData();
    }

}
