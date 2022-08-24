package com.example.Postgres.Test;

import com.example.Postgres.Test.models.RawIngredient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class RawIngredientTest {

    RawIngredient rawIngredient;

    @Before
    public void before(){
        rawIngredient = new RawIngredient("Milk", "Image Link", false, "Milk Description");
    }

    @Test
    public void hasName(){
        assertEquals("Milk", rawIngredient.getName());
    }

    @Test
    public void hasImageLink(){
        assertEquals("Image Link", rawIngredient.getImage());
    }

    @Test
    public void hasAlcoholicProperty(){
        assertFalse(rawIngredient.getAlcoholic());
    }

    @Test
    public void hasDescription(){
        assertEquals("Milk Description", rawIngredient.getDescription());
    }
}
