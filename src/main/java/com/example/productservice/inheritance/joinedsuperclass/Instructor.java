package com.example.productservice.inheritance.joinedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_instructor")
public class Instructor extends User {
    String specialization;
}
