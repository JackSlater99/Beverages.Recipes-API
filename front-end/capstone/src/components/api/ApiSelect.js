import React from 'react';

const ApiSelect = ({endPoints, onSelectionChange}) => {

    


    const optionNodes = endPoints.map( (endpoint) => {
        return(
            <option key={endpoint.id} value={endpoint.id}>{endpoint.title}</option>
        )
    } );



  return (
    <select onChange={onSelectionChange}>
        {optionNodes}
    </select>
  )
}

export default ApiSelect;