import React from "react";
import Ratings from "../elements/Ratings";
import YouTubeLink from "../elements/YouTubeLink";

const RecipeCard = () => {
    return (
        <article className="bg-gray-200 flex-col">
            <h2>Title of Drink</h2>
            <img src="https://via.placeholder.com/150" alt="YouTube Link" />
            <p>Our favourite tipple for those early morning blues.</p>
            <Ratings />
            <p>Stats Here</p>
            <YouTubeLink />

        </article>
    )
}

export default RecipeCard;