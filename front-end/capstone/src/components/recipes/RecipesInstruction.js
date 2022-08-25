import React from "react";

const RecipesInstruction = ({ instructions }) => {
  const instructionsNodes = instructions.map((instruction) => {
    return <li key={instruction.id}>{instruction.instruction}</li>;
  });

  return <ul>{instructionsNodes}</ul>;
};

export default RecipesInstruction;
