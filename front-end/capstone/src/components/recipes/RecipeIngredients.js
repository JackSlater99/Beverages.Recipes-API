import React from "react";

const RecipesIngredients = ({ ingredients }) => {
  const ingredientssNodes = ingredients.map((ingredient) => {
    return <li key={ingredient.id}>{ingredient.rawIngredient.name}</li>;
  });

  return <ul>{ingredientssNodes}</ul>;
};

export default RecipesIngredients;
