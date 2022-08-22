import React from "react";
import { BrowserRouter as Router, Routes, Route,Switch} from 'react-router-dom';
import NavBar from '../components/header/NavBar';
import Header from '../components/header/Header';
import Footer from '../components/footer/Footer';
import TitleBanner from "../components/titlebanner/TitleBanner";
import Recipies from "../components/recipies/Recipies";
import RecipeFull from "../components/recipeFull/RecipeFull";


const MainContainer = () => {

    return (
        <div className="container mx-auto">
            <Header />
            <TitleBanner />
            
                <Routes>
                    <Route element={<Recipies />} path="/" exact component={<Recipies />} />
                    <Route element={<RecipeFull />} path="/recipies" exact component={<RecipeFull />} />
                </Routes>

            <Footer />
        </div>
    )

}

export default MainContainer;