package com.company.Inheritance;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("name", 12);
        Person person1 = new Person(person);
        System.out.println(person1.equals(person));


    }
}
