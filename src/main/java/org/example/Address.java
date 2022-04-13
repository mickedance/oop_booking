package org.example;

import java.util.UUID;

public class Address {
    private String id;
    private String city;
    private String street;
    private String zipCode;


    public Address(String city, String street, String zipCode) {
        setCity(city);
        setStreet(street);
        setZipCode(zipCode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.equals("")) throw new IllegalArgumentException("Param: City cannot be null or empty");
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null || street.equals(""))
            throw new IllegalArgumentException("Param: Street cannot be null or empty");

        this.street = street;
    }

    public String getId() {
        return id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.equals(""))
            throw new IllegalArgumentException("Param: zipCode cannot be null or empty");
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
