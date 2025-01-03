package com.example.productservice.inheritance.joinedsuperclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    Long id;
    Long name;
    String email;
    String phone;
    String password;
}
