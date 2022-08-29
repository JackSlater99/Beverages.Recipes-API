import React from 'react';
import { Link } from "react-router-dom";
import Ingredient from './Ingredient';


const IngredientsCard = ({ingredient}) => {
  return (

    
    <article className="bg-blue-200 grid place-items-center pb-6">
      <h2>{ingredient.name}</h2>
      <p>{ingredient.alchoholic}</p>
      <p>{ingredient.description}</p>
      <img className="w-48" src={ingredient.image} alt={ingredient.name} />
      <Link to={{ pathname: `/ingredients/${ingredient.id}` }} ingredient={ingredient} element={<Ingredient />} >
        Click to see where this ingredient is used
      </Link>
      
      </article>
  )
}

export default IngredientsCard;