package com.learningSpring.springFirst.cardatabase;

import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long Id;

    @Column(unique = true,nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable=false)
    private String roll;

    public AppUser(){}

    public Long getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoll() {
        return roll;
    }

    public AppUser(String username, String password, String roll){
        this.username=username;
        this.password=password;
        this.roll=roll;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getRole() {
        return roll;
    }
}
