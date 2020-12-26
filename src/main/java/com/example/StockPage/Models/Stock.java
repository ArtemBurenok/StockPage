package com.example.StockPage.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private String Name;
    private double Price, AssessedValue, CAPM;

    public Stock(){}

    public Stock(String Name, double Price, double AssessedValue, double CAPM){
        this.Name = Name;
        this.Price = Price;
        this.AssessedValue = AssessedValue;
        this.CAPM = CAPM;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getAssessedValue() {
        return AssessedValue;
    }

    public void setAssessedValue(double assessedValue) {
        AssessedValue = assessedValue;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getCAPM() {
        return CAPM;
    }

    public void setCAPM(double CAPM) {
        this.CAPM = CAPM;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
