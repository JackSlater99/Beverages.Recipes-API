import React from "react";
import Search from "./Search";
import Favourites from "./Favourites";

const TitleBanner = () => {

    return(
        <div>
            <h2>Favourites (**TitleBanner**)</h2>
            <Search />
            <Favourites />
        </div>
    )

}

export default TitleBanner;