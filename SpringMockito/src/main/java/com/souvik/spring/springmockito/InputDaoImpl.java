package com.souvik.spring.springmockito;

import org.springframework.stereotype.Service;

@Service
public class InputDaoImpl implements InputDao{

    @Override
    public int[] getInput() {
        return new int[]{1,2,3,4};
    }
}
