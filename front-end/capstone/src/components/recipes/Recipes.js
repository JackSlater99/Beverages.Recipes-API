import React, { useState, useEffect } from "react";
import RecipeCard from "./RecipeCard";

const Recipes = ({ recipes }) => {
  // const apiUrl = "http://localhost:8080/api/recipes";

  // const [recipesJson, setRecipesJson] = useState([]);

  // const getAllRecipes = async () => {
  //   const resp = await fetch(apiUrl);
  //   const data = await resp.json();
  //   setRecipesJson(data);
  // };

  // useEffect(() => {
  //   getAllRecipes();
  // }, []);

  // console.log(recipesJson);

  const cardNodes = recipes.map((recipe) => {
    return <RecipeCard recipe={recipe} key={recipe.id} />;
  });

  return (
    <>
      <h2>Recipes Index (**Recipes**)</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes}</main>
    </>
  );
};

export default Recipes;
