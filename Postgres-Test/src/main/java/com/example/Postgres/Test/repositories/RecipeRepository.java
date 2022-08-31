package com.example.Postgres.Test.repositories;


import com.example.Postgres.Test.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
