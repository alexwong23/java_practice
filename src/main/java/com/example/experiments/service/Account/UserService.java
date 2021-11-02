package com.example.experiments.service.Account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService implements AccountService {
    private String id;
    private String username;
    private String password;
    private String email;

    private Logger log = LoggerFactory.getLogger(AdminService.class);

    // TODO: generate id
    public UserService() {
        this.id = "1a";
    }

    public UserService(String username, String password, String email) {
        this();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void say() {
        log.info("\nId: " + this.id +
                "\nUsername: " + this.username +
                "\nPassword: " + this.password +
                "\nEmail: " + this.email);
    }

    public String getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public String getEmail() { return this.email; }
    public void setId(String id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
}

