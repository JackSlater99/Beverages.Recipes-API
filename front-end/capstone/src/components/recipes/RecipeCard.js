import React from "react";
import { Link } from "react-router-dom";
import Ratings from "../elements/Ratings";
import YouTubeLink from "../elements/YouTubeLink";
import RecipeFull from "../recipeFull/RecipeFull";
import RecipesInstruction from "./RecipesInstruction";

const RecipeCard = ({ recipe }) => {
  return (
    <article className="grid place-items-center pb-6">
      <h4>{recipe.name}</h4>
      <img className="w-96 mb-4 rounded" src={recipe.image} alt={recipe.name} />
      <Link to={{ pathname: `/recipes/${recipe.id}` }} recipe={recipe}>
        Full Recipe
      </Link>
    </article>
  );
};

export default RecipeCard;
