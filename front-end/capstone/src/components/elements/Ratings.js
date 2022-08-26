import React from "react";

const Ratings = ({ rating }) => {
  // logic to apply classes

  return (
    <div className="ratings text-center">
      <span className="star star-lit" data-value="1">
        ⭐️
      </span>
      <span className="star star-lit" data-value="2">
        ⭐️
      </span>
      <span className="star star-lit" data-value="3">
        ⭐️
      </span>
      <span className="star" data-value="4">
        ⭐️
      </span>
      <span className="star" data-value="5">
        ⭐️
      </span>
    </div>
  );
};

export default Ratings;
