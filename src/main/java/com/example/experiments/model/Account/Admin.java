package com.example.experiments.model.Account;

public class Admin implements Account {
    private Long id;
    private String username;
    private String password;

    // TODO: generate admin id
    public Admin() { }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "\nId: " + this.id +
                "\nUsername: " + this.username +
                "\nPassword: " + this.password;
    }

    public Long getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public void setId(Long id) {
        if(id == null) throw new IllegalArgumentException("Error: Id cannot be set to Null");
        if(id < 0) throw new IllegalArgumentException("Error: Id cannot be negative");
        this.id = id;
    }
    public void setUsername(String username) {
        if(username == null) throw new IllegalArgumentException("Error: Username cannot be set to Null");
        this.username = username;
    }
    public void setPassword(String password) {
        if(password == null) throw new IllegalArgumentException("Error: Password cannot be set to Null");
        this.password = password;
    }
}

