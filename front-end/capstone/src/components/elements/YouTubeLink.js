import React from "react";

const YouTubeLink = ({ videoLink, title }) => {
  return (
    <div>
      <a className="flex items-center m-4" href={videoLink}>
        <img src="https://via.placeholder.com/32" alt={title} />
        <span>You Tube</span>
      </a>
    </div>
  );
};

export default YouTubeLink;
