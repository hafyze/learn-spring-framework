package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address (String address, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Zul";
    }
    @Bean
    public int age () {
        return 20;
    }
    @Bean
    public Person person() {
        var person = new Person("Hafiz", 21);
        return person;
    }

    @Bean
    public Address address() {
        var address = new Address("23 Jalan", "Puchong");
        return address;
    }
}
