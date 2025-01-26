package dev.anta.scalars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Boolean isOnSale;
    private Float weight;


    public Product(String title, Boolean isOnSale, Float weight) {
        this.title = title;
        this.isOnSale = isOnSale;
        this.weight = weight;
    }

    public Product () {}

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", isOnSale=" + isOnSale +
                ", weight=" + weight +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Boolean getOnSale() {
        return isOnSale;
    }

    public void setOnSale(Boolean onSale) {
        isOnSale = onSale;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }


}
