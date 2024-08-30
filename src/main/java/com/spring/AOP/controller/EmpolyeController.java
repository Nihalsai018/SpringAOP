package com.spring.AOP.controller;

import com.spring.AOP.annotation.LogExecution;
import com.spring.AOP.entity.Employe;
import com.spring.AOP.entity.SimpleEntity;
import com.spring.AOP.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@LogExecution //class level
@RequestMapping("/EmpolyeController")
public class EmpolyeController {

    @Autowired
    private SimpleService service;


    @PostMapping("/empPOST")
    public String serve(@RequestBody Employe employe) {
       return service.empservice(employe);
    }

}
