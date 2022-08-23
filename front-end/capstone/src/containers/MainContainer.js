import React from "react";
import { BrowserRouter as Router, Routes, Route,Switch} from 'react-router-dom';
import NavBar from '../components/header/NavBar';
import Header from '../components/header/Header';
import Footer from '../components/footer/Footer';
import Recipies from "../components/recipies/Recipies";
import RecipeFull from "../components/recipeFull/RecipeFull";
import ApiIndex from "../components/api/ApiIndex";


const MainContainer = () => {

    return (
        <div className="container mx-auto">
            <Header />
            
                <Routes>
                    <Route element={<Recipies />} path="/" exact component={<Recipies />} />
                    <Route element={<RecipeFull />} path="/recipies" exact component={<RecipeFull />} />
                    <Route element={<ApiIndex />} path="/api" component={<ApiIndex />} />
                </Routes>

            <Footer />
        </div>
    )

}

export default MainContainer;