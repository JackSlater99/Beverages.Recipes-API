import React from "react";
import RecipeCard from "./RecipeCard";

const Recipies = () => {
    return (
        <main className="min-h-screen">
            <h2>Recipies Index (**Recipies**)</h2>
            <RecipeCard />
            <RecipeCard />
            <RecipeCard />
        </main>
    )
}

export default Recipies;