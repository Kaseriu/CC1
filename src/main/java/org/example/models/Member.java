package org.example.models;

public class Member {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final Address address;

    public Member(String firstName, String lastName, int age, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return this.address.toString();
    }

    @Override
    public String toString() {
        return firstName +
                " " + lastName +
                ", " + age + "ans" +
                ", " + email +
                ", " + getAddress();
    }
}
