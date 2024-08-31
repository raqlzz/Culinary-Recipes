package com.culinaryRecipes.api.rest.repository;


import com.culinaryRecipes.api.rest.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reciperepository extends JpaRepository<Recipe, Long> {

}
