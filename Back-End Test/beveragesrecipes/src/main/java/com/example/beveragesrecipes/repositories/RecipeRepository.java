package com.example.beveragesrecipes.repositories;


import com.example.beveragesrecipes.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
