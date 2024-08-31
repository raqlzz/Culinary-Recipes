package com.culinaryRecipes.api.rest.dtos;

import com.culinaryRecipes.api.rest.entity.Recipe;

import java.util.List;

public record CriarUsersDTO(
        Long id,
        String name,
        String surname,
        String email,
        String password,
        List<Recipe>favoriteRecipes
) {
}
