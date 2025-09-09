package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        Person person1 = new Person("Haluk","Aytış", 23, "Student", new String[]{"Music", "Coding"}, true);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person1.toString());

    }
}
