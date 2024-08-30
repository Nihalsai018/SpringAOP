package com.spring.AOP.service;

import com.spring.AOP.entity.Employe;
import com.spring.AOP.entity.SimpleEntity;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String empservice(Employe employe){
        System.out.println("iam employe service");
        System.out.println("iam employe service end");
        return "hiiiii";
    }
    public void service(SimpleEntity simpleEntity)  {
        System.out.println("I am in the service class");
    }

}
