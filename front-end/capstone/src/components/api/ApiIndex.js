import React, { useState } from "react";
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
      endPointUrl: "http://localhost:8080/api/recipesCREATE",
    },
  ];

  const [selectedOption, setSelectedOption] = useState({
    id: 1,
    title: "Recipes Index",
    description: "Get all recipes as an array of Objects.",
    endPointUrl: "http://localhost:8080/api/recipes",
  });

  const [selectedJson, setSelectedJson] = useState();

  const test_json = {
    bev_id: 34,
    title: "Drink",
    rating: 5,
    ingredients: {
      whisky: {
        quantity: 10,
        units: "ml",
      },
      banana: {
        quantity: 10,
        units: "ml",
      },
      batman: {
        quantity: 10,
        units: "ml",
      },
    },
    Instructions: {
      summary:
        "take the batman and soak him in whisky for at least 45 minutes.  He will then sing and want to eat the banana.",
      steps: {
        1: "Peel batman",
        2: "Drink Whisky",
        3: "Eat the banana",
      },
    },
    image_link: "http://beverages.recipies/images/batman.jpg",
    thumb_nail: "http://beverages.recipies/images/batman.jpg",
    youtube: "http://youtube.com/jshsduse",
    uri: "http://beverages.recipies/drinks/34",
    country: "link",
  };

  const onSelectChange = (event) => {
    const selectedEndPoint = endPoints.find(
      (endPoint) => endPoint.id === parseInt(event.target.value)
    );
    setSelectedOption(selectedEndPoint);
  };

  const makeFetchRequest = async (event) => {
    console.log(selectedOption.endPointUrl, { mode: "cors" });
    const resp = await fetch(selectedOption.endPointUrl);
    console.log(resp);
  };

  return (
    <main className="flex">
      <section className="p-4 w-2/3">
        <div className="pb-8">
          <ApiSelect endPoints={endPoints} onSelectionChange={onSelectChange} />
        </div>

        <div>
          <h2 className="text-lg font-semibold">{selectedOption.title}</h2>
          <input
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

      <section className="max-w-3x1">
        <JsonView jsonApiData={selectedJson} />
      </section>
    </main>
  );
};

export default ApiIndex;
