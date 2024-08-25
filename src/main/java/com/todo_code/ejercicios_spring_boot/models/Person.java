package com.todo_code.ejercicios_spring_boot.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Person {
    String name;
    String last_name;
    int age;

    public Person(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }


}
