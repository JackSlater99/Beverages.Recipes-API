import React from "react";
import FooterLinks from "./FooterLinks";
import styled from "styled-components";

const Footer = () => {
  return (
    <footer className="min-h-[8rem]">
      <FooterBox>
        <Row>
          <Column>
            <Heading>Directory</Heading>
            <FooterLink href="/">Home</FooterLink>
            <FooterLink href="">Recipes</FooterLink>
            <FooterLink href="">API</FooterLink>
            <FooterLink href="/about">About</FooterLink>
          </Column>
          <Column>
            <Heading>Contact Us</Heading>
            <FooterLink href="https://www.linkedin.com/in/J-Slater99">
              Jack Slater
            </FooterLink>
            <FooterLink href="">Jack Carmichael</FooterLink>
            <FooterLink href="">Michael Lyon</FooterLink>
            <FooterLink href="">Mike Langley</FooterLink>
            <FooterLink href="">Sandy Yu</FooterLink>
          </Column>
          <Column>
            <Heading>Social Media</Heading>
            <FooterLink href="#">
              <i className="fa fa-facebook-f"></i> Facebook
            </FooterLink>
            <FooterLink href="#">
              <i className="fa fa-instagram"></i> Instagram
            </FooterLink>
            <FooterLink href="#">
              <i className="fa fa-twitter"></i> Twitter
            </FooterLink>
            <FooterLink href="#">
              <i className="fa fa-youtube"></i> Youtube
            </FooterLink>
          </Column>
        </Row>
      </FooterBox>
    </footer>
  );
};

const FooterBox = styled.div`
  background-color: #222b36;
  position: relative;
  width: 100%;
  margin-top: 3rem;
  padding: 2rem 0rem;
  display: flex;
  flex-direction: column;
`;

const Column = styled.div`
  display: flex;
  flex-direction: column;
  text-align: left;
`;

const Row = styled.div`
  display: flex;
  justify-content: space-evenly;
`;

const FooterLink = styled.a`
  color: #fff;
  margin-bottom: 20px;
  font-size: 18px;
  text-decoration: none;
  &:hover {
    color: #f95959;
    transition: all 0.2s ease-in;
  }
`;

const Heading = styled.p`
  font-size: 24px;
  color: #fff;
  margin-bottom: 40px;
  font-weight: bold;
`;

export default Footer;
