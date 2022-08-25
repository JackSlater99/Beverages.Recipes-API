import React from "react";
import RecipeCard from "./RecipeCard";

const Recipes = () => {
  return (
    <>
      <h2>Recipes Index (**Recipes**)</h2>
      <main className="flex gap-x-4 min-h-screen ">
        <RecipeCard />
        <RecipeCard />
        <RecipeCard />
      </main>
    </>
  );
};

export default Recipes;
