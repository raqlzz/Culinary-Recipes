package com.culinaryRecipes.api.rest.entity;

import com.culinaryRecipes.api.rest.entity.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ingredientes;
    private String preparation;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @ManyToOne
    private Users users;
}
