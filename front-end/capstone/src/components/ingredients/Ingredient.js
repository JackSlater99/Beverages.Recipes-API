import React from "react";
import { useParams } from "react-router-dom";
import RecipeCard from "../recipes/RecipeCard";

const Ingredient = ({ ingredients, recipes }) => {
  const { id } = useParams();

  const foundIngredient = ingredients.find((currentIngredient) => {
    // console.log(currentIngredient.id);
    return currentIngredient.id === parseInt(id);
  });

  const recipesWithIngredient = [];

  for (let recipe of recipes) {
    for (let ingredient of recipe.ingredients) {
      if (ingredient.id === foundIngredient.id) {
        recipesWithIngredient.push(recipe);
      }
    }
  }

  const cardNodes = recipesWithIngredient.map((recipe) => {
    return <RecipeCard recipe={recipe} key={recipe.id} />;
  });

  const alcoholicIngredient = () => {
    if (foundIngredient.alcoholic === true) {
      return "Yes";
    } else {
      return "No";
    }
  };

  return (
    <>
      <div className="grid grid-rows-1">
        <h2 className="text-center">{foundIngredient.name}</h2>
      </div>
      <div className="grid grid-cols-2 gap-4 p-6 center">
        <div className="p-4">
          <img
            src={foundIngredient.image}
            alt={foundIngredient.name}
            className="max-w-md rounded"
          />
        </div>
        <div className="p-4">
          <p>
            <span className="font-bold">Alcoholic: </span>
            {alcoholicIngredient()}
          </p>
          <p className="font-bold">Description:</p>
          <p>{foundIngredient.description}</p>
        </div>
      </div>

      <h2 className="text-center">Recipes using {foundIngredient.name}</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes}</main>
    </>
  );
};

export default Ingredient;
