import React from "react";

const RecipesInstruction = ({ instructions }) => {
  const instructionsNodes = instructions.map((instruction) => {
    return (
      <li key={instruction.id} className="mb-4">
        {instruction.instruction}
      </li>
    );
  });

  return <ol>{instructionsNodes}</ol>;
};

export default RecipesInstruction;
