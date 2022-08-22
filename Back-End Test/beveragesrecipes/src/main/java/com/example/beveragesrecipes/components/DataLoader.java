package com.example.beveragesrecipes.components;

import com.example.beveragesrecipes.models.RawIngredient;
import com.example.beveragesrecipes.models.Recipe;
import com.example.beveragesrecipes.models.RecipeIngredient;
import com.example.beveragesrecipes.repositories.IngredientRepository;
import com.example.beveragesrecipes.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        RawIngredient milk = new RawIngredient("Milk", "https://i.imgur.com/49CWlbF.jpg", Boolean.FALSE, "Milk is a nutrient-rich liquid food produced by the mammary glands of mammals. It is the primary source of nutrition for young mammals before they are able to digest solid food.");
        ingredientRepository.save(milk);

        RawIngredient groundEspresso = new RawIngredient("Ground Espresso", "https://i.imgur.com/KhZQ9Oq.jpg", Boolean.FALSE, "" );
        ingredientRepository.save(groundEspresso);

        RawIngredient drinkingChocolate = new RawIngredient("Drinking Chocolate", "https://i.imgur.com/o0KXhGQ.jpg", Boolean.FALSE, "Drinking chocolate, or sipping chocolate, is exactly what it sounds like – luxurious, melted chocolate you can drink!");
        ingredientRepository.save(drinkingChocolate);

        RecipeIngredient recipeIngredient1 = new RecipeIngredient(milk, 100, "ml");

        RecipeIngredient recipeIngredient2 = new RecipeIngredient(groundEspresso, 18, "g");

        RecipeIngredient recipeIngredient3 = new RecipeIngredient(milk, 250, "ml");

        RecipeIngredient recipeIngredient4 = new RecipeIngredient(drinkingChocolate, 1, "tsp");

        Recipe recipe1 = new Recipe(
                "Flat White",
                "Coffee",
                0,
                "https://i.imgur.com/vWWmMbP.jpg",
                "Easy",
                3,
                "Placeholder Instructions",
                "https://youtu.be/-50tS3d2Yao"
        );

        recipe1.addIngredients(recipeIngredient1);
        recipe1.addIngredients(recipeIngredient2);
//        recipe1.addInstructions("Make around 35ml espresso using your coffee machine and pour into the base of your cup.");
//        recipe1.addInstructions("Steam the milk with the steamer attachment so that it has around 1-2cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt the jug to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.");
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe(
                "Mocha",
                "Coffee",
                0,
                "https://i.imgur.com/jiN9sSV.jpg",
                "Easy",
                3,
                "Placeholder Instructions",
                "https://youtu.be/g86JjlpegIM"
        );

        recipe2.addIngredients(recipeIngredient2);
        recipe2.addIngredients(recipeIngredient3);
        recipe2.addIngredients(recipeIngredient4);
//        recipe2.addInstructions("Make around 35ml espresso using a coffee machine and pour into the base of your cup. Add the drinking chocolate and mix well until smooth.");
//        recipe2.addInstructions("Steam the milk with the steamer attachment so that it has around 4-6cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming into the centre. Once the milk jug is almost touching the surface of the coffee, tilt to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.");
        recipeRepository.save(recipe2);
    }
}
