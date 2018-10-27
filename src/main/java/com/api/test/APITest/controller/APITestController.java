package com.api.test.APITest.controller;

import com.api.test.APITest.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APITestController {

    @Autowired
    private ApiService apiService;
    @GetMapping(value = "/EndPoint")
    public String helloApi(){
        return apiService.getDataFromTableA1All();
    }
}
