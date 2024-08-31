package com.culinaryRecipes.api.rest.service;

import com.culinaryRecipes.api.rest.dtos.DetalhesUsersDTO;
import com.culinaryRecipes.api.rest.entity.Users;
import com.culinaryRecipes.api.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UsersService {
    @Autowired
    private UserRepository userRepository;
    public List<DetalhesUsersDTO> retornarListaDeUsuarios(){
        List<Users> users =userRepository.findAll();
        List<DetalhesUsersDTO> detalhesUsersDto = users.stream().map(u -> new DetalhesUsersDTO(u)).collect(Collectors.toList());
        return detalhesUsersDto;
    }

    public Users criarUsuario(Users users){
        return userRepository.save(users);
    }
}