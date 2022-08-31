import React from "react";

import ReactJson from "react-json-view";

const JsonView = ({ jsonApiData }) => {
  return (
    <div className="mt-12 w-px-600 bg-red-500">
      <ReactJson
        src={jsonApiData}
        displayDataTypes={false}
        displayObjectSize={false}
        theme="monokai"
      />
    </div>
  );
};

export default JsonView;
