package com.example.aop.service;

import com.example.aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    Dao2 dao2;

    public String doSomething(){
        return dao2.retrieveData();
    }
}
