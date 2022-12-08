package com.souvik.spring.springmockito;

import org.assertj.core.api.Fail;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import com.souvik.spring.springmockito.*;
import org.xmlunit.builder.Input;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class SpringMockitoApplicationTests {

    @Mock
    InputDao inputDao;

    @InjectMocks
    BusinessServiceImpl service;
    

    @Test
    public void testFindGreatest(){
        InputDao input=mock(InputDao.class);
        when(input.getInput()).thenReturn(new int[]{1,2,3,4});
        BusinessServiceImpl service=new BusinessServiceImpl(input);
        assertEquals(4,service.findGreatest());
    }

}

