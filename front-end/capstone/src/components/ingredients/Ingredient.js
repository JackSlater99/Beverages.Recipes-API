import React from 'react';
import { useParams } from 'react-router-dom';

const Ingredient = ({ ingredients, recipes }) => {

    const {id} = useParams();

    const foundIngredient = ingredients.find((currentIngredient) => { 
            // console.log(currentIngredient.id);
            return currentIngredient.id === parseInt(id);
        }); 
    // we need to compare every rawIngredient id to the recpies. 


    const recipesWithIngredient = [];

    for (let recipe of recipes){
        for (let ingredient of recipe.ingredients){
            if(ingredient.id === foundIngredient.id){
                recipesWithIngredient.push(recipe);
            }
        }
    }

    // const recipesWithIngredient = recipes.map( (recipe) => {
    //     return recipe.ingredients.filter((ingredient) => {
    //         console.log(foundIngredient) ;
    //         return  ingredient.rawIngredient.id === foundIngredient.id;

    //     });
    // });



    console.log(recipesWithIngredient);
    
    return(
        <>
            <p>{foundIngredient.name}</p> 
            <p>{foundIngredient.recipe}</p>
        </>    
            
    )
}

export default Ingredient;