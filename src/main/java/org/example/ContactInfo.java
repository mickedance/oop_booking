package org.example;

import java.util.UUID;

public class ContactInfo {
    private final String id;
    private String email;
    private String phone;

    public ContactInfo(String email, String phone) {
        this.id = UUID.randomUUID().toString();
        setEmail(email);
        setPhone(phone);
    }

    public String getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.equals("")) throw new IllegalArgumentException("Param: email cannot be  null");
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.equals("")) throw new IllegalArgumentException("Param: phone cannot be  null");

        this.phone = phone;
    }
}
