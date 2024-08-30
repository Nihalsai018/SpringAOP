package com.spring.AOP.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
    @Id
    @JsonProperty("id")
    private long empID;
    @JsonProperty("name")
    private String  empName;
    @JsonProperty("age")
    private int empAge;
}
