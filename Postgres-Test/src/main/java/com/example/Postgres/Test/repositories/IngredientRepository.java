package com.example.Postgres.Test.repositories;

import com.example.Postgres.Test.models.RawIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<RawIngredient, Long> {
}
