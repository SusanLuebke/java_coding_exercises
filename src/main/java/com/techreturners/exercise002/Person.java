package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String City;
    private Integer Age;

    public Person(String firstName, String lastName, String City, Integer Age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.City = City;
        this.Age = Age;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getCity() {
        return City;
    }

    public Integer getAge() {
        return Age;
    }
}