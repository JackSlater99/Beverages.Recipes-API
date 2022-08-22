package com.example.beveragesrecipes.repositories;

import com.example.beveragesrecipes.models.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
}
