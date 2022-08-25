import React, { useEffect, useState } from "react";
import ApiSelect from "./ApiSelect";
import JsonView from "./JsonView";

const ApiIndex = () => {
  const endPoints = [
    {
      id: 1,
      title: "Recipes Index",
      description: "Get all recipes as an array of Objects.",
      endPointUrl: "http://localhost:8080/api/recipes",
    },
    {
      id: 2,
      title: "Recipes Show",
      description: "Get a single recipe by (id, name).",
      endPointUrl: "http://localhost:8080/api/recipes/1",
    },
    {
      id: 3,
      title: "Recipes Create",
      description: "Create a single recipe by (id, name).",
      endPointUrl: "http://localhost:8080/recipesCREATE",
    },
    {
      id: 4,
      title: "Ingredients",
      description: "Ingredients Show by Id.",
      endPointUrl: "http://localhost:8080/api/ingredients/1",
    },
  ];

  const [jsonData, setJsonData] = useState({});

  const [selectedOption, setSelectedOption] = useState({
    id: 2,
    title: "Recipes Show",
    description: "Get a single recipe by (id, name).",
    endPointUrl: "http://localhost:8080/api/recipes/1",
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
            className="w-full border-solid border-2 border-gray-500"
            type="text"
            value={selectedOption.endPointUrl}
          />

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
