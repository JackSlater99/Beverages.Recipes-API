import React, { useEffect, useState } from "react";
import ApiSelect from "./ApiSelect";
import JsonView from "./JsonView";

import "./ApiIndex.css";

const ApiIndex = () => {
  const baseUrl = "http://localhost:8080/api";

  const endPoints = [
    {
      id: 1,
      section: "recipes",
      title: "Recipes Index",
      description: "Get all recipes as an array of Objects.",
      endPointUrl: `${baseUrl}/recipes/1`,
      displayUrl: `${baseUrl}/recipes/`,
      httpVerb: "GET",
    },
    {
      id: 2,
      section: "recipes",
      title: "Recipes Show",
      description: "Get a single recipe by (id, name).",
      endPointUrl: `${baseUrl}/recipes/1`,
      displayUrl: `${baseUrl}/recipes/1`,
      httpVerb: "GET",
    },
    {
      id: 3,
      section: "recipes",
      title: "Recipes Create",
      description:
        "Add a recipe to our database by sending JSON in the format shown.",
      endPointUrl: `${baseUrl}/recipes/2`,
      displayUrl: `${baseUrl}/recipes`,
      httpVerb: "POST",
    },
    {
      id: 4,
      section: "recipes",
      title: "Recipe By Name",
      description: "Recipe Get by name.",
      endPointUrl: `${baseUrl}/recipes?name=flat white`,
      displayUrl: `${baseUrl}/recipes?name=flat white`,
      httpVerb: "GET",
    },
    {
      id: 5,
      section: "recipes",
      title: "Recipe By Author",
      description: "Recipe Get by Author (Name)",
      endPointUrl: `${baseUrl}/recipes?author=jack`,
      displayUrl: `${baseUrl}/recipes?author=jack`,
      httpVerb: "GET",
    },
    {
      id: 6,
      section: "recipes",
      title: "Recipe By Type",
      description: "Recipe Get by Type (Beer, Coffee).",
      endPointUrl: `${baseUrl}/recipes?type=Coffee`,
      displayUrl: `${baseUrl}/recipes?type=Coffee`,
      httpVerb: "GET",
    },
    {
      id: 7,
      section: "recipes",
      title: "Recipe By Difficulty",
      description: "Recipe Get by Difficulty (Easy, Medium, Difficult).",
      endPointUrl: `${baseUrl}/recipes?difficulty=medium`,
      displayUrl: `${baseUrl}/recipes?difficulty=medium`,
      httpVerb: "GET",
    },
    {
      id: 8,
      section: "recipes",
      title: "Recipe By Preparation Time",
      description: "Recipe Get by time to preapare (minutes).",
      endPointUrl: `${baseUrl}/recipes?preptime=5`,
      displayUrl: `${baseUrl}/recipes?preptime=5`,
      httpVerb: "GET",
    },
    {
      id: 9,
      section: "recipes",
      title: "Recipe Contains Alcohol",
      description: "Recipes that contain one or more alhoholic ingredients.",
      endPointUrl: `${baseUrl}/recipes/alcoholic`,
      displayUrl: `${baseUrl}/recipes/alcoholic`,
      httpVerb: "GET",
    },
    {
      id: 10,
      section: "ingredients",
      title: "Ingredients Index",
      description: "Show all ingredients from all recipes",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients`,
      httpVerb: "GET",
    },
    {
      id: 11,
      section: "ingredients",
      title: "Ingredient by ID",
      description: "Show ingredient by ID",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients/1`,
      httpVerb: "GET",
    },
    {
      id: 12,
      section: "ingredients",
      title: "Ingredient Create",
      description:
        "Create an ingredient by sending JSON in the format show using HTTP POST.",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients`,
      httpVerb: "POST",
    },
    {
      id: 13,
      section: "ingredients",
      title: "Ingredient Update",
      description:
        "Update an ingredient by sending JSON in the format show using an HTTP PUT",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients/22`,
      httpVerb: "PUT",
    },
    {
      id: 14,
      section: "instructions",
      title: "Instructions Index",
      description: "Show all instructions",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions`,
      httpVerb: "GET",
    },
    {
      id: 15,
      section: "instructions",
      title: "Instructions by ID",
      description: "Get instruction by ID",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions/1`,
      httpVerb: "GET",
    },
    {
      id: 16,
      section: "instructions",
      title: "Instructions Create",
      description: "Create an instructions by POSTing JSON as shown",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions`,
      httpVerb: "POST",
    },
    {
      id: 17,
      section: "recipe-ingredients",
      title: "Recipe Ingredients Index",
      description: "Show all recipe ingredients",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients`,
      httpVerb: "GET",
    },
    {
      id: 18,
      section: "recipe-ingredients",
      title: "Recipe Ingredients by ID",
      description: "Show recipe ingredients by ID",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients/1`,
      httpVerb: "GET",
    },
    {
      id: 19,
      section: "recipe-ingredients",
      title: "Add a recipe ingredient",
      description:
        "Add a newe recipe ingredient by POSTing JSON in the format shown.",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients/1`,
      httpVerb: "POST",
    },
  ];

  const [jsonData, setJsonData] = useState({});

  const [selectedOption, setSelectedOption] = useState({
    id: 2,
    section: "recipes",
    title: "Recipes Show",
    description: "Get a single recipe by (id, name).",
    endPointUrl: `${baseUrl}/recipes/1`,
    displayUrl: `${baseUrl}/recipes`,
    httpVerb: "GET",
  });

  const onSelectChange = (event) => {
    const selectedEndPoint = endPoints.find(
      (endPoint) => endPoint.id === parseInt(event.target.value)
    );
    setSelectedOption(selectedEndPoint);
  };

  const makeFetchRequest = async (event) => {
    const resp = await fetch(selectedOption.endPointUrl);
    const jsonData = await resp.json();
    setJsonData(jsonData);
  };

  useEffect(() => {
    makeFetchRequest();
  }, []);

  return (
    <main className="flex">
      <section className="p-4 w-1/2">
        <div className="ep-select">
          <ApiSelect endPoints={endPoints} onSelectionChange={onSelectChange} />
        </div>

        <div>
          <p className="">{selectedOption.title}</p>
          <input
            readOnly
            className="invisible"
            type="text"
            value={selectedOption.endPointUrl}
          />

          <h3 className="mt-4 mb-2 text-md font-semibold">Endpoint URL</h3>
          <p className="ep-display-url">
            <span className="">
              {selectedOption.displayUrl}
            </span>
            <button
              onClick={() => {
                navigator.clipboard.writeText(selectedOption.endPointUrl);
              }}
            >
              Copy URL
            </button>
          </p>

          <h3 className="mt-4 text-md font-semibold">HTTP Method</h3>
          <p className="ep-display-url">{selectedOption.httpVerb}</p>

          <h3 className="mt-4 text-md font-semibold">Purpose</h3>
          <p className="mt-4">{selectedOption.description}</p>

          <button
            className="w-1/2 mt-4 border-solid border-2 border-green-500"
            onClick={makeFetchRequest}
          >
            Try Button
          </button>
        </div>
      </section>

      <section className="w-1/2">
        <JsonView jsonApiData={jsonData} />
      </section>
    </main>
  );
};

export default ApiIndex;
