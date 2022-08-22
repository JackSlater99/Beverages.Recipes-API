package com.example.backendbeveragesrecipes.repositories;

import com.example.backendbeveragesrecipes.models.RawIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<RawIngredient, Long> {
}
