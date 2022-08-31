import React from "react";
import { Link } from "react-router-dom";

const RecipesIngredients = ({ ingredients }) => {
  const ingredientssNodes = ingredients.map((ingredient) => {
    return (
      <li key={ingredient.id}>
        <Link to={{ pathname: `/ingredients/${ingredient.rawIngredient.id}` }}>
          {ingredient.quantity} {ingredient.units}{" "}
          {ingredient.rawIngredient.name}
        </Link>
      </li>
    );
  });

  return <ul>{ingredientssNodes}</ul>;
};

export default RecipesIngredients;
