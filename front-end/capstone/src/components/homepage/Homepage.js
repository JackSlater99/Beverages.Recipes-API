import React, {useState, useEffect, Component, useRef} from 'react';
import { Link, NavLink, useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link"
import mocktail from "../../images/mocktail.jpeg"
import coffee from "../../images/coffee3.jpeg"
import cocktail from "../../images/cocktail.webp"
import martini from "../../images/martini.jpeg"


const Homepage = ({ recipes }) => {

    return (
        <div>
            <section className="border-double border-4 border-gold-300">
                <h1 className="text-5xl font-medium text-center">WELCOME</h1>
                <h2 className="text-1xl font-medium text-center">EXPLORE & DOWNLOAD BEVERAGES.RECIPES OPEN API </h2>
            </section>

            <article>

                <div className="flex justify-center  ">
                    <ul className="flex justify-center  ">
                        <HashLink smooth to={"/recipes#coffee"} >
                            <img className="w-48 " src={coffee} ></img>
                            <button className="flex justify-center  bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                                Coffee
                            </button>
                        </HashLink >
                    </ul>
                    <ul>
                        <HashLink smooth to={"/recipes#mocktail"} >
                            <img className="w-48" src={mocktail} ></img>
                            <button className="flex justify-center bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                                Mocktail
                            </button>
                        </HashLink >
                    </ul>
                    <ul>
                        <HashLink smooth to={"/recipes#cocktail"} >
                            <img className="w-48 h-42" src={cocktail} ></img>
                            <button className="flex justify-center bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                                Cocktail
                            </button>
                        </HashLink >

                    </ul>
                    <ul>
                        <HashLink smooth to={"/recipes#martini"}>
                            <img className="w-48 h-42" src={martini} ></img>
                            <button className="flex justify-center bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                                Martini
                            </button>
                        </HashLink>
                    </ul>
                </div>
            </article>





        </div>
    )
}

export default Homepage;