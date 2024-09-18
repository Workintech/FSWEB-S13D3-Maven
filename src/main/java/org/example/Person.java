package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    int iq;
    String address;
    String pet;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, int iq) {
        this(firstname,lastName,age);
        this.iq = iq;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
