package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;
    String nationality;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int height, int weight, String nationality){
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        if(this.age >= 13 && this.age < 19){
            return true;
        }
        else{
            return false;
        }
    }
}