import React, { useState } from "react";
import { FaStar } from "react-icons/fa";

const Ratings = ({ recipe }) => {
  const accumulatedRating = recipe.accumulatedRating;
  const numberOfRatings = recipe.numberOfRatings;
  // const averageRating = () => {
  //   return accumulatedRating / numberOfRatings;
  // };

  const makeStars = (recipe) => {
    return (
      <div className="wrapper">
        {[...Array(5)].map((star, i) => {
          const ratingValue = i + 1;

          return (
            <label key={ratingValue}>
              <input type="radio" name="rating" value={ratingValue} />
              <FaStar
                color={ratingValue <= recipe.rating ? "#FFC107" : "#E4E5E9"}
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
      <p>
        <span>
          {makeStars(recipe)} {recipe.numberOfRatings} reviews
        </span>
      </p>
      <p></p>
    </div>
  );
};

export default Ratings;
