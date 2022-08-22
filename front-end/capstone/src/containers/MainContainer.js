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
        <div>
            <h2 className="text-3xl font-bold">
                
                **MainContainer**
                    
                </h2>
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