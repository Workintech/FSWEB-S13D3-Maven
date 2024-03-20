package org.example;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private String email; // Ekstra instance variable 1
    private String phoneNumber; // Ekstra instance variable 2
    private String address; // Ekstra instance variable 3

    // İlk constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // İkinci constructor - Overloading ve constructor chaining
    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this(firstName, lastName, age); // Constructor chaining
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Metodlar
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
    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

}
