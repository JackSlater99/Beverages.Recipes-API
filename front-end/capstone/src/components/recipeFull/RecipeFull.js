import React from "react";
import { useParams } from "react-router-dom";
import Ratings from "../elements/Ratings";
import RecipesIngredients from "../recipes/RecipeIngredients";
import RecipesInstruction from "../recipes/RecipesInstruction";
import YouTubeLink from "../elements/YouTubeLink";
import RatingForm from "../elements/RatingForm";

const RecipeFull = ({ recipes, getAllRecipes }) => {
  const { id } = useParams();
  const recipe = recipes.find((currentRecipe) => currentRecipe.id == id);

  if (!recipe) {
    return "Recipe not found";
  }

  return (
    <main className="pb-8">
      <div className="grid grid-rows-1">
        <h2 className="text-center mt-20">{recipe.name}</h2>
        <Ratings recipe={recipe} />
      </div>
      <div className="grid grid-cols-2 gap-4 p-6 center">
        <div className="p-4">
          <img
            src={recipe.image}
            alt={recipe.name}
            className="rounded recipe-img"
          />

          <p className="mt-10">
            <span className="font-bold">Type of Drink:</span> {recipe.type}
          </p>
          <p>
            <span className="font-bold">Difficulty:</span> {recipe.difficulty}
          </p>
          <p>
            <span className="font-bold">Prep Time: </span>
            {recipe.prepTime} minutes
          </p>
        </div>
        <div className="p-4">
          <YouTubeLink videoLink={recipe.video} title={recipe.name} />
          <p>
            <span className="font-bold">Ingredients:</span>
            <RecipesIngredients ingredients={recipe.ingredients} />
          </p>
          <p className="mt-10">
            <span className="font-bold">Instructions:</span>
            <RecipesInstruction instructions={recipe.instructions} />
          </p>
        </div>
      </div>
      <div className="grid grid-rows-1">
        <RatingForm recipes={recipes} getAllRecipes={getAllRecipes} />
      </div>
    </main>
  );
};

export default RecipeFull;
