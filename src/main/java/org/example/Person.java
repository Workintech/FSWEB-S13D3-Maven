package org.example;

public class Person {
    // Required instance variables
    String firstName;
    String lastName;
    int age;

    // Custom instance variables
    String gender;
    double height;
    boolean isEmployed;

    // 1. Constructor (3 parameters)
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // 2. Constructor (6 parameters) - Constructor Chaining with 'this(...)'
    public Person(String firstName, String lastName, int age, String gender, double height, boolean isEmployed) {
        this(firstName, lastName, age); // Calls the 3-parameter constructor
        this.gender = gender;
        this.height = height;
        this.isEmployed = isEmployed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}