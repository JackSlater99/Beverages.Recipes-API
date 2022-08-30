import React, { useEffect, useState } from "react";
import ApiSelect from "./ApiSelect";
import JsonView from "./JsonView";

import "./ApiIndex.css";
import { FaCopy, FaArrowRight } from "react-icons/fa";

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
      id: 14,
      section: "instructions",
      title: "Instructions Index",
      description: "Show all instructions",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions`,
      httpVerb: "GET",
    }
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
      <section className="px-16 w-1/2">

        <h1 className="mb-4 mt-8">Recipe Open API</h1>
        <p className="mb-8">Please select an endpoint from the dropdown to see sample JSON, the enpoint URL and the HTTP method.</p>

        <h3 className="mt-4 mb-4 text-md font-semibold">Select Endpoint <span className="pl-12 text-gray-500 font-normal">{selectedOption.title}</span></h3>
        <div className="ep-select">
          <ApiSelect endPoints={endPoints} onSelectionChange={onSelectChange} />
        </div>

        <div>

          <input
            readOnly
            className="invisible"
            type="text"
            value={selectedOption.endPointUrl}
          />

          <h3 className="mt-4 mb-2 text-md font-semibold">Endpoint URL</h3>
          <p className="ep-display-url">
            <span>{selectedOption.displayUrl}</span>
            <button
              onClick={() => {
                navigator.clipboard.writeText(selectedOption.endPointUrl);
              }}
            >
              <FaCopy className="fa-copy" color="222B36" />
            </button>
          </p>

          <h3 className="mt-8 text-md font-semibold">HTTP Method</h3>
          <p className="ep-display-url">{selectedOption.httpVerb}</p>

          <h3 className="mt-8 text-md font-semibold">Purpose</h3>
          <p className="mt-4">{selectedOption.description}</p>

          <button className="styled-btn mt-8 items-end flex place-content-center" onClick={makeFetchRequest}>
            Try Button <FaArrowRight className="ml-8" />
          </button>
        </div>
      </section>

      <section className="w-1/2 mt-8">
        <JsonView jsonApiData={jsonData} />
      </section>
    </main>
  );
};

export default ApiIndex;
