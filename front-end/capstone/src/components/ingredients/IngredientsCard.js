import React from "react";
import { Link } from "react-router-dom";
import Ingredient from "./Ingredient";

const IngredientsCard = ({ ingredient }) => {
  return (
    <figure className="grid place-items-center pb-12">
      <h3>{ingredient.name}</h3>
      <Link
        to={{ pathname: `/ingredients/${ingredient.id}` }}
        ingredient={ingredient}
        element={<Ingredient />}
      >
        <img
          className="w-80 mb-4 rounded"
          src={ingredient.image}
          alt={ingredient.name}
        />
        <figcaption>See Ingredient</figcaption>
      </Link>
    </figure>
  );
};

export default IngredientsCard;
