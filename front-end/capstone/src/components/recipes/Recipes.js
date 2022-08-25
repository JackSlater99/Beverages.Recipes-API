import React, { useState, useEffect } from "react";
import RecipeCard from "./RecipeCard";

const Recipes = () => {
  const apiUrl = "http://localhost:8080/api/recipes";

  const [recipesJson, setRecipesJson] = useState({});

  const getAllRecipes = async () => {
    const resp = await fetch(apiUrl);
    const data = await resp.json();
    setRecipesJson(data);
  };

  useEffect(() => {
    getAllRecipes();
  }, []);

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
