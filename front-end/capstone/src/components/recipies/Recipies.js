import React from "react";
import RecipeCard from "./RecipeCard";

const Recipies = () => {
    return (
        <>
            <h2>Recipies Index (**Recipies**)</h2>
            <main className="flex gap-x-4 min-h-screen ">
                <RecipeCard />
                <RecipeCard />
                <RecipeCard />
            </main>
        </>
    )
}

export default Recipies;