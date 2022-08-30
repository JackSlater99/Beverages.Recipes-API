import React from 'react';
import { useParams } from 'react-router-dom';
import RecipeCard from '../recipes/RecipeCard';
import { Link } from "react-router-dom";


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

  return (
    <>
      <h2>Recipes using {foundIngredient.name}</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes}</main>
    </>

  )
}

export default Ingredient;