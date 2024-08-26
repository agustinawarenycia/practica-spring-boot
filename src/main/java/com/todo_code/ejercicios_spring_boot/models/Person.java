package com.todo_code.ejercicios_spring_boot.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


}
