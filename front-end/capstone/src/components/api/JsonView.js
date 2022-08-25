import React from "react";

import ReactJson from "react-json-view";

const JsonView = ({jsonApiData}) => {
    return (
        <div className='mt-8 w-px-500'>
            <ReactJson 
                src={jsonApiData} 
                displayDataTypes={false} 
                displayObjectSize={false} 
                // theme="solarized"
                theme={{
                    base00: "#efefef",
                    base01: "#ddd",
                    base02: "#ccc",
                    base03: "#000",
                    base04: "#f20",
                    base05: "#000",
                    base06: "#000",
                    base07: "#000",
                    base08: "#f00",
                    base09: "rgba(255, 90, 30, 1)",
                    base0A: "rgba(20, 70, 230, 1)",
                    base0B: "rgba(255, 70, 230, 1)",
                    base0C: "rgba(0, 30, 230, 1)",
                    base0D: "rgba(0, 70, 230, 1)",
                    base0E: "rgba(0, 70, 230, 1)",
                    base0F: "rgba(0, 70, 230, 1)"
                }}
                />
        </div>
    )
}

export default JsonView;