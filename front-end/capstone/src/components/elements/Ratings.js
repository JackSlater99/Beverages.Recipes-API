import React, { useState } from "react";
import { FaStar } from "react-icons/fa";
import "./Rating.css";

const Ratings = ({ recipe }) => {
  const accumulatedRating = recipe.accumulatedRating;
  const numberOfRatings = recipe.numberOfRatings;
  const averageRating = () => {
    return accumulatedRating / numberOfRatings;
  };

  const makeStars = (recipe) => {
    return (
      <div className="wrapper">
        {[...Array(5)].map((star, i) => {
          const ratingValue = i + 1;

          return (
            <label key={ratingValue}>
              <input type="radio" name="rating" value={ratingValue} />
              <FaStar
                className="star"
                color={ratingValue <= recipe.rating ? "#FFC107" : "E4E5E9"}
                size={50}
              />
            </label>
          );
        })}
      </div>
    );
  };

  return (
    <div className="ratings text-center">
      <p>Rating: {recipe.rating}</p>
      <p>Number of Ratings: {recipe.numberOfRatings}</p>
      <p>Accumulated Rating: {recipe.accumulatedRating}</p>
      <p>Average Ratign: {averageRating()}</p>
      {makeStars(recipe)}
    </div>
  );
};

export default Ratings;
