import React, { useState, useEffect } from "react";
import RecipeCard from "./RecipeCard";

const Recipes = ({ recipes }) => {
  const cardNodes = recipes.map((recipe) => {
    return <RecipeCard recipe={recipe} key={recipe.id} />;
  });

  return (
    <>
      <h2>Recipes Index (**Recipes**)</h2>
      <h2 id="cocktail">Cocktail</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(0, 5)}</main>
      <h2 id="coffee">Coffee</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(5, 9)}</main>
      <h2 id="fruit">Fruit Juice</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(9, 14)}</main>
      <h2 id="martini">Martini</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(14, 16)}</main>
      <h2 id="tea">Tea</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(16, 20)}</main>
      <h2 id="milk">Milk</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(17, 18)}</main>
      <h2 id="milkshake">Milkshake</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(18, 20)}</main>
    </>
  );
};

export default Recipes;
