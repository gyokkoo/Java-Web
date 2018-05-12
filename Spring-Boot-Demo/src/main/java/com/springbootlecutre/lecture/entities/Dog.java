package com.springbootlecutre.lecture.entities;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Animal {

    private String name;

    public Dog() {
        System.out.println("Instantiating");
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
