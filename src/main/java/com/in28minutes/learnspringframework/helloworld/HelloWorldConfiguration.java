package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
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
        var person = new Person("Hafiz", 21, new Address("Main Road", "Melaka"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address person_address) {
        return new Person(name, age, person_address);
    }

    @Bean (name = "person_address")
    public Address address() {
        var address = new Address("23 Jalan", "Puchong");
        return address;
    }
}
