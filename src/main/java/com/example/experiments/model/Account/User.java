package com.example.experiments.model.Account;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "User_table")
@Table(
        name = "user_table"
//        uniqueConstraints = {
//                @UniqueConstraint(
//                        name = "user_email_unique,",
//                        columnNames = "email"
//                )
//        }
)
public class User extends Person implements Account {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "username",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String username;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String password;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    public User() {
        super();
    }

    public User(String username,
                String password,
                String email,
                String firstName,
                String lastName) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username,
                       String password,
                       String email,
                       String firstName,
                       String lastName,
                       LocalDate dob) {
        super(firstName, lastName, dob);
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String toString() {
        return "\nId: " + this.id +
                "\nUsername: " + this.username +
                "\nPassword: " + this.password +
                "\nEmail: " + this.email +
                "\nFirstName: " + super.getFirstName() +
                "\nLastName: " + super.getLastName() +
                "\nAge: " + super.getAge();
    }

    public Long getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public String getEmail() { return this.email; }
    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
}

