package com.souvik.spring.springproperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyReader {
    
    @Value("${external.api.url}")
    private String apiEndPointURL;

    public String getApiEndPointURL() {
        return apiEndPointURL;
    }
}
