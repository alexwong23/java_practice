package com.example.experiments.service.Account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminService implements AccountService {
    private String id;
    private String username;
    private String password;

    private Logger log = LoggerFactory.getLogger(AdminService.class);

    // TODO: generate admin id
    public AdminService() {
        this.id = "1a";
    }

    public AdminService(String username, String password) {
        this();
        this.username = username;
        this.password = password;
    }

    public void say() {
        log.info("\nId: " + this.id +
                "\nUsername: " + this.username +
                "\nPassword: " + this.password);
    }

    public String getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public void setId(String id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
}

