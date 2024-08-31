package com.culinaryRecipes.api.rest.service;

import com.culinaryRecipes.api.rest.dtos.DetalhesRecipeDTO;
import com.culinaryRecipes.api.rest.dtos.DetalhesUsersDTO;
import com.culinaryRecipes.api.rest.entity.Recipe;
import com.culinaryRecipes.api.rest.repository.Reciperepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RecipeService {
    @Autowired
    private Reciperepository reciperepository;
    public List<DetalhesRecipeDTO> retornarListadeReceitas(){
        List <Recipe> recipes = reciperepository.findAll();
        List<DetalhesRecipeDTO> detalhesRecipeDTOS = recipes.stream().map(r -> new DetalhesUsersDTO(r)).collect(Collectors.toList());
        return detalhesRecipeDTOS;
    }

    //  public DetalheInsumo buscaInsumoPorId (Long id){
    //            InsumosEntity insumo = insumosRepository.findById(id).orElseThrow(() -> new RuntimeException("Insumo não encontrado"));
    //            DetalheInsumo detalheInsumo = new DetalheInsumo(insumo);
    //            return detalheInsumo;
}
