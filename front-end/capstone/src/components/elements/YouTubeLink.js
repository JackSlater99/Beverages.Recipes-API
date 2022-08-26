import React from "react";

const YouTubeLink = ({ videoLink, title }) => {
  console.log({ videoLink });
  return (
    <div className="aspect-w-16 aspect-h-9">
      <iframe
        src={videoLink}
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      ></iframe>
    </div>
  );
};

export default YouTubeLink;
