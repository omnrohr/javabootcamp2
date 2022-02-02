package com.company.Inheritance;

import java.util.Objects;

public class Person {
  
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person))return false;
        Person person = (Person) obj;
        return this.name == person.getName() && this.age == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
