package com.culinaryRecipes.api.rest.dtos;

import com.culinaryRecipes.api.rest.entity.Users;

public record DetalhesUsersDTO(Long id, String name, String surname, String email, String password) {

    public DetalhesUsersDTO(Users users){
        this(users.getId(), users.getName(), users.getSurname(), users.getEmail(), users.getPassword());

    }
}
