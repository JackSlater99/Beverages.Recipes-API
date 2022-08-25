import React, { useEffect, useState } from "react";
import ApiSelect from "./ApiSelect";
import JsonView from "./JsonView";

const ApiIndex = () => {

  const baseUrl = "http://localhost:8080/api";

  const endPoints = [
    {
      id: 1,
      title: "Recipes Index",
      description: "Get all recipes as an array of Objects.",
      endPointUrl: `${baseUrl}/recipes/1`,
      displayUrl: `${baseUrl}/recipes/`,
      httpVerb: "GET"
    },
    {
      id: 2,
      title: "Recipes Show",
      description: "Get a single recipe by (id, name).",
      endPointUrl: `${baseUrl}/recipes/1`,
      displayUrl: `${baseUrl}/recipes/1`,
      httpVerb: "GET"
    },
    {
      id: 3,
      title: "Recipes Create",
      description: "Add a recipe to our database by sending JSON in the format shown.",
      endPointUrl: `${baseUrl}/recipes/2`,
      displayUrl: `${baseUrl}/recipes`,
      httpVerb: "POST"
    },
    {
      id:4,
      title: "Recipe By Name",
      description: "Recipe Get by name.",
      endPointUrl: `${baseUrl}/recipes?name=flat white`,
      displayUrl: `${baseUrl}/recipes?name=flat white`,
      httpVerb: "GET"
    },
    {
      id:5,
      title: "Recipe By Author",
      description: "Recipe Get by Author (Name)",
      endPointUrl: `${baseUrl}/recipes?author=jack`,
      displayUrl: `${baseUrl}/recipes?author=jack`,
      httpVerb: "GET"
    },
    {
      id:6,
      title: "Recipe By Type",
      description: "Recipe Get by Type (Beer, Coffee).",
      endPointUrl: `${baseUrl}/recipes?type=Coffee`,
      displayUrl: `${baseUrl}/recipes?type=Coffee`,
      httpVerb: "GET"
    },
    {
      id:7,
      title: "Recipe By Difficulty",
      description: "Recipe Get by Difficulty (Easy, Medium, Difficult).",
      endPointUrl: `${baseUrl}/recipes?difficulty=medium`,
      displayUrl: `${baseUrl}/recipes?difficulty=medium`,
      httpVerb: "GET"
    },
    {
      id:8,
      title: "Recipe By Preparation Time",
      description: "Recipe Get by time to preapare (minutes).",
      endPointUrl: `${baseUrl}/recipes?preptime=5`,
      displayUrl: `${baseUrl}/recipes?preptime=5`,
      httpVerb: "GET"
    },
    {
      id:9,
      title: "Recipe Contains Alcohol",
      description: "Recipes that contain one or more alhoholic ingredients.",
      endPointUrl: `${baseUrl}/recipes/alcoholic`,
      displayUrl: `${baseUrl}/recipes/alcoholic`,
      httpVerb: "GET"
    },
    {
      id:10,
      title: "Ingredients Index",
      description: "Show all ingredients from all recipes",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients`,
      httpVerb: "GET"
    },
    {
      id:11,
      title: "Ingredient by ID",
      description: "Show ingredient by ID",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients/1`,
      httpVerb: "GET"
    },
    {
      id:12,
      title: "Ingredient Create",
      description: "Create an ingredient by sending JSON in the format show using HTTP POST.",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients`,
      httpVerb: "POST"
    },
    {
      id:13,
      title: "Ingredient Update",
      description: "Update an ingredient by sending JSON in the format show using an HTTP PUT",
      endPointUrl: `${baseUrl}/ingredients/1`,
      displayUrl: `${baseUrl}/ingredients/22`,
      httpVerb: "PUT"
    },
    {
      id:14,
      title: "Instructions Index",
      description: "Show all instructions",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions`,
      httpVerb: "GET"
    },
    {
      id:15,
      title: "Instructions by ID",
      description: "Get instruction by ID",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions/1`,
      httpVerb: "GET"
    },
    {
      id:16,
      title: "Instructions Create",
      description: "Create an instructions by POSTing JSON as shown",
      endPointUrl: `${baseUrl}/instructions/1`,
      displayUrl: `${baseUrl}/instructions`,
      httpVerb: "POST"
    },
    {
      id:17,
      title: "Recipe Ingredients Index",
      description: "Show all recipe ingredients",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients`,
      httpVerb: "GET"
    },
    {
      id:18,
      title: "Recipe Ingredients by ID",
      description: "Show recipe ingredients by ID",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients/1`,
      httpVerb: "GET"
    },
    {
      id:19,
      title: "Add a recipe ingredient",
      description: "Add a newe recipe ingredient by POSTing JSON in the format shown.",
      endPointUrl: `${baseUrl}/recipe-ingredients/1`,
      displayUrl: `${baseUrl}/recipe-ingredients/1`,
      httpVerb: "POST"
    },

  ];

  const [jsonData, setJsonData] = useState({});

  const [selectedOption, setSelectedOption] = useState({
    id: 2,
    title: "Recipes Show",
    description: "Get a single recipe by (id, name).",
    endPointUrl: `${baseUrl}/recipes/1`,
    displayUrl: `${baseUrl}/recipes`,
    httpVerb: "GET"
  });

  const onSelectChange = (event) => {
    const selectedEndPoint = endPoints.find(
      (endPoint) => endPoint.id === parseInt(event.target.value)
    );
    setSelectedOption(selectedEndPoint);
  };

  const makeFetchRequest = async (event) => {
    console.log(selectedOption.endPointUrl, {});
    const resp = await fetch(selectedOption.endPointUrl);
    const jsonData = await resp.json();
    console.log(jsonData);
    setJsonData(jsonData);
  };

  useEffect(() => {
    makeFetchRequest();
  }, []);

  return (
    <main className="flex">
      <section className="p-4 w-1/2">
        <div className="pb-8">
          <ApiSelect endPoints={endPoints} onSelectionChange={onSelectChange} />
        </div>

        <div>
          <h2 className="text-lg font-semibold">{selectedOption.title}</h2>
          <input
            readOnly
            className="invisible"
            type="text"
            value={selectedOption.endPointUrl}
          />

          <p>
            {selectedOption.httpVerb}
            <span className="border-solid border-2 border-gray-500">
              {selectedOption.displayUrl}
            </span>
          </p>

          <p className="mt-8 ">{selectedOption.description}</p>
          <button
            className="w-1/2 mt-8 border-solid border-2 border-gray-500"
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
