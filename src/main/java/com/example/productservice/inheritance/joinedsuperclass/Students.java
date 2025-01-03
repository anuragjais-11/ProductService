package com.example.productservice.inheritance.joinedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_student")
public class Students extends User {
    String course;
    String batch;
}
