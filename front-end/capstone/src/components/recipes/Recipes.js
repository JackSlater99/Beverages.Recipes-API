import React, { useState, useEffect } from "react";
import RecipeCard from "./RecipeCard";

const Recipes = ({ recipes }) => {
  const cardNodes = recipes.map((recipe) => {
    return <RecipeCard recipe={recipe} key={recipe.id} />;
  });

  return (
    <>
      <h2 className="mt-20">List of Recipes</h2>
      <h3 id="cocktail" className="mt-10">
        Cocktail
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(0, 5)}</main>
      <h3 id="coffee" className="mt-10">
        Coffee
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(5, 9)}</main>
      <h3 id="fruit" className="mt-10">
        Fruit Juice
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(9, 14)}</main>
      <h3 id="martini" className="mt-10">
        Martini
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(14, 16)}</main>
      <h3 id="milk" className="mt-10">
        Milk
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(16, 18)}</main>
      <h3 id="milkshake" className="mt-10">
        Milkshake
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(18, 20)}</main>
      <h3 id="mocktail" className="mt-10">
        Mocktail
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(20, 22)}</main>
      <h3 id="tea" className="mt-10">
        Tea
      </h3>
      <main className="grid grid-cols-4 gap-4">{cardNodes.slice(22, 26)}</main>
    </>
  );
};



export default Recipes;
