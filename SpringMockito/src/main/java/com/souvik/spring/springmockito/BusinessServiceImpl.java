package com.souvik.spring.springmockito;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

@Component
public class BusinessServiceImpl {

    private InputDao inputDao;

    @Autowired
    BusinessServiceImpl(InputDao inputDao){
        this.inputDao=inputDao;
    }

    public int findGreatest(){
        int[] input=inputDao.getInput();
        int max=Integer.MIN_VALUE;
        for(int a:input) max=Math.max(a,max);
        return max;
    }
}
