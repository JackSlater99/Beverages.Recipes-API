import React from "react";
import { useParams } from "react-router-dom";
import Ratings from "../elements/Ratings";

const RecipeFull = ({ recipes }) => {
  const { id } = useParams();
  const recipe = recipes.find((currentRecipe) => currentRecipe.id == id);

  if (!recipe) {
    return "Recipe not found";
  }

  return (
    <main className="min-h-screen bg-green-100">
      <h2>{recipe.name}</h2>

      <div className="flex">
        <div>
          <img src={recipe.image} alt={recipe.name} />
        </div>

        <div>
          <div className="STATSBAR">
            <Ratings rating={recipe.rating} />
          </div>
        </div>
      </div>

      <h3></h3>
    </main>
  );
};

export default RecipeFull;
