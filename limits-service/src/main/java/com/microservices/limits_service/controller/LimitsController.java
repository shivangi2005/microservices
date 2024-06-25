package com.microservices.limits_service.controller;

import com.microservices.limits_service.config.AppConfig;
import com.microservices.limits_service.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private  AppConfig config;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(config.getMinimum(),config.getMaximum());
    }

}
