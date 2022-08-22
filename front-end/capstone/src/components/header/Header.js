import React from "react";
import Hero from "./Hero";
import NavBar from './NavBar';

const Header = () => {

    return (
        <header className="min-h-[16rem] bg-blue-200">
            <h1 className="text-3xl font-bold">Beverages.Recipies</h1>
            <p>Go on, you know you want to ...</p>
            <NavBar />
            <Hero />

        </header>
    )


}

export default Header;