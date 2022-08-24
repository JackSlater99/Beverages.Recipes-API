package com.example.Postgres.Test;

import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.RecipeIngredient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RecipeIngredientTest {

    RawIngredient rawIngredient;
    RecipeIngredient recipeIngredient;

    @Before
    public void before(){
        rawIngredient = new RawIngredient("Milk", "Image Link", false, "Milk Description");
        recipeIngredient = new RecipeIngredient(rawIngredient, 100, "ml");
    }

    @Test
    public void hasIngredient(){
        assertEquals(rawIngredient, recipeIngredient.getRawIngredient());
    }

    @Test
    public void hasIngredientName(){
        assertEquals("Milk", recipeIngredient.getRawIngredient().getName());
    }

    @Test
    public void hasQuantity(){
        assertEquals("Image Link", recipeIngredient.getQuantity());
    }

    @Test
    public void hasUnit(){
        assertEquals("ml", recipeIngredient.getUnits());
    }

}
