package com.learningSpring.springFirst.cardatabase;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Car> cars;

    private String firstname,lastname;
    public Owner(){}
    public Owner(String firstname,String lastname){
        super();
        this.firstname=firstname;
        this.lastname=lastname;
    }
    Long getId(){
        return ownerid;
    }
    void setOwnerid(long id){
        ownerid=id;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
}
