import React, { useState } from "react";
import { Link } from "react-router-dom";
import LoginButton from "../AuthComponents/LoginButton";
import styled from "styled-components"

const NavBar = () => {

  const [styling, setStyling] = useState(false)
  return (
    <Nav>
        <Logo href='/'>BEVERAGES.RECIPES</Logo>
        <Hamburger onClick={() => setStyling(!styling)}>
            <span></span>
            <span></span>
            <span></span>
        </Hamburger>
        <Menu styling={styling}>
            <MenuLink to='/'>Home</MenuLink>
            <MenuLink to='/recipes'>Recipes</MenuLink>
            <MenuLink to='/Ingredients'>Ingredients</MenuLink>
            <MenuLink to='/api'>API</MenuLink>
            <MenuLink to='/about'>About</MenuLink>
        </Menu>
    </Nav>
);
};

const Nav = styled.div`
padding: 0 2rem;
display:flex;
justify-content:space-between;
align-items: center;
flex-wrap: wrap;
background-color: #222b36;
`

const Hamburger = styled.div`
display: none;
flex-direction: column;
cursor: pointer;
span{
    height: 2px;
    width: 25px;
    background-color: white;
    margin-bottom: 4px;
    border-radius: 5px;
}
@media (max-width: 1200px) {
    display: flex;
}
`

const Menu = styled.div`
display: flex;
justify-content:space-between;
align-items: center;
position: relative;
@media (max-width: 1200px) {
    overflow: hidden;
    flex-direction:column;
    width: 100%;
    max-height: ${({styling}) => (styling ? "1000px" : "0")};
    transition: max-height 0.3s ease-in;
}
`

const MenuLink = styled(Link)`
padding: 1rem 2rem;
cursor: pointer;
text-align: center;
text-decoration: none;
color: white;
transition: all 0.2s ease-in;
font-size: 1.5rem;
font-weight: 700;
&:hover {
    color: red;
}
`

const Logo = styled.a`
 padding: 1rem 0;
 color: white;
 text-decoration: none;
 font-weight: 200;
 font-size: 3rem;
 span {
     font-weight: 300;
     font-size: 3rem;
}
`

export default NavBar;
