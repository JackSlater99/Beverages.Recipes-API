import React from 'react';
import { useParams } from 'react-router-dom';

const Ingredient = ({ ingredients, recipes }) => {

    const {id} = useParams();

    const ingredient = ingredients.find((currentIngredient) => currentIngredient.id === parseInt(id))

    
    return(
            <p>{ingredient.name}</p>     
    )
}

export default Ingredient;