package org.example;

import java.util.Arrays;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    String[] Hobbies;
    boolean hasDriverLicense;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName,String lastName,int age, String job, String[] Hobbies, boolean hasDriverLicense) {
        this(firstName,lastName,age);
        this.job = job;
        this.Hobbies = Hobbies;
        this.hasDriverLicense = hasDriverLicense;

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
        return age < 19 && age > 13;
    }
    public String toString() {
        return "FirstName: " + firstName + " LastName: " + lastName + " Age: " + age + " Job: " + job + " Hobbies: " + Arrays.toString(Hobbies) + " Has Driver License: " + hasDriverLicense;
    }
}
