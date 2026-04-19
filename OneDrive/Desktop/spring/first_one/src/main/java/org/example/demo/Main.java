package org.example.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context=new AnnotationConfigApplicationContext(AppConfig.class);
        Greeting g=context.getBean(Greeting.class);
        Time_Service t=context.getBean(Time_Service.class);

        System.out.println(g.getGreeting());
        System.out.println(t.getTime());
        context.close();




    }


}
