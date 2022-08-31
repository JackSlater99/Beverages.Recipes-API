import React from "react";

const YouTubeLink = ({ videoLink, title }) => {
  return (
    <div className="aspect-w-16 aspect-h-9 mb-10">
      <iframe
        width="560"
        height="315"
        src={videoLink}
        title="YouTube video player"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      ></iframe>
    </div>
  );
};

export default YouTubeLink;
