package com.culinaryRecipes.api.rest.repository;

import com.culinaryRecipes.api.rest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long> {
}
