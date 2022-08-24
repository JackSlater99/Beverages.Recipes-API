import React from "react";
import Ratings from "../elements/Ratings";

const RecipeFull = ({selectedRecipe}) => {

    console.log(selectedRecipe)

    return (
        <main className="min-h-screen bg-green-100">
            <h2>{selectedRecipe.name}</h2>

            <div className="flex">
                <div>
                    <img src={selectedRecipe.image} alt={selectedRecipe.name} />
                </div>

                <div>
                    <div className="STATSBAR">
                        {selectedRecipe.type}
                        {selectedRecipe.prepTime}
                        {selectedRecipe.difficulty}
                        <Ratings rating={selectedRecipe.rating} />
                    </div>

                    
                </div>

            </div>

            <h3></h3>
        </main>
        )
}

export default RecipeFull;