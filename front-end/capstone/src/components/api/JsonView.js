import React from "react";

import ReactJson from "react-json-view";

const JsonView = ({ jsonApiData }) => {
  return (
    <div className="mt-8 w-px-500">
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
