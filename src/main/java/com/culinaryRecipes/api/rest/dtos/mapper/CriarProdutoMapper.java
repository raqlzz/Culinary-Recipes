package com.culinaryRecipes.api.rest.dtos.mapper;

import com.culinaryRecipes.api.rest.dtos.CriarUsersDTO;
import com.culinaryRecipes.api.rest.entity.Users;

public interface CriarProdutoMapper {
    CriarUsersDTO produtoEntityParaProdutoDto (Users users);
    Users produtoEntityParaProdutoDTO (CriarUsersDTO criarUsersDTO);
}
