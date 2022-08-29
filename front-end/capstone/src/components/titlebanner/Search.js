import React, { useEffect, useState, useNavigate } from "react";
import styled from "styled-components"

const Search = () => {
    
    const [recipeSearchId, setRecipeSearchId] = useState();

    const getRecipeSearch = async (search) => {
      const resp = await fetch(`http://localhost:8080/api/recipes?name=${search}`);
      const data = await resp.json();
      setRecipeSearchId(data);
      console.log(recipeSearchId)
    };
  
    const handleSearch = (event) => {
        event.preventDefault();
        getRecipeSearch(event.target.search.value);
    };

    useEffect((recipeSearchId) => {
    //   window.location.href = `http://localhost:8080/api/recipes/${recipeSearchId}`
      }, []);

    return(
        <Form onSubmit={handleSearch}>
            <SearchBar type="text" id="search" placeholder="Search.."/>
            <SearchButton type="submit"><i className="fa fa-search"></i></SearchButton>
        </Form>

    )

}

const Form = styled.form`
display:flex;
flex-direction:row;
padding-inline:1rem;
`

const SearchBar = styled.input`
padding: 10px;
font-size: 17px;
border: 1px solid grey;
width: 80%;
background: #f1f1f1;
`

const SearchButton = styled.button`
width: 20%;
padding: 10px;
background: #2196F3;
color: white;
font-size: 17px;
border: 1px solid grey;
border-left: none;
cursor: pointer;
`

export default Search;