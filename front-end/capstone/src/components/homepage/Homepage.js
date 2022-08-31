import React, { useState, useEffect, Component, useRef } from "react";
import { Link, NavLink, useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";
import mocktail from "../../images/mocktail.jpeg";
import coffee from "../../images/coffee3.jpeg";
import cocktail from "../../images/cocktail.webp";
import martini from "../../images/martini.jpeg";

const Homepage = ({ recipes }) => {
  return (
    <div className="border-double border-8 border-gray-400 py-10 px-10">
      <section className="">
        <h1 className="font-medium text-center underline">WELCOME</h1>
        <h2 className="font-medium text-center">
          EXPLORE & DOWNLOAD BEVERAGES.RECIPES OPEN API{" "}
        </h2>
      </section>

      <article>
        <div className="flex justify-center pt-10  ">
          <ul className="flex justify-center  ">
            <HashLink smooth to={"/recipes#coffee"}>
              <img className="w-48 flex justify-center " src={coffee}></img>

              <div className=" mx-14 py-2 text-2xl italic ">Coffee</div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#mocktail"}>
              <img className="w-48 flex justify-center" src={mocktail}></img>
              <div className=" mx-12 py-2 text-2xl italic ">Mocktail</div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#cocktail"}>
              <img className="w-48 flex justify-center" src={cocktail}></img>
              <div className=" mx-12 py-2 text-2xl italic ">Cocktail</div>
            </HashLink>
          </ul>
          <ul>
            <HashLink smooth to={"/recipes#martini"}>
              <img className="w-48 flex justify-center" src={martini}></img>
              <div className=" mx-14 py-2 text-2xl italic">Martini</div>
            </HashLink>
          </ul>
        </div>
      </article>
    </div>
  );
};

export default Homepage;
