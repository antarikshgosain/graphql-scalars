package dev.anta.scalars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Boolean isOnSale;
    private Float weight;
    private BigDecimal price;
    private LocalDateTime dateCreated;


    public Product(String title, Boolean isOnSale, Float weight, BigDecimal price, LocalDateTime dateCreated) {
        this.title = title;
        this.isOnSale = isOnSale;
        this.weight = weight;
        this.price = price;
        this.dateCreated = dateCreated;
    }

    public Product () {}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isOnSale=" + isOnSale +
                ", weight=" + weight +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
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
