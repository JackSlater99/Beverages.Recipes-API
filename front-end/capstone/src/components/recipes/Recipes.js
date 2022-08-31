import React, { useState, useEffect } from "react";
import RecipeCard from "./RecipeCard";

const Recipes = ({ recipes }) => {
  const cardNodes = recipes.map((recipe) => {
    return <RecipeCard recipe={recipe} key={recipe.id} />;
  });

  return (
    <>
      <h2>List of Ingredients</h2>
      <h2 id="cocktail">Cocktail</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes[0]}</main>
      <h2 id="coffee">Coffee</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice[0, 5]}</main>
      <h2 id="martini">Martini</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(6, 10)}</main>
      <h2 id="mocktail">Mocktail</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(6)}</main>
      <h2 id="tea">Tea</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice()}</main>
      <h2 id="milk">Milk</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice()}</main>
    </>
  );
};

export default Recipes;
