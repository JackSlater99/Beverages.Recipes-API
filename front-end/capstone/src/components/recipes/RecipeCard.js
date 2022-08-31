import React from "react";
import { Link } from "react-router-dom";
import Ratings from "../elements/Ratings";
import YouTubeLink from "../elements/YouTubeLink";
import RecipeFull from "../recipeFull/RecipeFull";
import RecipesInstruction from "./RecipesInstruction";

const RecipeCard = ({ recipe }) => {
  return (
    <figure className="grid place-items-center pb-6">
      <h3>{recipe.name}</h3>
      <Link to={{ pathname: `/recipes/${recipe.id}` }} recipe={recipe}>
        <img
          className="w-96 mb-4 rounded"
          src={recipe.image}
          alt={recipe.name}
        />
        <figcaption>Full Recipe</figcaption>
      </Link>
    </figure>
  );
};

export default RecipeCard;
