package org.example.demo;


import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Greeting {
    @PostConstruct
    public void init(){
        System.out.println("The greeting service is initialized ");
    }
    public String getGreeting(){
        return "Hello World , Greetings!!";
    }
    @PreDestroy
    public void cleanup(){
        System.out.println("The greeting service is being  terminated");
    }

}
