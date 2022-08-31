import React from "react";
import Search from "./Search";
import Favourites from "./Favourites";

const TitleBanner = () => {

    return(
        <div className="flex bg-yellow-100">
            <Search />
            <Favourites />
        </div>
    )

}

export default TitleBanner;