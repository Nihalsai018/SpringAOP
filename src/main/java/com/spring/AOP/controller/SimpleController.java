package com.spring.AOP.controller;

import com.spring.AOP.annotation.LogExecution;
import com.spring.AOP.entity.SimpleEntity;
import com.spring.AOP.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simpleController")
public class SimpleController {

    @Autowired
    private SimpleService service;

    @LogExecution //method level
    @PostMapping("/postservice")
    public void serve(@RequestBody SimpleEntity simpleEntity) {
        service.service(simpleEntity);
    }
}
