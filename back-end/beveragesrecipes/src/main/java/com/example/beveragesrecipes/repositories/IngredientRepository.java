package com.example.beveragesrecipes.repositories;

import com.example.beveragesrecipes.models.RawIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<RawIngredient, Long> {
}
