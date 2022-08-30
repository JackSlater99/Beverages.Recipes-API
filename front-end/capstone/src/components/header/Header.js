import React from "react";

import Hero from "./Hero";
import NavBar from "./NavBar";
import TitleBanner from "../titlebanner/TitleBanner";

const Header = () => {
  return (
    <header className="min-h-[16rem] ">
      <NavBar />
      <TitleBanner />
      {/* <Hero /> */}
    </header>
  );
};

export default Header;
