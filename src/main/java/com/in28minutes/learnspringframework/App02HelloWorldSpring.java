package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1:Launch a spring Context -
        var context =
            new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2:Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name"));

    }
}