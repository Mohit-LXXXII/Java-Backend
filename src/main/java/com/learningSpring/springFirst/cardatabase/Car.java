package com.learningSpring.springFirst.cardatabase;

import jakarta.persistence.*;
import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model,color,brand,registrationNumber;
    private int modelYear,price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner")
    private Owner owner;

    public void setOwner(Owner owner){
        this.owner=owner;
    }
    public Owner getOwner(){
        return owner;
    }






//    @Column(name="explanation",nullable = false,length = 512)
//    private String description;

    public Car() {
    }

    public Car(String model, String color, String brand, String registrationNumber, int modelYear, int price,Owner owner) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner=owner;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
