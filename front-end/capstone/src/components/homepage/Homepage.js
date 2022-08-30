import React from "react";
import { Link } from "react-router-dom";
import mocktail from "../../images/mocktail.jpeg";
import coffee from "../../images/coffee3.jpeg";
import cocktail from "../../images/cocktail.webp";

const Homepage = ({ recipes }) => {
  const baseUrl1 = "http://localhost:8080/api/recipes?type=beer";

  const getRecipes = () => {
    return fetch(baseUrl1).then((res) => res.json());
  };

  return (
    <div>
      <section className="border-double border-4 border-gold-300">
        <h1 className="text-5xl font-medium text-center">WELCOME</h1>
        <h2 className="text-1xl font-medium text-center">
          EXPLORE & DOWNLOAD BEVERAGES.RECIPES OPEN API{" "}
        </h2>
      </section>

      <article>
        <div className="flex justify-center  ">
          <ul className="flex justify-center  ">
            <Link
              to="http://localhost:8080/api/recipes?type=beer"
              className="nav-links"
            >
              <img className="w-48 " src={coffee}></img>
              <button className="flex justify-center  bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                Coffee
              </button>
            </Link>
          </ul>
          <ul>
            <Link to="/recipes">
              <img className="w-48" src={mocktail}></img>
              <button className="flex justify-center bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                Mocktail
              </button>
            </Link>
          </ul>
          <ul>
            <Link to="/recipes">
              <img className="w-48 h-42" src={cocktail}></img>
              <button className="flex justify-center bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow">
                Cocktail
              </button>
            </Link>
          </ul>
        </div>
      </article>
    </div>
  );
};

export default Homepage;
