package com.souvik.springbasic.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch =applicationContext.getBean(BinarySearchImpl.class,null);
        int[] arr={5,2,4,5,2,5,6,2,1,2,4,65};
        System.out.println(binarySearch.search(arr,65));

    }

}
