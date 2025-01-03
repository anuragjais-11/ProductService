package com.example.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {
    String description;

//    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
//    List<Product> productList;
}
