package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static class Person {
        String firstname;
        String lastName;
        int age;

        String email;
        String phoneNumber;
        String address;

        public Person(String firstname, String lastName, int age) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstname, String lastName, int age, String email, String phoneNumber, String address) {

            this(firstname, lastName, age);
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
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

        public boolean isTeen() {
            return age >= 13 && age <= 19;
        }


    }
    public class wall {
        private double width;
        private double Height;

        public wall(double width, double height) {
            setWidth(width);
            setHeight(height);
        }
        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return Height;
        }
        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }
        public void setHeight(double height) {
            if (height < 0) {
                this.Height = 0;
            } else {
                this.Height = height;
            }
        }

        public double getArea() {
            return width * Height;
        }
    }
    }

