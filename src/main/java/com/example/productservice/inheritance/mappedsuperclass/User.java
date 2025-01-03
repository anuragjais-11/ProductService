package com.example.productservice.inheritance.mappedsuperclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class User {
    @Id
    Long id;
    Long name;
    String email;
    String phone;
    String password;
}
