import React from 'react';

const Ratings = ({rating}) => {

   
    // logic to apply classes


    
  return (
    <div className="ratings">
        <span className="star star-lit" data-value="1">X</span>
        <span className="star star-lit" data-value="2">X</span>
        <span className="star star-lit" data-value="3">X</span>
        <span className="star" data-value="4">X</span>
        <span className="star" data-value="5">X</span>
    </div>
  )
}

export default Ratings;