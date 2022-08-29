import React from "react";
import { Link } from "react-router-dom";
import Ratings from "../elements/Ratings";
import YouTubeLink from "../elements/YouTubeLink";
import RecipeFull from "../recipeFull/RecipeFull";
import RecipesInstruction from "./RecipesInstruction";

const RecipeCard = ({ recipe }) => {

  return (
    <article className="bg-blue-200 grid place-items-center pb-6">
      <h2>{recipe.name}</h2>
      <img className="w-48" src={recipe.image} alt={recipe.name} />
      <Ratings recipe={recipe} />
      <span>Difficulty: {recipe.difficulty}</span>
      <span>Prep time: {recipe.prepTime}</span>
      <Link to={{ pathname: `/recipes/${recipe.id}` }} recipe={recipe}>
        Click to see full recipe
      </Link>
    </article>
  );
};

export default RecipeCard;
