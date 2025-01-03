package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String email;
    private String name;
    private List<RoleDto> roleDtoList;
}
