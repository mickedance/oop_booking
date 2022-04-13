package org.example;

import java.util.UUID;

public class Premises {
    private final String id;
    private String name;
    private Address address;
    private ContactInfo contactInfo;

    public Premises(String name, Address address, ContactInfo contactInfo) {
        this.id = UUID.randomUUID().toString();
        setName(name);
        setAddress(address);
        setContactInfo(contactInfo);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) throw new IllegalArgumentException("Param: name cannot be null");
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (address == null) throw new IllegalArgumentException("Param: address cannot be null");
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        if (contactInfo == null) throw new IllegalArgumentException("Param: contactInfo cannot be null");
        this.contactInfo = contactInfo;
    }
}
