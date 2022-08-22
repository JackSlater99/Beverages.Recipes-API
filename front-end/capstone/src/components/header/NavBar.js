import React from "react";

import AuthNav from "../AuthComponents/AuthNav";
import { Link } from 'react-router-dom';
import LoginButton from "../AuthComponents/LoginButton";

const NavBar = () => {

    return (
        <nav>
            <ul className="flex justify-between bg-gray-100 p-8">
                <li><Link to="/">Home</Link></li>
                <li><Link to="/recipies">Recipes</Link></li>
                <li><AuthNav /></li>
            </ul>
        </nav>
    )
}

export default NavBar;