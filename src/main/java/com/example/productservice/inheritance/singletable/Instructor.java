package com.example.productservice.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_instructor")
@DiscriminatorValue(value = "3")
public class Instructor extends User {
    String specialization;
}
