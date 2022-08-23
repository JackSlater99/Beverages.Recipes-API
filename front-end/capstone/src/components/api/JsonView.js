import React from "react";

import ReactJson from "react-json-view";

const JsonView = ({jsonApiData}) => {
    return (
        <div className='bg-green-300 p-4 w-px-500'>
            <ReactJson src={jsonApiData} theme="monokai" />
        </div>
    )
}

export default JsonView;