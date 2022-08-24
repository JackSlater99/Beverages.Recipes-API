package com.example.Postgres.Test.repositories;


import com.example.Postgres.Test.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findAllByDifficultyIgnoreCase(String difficulty);
    List<Recipe> findAllByTypeIgnoreCase(String type);
    List<Recipe> findAllByPrepTimeLessThanEqual(Integer prepTime);
    List<Recipe> findAllByApprovedTrue();
    List<Recipe> findAllByApprovedFalse();
    List<Recipe> findAllByAuthorIgnoreCase(String author);
    List<Recipe> findByNameIgnoreCase(String name);
    List<Recipe> findById(long id);

    List<Recipe> findAllByIngredientsRawIngredientAlcoholicIsTrue();
}
