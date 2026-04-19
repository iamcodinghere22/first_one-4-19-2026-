package org.example.demo;


import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Time_Service {
    public String getTime(){
        return "The time is : "+ LocalTime.now();
    }
}
