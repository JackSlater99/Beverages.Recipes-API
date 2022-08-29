import React, { useState, useEffect } from "react";
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
import Recipes from "../components/recipes/Recipes";
import RecipeFull from "../components/recipeFull/RecipeFull";
import ApiIndex from "../components/api/ApiIndex";
import Profile from "../components/AuthComponents/Profile";
import Loading from "../components/AuthComponents/Loading";
import ProtectedRoute from "../auth/protected-route";

const MainContainer = () => {
  const { isLoading } = useAuth0();

  const apiUrl = "http://localhost:8080/api/recipes";

  const [recipesJson, setRecipesJson] = useState([]);

  const getAllRecipes = async () => {
    const resp = await fetch(apiUrl);
    const data = await resp.json();
    setRecipesJson(data);
  };

  useEffect(() => {
    getAllRecipes();
  }, []);

  if (isLoading) {
    return <Loading />;
  }

  return (
    <div className="container mx-auto">
      <Header />

      <Routes>
        <Route
          element={<Recipes recipes={recipesJson} />}
          path="/"
          exact
        />
        <Route
          element={<RecipeFull recipes={recipesJson} />}
          path="/recipes/:id"
          exact
        />
        <Route element={<ApiIndex />} path="/api" />
        <Route element={<Profile />} path="/profile" />
      </Routes>

      <Footer />
    </div>
  );
};

export default MainContainer;
