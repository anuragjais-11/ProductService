package com.example.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    String description;
    Double price;
    float rating;
    @ManyToOne(cascade = CascadeType.PERSIST)
    Category category;
}
