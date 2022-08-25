package com.example.Postgres.Test.repositories;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<RawIngredient, Long> {

    List<RawIngredient> findAllByNameIgnoreCase(String name);
    List<RawIngredient> findAllById(long id);
}
