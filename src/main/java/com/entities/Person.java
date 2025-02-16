package com.entities;

public class Person extends BaseEntity{

    private String firstNAme;

    private String lastName;

    private int age;

    public Person(String firstNAme, String lastName, int age) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.age = age;
    }

}
