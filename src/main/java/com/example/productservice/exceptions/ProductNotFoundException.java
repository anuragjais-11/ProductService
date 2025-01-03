package com.example.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class ProductNotFoundException extends Exception {
    private long id;

    public ProductNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }
}
