import React from "react";
import IngredientsCard from "./IngredientsCard";

const Ingredients = ({ ingredients }) => {
  const cardNodes = ingredients.map((ingredient) => {
    return <IngredientsCard ingredient={ingredient} key={ingredient.id} />;
  });

  return (
    <>
      <h2 className="mt-20">List of Ingredients</h2>
      <main className="grid grid-cols-4 gap-4">{cardNodes}</main>
    </>
  );
};

export default Ingredients;
