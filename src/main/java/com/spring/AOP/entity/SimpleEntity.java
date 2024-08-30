package com.spring.AOP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Setter
@Getter
public class SimpleEntity {
    @Id
    private Long id;
    private String name;

}
