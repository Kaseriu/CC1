package org.example.models;

public class Address {

    private final int streetNumber;
    private final String street;
    private final String city;

    public Address(int streetNumber, String street, String city) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return streetNumber +
                " " + street +
                " " + city;
    }
}
