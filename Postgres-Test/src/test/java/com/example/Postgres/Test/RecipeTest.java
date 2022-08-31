package com.example.Postgres.Test;

import com.example.Postgres.Test.models.Instructions;
import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.models.RecipeIngredient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecipeTest {

    RawIngredient rawIngredient;
    RecipeIngredient recipeIngredient;
    Recipe recipe;
    Instructions instruction;

    @Before
    public void before(){
        rawIngredient = new RawIngredient("Milk", "Image Link", false, "Milk Description");
        recipeIngredient = new RecipeIngredient(rawIngredient, 100, "ml");
        recipe = new Recipe(
                "Flat White",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/vWWmMbP.jpg",
                "Easy",
                3,
                "https://youtu.be/-50tS3d2Yao"
        );
        instruction = new Instructions("This is an instruction", recipe);
    }

    @Test
    public void hasName(){
        assertEquals("Flat White", recipe.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Jack", recipe.getAuthor());
    }

    @Test
    public void isApproved(){
        assertTrue(recipe.getApproved());
    }

    @Test
    public void hasType(){
        assertEquals("Coffee", recipe.getType());
    }

    @Test
    public void hasRating(){
        assertEquals(0, recipe.getRating(), 0.01);
    }

    @Test
    public void hasImage(){
        assertEquals("https://i.imgur.com/vWWmMbP.jpg", recipe.getImage());
    }

    @Test
    public void hasDifficulty(){
        assertEquals("Easy", recipe.getDifficulty());
    }

    @Test
    public void hasPrepTime(){
        assertEquals(3, recipe.getPrepTime());
    }

    @Test
    public void hasVideo(){
        assertEquals("https://youtu.be/-50tS3d2Yao", recipe.getVideo());
    }

    @Test
    public void canAddIngredients(){
        recipe.addIngredients(recipeIngredient);
        assertEquals(1, recipe.getIngredients().size());
    }
}
