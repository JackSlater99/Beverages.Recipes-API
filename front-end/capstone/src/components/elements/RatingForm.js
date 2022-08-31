import React, { useState } from "react";
import { FaStar } from "react-icons/fa";
import { useParams } from "react-router-dom";
import "./Rating.css";

const RatingForm = ({ recipes, getAllRecipes }) => {
  const { id } = useParams();
  const recipe = recipes.find((currentRecipe) => currentRecipe.id == id);

  const [rating, setRating] = useState(recipe.rating);
  const [accumulatedRating, setAccumulatedRating] = useState(
    recipe.accumulatedRating
  );
  const [numberOfRatings, setNumberOfRatings] = useState(
    recipe.numberOfRatings
  );
  const [userRating, setUserRating] = useState(null);
  const [hover, setHover] = useState(null);
  const [formData, setFormData] = useState({
    rating: "",
  });

  const baseUrl = `http://localhost:8080/api/recipes/${id}`;

  const putMappingRating = () => {
    const updatedRecipe = { ...recipe };
    updatedRecipe.accumulatedRating += userRating;
    updatedRecipe.numberOfRatings += 1;
    updatedRecipe.rating = rating + userRating;
    console.log(updatedRecipe);
    return fetch(baseUrl, {
      method: "PUT",
      body: JSON.stringify(updatedRecipe),
      headers: { "Content-Type": "application/json" },
    }).then((res) => res.json());
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    putMappingRating(formData).then(() => {
      getAllRecipes();
    });
    setFormData({
      rating: "",
    });
  };

  const onRatingChange = (starRating) => {
    const newFormData = Object.assign({}, formData);
    newFormData.rating = starRating;
    setFormData(newFormData);
  };

  return (
    <div className="RatingForm text-center">
      <form onSubmit={handleSubmit} id="feedback-form">
        <h3>Tried a recipe? Rate it!</h3>
        <div className="wrapper">
          {[...Array(5)].map((star, i) => {
            const ratingValue = i + 1;

            return (
              <label>
                <input
                  type="radio"
                  name="rating"
                  value={ratingValue}
                  onClick={() => {
                    setUserRating(ratingValue);
                    onRatingChange(ratingValue);
                  }}
                />
                <FaStar
                  className="star"
                  color={
                    ratingValue <= (hover || rating) ? "#FFC107" : "E4E5E9"
                  }
                  size={100}
                  onMouseEnter={() => setHover(ratingValue)}
                />
              </label>
            );
          })}
        </div>
        <input
          className="styled-btn"
          type="submit"
          value="Submit"
          id="submit"
        />
      </form>
    </div>
  );
};

export default RatingForm;
