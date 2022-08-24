import React from "react";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Switch,
} from "react-router-dom";
import { useAuth0 } from "@auth0/auth0-react";

import NavBar from "../components/header/NavBar";
import Header from "../components/header/Header";
import Footer from "../components/footer/Footer";
import Recipies from "../components/recipies/Recipies";
import RecipeFull from "../components/recipeFull/RecipeFull";
import ApiIndex from "../components/api/ApiIndex";
import Profile from "../components/AuthComponents/Profile";
import Loading from "../components/AuthComponents/Loading";
import ProtectedRoute from "../auth/protected-route";

const MainContainer = () => {
  const { isLoading } = useAuth0();

  if (isLoading) {
    return <Loading />;
  }

  const test_json = {
    id: 1,
    name: "Flat White",
    type: "Coffee",
    rating: 4.0,
    image: "https://i.imgur.com/vWWmMbP.jpg",
    difficulty: "Easy",
    prepTime: 3,
    ingredients: [
      {
        id: 1,
        rawIngredient: {
          id: 1,
          name: "Milk",
          image: "https://i.imgur.com/49CWlbF.jpg",
          alcoholic: false,
          description: "",
        },
        quantity: 100.0,
        units: "ml",
      },
      {
        id: 2,
        rawIngredient: {
          id: 2,
          name: "Ground Espresso",
          image: "https://i.imgur.com/KhZQ9Oq.jpg",
          alcoholic: false,
          description: "",
        },
        quantity: 18.0,
        units: "g",
      },
    ],
    instructions: [
      {
        id: 1,
        instruction:
          "Make around 35ml espresso using your coffee machine and pour into the base of your cup.",
      },
      {
        id: 2,
        instruction:
          "Steam the milk with the steamer attachment so that it has around 1-2cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt the jug to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.",
      },
    ],
    video: "https://youtu.be/-50tS3d2Yao",
  };

  return (
    <div className="container mx-auto">
      <Header />

      <Routes>
        <Route element={<Recipies />} path="/" exact component={<Recipies />} />
        <Route
          element={<RecipeFull selectedRecipe={test_json} />}
          path="/recipies"
          exact
          component={<RecipeFull />}
        />
        <Route element={<ApiIndex />} path="/api" component={<ApiIndex />} />
        <Route element={<Profile />} path="/profile" component={<Profile />} />
      </Routes>

      <Footer />
    </div>
  );
};

export default MainContainer;
