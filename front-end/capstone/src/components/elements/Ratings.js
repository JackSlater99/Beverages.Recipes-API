import React from 'react';

const Ratings = () => {

    const rating = 3;
    

    
  return (
    <div class="ratings">
        <span class="star star-lit" data-value="1">X</span>
        <span class="star star-lit" data-value="2">X</span>
        <span class="star star-lit" data-value="3">X</span>
        <span class="star" data-value="4">X</span>
        <span class="star" data-value="5">X</span>
    </div>
  )
}

export default Ratings;