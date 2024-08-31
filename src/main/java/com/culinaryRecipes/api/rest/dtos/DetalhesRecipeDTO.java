package com.culinaryRecipes.api.rest.dtos;

import com.culinaryRecipes.api.rest.entity.Recipe;
import com.culinaryRecipes.api.rest.entity.Users;
import com.culinaryRecipes.api.rest.entity.enums.Categoria;

public record DetalhesRecipeDTO(Long id, String name, String ingrediente, String preparation, Categoria categoria, Users users){
    public DetalhesRecipeDTO(Recipe recipe){
        this(recipe.getId(), recipe.getName(), recipe.getIngredientes(), recipe.getPreparation(), recipe.getCategoria(), recipe.getUsers());
    }

}
