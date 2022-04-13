package org.example;

import java.util.UUID;

public class UserCredentials {
    private String id;
    private String username;
    private String password;
    private String role;

    public UserCredentials(String username, String password, String role) {
        this.id = UUID.randomUUID().toString();
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username== null || username.equals("")) throw new IllegalArgumentException("Param: username cannot be null");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password== null || password.equals("")) throw new IllegalArgumentException("Param: password cannot be null");
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role== null || role.equals("")) throw new IllegalArgumentException("Param: role cannot be null");
        this.role = role;
    }
}
