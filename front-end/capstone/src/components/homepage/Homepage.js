import React, { useState, useEffect, Component, useRef } from "react";
import { Link, NavLink, useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";
import mocktail from "../../images/mocktail.jpeg";
import coffee from "../../images/coffee3.jpeg";
import cocktail from "../../images/cocktail.webp";
import martini from "../../images/martini.jpeg";
import tea from "../../images/tea.webp";
import milk from "../../images/milk.jpeg";
import milkshakes from "../../images/milkshakes.jpeg";
import fruitjuice from "../../images/fruitjuice.jpeg";


const Homepage = ({ }) => {
  return (
    <div className="border-double border-8 border-gray-400 py-10 px-10 mt-20">
      <section className="">
        <h2 className="text-center underline">WELCOME</h2>
        <h3 className="text-center">
          EXPLORE & DOWNLOAD BEVERAGES.RECIPES OPEN API
        </h3>
      </section>

      <section className="">
        <ul className="grid grid-cols-4 gap-4 mt-20">
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#coffee"}>
                <img className="" src={coffee}></img>
                <p className="text-center pr-16 ">Coffee</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#mocktail"}>
                <img className="" src={mocktail}></img>
                <p className="text-center pr-16 ">Mocktail</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#cocktail"}>
                <img className="" src={cocktail}></img>
                <p className="text-center pr-16 ">Cocktail</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#martini"}>
                <img className="" src={martini}></img>
                <p className="text-center pr-16 ">Martini</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#tea"}>
                <img className="" src={tea}></img>
                <p className="text-center pr-16 ">Tea</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#milk"}>
                <img className="" src={milk}></img>
                <p className="text-center pr-16 ">Milk</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#fruit"}>
                <img className="" src={fruitjuice}></img>
                <p className="text-center pr-16 ">Fruit Juice</p>
              </HashLink>
            </div>
          </li>
          <li>
            <div className="max-w-min">
              <HashLink smooth to={"/recipes#milkshake"}>
                <img className="" src={milkshakes}></img>
                <p className="text-center pr-16 ">Milkshake</p>
              </HashLink>
            </div>
          </li>
        </ul>
      </section>
    </div>
  );
};

export default Homepage;
