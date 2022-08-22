package com.example.backendbeveragesrecipes.repositories;


import com.example.backendbeveragesrecipes.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
