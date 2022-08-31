import React, { useState, useEffect, Component, useRef } from "react";
import { Link, NavLink, useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";
import mocktail from "../../images/mocktail.jpeg";
import coffee from "../../images/coffee3.jpeg";
import cocktail from "../../images/cocktail.webp";
import martini from "../../images/martini.jpeg";
import tea from "../../images/tea.webp";
import milk from "../../images/milk.jpeg";

const Homepage = ({ }) => {
  return (
    <div className="border-double border-8 border-gray-400 py-10 px-10">
      <section className="">
        <h1 className="text-5xl font-medium text-center underline">WELCOME</h1>
        <h2 className="text-1xl font-medium text-center">
          EXPLORE & DOWNLOAD BEVERAGES.RECIPES OPEN API{" "}
        </h2>
      </section>

      <section className="">
        <div className="grid grid-cols-4 gap-4 p-6 center px-5">
          <ul className="">
            <HashLink smooth to={"/recipes#coffee"}>
              <img className="" src={coffee}></img>
              <div className="text-center pr-16 ">
                Coffee
              </div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#mocktail"} >
              <img className="" src={mocktail}></img>
              <div className="text-center pr-16 ">
                Mocktail
              </div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#cocktail"}>
              <img className="" src={cocktail}></img>
              <div className="text-center pr-16 ">
                Cocktail
              </div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#martini"}>
              <img className="" src={martini}></img>
              <div className="text-center pr-16 ">
                Martini
              </div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#tea"} >
              <img className="" src={tea}></img>
              <div className="text-center pr-16 ">
                Tea
              </div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#milk"} >
              <img className="" src={milk}></img>
              <div className="text-center pr-16 " >
                Milk
              </div>
            </HashLink>
          </ul>


        </div>
      </section>
    </div>
  );
};

export default Homepage;
