package com.codeup.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "properties")
public class Property {
    // CREATE TABLE properties (
    //  id BIGINT NOT NULL AUTO_INCREMENT,
    //  address VARCHAR(100) NOT NULL,
    //  description VARCHAR(255) NOT NULL,
    //  asking_price int,
    //  bedrooms int,
    //  bathrooms double,
    //  square_footage int,
    //
    //  PRIMARY KEY (id)
    // );

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    private String description;

    @Column(name = "asking_price")
    private int askingPrice;

    @Column
    private int bedrooms;

    @Column
    private double bathrooms;

    @Column(name = "square_footage")
    private int squareFootage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAskingPrice() {
        return askingPrice;
    }

    public void setAskingPrice(int askingPrice) {
        this.askingPrice = askingPrice;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }
}